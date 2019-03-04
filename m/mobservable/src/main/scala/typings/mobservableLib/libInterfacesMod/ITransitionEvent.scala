package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransitionEvent extends js.Object {
  var changed: scala.Boolean
  var context: js.Object
  var id: scala.Double
  var name: java.lang.String
  var newValue: java.lang.String
  var state: java.lang.String
}

object ITransitionEvent {
  @scala.inline
  def apply(
    changed: scala.Boolean,
    context: js.Object,
    id: scala.Double,
    name: java.lang.String,
    newValue: java.lang.String,
    state: java.lang.String
  ): ITransitionEvent = {
    val __obj = js.Dynamic.literal(changed = changed, context = context, id = id, name = name, newValue = newValue, state = state)
  
    __obj.asInstanceOf[ITransitionEvent]
  }
}

