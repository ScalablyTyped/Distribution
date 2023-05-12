package typings.metroCache

import typings.metroCache.srcStoresHttpStoreMod.Options
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStoresHttpGetStoreMod {
  
  @JSImport("metro-cache/src/stores/HttpGetStore", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with HttpGetStore[T] {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Buffer): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def set(key: Buffer, value: T): js.Promise[Unit] = js.native
  }
  
  trait HttpGetStore[T] extends StObject {
    
    def clear(): Unit
    
    def get(key: Buffer): js.Promise[T | Null]
    
    def set(key: Buffer, value: T): js.Promise[Unit]
  }
  object HttpGetStore {
    
    inline def apply[T](clear: () => Unit, get: Buffer => js.Promise[T | Null], set: (Buffer, T) => js.Promise[Unit]): HttpGetStore[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[HttpGetStore[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpGetStore[?], T] (val x: Self & HttpGetStore[T]) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: Buffer => js.Promise[T | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Buffer, T) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
