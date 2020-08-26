package typings.pkijs.tstinfoMod

import typings.asn1js.mod.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTInfo extends js.Object {
  var accuracy: js.UndefOr[typings.pkijs.accuracyMod.default] = js.native
  var extensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.native
  var genTime: Date = js.native
  var messageImprint: typings.pkijs.messageImprintMod.default = js.native
  var nonce: js.UndefOr[Integer] = js.native
  var ordering: js.UndefOr[Boolean] = js.native
  var policy: String = js.native
  var serialNumber: Integer = js.native
  var tsa: js.UndefOr[typings.pkijs.generalNameMod.default] = js.native
  var version: Double = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
  def verify(params: VerifyParams): js.Thenable[Boolean] = js.native
}

object TSTInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    genTime: Date,
    messageImprint: typings.pkijs.messageImprintMod.default,
    policy: String,
    serialNumber: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    verify: VerifyParams => js.Thenable[Boolean],
    version: Double
  ): TSTInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), verify = js.Any.fromFunction1(verify), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTInfo]
  }
  @scala.inline
  implicit class TSTInfoOps[Self <: TSTInfo] (val x: Self) extends AnyVal {
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
    def setGenTime(value: Date): Self = this.set("genTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageImprint(value: typings.pkijs.messageImprintMod.default): Self = this.set("messageImprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialNumber(value: Integer): Self = this.set("serialNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setToSchema(value: () => js.Any): Self = this.set("toSchema", js.Any.fromFunction0(value))
    @scala.inline
    def setVerify(value: VerifyParams => js.Thenable[Boolean]): Self = this.set("verify", js.Any.fromFunction1(value))
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccuracy(value: typings.pkijs.accuracyMod.default): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
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
    def setOrdering(value: Boolean): Self = this.set("ordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrdering: Self = this.set("ordering", js.undefined)
    @scala.inline
    def setTsa(value: typings.pkijs.generalNameMod.default): Self = this.set("tsa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTsa: Self = this.set("tsa", js.undefined)
  }
  
}

