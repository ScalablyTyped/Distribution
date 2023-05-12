package typings.metroCache

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStoresFileStoreMod {
  
  @JSImport("metro-cache/src/stores/FileStore", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with FileStore[T] {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Buffer): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def set(key: Buffer, value: T): js.Promise[Unit] = js.native
  }
  
  trait FileStore[T] extends StObject {
    
    def clear(): Unit
    
    def get(key: Buffer): js.Promise[T | Null]
    
    def set(key: Buffer, value: T): js.Promise[Unit]
  }
  object FileStore {
    
    inline def apply[T](clear: () => Unit, get: Buffer => js.Promise[T | Null], set: (Buffer, T) => js.Promise[Unit]): FileStore[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[FileStore[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileStore[?], T] (val x: Self & FileStore[T]) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: Buffer => js.Promise[T | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Buffer, T) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    var root: String
  }
  object Options {
    
    inline def apply(root: String): Options = {
      val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
