package typings
package pkijsLib.srcTimeStampReqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeStampReq extends js.Object {
  var certReq: js.UndefOr[scala.Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[pkijsLib.srcExtensionMod.default]] = js.undefined
  var messageImprint: pkijsLib.srcMessageImprintMod.default
  var nonce: js.UndefOr[asn1jsLib.asn1jsMod.Integer] = js.undefined
  var reqPolicy: js.UndefOr[java.lang.String] = js.undefined
  var version: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object TimeStampReq {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    messageImprint: pkijsLib.srcMessageImprintMod.default,
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    version: scala.Double,
    certReq: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[pkijsLib.srcExtensionMod.default] = null,
    nonce: asn1jsLib.asn1jsMod.Integer = null,
    reqPolicy: java.lang.String = null
  ): TimeStampReq = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, messageImprint = messageImprint, toJSON = toJSON, toSchema = toSchema, version = version)
    if (!js.isUndefined(certReq)) __obj.updateDynamic("certReq")(certReq)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (reqPolicy != null) __obj.updateDynamic("reqPolicy")(reqPolicy)
    __obj.asInstanceOf[TimeStampReq]
  }
}

