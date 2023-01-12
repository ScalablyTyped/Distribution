package typings.memCache

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mem-cache", JSImport.Namespace)
  @js.native
  open class ^ () extends Cache {
    def this(options: Double) = this()
    def this(options: CacheOptions) = this()
  }
  
  @js.native
  trait Cache extends EventEmitter {
    
    def clean(): Unit = js.native
    
    def get(key: String): Any = js.native
    
    var keys: js.Array[String] = js.native
    
    var length: Double = js.native
    
    def remove(key: String): Unit = js.native
    
    def set(key: String, value: Any): Unit = js.native
    def set(key: String, value: Any, timeout: Double): Unit = js.native
  }
  
  trait CacheOptions extends StObject {
    
    var doesNotRenewTimeout: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var timeoutDisabled: js.UndefOr[Boolean] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      inline def setDoesNotRenewTimeout(value: Boolean): Self = StObject.set(x, "doesNotRenewTimeout", value.asInstanceOf[js.Any])
      
      inline def setDoesNotRenewTimeoutUndefined: Self = StObject.set(x, "doesNotRenewTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutDisabled(value: Boolean): Self = StObject.set(x, "timeoutDisabled", value.asInstanceOf[js.Any])
      
      inline def setTimeoutDisabledUndefined: Self = StObject.set(x, "timeoutDisabled", js.undefined)
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
