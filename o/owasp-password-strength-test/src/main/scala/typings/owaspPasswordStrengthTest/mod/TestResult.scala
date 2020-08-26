package typings.owaspPasswordStrengthTest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestResult extends js.Object {
  /** error messages associated with the failed tests */
  var errors: js.Array[String] = js.native
  /** enumerates which tests have failed, beginning from 0 with the first required test */
  var failedTests: js.Array[Double] = js.native
  /** indicates whether or not the password was considered to be a passphrase */
  var isPassphrase: Boolean = js.native
  /** error messages of optional tests that have failed */
  var optionalTestErrors: js.Array[String] = js.native
  /**
    * indicates how many of the optional tests were passed;
    * In order for the password to be considered "strong", it (by default) must either be a passphrase,
    * or must pass a number of optional tests that is equal to or greater than configs.minOptionalTestsToPass
    */
  var optionalTestsPassed: Double = js.native
  /** enumerates which tests have succeeded, beginning from 0 with the first required test */
  var passedTests: js.Array[Double] = js.native
  /** error messages of required tests that have failed */
  var requiredTestErrors: js.Array[String] = js.native
  /** indicates whether or not the user's password satisfied the strength requirements */
  var strong: Boolean = js.native
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
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], failedTests = failedTests.asInstanceOf[js.Any], isPassphrase = isPassphrase.asInstanceOf[js.Any], optionalTestErrors = optionalTestErrors.asInstanceOf[js.Any], optionalTestsPassed = optionalTestsPassed.asInstanceOf[js.Any], passedTests = passedTests.asInstanceOf[js.Any], requiredTestErrors = requiredTestErrors.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestResult]
  }
  @scala.inline
  implicit class TestResultOps[Self <: TestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorsVarargs(value: String*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[String]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedTestsVarargs(value: Double*): Self = this.set("failedTests", js.Array(value :_*))
    @scala.inline
    def setFailedTests(value: js.Array[Double]): Self = this.set("failedTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPassphrase(value: Boolean): Self = this.set("isPassphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalTestErrorsVarargs(value: String*): Self = this.set("optionalTestErrors", js.Array(value :_*))
    @scala.inline
    def setOptionalTestErrors(value: js.Array[String]): Self = this.set("optionalTestErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionalTestsPassed(value: Double): Self = this.set("optionalTestsPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassedTestsVarargs(value: Double*): Self = this.set("passedTests", js.Array(value :_*))
    @scala.inline
    def setPassedTests(value: js.Array[Double]): Self = this.set("passedTests", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredTestErrorsVarargs(value: String*): Self = this.set("requiredTestErrors", js.Array(value :_*))
    @scala.inline
    def setRequiredTestErrors(value: js.Array[String]): Self = this.set("requiredTestErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrong(value: Boolean): Self = this.set("strong", value.asInstanceOf[js.Any])
  }
  
}

