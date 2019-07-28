package typings.passwordDashHash.passwordDashHashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("password-hash", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def generate(password: String): String = js.native
  def generate(password: String, options: Options): String = js.native
  def isHashed(password: String): Boolean = js.native
  def verify(password: String, hashedPassword: String): Boolean = js.native
}

