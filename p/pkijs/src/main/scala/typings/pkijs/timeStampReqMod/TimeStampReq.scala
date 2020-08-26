package typings.pkijs.timeStampReqMod

import typings.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeStampReq extends js.Object {
  var certReq: js.UndefOr[Boolean] = js.native
  var extensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.native
  var messageImprint: typings.pkijs.messageImprintMod.default = js.native
  var nonce: js.UndefOr[Integer] = js.native
  var reqPolicy: js.UndefOr[String] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object TimeStampReq {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    messageImprint: typings.pkijs.messageImprintMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): TimeStampReq = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), messageImprint = messageImprint.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStampReq]
  }
  @scala.inline
  implicit class TimeStampReqOps[Self <: TimeStampReq] (val x: Self) extends AnyVal {
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
    def setMessageImprint(value: typings.pkijs.messageImprintMod.default): Self = this.set("messageImprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertReq(value: Boolean): Self = this.set("certReq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertReq: Self = this.set("certReq", js.undefined)
    @scala.inline
    def setExtensionsVarargs(value: typings.pkijs.extensionMod.default*): Self = this.set("extensions", js.Array(value :_*))
    @scala.inline
    def setExtensions(value: js.Array[typings.pkijs.extensionMod.default]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setNonce(value: Integer): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonce: Self = this.set("nonce", js.undefined)
    @scala.inline
    def setReqPolicy(value: String): Self = this.set("reqPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReqPolicy: Self = this.set("reqPolicy", js.undefined)
  }
  
}

