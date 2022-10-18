package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncPolling extends StObject {
  
  /**
    * @since 1.55 default: false Enable asynchronous polling after success() call. This allows more stable
    * autoWaiter synchronization with event flows originating from within success(). Especially usefull to
    * stabilize synchronization with overflow toolbars.
    */
  var asyncPolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will get invoked in every polling interval. If it returns true, the check is successful and the polling
    * will stop. The first parameter passed into the function is the same value that gets passed to the success
    * function. Returning something other than boolean in the check will not change the first parameter of
    * success.
    */
  var check: js.UndefOr[js.Function] = js.undefined
  
  /**
    * @since 1.47 default: 0 - (seconds) Specifies how long the waitFor function polls before it fails in debug
    * mode.O means it will wait forever.
    */
  var debugTimeout: js.UndefOr[int] = js.undefined
  
  /**
    * Will be displayed as an errorMessage depending on your unit test framework. Currently the only adapter
    * for Opa is QUnit. This message is displayed there if Opa has reached its timeout but QUnit has not yet
    * reached it.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * default: 400 - (milliseconds) Specifies how often the waitFor function polls.
    */
  var pollingInterval: js.UndefOr[int] = js.undefined
  
  /**
    * Will get invoked after the check function returns true. If there is no check function defined, it will
    * be directly invoked. waitFor statements added in the success handler will be executed before previously
    * added waitFor statements.
    */
  var success: js.UndefOr[js.Function] = js.undefined
  
  /**
    * default: 15 - (seconds) Specifies how long the waitFor function polls before it fails.O means it will
    * wait forever.
    */
  var timeout: js.UndefOr[int] = js.undefined
}
object AsyncPolling {
  
  inline def apply(): AsyncPolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncPolling]
  }
  
  extension [Self <: AsyncPolling](x: Self) {
    
    inline def setAsyncPolling(value: Boolean): Self = StObject.set(x, "asyncPolling", value.asInstanceOf[js.Any])
    
    inline def setAsyncPollingUndefined: Self = StObject.set(x, "asyncPolling", js.undefined)
    
    inline def setCheck(value: js.Function): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setCheckUndefined: Self = StObject.set(x, "check", js.undefined)
    
    inline def setDebugTimeout(value: int): Self = StObject.set(x, "debugTimeout", value.asInstanceOf[js.Any])
    
    inline def setDebugTimeoutUndefined: Self = StObject.set(x, "debugTimeout", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setPollingInterval(value: int): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
    
    inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
    
    inline def setSuccess(value: js.Function): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: int): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
