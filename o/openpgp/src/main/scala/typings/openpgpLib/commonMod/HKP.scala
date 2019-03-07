package typings
package openpgpLib.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp/common", "HKP")
@js.native
class HKP () extends js.Object {
  def this(keyServerUrl: java.lang.String) = this()
  def lookup(options: openpgpLib.Anon_KeyId): js.Promise[java.lang.String] = js.native
  def upload(publicKeyArmored: java.lang.String): js.Promise[stdLib.Response] = js.native
}

