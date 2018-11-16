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
  def verify(params: VerifyParams): stdLib.PromiseLike[scala.Boolean]
}

