package typings.nodeForge.mod.pkcs12

import typings.nodeForge.mod.asn1.Asn1
import typings.nodeForge.mod.pki.Certificate
import typings.nodeForge.mod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bag extends js.Object {
  var asn1: Asn1 = js.native
  var attributes: js.Any = js.native
  var cert: js.UndefOr[Certificate] = js.native
  var key: js.UndefOr[PrivateKey] = js.native
  var `type`: String = js.native
}

object Bag {
  @scala.inline
  def apply(asn1: Asn1, attributes: js.Any, `type`: String): Bag = {
    val __obj = js.Dynamic.literal(asn1 = asn1.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bag]
  }
  @scala.inline
  implicit class BagOps[Self <: Bag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsn1(value: Asn1): Self = this.set("asn1", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCert(value: Certificate): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setKey(value: PrivateKey): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

