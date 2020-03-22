package typings.nodePhpass

import typings.nodePhpass.nodePhpassNumbers.`1`
import typings.nodePhpass.nodePhpassNumbers.`2`
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
    @JSName("HashPassword")
    def HashPassword_1(password: String, method: `1`): js.Promise[String] = js.native
    @JSName("HashPassword")
    def HashPassword_2(password: String, method: `2`): js.Promise[String] = js.native
  }
  
  val CRYPT_BLOWFISH: `1` = js.native
  val CRYPT_EXT_DES: `2` = js.native
}

