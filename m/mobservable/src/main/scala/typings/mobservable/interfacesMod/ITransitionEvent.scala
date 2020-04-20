package typings.mobservable.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransitionEvent extends js.Object {
  var changed: Boolean
  var context: js.Object
  var id: Double
  var name: String
  var newValue: String
  var state: String
}

object ITransitionEvent {
  @scala.inline
  def apply(changed: Boolean, context: js.Object, id: Double, name: String, newValue: String, state: String): ITransitionEvent = {
    val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransitionEvent]
  }
}

