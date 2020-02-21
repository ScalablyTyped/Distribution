package typings.node.tlsMod

import typings.node.NodeJS.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PSKCallbackNegotation extends js.Object {
  var identitty: String
  var psk: DataView | TypedArray
}

object PSKCallbackNegotation {
  @scala.inline
  def apply(identitty: String, psk: DataView | TypedArray): PSKCallbackNegotation = {
    val __obj = js.Dynamic.literal(identitty = identitty.asInstanceOf[js.Any], psk = psk.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PSKCallbackNegotation]
  }
}

