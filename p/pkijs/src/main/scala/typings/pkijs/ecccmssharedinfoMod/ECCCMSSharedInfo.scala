package typings.pkijs.ecccmssharedinfoMod

import typings.asn1js.mod.OctetString
import typings.std.AlgorithmIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECCCMSSharedInfo extends js.Object {
  var entityUInfo: js.UndefOr[OctetString] = js.native
  var keyInfo: AlgorithmIdentifier = js.native
  var suppPubInfo: OctetString = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object ECCCMSSharedInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    keyInfo: AlgorithmIdentifier,
    suppPubInfo: OctetString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): ECCCMSSharedInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), keyInfo = keyInfo.asInstanceOf[js.Any], suppPubInfo = suppPubInfo.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[ECCCMSSharedInfo]
  }
  @scala.inline
  implicit class ECCCMSSharedInfoOps[Self <: ECCCMSSharedInfo] (val x: Self) extends AnyVal {
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
    def setFromSchema(value: js.Any => Unit): Self = this.set("fromSchema", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyInfo(value: AlgorithmIdentifier): Self = this.set("keyInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuppPubInfo(value: OctetString): Self = this.set("suppPubInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setEntityUInfo(value: OctetString): Self = this.set("entityUInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityUInfo: Self = this.set("entityUInfo", js.undefined)
  }
  
}

