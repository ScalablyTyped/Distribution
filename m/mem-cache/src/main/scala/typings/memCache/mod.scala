package typings.memCache

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mem-cache", JSImport.Namespace)
  @js.native
  class ^ () extends Cache {
    def this(options: Double) = this()
    def this(options: CacheOptions) = this()
  }
  
  @js.native
  trait Cache extends EventEmitter {
    
    def clean(): Unit = js.native
    
    def get(key: String): js.Any = js.native
    
    var keys: js.Array[String] = js.native
    
    var length: Double = js.native
    
    def remove(key: String): Unit = js.native
    
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: String, value: js.Any, timeout: Double): Unit = js.native
  }
  
  @js.native
  trait CacheOptions extends StObject {
    
    var doesNotRenewTimeout: js.UndefOr[Boolean] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var timeoutDisabled: js.UndefOr[Boolean] = js.native
  }
  object CacheOptions {
    
    @scala.inline
    def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    @scala.inline
    implicit class CacheOptionsMutableBuilder[Self <: CacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDoesNotRenewTimeout(value: Boolean): Self = StObject.set(x, "doesNotRenewTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDoesNotRenewTimeoutUndefined: Self = StObject.set(x, "doesNotRenewTimeout", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutDisabled(value: Boolean): Self = StObject.set(x, "timeoutDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutDisabledUndefined: Self = StObject.set(x, "timeoutDisabled", js.undefined)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
