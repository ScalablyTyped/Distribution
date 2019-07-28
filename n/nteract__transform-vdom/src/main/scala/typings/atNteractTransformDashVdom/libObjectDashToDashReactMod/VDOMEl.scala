package typings.atNteractTransformDashVdom.libObjectDashToDashReactMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VDOMEl extends js.Object {
  var attributes: Attributes
  var children: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl])
  var eventHandlers: js.UndefOr[EventHandlers] = js.undefined
  var key: Double | String | Null
  var tagName: String
}

object VDOMEl {
  @scala.inline
  def apply(
    attributes: Attributes,
    children: ReactNode | VDOMEl | (js.Array[ReactNode | VDOMEl]),
    tagName: String,
    eventHandlers: EventHandlers = null,
    key: Double | String = null
  ): VDOMEl = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], tagName = tagName)
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VDOMEl]
  }
}

