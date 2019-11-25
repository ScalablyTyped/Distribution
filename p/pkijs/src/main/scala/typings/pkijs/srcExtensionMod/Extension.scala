package typings.pkijs.srcExtensionMod

import typings.asn1js.asn1jsMod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var critical: Boolean
  var extnID: String
  var extnValue: OctetString
  var parsedValue: js.UndefOr[js.Any] = js.undefined
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object Extension {
  @scala.inline
  def apply(
    critical: Boolean,
    extnID: String,
    extnValue: OctetString,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    parsedValue: js.Any = null
  ): Extension = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], extnID = extnID.asInstanceOf[js.Any], extnValue = extnValue.asInstanceOf[js.Any], fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (parsedValue != null) __obj.updateDynamic("parsedValue")(parsedValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
}

