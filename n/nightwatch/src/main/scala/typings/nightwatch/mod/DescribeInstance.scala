package typings.nightwatch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nightwatch", "DescribeInstance")
@js.native
open class DescribeInstance () extends StObject {
  
  var `[client]`: NightwatchClient = js.native
  
  var `[instance]`: Any = js.native
  
  /**
    * Get all current cli arguments.
    */
  def argv: StringDictionary[Any] = js.native
  
  /**
    * Get or set testsuite specific capabilities.
    */
  def desiredCapabilities: NightwatchDesiredCapabilities = js.native
  def desiredCapabilities_=(value: NightwatchDesiredCapabilities): Unit = js.native
  
  /**
    * Set to true if you'd like this test suite to be skipped by the
    * test runner.
    */
  def disabled: Boolean = js.native
  def disabled_=(value: Boolean): Unit = js.native
  
  /**
    * Set to false if you'd like the browser window to be kept open
    * in case of a failure or error (useful for debugging).
    */
  def endSessionOnFail: Boolean = js.native
  def endSessionOnFail_=(value: Boolean): Unit = js.native
  
  /**
    * Get all current globals.
    */
  def globals: NightwatchGlobals = js.native
  
  /**
    * Get all current mocha options.
    */
  def mochaOptions: js.UndefOr[StringDictionary[Any]] = js.native
  
  /**
    * Title of the describe suite.
    */
  def name: String = js.native
  
  /**
    * Get available page objects.
    */
  def page: NightwatchPage & NightwatchCustomPageObjects = js.native
  
  /**
    * How many time to retry a failed testcase inside this test suite
    */
  def retries(n: Double): Unit = js.native
  
  /**
    * Control the polling interval between re-tries for assertions
    * or element commands.
    *
    * @param value Time interval in `ms`
    */
  def retryInterval(value: Double): Unit = js.native
  
  /**
    * Get all current settings.
    */
  def settings: NightwatchOptions = js.native
  
  /**
    * Set to false if you'd like the rest of the test cases/test steps
    * to be executed in the event of an assertion failure/error.
    */
  def skipTestcasesOnFail: Boolean = js.native
  def skipTestcasesOnFail_=(value: Boolean): Unit = js.native
  
  /**
    * How many times to retry the current test suite in case of an
    * assertion failure or error
    */
  def suiteRetries(n: Double): Unit = js.native
  
  /**
    * Get or set tags for the test suite.
    *
    * @see https://nightwatchjs.org/guide/running-tests/filtering-by-test-tags.html
    */
  def tags: String | js.Array[String] = js.native
  def tags_=(value: String | js.Array[String]): Unit = js.native
  
  /**
    * Control the unit test timeout.
    *
    * Control the assertion and element commands timeout until when
    * an element should be located or assertion passed.
    *
    * @param value Timeout in `ms`
    */
  def timeout(value: Double): Unit = js.native
  
  /**
    * Enable if the current test is a unit/integration test
    * (no webdriver session is required).
    */
  def unitTest: Boolean = js.native
  def unitTest_=(value: Boolean): Unit = js.native
  
  /**
    * Get the polling interval between re-tries for assertions
    * or element commands.
    *
    * @returns Time interval in `ms`
    */
  def waitForRetryInterval(): Double = js.native
  /**
    * Control the polling interval between re-tries for assertions
    * or element commands.
    *
    * @param value Time interval in `ms`
    */
  def waitForRetryInterval(value: Double): Unit = js.native
  
  /**
    * Get the assertion and element commands timeout until when
    * an element would be located or assertion passed.
    *
    * @returns Timeout in `ms`
    */
  def waitForTimeout(): Double = js.native
  /**
    * Control the assertion and element commands timeout until when
    * an element should be located or assertion passed.
    *
    * @param value Timeout in `ms`
    */
  def waitForTimeout(value: Double): Unit = js.native
}
