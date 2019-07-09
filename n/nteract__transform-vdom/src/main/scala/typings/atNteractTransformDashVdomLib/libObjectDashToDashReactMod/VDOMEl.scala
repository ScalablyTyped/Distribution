package typings
package atNteractTransformDashVdomLib.libObjectDashToDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VDOMEl extends js.Object {
  var attributes: Attributes
  var children: reactLib.reactMod.ReactNode | VDOMEl | (js.Array[reactLib.reactMod.ReactNode | VDOMEl])
  var eventHandlers: js.UndefOr[EventHandlers] = js.undefined
  var key: scala.Double | java.lang.String | scala.Null
  var tagName: java.lang.String
}

object VDOMEl {
  @scala.inline
  def apply(
    attributes: Attributes,
    children: reactLib.reactMod.ReactNode | VDOMEl | (js.Array[reactLib.reactMod.ReactNode | VDOMEl]),
    tagName: java.lang.String,
    eventHandlers: EventHandlers = null,
    key: scala.Double | java.lang.String = null
  ): VDOMEl = {
    val __obj = js.Dynamic.literal(attributes = attributes, children = children.asInstanceOf[js.Any], tagName = tagName)
    if (eventHandlers != null) __obj.updateDynamic("eventHandlers")(eventHandlers)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[VDOMEl]
  }
}

