package typings.owaspDashPasswordDashStrengthDashTest.owaspDashPasswordDashStrengthDashTestMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("owasp-password-strength-test", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val configs: TestConfig = js.native
  def config(configuration: Partial[TestConfig]): Unit = js.native
  def test(password: String): TestResult = js.native
}

