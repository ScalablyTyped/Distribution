package typings.nodeDashForge.nodeDashForgeMod.pkcs12

import typings.nodeDashForge.nodeDashForgeMod.asn1.Asn1
import typings.nodeDashForge.nodeDashForgeMod.pki.Certificate
import typings.nodeDashForge.nodeDashForgeMod.pki.PrivateKey
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
    val __obj = js.Dynamic.literal(asn1 = asn1, attributes = attributes)
    __obj.updateDynamic("type")(`type`)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bag]
  }
}

