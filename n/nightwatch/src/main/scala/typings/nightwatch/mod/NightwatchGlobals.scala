package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NightwatchGlobals
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  /**
    * this controls whether to abort the test execution when an assertion failed and skip the rest
    * it's being used in waitFor commands and expect assertions
    * @default true
    */
  var abortOnAssertionFailure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * this controls whether to abort the test execution when an assertion failed and skip the rest
    * it's being used in waitFor commands and expect assertions
    * @default false
    */
  var abortOnElementLocateError: js.UndefOr[Boolean] = js.undefined
  
  def afterTestCase(browser: Any): js.Promise[Unit]
  
  def afterTestSuite(browser: Any): js.Promise[Unit]
  
  /**
    * controls the timeout time for async hooks. Expects the done() callback to be invoked within this time
    * or an error is thrown
    * @default 20000
    */
  var asyncHookTimeout: js.UndefOr[Double] = js.undefined
  
  def beforeTestCase(browser: Any): js.Promise[Unit]
  
  def beforeTestSuite(browser: Any): js.Promise[Unit]
  
  /**
    * controls the timeout value for when executing the global async reporter. Expects the done() callback to be invoked within this time
    * or an error is thrown
    * @default 20000
    */
  var customReporterCallbackTimeout: js.UndefOr[Double] = js.undefined
  
  def onBrowserNavigate(browser: Any): js.Promise[Unit]
  
  def onBrowserQuit(browser: Any): js.Promise[Unit]
  
  def reporter(results: Any, cb: Any): Unit
  
  /**
    * Automatically retrying failed assertions - You can tell Nightwatch to automatically retry failed assertions until a given timeout is reached, before the test runner gives up and fails the test.
    */
  var retryAssertionTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * By default a warning is printed if multiple elements are found using the given locate strategy
    * and selector; set this to true to suppress those warnings
    * @default false
    */
  var suppressWarningsOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * this will cause waitFor commands on elements to throw an error if multiple
    * elements are found using the given locate strategy and selector
    * @default false
    */
  var throwOnMultipleElementsReturned: js.UndefOr[Boolean] = js.undefined
  
  /**
    * controls the timeout value for when running async unit tests. Expects the done() callback to be invoked within this time
    *  or an error is thrown
    * @default  2000
    */
  var unitTestsTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * this will overwrite the default polling interval (currently 500ms) for waitFor commands
    * and expect assertions that use retry
    * @default 500
    */
  var waitForConditionPollInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * default timeout value in milliseconds for waitFor commands and implicit waitFor value for
    * expect assertions
    * @default 5000
    */
  var waitForConditionTimeout: js.UndefOr[Double] = js.undefined
}
object NightwatchGlobals {
  
  inline def apply(
    afterTestCase: Any => js.Promise[Unit],
    afterTestSuite: Any => js.Promise[Unit],
    beforeTestCase: Any => js.Promise[Unit],
    beforeTestSuite: Any => js.Promise[Unit],
    onBrowserNavigate: Any => js.Promise[Unit],
    onBrowserQuit: Any => js.Promise[Unit],
    reporter: (Any, Any) => Unit
  ): NightwatchGlobals = {
    val __obj = js.Dynamic.literal(afterTestCase = js.Any.fromFunction1(afterTestCase), afterTestSuite = js.Any.fromFunction1(afterTestSuite), beforeTestCase = js.Any.fromFunction1(beforeTestCase), beforeTestSuite = js.Any.fromFunction1(beforeTestSuite), onBrowserNavigate = js.Any.fromFunction1(onBrowserNavigate), onBrowserQuit = js.Any.fromFunction1(onBrowserQuit), reporter = js.Any.fromFunction2(reporter))
    __obj.asInstanceOf[NightwatchGlobals]
  }
  
  extension [Self <: NightwatchGlobals](x: Self) {
    
    inline def setAbortOnAssertionFailure(value: Boolean): Self = StObject.set(x, "abortOnAssertionFailure", value.asInstanceOf[js.Any])
    
