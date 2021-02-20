package typings.nightwatch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchGlobals extends StObject {
  
  /**
    * this controls whether to abort the test execution when an assertion failed and skip the rest
    * it's being used in waitFor commands and expect assertions
    * @default true
    */
  var abortOnAssertionFailure: js.UndefOr[Boolean] = js.native
  
  /**
    * controls the timeout time for async hooks. Expects the done() callback to be invoked within this time
    * or an error is thrown
    * @default 10000
    */
  var asyncHookTimeout: js.UndefOr[Double] = js.native
  
  /**
    * this will cause waitFor commands on elements to throw an error if multiple
    * elements are found using the given locate strategy and selector
    * @default true
    */
  var throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.native
  
  /**
    * this will overwrite the default polling interval (currently 500ms) for waitFor commands
    * and expect assertions that use retry
    * @default 300
    */
  var waitForConditionPollInterval: js.UndefOr[Double] = js.native
  
  /**
    * default timeout value in milliseconds for waitFor commands and implicit waitFor value for
    * expect assertions
    * @default 5000
    */
  var waitForConditionTimeout: js.UndefOr[Double] = js.native
}
object NightwatchGlobals {
  
  @scala.inline
  def apply(): NightwatchGlobals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NightwatchGlobals]
  }
  
  @scala.inline
  implicit class NightwatchGlobalsMutableBuilder[Self <: NightwatchGlobals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortOnAssertionFailure(value: Boolean): Self = StObject.set(x, "abortOnAssertionFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortOnAssertionFailureUndefined: Self = StObject.set(x, "abortOnAssertionFailure", js.undefined)
    
    @scala.inline
    def setAsyncHookTimeout(value: Double): Self = StObject.set(x, "asyncHookTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncHookTimeoutUndefined: Self = StObject.set(x, "asyncHookTimeout", js.undefined)
    
    @scala.inline
    def setThrowOnMultipleElementsReturned(value: Boolean): Self = StObject.set(x, "throwOnMultipleElementsReturned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrowOnMultipleElementsReturnedUndefined: Self = StObject.set(x, "throwOnMultipleElementsReturned", js.undefined)
    
    @scala.inline
    def setWaitForConditionPollInterval(value: Double): Self = StObject.set(x, "waitForConditionPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForConditionPollIntervalUndefined: Self = StObject.set(x, "waitForConditionPollInterval", js.undefined)
    
    @scala.inline
    def setWaitForConditionTimeout(value: Double): Self = StObject.set(x, "waitForConditionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForConditionTimeoutUndefined: Self = StObject.set(x, "waitForConditionTimeout", js.undefined)
  }
}
