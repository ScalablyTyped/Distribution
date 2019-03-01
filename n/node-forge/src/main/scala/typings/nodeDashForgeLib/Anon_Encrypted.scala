package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Encrypted extends js.Object {
  var encrypted: scala.Boolean
  var safeBags: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag]
}

object Anon_Encrypted {
  @scala.inline
  def apply(encrypted: scala.Boolean, safeBags: js.Array[nodeDashForgeLib.nodeDashForgeMod.pkcs12Ns.Bag]): Anon_Encrypted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.updateDynamic("safeBags")(safeBags)
    __obj.asInstanceOf[Anon_Encrypted]
  }
}