    inline def setAbortOnAssertionFailureUndefined: Self = StObject.set(x, "abortOnAssertionFailure", js.undefined)
    
    inline def setAbortOnElementLocateError(value: Boolean): Self = StObject.set(x, "abortOnElementLocateError", value.asInstanceOf[js.Any])
    
    inline def setAbortOnElementLocateErrorUndefined: Self = StObject.set(x, "abortOnElementLocateError", js.undefined)
    
    inline def setAfterTestCase(value: Any => js.Promise[Unit]): Self = StObject.set(x, "afterTestCase", js.Any.fromFunction1(value))
    
    inline def setAfterTestSuite(value: Any => js.Promise[Unit]): Self = StObject.set(x, "afterTestSuite", js.Any.fromFunction1(value))
    
    inline def setAsyncHookTimeout(value: Double): Self = StObject.set(x, "asyncHookTimeout", value.asInstanceOf[js.Any])
    
    inline def setAsyncHookTimeoutUndefined: Self = StObject.set(x, "asyncHookTimeout", js.undefined)
    
    inline def setBeforeTestCase(value: Any => js.Promise[Unit]): Self = StObject.set(x, "beforeTestCase", js.Any.fromFunction1(value))
    
    inline def setBeforeTestSuite(value: Any => js.Promise[Unit]): Self = StObject.set(x, "beforeTestSuite", js.Any.fromFunction1(value))
    
    inline def setCustomReporterCallbackTimeout(value: Double): Self = StObject.set(x, "customReporterCallbackTimeout", value.asInstanceOf[js.Any])
    
    inline def setCustomReporterCallbackTimeoutUndefined: Self = StObject.set(x, "customReporterCallbackTimeout", js.undefined)
    
    inline def setOnBrowserNavigate(value: Any => js.Promise[Unit]): Self = StObject.set(x, "onBrowserNavigate", js.Any.fromFunction1(value))
    
    inline def setOnBrowserQuit(value: Any => js.Promise[Unit]): Self = StObject.set(x, "onBrowserQuit", js.Any.fromFunction1(value))
    
    inline def setReporter(value: (Any, Any) => Unit): Self = StObject.set(x, "reporter", js.Any.fromFunction2(value))
    
    inline def setRetryAssertionTimeout(value: Double): Self = StObject.set(x, "retryAssertionTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetryAssertionTimeoutUndefined: Self = StObject.set(x, "retryAssertionTimeout", js.undefined)
    
    inline def setSuppressWarningsOnMultipleElementsReturned(value: Boolean): Self = StObject.set(x, "suppressWarningsOnMultipleElementsReturned", value.asInstanceOf[js.Any])
    
    inline def setSuppressWarningsOnMultipleElementsReturnedUndefined: Self = StObject.set(x, "suppressWarningsOnMultipleElementsReturned", js.undefined)
    
    inline def setThrowOnMultipleElementsReturned(value: Boolean): Self = StObject.set(x, "throwOnMultipleElementsReturned", value.asInstanceOf[js.Any])
    
    inline def setThrowOnMultipleElementsReturnedUndefined: Self = StObject.set(x, "throwOnMultipleElementsReturned", js.undefined)
    
    inline def setUnitTestsTimeout(value: Double): Self = StObject.set(x, "unitTestsTimeout", value.asInstanceOf[js.Any])
    
    inline def setUnitTestsTimeoutUndefined: Self = StObject.set(x, "unitTestsTimeout", js.undefined)
    
    inline def setWaitForConditionPollInterval(value: Double): Self = StObject.set(x, "waitForConditionPollInterval", value.asInstanceOf[js.Any])
    
    inline def setWaitForConditionPollIntervalUndefined: Self = StObject.set(x, "waitForConditionPollInterval", js.undefined)
    
    inline def setWaitForConditionTimeout(value: Double): Self = StObject.set(x, "waitForConditionTimeout", value.asInstanceOf[js.Any])
    
    inline def setWaitForConditionTimeoutUndefined: Self = StObject.set(x, "waitForConditionTimeout", js.undefined)
  }
}
