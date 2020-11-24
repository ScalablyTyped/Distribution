package typings.openfin.mod.fin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenFinDesktop extends js.Object {
  
  var Application: OpenFinApplicationStatic = js.native
  
  var ExternalApplication: OpenFinExternalApplicationStatic = js.native
  
  var Frame: OpenFinFrameStatic = js.native
  
  var GlobalHotkey: OpenFinGlobalHotkey = js.native
  
  var InterApplicationBus: OpenFinInterApplicationBus = js.native
  
  var Notification: OpenFinNotificationStatic = js.native
  
  var System: OpenFinSystem = js.native
  
  var Window: OpenFinWindowStatic = js.native
  
  def main(f: js.Function0[_]): Unit = js.native
}
object OpenFinDesktop {
  
  @scala.inline
  def apply(
    Application: OpenFinApplicationStatic,
    ExternalApplication: OpenFinExternalApplicationStatic,
    Frame: OpenFinFrameStatic,
    GlobalHotkey: OpenFinGlobalHotkey,
    InterApplicationBus: OpenFinInterApplicationBus,
    Notification: OpenFinNotificationStatic,
    System: OpenFinSystem,
    Window: OpenFinWindowStatic,
    main: js.Function0[_] => Unit
  ): OpenFinDesktop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ExternalApplication = ExternalApplication.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], GlobalHotkey = GlobalHotkey.asInstanceOf[js.Any], InterApplicationBus = InterApplicationBus.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], System = System.asInstanceOf[js.Any], Window = Window.asInstanceOf[js.Any], main = js.Any.fromFunction1(main))
    __obj.asInstanceOf[OpenFinDesktop]
  }
  
  @scala.inline
  implicit class OpenFinDesktopOps[Self <: OpenFinDesktop] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: OpenFinApplicationStatic): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalApplication(value: OpenFinExternalApplicationStatic): Self = this.set("ExternalApplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrame(value: OpenFinFrameStatic): Self = this.set("Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalHotkey(value: OpenFinGlobalHotkey): Self = this.set("GlobalHotkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterApplicationBus(value: OpenFinInterApplicationBus): Self = this.set("InterApplicationBus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: OpenFinNotificationStatic): Self = this.set("Notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystem(value: OpenFinSystem): Self = this.set("System", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: OpenFinWindowStatic): Self = this.set("Window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMain(value: js.Function0[_] => Unit): Self = this.set("main", js.Any.fromFunction1(value))
  }
}
