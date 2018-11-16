package typings
package pkijsLib.srcMacDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MacData extends js.Object {
  var iterations: js.UndefOr[scala.Double] = js.undefined
  var mac: pkijsLib.srcDigestInfoMod.default
  var macSalt: asn1jsLib.asn1jsMod.OctetString
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

