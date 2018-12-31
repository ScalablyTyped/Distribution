package typings
package pkijsLib.srcPKIStatusInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PKIStatusInfo extends js.Object {
  var failInfo: js.UndefOr[asn1jsLib.asn1jsMod.BitString] = js.undefined
  var status: scala.Double
  var statusStrings: js.UndefOr[asn1jsLib.asn1jsMod.Utf8String] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

