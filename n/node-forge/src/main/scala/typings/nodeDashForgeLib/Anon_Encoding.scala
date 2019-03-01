package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: java.lang.String
  var message: java.lang.String
  var privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
}

object Anon_Encoding {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    message: java.lang.String,
    privateKey: nodeDashForgeLib.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
  ): Anon_Encoding = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("privateKey")(privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Encoding]
  }
}

