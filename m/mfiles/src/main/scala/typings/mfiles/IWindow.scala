package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWindow extends js.Object {
  val Events: IWindowEvents
  val Handle: Double
  var Height: Double
  val IsFocused: Boolean
  var Maximizable: Boolean
  var Minimizable: Boolean
  var Resizable: Boolean
  var Title: String
  var Width: Double
  def Close(): Unit
  def Focus(): Unit
  def Maximize(): Unit
  def Minimize(): Unit
  def Restore(): Unit
  def SetDefaultSize(defaultWidth: Double, defaultHeight: Double, resizeToDefault: Boolean): Unit
}

object IWindow {
  @scala.inline
  def apply(
    Close: () => Unit,
    Events: IWindowEvents,
    Focus: () => Unit,
    Handle: Double,
    Height: Double,
    IsFocused: Boolean,
    Maximizable: Boolean,
    Maximize: () => Unit,
    Minimizable: Boolean,
    Minimize: () => Unit,
    Resizable: Boolean,
    Restore: () => Unit,
    SetDefaultSize: (Double, Double, Boolean) => Unit,
    Title: String,
    Width: Double
  ): IWindow = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Events = Events, Focus = js.Any.fromFunction0(Focus), Handle = Handle, Height = Height, IsFocused = IsFocused, Maximizable = Maximizable, Maximize = js.Any.fromFunction0(Maximize), Minimizable = Minimizable, Minimize = js.Any.fromFunction0(Minimize), Resizable = Resizable, Restore = js.Any.fromFunction0(Restore), SetDefaultSize = js.Any.fromFunction3(SetDefaultSize), Title = Title, Width = Width)
  
    __obj.asInstanceOf[IWindow]
  }
}

