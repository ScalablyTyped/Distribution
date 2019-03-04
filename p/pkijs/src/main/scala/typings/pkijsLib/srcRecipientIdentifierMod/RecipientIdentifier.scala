package typings
package pkijsLib.srcRecipientIdentifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientIdentifier extends js.Object {
  var value: js.Any
  var variant: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientIdentifier {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    value: js.Any,
    variant: scala.Double
  ): RecipientIdentifier = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema, value = value, variant = variant)
  
    __obj.asInstanceOf[RecipientIdentifier]
  }
}

