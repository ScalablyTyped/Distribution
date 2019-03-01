package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindow extends js.Object {
  val Events: IWindowEvents
  val Handle: scala.Double
  var Height: scala.Double
  val IsFocused: scala.Boolean
  var Maximizable: scala.Boolean
  var Minimizable: scala.Boolean
  var Resizable: scala.Boolean
  var Title: java.lang.String
  var Width: scala.Double
  def Close(): scala.Unit
  def Focus(): scala.Unit
  def Maximize(): scala.Unit
  def Minimize(): scala.Unit
  def Restore(): scala.Unit
  def SetDefaultSize(defaultWidth: scala.Double, defaultHeight: scala.Double, resizeToDefault: scala.Boolean): scala.Unit
}

object IWindow {
  @scala.inline
  def apply(
    Close: js.Function0[scala.Unit],
    Events: IWindowEvents,
    Focus: js.Function0[scala.Unit],
    Handle: scala.Double,
    Height: scala.Double,
    IsFocused: scala.Boolean,
    Maximizable: scala.Boolean,
    Maximize: js.Function0[scala.Unit],
    Minimizable: scala.Boolean,
    Minimize: js.Function0[scala.Unit],
    Resizable: scala.Boolean,
    Restore: js.Function0[scala.Unit],
    SetDefaultSize: js.Function3[scala.Double, scala.Double, scala.Boolean, scala.Unit],
    Title: java.lang.String,
    Width: scala.Double
  ): IWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("Focus")(Focus)
    __obj.updateDynamic("Handle")(Handle)
    __obj.updateDynamic("Height")(Height)
    __obj.updateDynamic("IsFocused")(IsFocused)
    __obj.updateDynamic("Maximizable")(Maximizable)
    __obj.updateDynamic("Maximize")(Maximize)
    __obj.updateDynamic("Minimizable")(Minimizable)
    __obj.updateDynamic("Minimize")(Minimize)
    __obj.updateDynamic("Resizable")(Resizable)
    __obj.updateDynamic("Restore")(Restore)
    __obj.updateDynamic("SetDefaultSize")(SetDefaultSize)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Width")(Width)
    __obj.asInstanceOf[IWindow]
  }
}

