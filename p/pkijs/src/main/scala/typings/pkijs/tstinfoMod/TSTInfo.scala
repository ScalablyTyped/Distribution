package typings.pkijs.tstinfoMod

import typings.asn1js.mod.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTInfo extends js.Object {
  var accuracy: js.UndefOr[typings.pkijs.accuracyMod.default] = js.undefined
  var extensions: js.UndefOr[js.Array[typings.pkijs.extensionMod.default]] = js.undefined
  var genTime: Date
  var messageImprint: typings.pkijs.messageImprintMod.default
  var nonce: js.UndefOr[Integer] = js.undefined
  var ordering: js.UndefOr[Boolean] = js.undefined
  var policy: String
  var serialNumber: Integer
  var tsa: js.UndefOr[typings.pkijs.generalNameMod.default] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
  def verify(params: VerifyParams): js.Thenable[Boolean]
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
    version: Double,
    accuracy: typings.pkijs.accuracyMod.default = null,
    extensions: js.Array[typings.pkijs.extensionMod.default] = null,
    nonce: Integer = null,
    ordering: js.UndefOr[Boolean] = js.undefined,
    tsa: typings.pkijs.generalNameMod.default = null
  ): TSTInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), genTime = genTime.asInstanceOf[js.Any], messageImprint = messageImprint.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), verify = js.Any.fromFunction1(verify), version = version.asInstanceOf[js.Any])
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering.asInstanceOf[js.Any])
    if (tsa != null) __obj.updateDynamic("tsa")(tsa.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTInfo]
  }
}

