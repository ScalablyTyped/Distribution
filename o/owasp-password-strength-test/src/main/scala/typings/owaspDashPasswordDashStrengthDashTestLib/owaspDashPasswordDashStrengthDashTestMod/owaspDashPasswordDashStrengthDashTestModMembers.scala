package typings
package owaspDashPasswordDashStrengthDashTestLib.owaspDashPasswordDashStrengthDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("owasp-password-strength-test", JSImport.Namespace)
@js.native
object owaspDashPasswordDashStrengthDashTestModMembers extends js.Object {
  val configs: stdLib.Readonly[TestConfig] = js.native
  var tests: owaspDashPasswordDashStrengthDashTestLib.Anon_Required = js.native
  def config(configuration: stdLib.Partial[TestConfig]): scala.Unit = js.native
  def test(password: java.lang.String): TestResult = js.native
}

