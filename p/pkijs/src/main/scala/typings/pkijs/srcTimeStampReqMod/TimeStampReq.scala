package typings.pkijs.srcTimeStampReqMod

import typings.asn1js.asn1jsMod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeStampReq extends js.Object {
  var certReq: js.UndefOr[Boolean] = js.undefined
  var extensions: js.UndefOr[js.Array[typings.pkijs.srcExtensionMod.default]] = js.undefined
  var messageImprint: typings.pkijs.srcMessageImprintMod.default
  var nonce: js.UndefOr[Integer] = js.undefined
  var reqPolicy: js.UndefOr[String] = js.undefined
  var version: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object TimeStampReq {
  @scala.inline
  def apply(
    fromSchema: js.Any => Unit,
    messageImprint: typings.pkijs.srcMessageImprintMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double,
    certReq: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[typings.pkijs.srcExtensionMod.default] = null,
    nonce: Integer = null,
    reqPolicy: String = null
  ): TimeStampReq = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), messageImprint = messageImprint, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version)
    if (!js.isUndefined(certReq)) __obj.updateDynamic("certReq")(certReq)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (reqPolicy != null) __obj.updateDynamic("reqPolicy")(reqPolicy)
    __obj.asInstanceOf[TimeStampReq]
  }
}

