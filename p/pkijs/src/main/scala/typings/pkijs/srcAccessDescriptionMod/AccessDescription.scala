package typings.pkijs.srcAccessDescriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessDescription extends js.Object {
  var accessLocation: default
  var accessMethod: String
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object AccessDescription {
  @scala.inline
  def apply(
    accessLocation: default,
    accessMethod: String,
    fromSchema: js.Any => Unit,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): AccessDescription = {
    val __obj = js.Dynamic.literal(accessLocation = accessLocation, accessMethod = accessMethod, fromSchema = js.Any.fromFunction1(fromSchema), toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
  
    __obj.asInstanceOf[AccessDescription]
  }
}

