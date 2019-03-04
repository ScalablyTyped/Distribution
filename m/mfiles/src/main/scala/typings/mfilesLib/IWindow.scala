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
    val __obj = js.Dynamic.literal(Close = Close, Events = Events, Focus = Focus, Handle = Handle, Height = Height, IsFocused = IsFocused, Maximizable = Maximizable, Maximize = Maximize, Minimizable = Minimizable, Minimize = Minimize, Resizable = Resizable, Restore = Restore, SetDefaultSize = SetDefaultSize, Title = Title, Width = Width)
  
    __obj.asInstanceOf[IWindow]
  }
}

