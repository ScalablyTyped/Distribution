package typings
package pkijsLib.srcExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Extension extends js.Object {
  var critical: scala.Boolean
  var extnID: java.lang.String
  var extnValue: asn1jsLib.asn1jsMod.OctetString
  var parsedValue: js.UndefOr[js.Any] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

