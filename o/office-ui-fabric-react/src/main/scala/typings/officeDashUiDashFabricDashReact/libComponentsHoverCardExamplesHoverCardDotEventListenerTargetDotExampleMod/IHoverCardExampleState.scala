package typings.officeDashUiDashFabricDashReact.libComponentsHoverCardExamplesHoverCardDotEventListenerTargetDotExampleMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHoverCardExampleState extends js.Object {
  var eventListenerTarget: HTMLElement | Null
  var target: HTMLElement | Null
}

object IHoverCardExampleState {
  @scala.inline
  def apply(eventListenerTarget: HTMLElement = null, target: HTMLElement = null): IHoverCardExampleState = {
    val __obj = js.Dynamic.literal()
    if (eventListenerTarget != null) __obj.updateDynamic("eventListenerTarget")(eventListenerTarget.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHoverCardExampleState]
  }
}

