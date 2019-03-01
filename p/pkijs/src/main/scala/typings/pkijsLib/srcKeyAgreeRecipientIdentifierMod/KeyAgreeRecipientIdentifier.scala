package typings
package pkijsLib.srcKeyAgreeRecipientIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyAgreeRecipientIdentifier extends js.Object {
  var value: js.Any
  var variant: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object KeyAgreeRecipientIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    value: js.Any,
    variant: scala.Double
  ): KeyAgreeRecipientIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromSchema")(fromSchema)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("toSchema")(toSchema)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("variant")(variant)
    __obj.asInstanceOf[KeyAgreeRecipientIdentifier]
  }
}

