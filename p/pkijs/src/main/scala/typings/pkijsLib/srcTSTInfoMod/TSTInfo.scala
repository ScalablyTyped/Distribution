package typings
package pkijsLib.srcTSTInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSTInfo extends js.Object {
  var accuracy: js.UndefOr[pkijsLib.srcAccuracyMod.default] = js.undefined
  var extensions: js.UndefOr[js.Array[pkijsLib.srcExtensionMod.default]] = js.undefined
  var genTime: stdLib.Date
  var messageImprint: pkijsLib.srcMessageImprintMod.default
  var nonce: js.UndefOr[asn1jsLib.asn1jsMod.Integer] = js.undefined
  var ordering: js.UndefOr[scala.Boolean] = js.undefined
  var policy: java.lang.String
  var serialNumber: asn1jsLib.asn1jsMod.Integer
  var tsa: js.UndefOr[pkijsLib.srcGeneralNameMod.default] = js.undefined
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
  def verify(params: VerifyParams): js.Thenable[scala.Boolean]
}

object TSTInfo {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    genTime: stdLib.Date,
    messageImprint: pkijsLib.srcMessageImprintMod.default,
    policy: java.lang.String,
    serialNumber: asn1jsLib.asn1jsMod.Integer,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    verify: js.Function1[VerifyParams, js.Thenable[scala.Boolean]],
    version: scala.Double,
    accuracy: pkijsLib.srcAccuracyMod.default = null,
    extensions: js.Array[pkijsLib.srcExtensionMod.default] = null,
    nonce: asn1jsLib.asn1jsMod.Integer = null,
    ordering: js.UndefOr[scala.Boolean] = js.undefined,
    tsa: pkijsLib.srcGeneralNameMod.default = null
  ): TSTInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("genTime")(genTime)
    __obj.updateDynamic("messageImprint")(messageImprint)
    __obj.updateDynamic("policy")(policy)
    __obj.updateDynamic("serialNumber")(serialNumber)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.updateDynamic("verify")(verify)
    __obj.updateDynamic("version")(version)
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (!js.isUndefined(ordering)) __obj.updateDynamic("ordering")(ordering)
    if (tsa != null) __obj.updateDynamic("tsa")(tsa)
    __obj.asInstanceOf[TSTInfo]
  }
}

