package typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod

import typings.react.reactMod.KeyboardEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPanel extends js.Object {
  /**
    * Forces the panel to dismiss.
    */
  def dismiss(): Unit = js.native
  def dismiss(ev: KeyboardEvent[HTMLElement]): Unit = js.native
  /**
    * Forces the panel to open.
    */
  def open(): Unit = js.native
}

