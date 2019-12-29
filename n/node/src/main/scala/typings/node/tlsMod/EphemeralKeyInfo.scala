package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EphemeralKeyInfo extends js.Object {
  /**
    * The name property is available only when type is 'ECDH'.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The size of parameter of an ephemeral key exchange.
    */
  var size: Double
  /**
    * The supported types are 'DH' and 'ECDH'.
    */
  var `type`: String
}

object EphemeralKeyInfo {
  @scala.inline
  def apply(size: Double, `type`: String, name: String = null): EphemeralKeyInfo = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EphemeralKeyInfo]
  }
}

