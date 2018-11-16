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

