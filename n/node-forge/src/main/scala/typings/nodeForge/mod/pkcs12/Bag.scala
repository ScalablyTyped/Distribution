package typings.nodeForge.mod.pkcs12

import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bag extends js.Object {
  var asn1: Asn1
  var attributes: js.Any
  var cert: js.UndefOr[Certificate] = js.undefined
  var key: js.UndefOr[PrivateKey] = js.undefined
  var `type`: String
}

object Bag {
  @scala.inline
  def apply(asn1: Asn1, attributes: js.Any, `type`: String, cert: Certificate = null, key: PrivateKey = null): Bag = {
    val __obj = js.Dynamic.literal(asn1 = asn1.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bag]
  }
}

