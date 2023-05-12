package typings.metroCache

import typings.metroCache.metroCacheInts.`4`
import typings.metroCache.metroCacheInts.`6`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStoresHttpStoreMod {
  
  @JSImport("metro-cache/src/stores/HttpStore", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with HttpStore[T] {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def get(key: Buffer): js.Promise[T | Null] = js.native
    
    /* CompleteClass */
    override def set(key: Buffer, value: T): js.Promise[Unit] = js.native
  }
  
  trait HttpStore[T] extends StObject {
    
    def clear(): Unit
    
    def get(key: Buffer): js.Promise[T | Null]
    
    def set(key: Buffer, value: T): js.Promise[Unit]
  }
  object HttpStore {
    
    inline def apply[T](clear: () => Unit, get: Buffer => js.Promise[T | Null], set: (Buffer, T) => js.Promise[Unit]): HttpStore[T] = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[HttpStore[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HttpStore[?], T] (val x: Self & HttpStore[T]) extends AnyVal {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: Buffer => js.Promise[T | Null]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Buffer, T) => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait Options extends StObject {
    
    var ca: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    var cert: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    var endpoint: String
    
    var family: js.UndefOr[`4` | `6`] = js.undefined
    
    var key: js.UndefOr[String | (js.Array[Buffer | String]) | Buffer] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(endpoint: String): Options = {
      val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCa(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (Buffer | String)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (Buffer | String)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setFamily(value: `4` | `6`): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      inline def setKey(value: String | (js.Array[Buffer | String]) | Buffer): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (Buffer | String)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
