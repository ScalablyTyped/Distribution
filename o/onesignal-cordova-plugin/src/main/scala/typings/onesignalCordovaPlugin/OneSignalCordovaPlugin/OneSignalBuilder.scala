package typings.onesignalCordovaPlugin.OneSignalCordovaPlugin

import typings.onesignalCordovaPlugin.anon.KOSSettingsKeyAutoPrompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneSignalBuilder extends StObject {
  
  def endInit(): Unit
  
  def handleNotificationOpened(callback: js.Function1[/* json */ OSNotificationOpenedResult, Unit]): OneSignalBuilder
  
  def handleNotificationReceived(callback: js.Function1[/* json */ OSNotification, Unit]): OneSignalBuilder
  
  def iOSSettings(settings: KOSSettingsKeyAutoPrompt): OneSignalBuilder
  
  def inFocusDisplaying(displayOption: OSDisplayType): OneSignalBuilder
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
  implicit class OneSignalBuilderMutableBuilder[Self <: OneSignalBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndInit(value: () => Unit): Self = StObject.set(x, "endInit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleNotificationOpened(value: js.Function1[/* json */ OSNotificationOpenedResult, Unit] => OneSignalBuilder): Self = StObject.set(x, "handleNotificationOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleNotificationReceived(value: js.Function1[/* json */ OSNotification, Unit] => OneSignalBuilder): Self = StObject.set(x, "handleNotificationReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIOSSettings(value: KOSSettingsKeyAutoPrompt => OneSignalBuilder): Self = StObject.set(x, "iOSSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInFocusDisplaying(value: OSDisplayType => OneSignalBuilder): Self = StObject.set(x, "inFocusDisplaying", js.Any.fromFunction1(value))
  }
}
