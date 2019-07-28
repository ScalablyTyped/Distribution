package typings.owaspDashPasswordDashStrengthDashTest.owaspDashPasswordDashStrengthDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestResult extends js.Object {
  /** error messages associated with the failed tests */
  var errors: js.Array[String]
  /** enumerates which tests have failed, beginning from 0 with the first required test */
  var failedTests: js.Array[Double]
  /** indicates whether or not the password was considered to be a passphrase */
  var isPassphrase: Boolean
  /** error messages of optional tests that have failed */
  var optionalTestErrors: js.Array[String]
  /**
    * indicates how many of the optional tests were passed;
    * In order for the password to be considered "strong", it (by default) must either be a passphrase,
    * or must pass a number of optional tests that is equal to or greater than configs.minOptionalTestsToPass
    */
  var optionalTestsPassed: Double
  /** enumerates which tests have succeeded, beginning from 0 with the first required test */
  var passedTests: js.Array[Double]
  /** error messages of required tests that have failed */
  var requiredTestErrors: js.Array[String]
  /** indicates whether or not the user's password satisfied the strength requirements */
  var strong: Boolean
}

object TestResult {
  @scala.inline
  def apply(
    errors: js.Array[String],
    failedTests: js.Array[Double],
    isPassphrase: Boolean,
    optionalTestErrors: js.Array[String],
    optionalTestsPassed: Double,
    passedTests: js.Array[Double],
    requiredTestErrors: js.Array[String],
    strong: Boolean
  ): TestResult = {
    val __obj = js.Dynamic.literal(errors = errors, failedTests = failedTests, isPassphrase = isPassphrase, optionalTestErrors = optionalTestErrors, optionalTestsPassed = optionalTestsPassed, passedTests = passedTests, requiredTestErrors = requiredTestErrors, strong = strong)
  
    __obj.asInstanceOf[TestResult]
  }
}

