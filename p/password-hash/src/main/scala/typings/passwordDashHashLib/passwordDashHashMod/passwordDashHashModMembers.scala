package typings
package passwordDashHashLib.passwordDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("password-hash", JSImport.Namespace)
@js.native
object passwordDashHashModMembers extends js.Object {
  def generate(password: java.lang.String): java.lang.String = js.native
  def generate(password: java.lang.String, options: Options): java.lang.String = js.native
  def isHashed(password: java.lang.String): scala.Boolean = js.native
  def verify(password: java.lang.String, hashedPassword: java.lang.String): scala.Boolean = js.native
}

