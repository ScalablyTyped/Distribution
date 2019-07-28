package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pkiNs.ed25519Ns.NativeBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encoding extends js.Object {
  var encoding: String
  var message: String
  var privateKey: NativeBuffer
}

object Anon_Encoding {
  @scala.inline
  def apply(encoding: String, message: String, privateKey: NativeBuffer): Anon_Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding, message = message, privateKey = privateKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Encoding]
  }
}

