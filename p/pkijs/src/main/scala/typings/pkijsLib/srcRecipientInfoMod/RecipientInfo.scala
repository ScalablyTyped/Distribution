package typings
package pkijsLib.srcRecipientInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipientInfo extends js.Object {
  var value: js.Any
  var variant: scala.Double
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RecipientInfo {
  @scala.inline
  def apply(
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any],
    value: js.Any,
    variant: scala.Double
  ): RecipientInfo = {
    val __obj = js.Dynamic.literal(fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema, value = value, variant = variant)
  
    __obj.asInstanceOf[RecipientInfo]
  }
}

