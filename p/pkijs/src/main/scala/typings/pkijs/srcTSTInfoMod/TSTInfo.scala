package typings.pkijs.srcTSTInfoMod

import typings.asn1js.asn1jsMod.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTInfo extends js.Object {
  var accuracy: js.UndefOr[typings.pkijs.srcAccuracyMod.default] = js.undefined
  var extensions: js.UndefOr[js.Array[typings.pkijs.srcExtensionMod.default]] = js.undefined
  var genTime: Date
  var messageImprint: typings.pkijs.srcMessageImprintMod.default
  var nonce: js.UndefOr[Integer] = js.undefined
  var ordering: js.UndefOr[Boolean] = js.undefined
  var policy: String
  var serialNumber: Integer
  var tsa: js.UndefOr[typings.pkijs.srcGeneralNameMod.default] = js.undefined
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
    messageImprint: typings.pkijs.srcMessageImprintMod.default,
    policy: String,
    serialNumber: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    verify: VerifyParams => js.Thenable[Boolean],
    version: Double,
    accuracy: typings.pkijs.srcAccuracyMod.default = null,
    extensions: js.Array[typings.pkijs.srcExtensionMod.default] = null,
    nonce: Integer = null,
    ordering: js.UndefOr[Boolean] = js.undefined,
    tsa: typings.pkijs.srcGeneralNameMod.default = null
  ): TSTInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), genTime = genTime, messageImprint = messageImprint, policy = policy, serialNumber = serialNumber, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), verify = js.Any.fromFunction1(verify), version = version)
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering)
    if (tsa != null) __obj.updateDynamic("tsa")(tsa)
    __obj.asInstanceOf[TSTInfo]
  }
}

