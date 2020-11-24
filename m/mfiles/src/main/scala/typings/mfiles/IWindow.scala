package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWindow extends js.Object {
  
  def Close(): Unit = js.native
  
  val Events: IWindowEvents = js.native
  
  def Focus(): Unit = js.native
  
  val Handle: Double = js.native
  
  var Height: Double = js.native
  
  val IsFocused: Boolean = js.native
  
  var Maximizable: Boolean = js.native
  
  def Maximize(): Unit = js.native
  
  var Minimizable: Boolean = js.native
  
  def Minimize(): Unit = js.native
  
  var Resizable: Boolean = js.native
  
  def Restore(): Unit = js.native
  
  def SetDefaultSize(defaultWidth: Double, defaultHeight: Double, resizeToDefault: Boolean): Unit = js.native
  
  var Title: String = js.native
  
  var Width: Double = js.native
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
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Events = Events.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), Handle = Handle.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], IsFocused = IsFocused.asInstanceOf[js.Any], Maximizable = Maximizable.asInstanceOf[js.Any], Maximize = js.Any.fromFunction0(Maximize), Minimizable = Minimizable.asInstanceOf[js.Any], Minimize = js.Any.fromFunction0(Minimize), Resizable = Resizable.asInstanceOf[js.Any], Restore = js.Any.fromFunction0(Restore), SetDefaultSize = js.Any.fromFunction3(SetDefaultSize), Title = Title.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWindow]
  }
  
  @scala.inline
  implicit class IWindowOps[Self <: IWindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("Close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvents(value: IWindowEvents): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("Focus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandle(value: Double): Self = this.set("Handle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("IsFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximizable(value: Boolean): Self = this.set("Maximizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximize(value: () => Unit): Self = this.set("Maximize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMinimizable(value: Boolean): Self = this.set("Minimizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimize(value: () => Unit): Self = this.set("Minimize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResizable(value: Boolean): Self = this.set("Resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestore(value: () => Unit): Self = this.set("Restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetDefaultSize(value: (Double, Double, Boolean) => Unit): Self = this.set("SetDefaultSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("Width", value.asInstanceOf[js.Any])
  }
}
