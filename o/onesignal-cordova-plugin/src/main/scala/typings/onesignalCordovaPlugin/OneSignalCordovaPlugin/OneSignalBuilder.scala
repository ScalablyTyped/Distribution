package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.anon.KOSSettingsKeyAutoPrompt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneSignalBuilder extends js.Object {
  
  def endInit(): Unit = js.native
  
  def handleNotificationOpened(callback: js.Function1[/* json */ OSNotificationOpenedResult, Unit]): OneSignalBuilder = js.native
  
  def handleNotificationReceived(callback: js.Function1[/* json */ OSNotification, Unit]): OneSignalBuilder = js.native
  
  def iOSSettings(settings: KOSSettingsKeyAutoPrompt): OneSignalBuilder = js.native
  
  def inFocusDisplaying(displayOption: OSDisplayType): OneSignalBuilder = js.native
}
object OneSignalBuilder {
  
  @scala.inline
  def apply(
    endInit: () => Unit,
    handleNotificationOpened: js.Function1[/* json */ OSNotificationOpenedResult, Unit] => OneSignalBuilder,
    handleNotificationReceived: js.Function1[/* json */ OSNotification, Unit] => OneSignalBuilder,
    iOSSettings: KOSSettingsKeyAutoPrompt => OneSignalBuilder,
    inFocusDisplaying: OSDisplayType => OneSignalBuilder
  ): OneSignalBuilder = {
    val __obj = js.Dynamic.literal(endInit = js.Any.fromFunction0(endInit), handleNotificationOpened = js.Any.fromFunction1(handleNotificationOpened), handleNotificationReceived = js.Any.fromFunction1(handleNotificationReceived), iOSSettings = js.Any.fromFunction1(iOSSettings), inFocusDisplaying = js.Any.fromFunction1(inFocusDisplaying))
    __obj.asInstanceOf[OneSignalBuilder]
  }
  
  @scala.inline
  implicit class OneSignalBuilderOps[Self <: OneSignalBuilder] (val x: Self) extends AnyVal {
    
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
    def setEndInit(value: () => Unit): Self = this.set("endInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleNotificationOpened(value: js.Function1[/* json */ OSNotificationOpenedResult, Unit] => OneSignalBuilder): Self = this.set("handleNotificationOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleNotificationReceived(value: js.Function1[/* json */ OSNotification, Unit] => OneSignalBuilder): Self = this.set("handleNotificationReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIOSSettings(value: KOSSettingsKeyAutoPrompt => OneSignalBuilder): Self = this.set("iOSSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInFocusDisplaying(value: OSDisplayType => OneSignalBuilder): Self = this.set("inFocusDisplaying", js.Any.fromFunction1(value))
  }
}
