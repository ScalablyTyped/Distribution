package typings
package owaspDashPasswordDashStrengthDashTestLib.owaspDashPasswordDashStrengthDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TestResult extends js.Object {
  /** error messages associated with the failed tests */
  var errors: js.Array[java.lang.String]
  /** enumerates which tests have failed, beginning from 0 with the first required test */
  var failedTests: js.Array[scala.Double]
  /** indicates whether or not the password was considered to be a passphrase */
  var isPassphrase: scala.Boolean
  /** error messages of optional tests that have failed */
  var optionalTestErrors: js.Array[java.lang.String]
  /**
       * indicates how many of the optional tests were passed;
       * In order for the password to be considered "strong", it (by default) must either be a passphrase,
       * or must pass a number of optional tests that is equal to or greater than configs.minOptionalTestsToPass
       */
  var optionalTestsPassed: scala.Double
  /** enumerates which tests have succeeded, beginning from 0 with the first required test */
  var passedTests: js.Array[scala.Double]
  /** error messages of required tests that have failed */
  var requiredTestErrors: js.Array[java.lang.String]
  /** indicates whether or not the user's password satisfied the strength requirements */
  var strong: scala.Boolean
}

