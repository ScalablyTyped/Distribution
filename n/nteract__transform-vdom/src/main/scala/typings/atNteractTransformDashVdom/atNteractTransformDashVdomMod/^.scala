package typings.atNteractTransformDashVdom.atNteractTransformDashVdomMod

import typings.atNteractTransformDashVdom.libEventDashToDashObjectMod.SerializedEvent
import typings.atNteractTransformDashVdom.libObjectDashToDashReactMod.VDOMEl
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def objectToReactElement(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[/* targetName */ String, /* event */ SerializedEvent[_], Unit]
  ): ReactElement = js.native
}

