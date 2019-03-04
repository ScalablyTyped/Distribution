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

object Extension {
  @scala.inline
  def apply(
    critical: scala.Boolean,
    extnID: java.lang.String,
    extnValue: asn1jsLib.asn1jsMod.OctetString,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    parsedValue: js.Any = null
  ): Extension = {
    val __obj = js.Dynamic.literal(critical = critical, extnID = extnID, extnValue = extnValue, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
    if (parsedValue != null) __obj.updateDynamic("parsedValue")(parsedValue)
    __obj.asInstanceOf[Extension]
  }
}

