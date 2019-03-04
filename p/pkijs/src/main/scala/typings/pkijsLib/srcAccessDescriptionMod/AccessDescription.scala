package typings
package pkijsLib.srcAccessDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessDescription extends js.Object {
  var accessLocation: default
  var accessMethod: java.lang.String
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AccessDescription {
  @scala.inline
  def apply(
    accessLocation: default,
    accessMethod: java.lang.String,
    fromSchema: js.Function1[js.Any, scala.Unit],
    toJSON: js.Function0[js.Any],
    toSchema: js.Function0[js.Any]
  ): AccessDescription = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation, accessMethod = accessMethod, fromSchema = fromSchema, toJSON = toJSON, toSchema = toSchema)
  
    __obj.asInstanceOf[AccessDescription]
  }
}

