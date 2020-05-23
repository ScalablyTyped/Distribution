package typings.nodePhpass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-phpass", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class PasswordHash () extends js.Object {
    def this(length: Double) = this()
    def this(length: Double, portable: Boolean) = this()
    def this(length: Double, portable: Boolean, phpVersion: Double) = this()
    def CheckPassword(password: String, hash: String): Boolean = js.native
    def HashPassword(password: String): js.Promise[String] = js.native
    def HashPassword(password: String, method: /* 1 */ Double): js.Promise[String] = js.native
  }
  
  val CRYPT_BLOWFISH: /* 1 */ Double = js.native
  val CRYPT_EXT_DES: /* 2 */ Double = js.native
}

