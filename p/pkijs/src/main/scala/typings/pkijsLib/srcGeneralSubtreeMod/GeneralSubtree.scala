package typings
package pkijsLib.srcGeneralSubtreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeneralSubtree extends js.Object {
  var base: pkijsLib.srcGeneralNameMod.default
  var maximum: js.UndefOr[scala.Double | asn1jsLib.asn1jsMod.Integer] = js.undefined
  var minimum: scala.Double | asn1jsLib.asn1jsMod.Integer
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

