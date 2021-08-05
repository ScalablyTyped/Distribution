package typings.mfiles

import typings.mfiles.MFiles.MFOfflineTransitionResultFlags
import typings.mfiles.MFiles.MFOnlineTransitionResultFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultClientOperations extends StObject {
  
  def DisableCheckInReminderForCallingProcess(): Unit
  
  def EnableCheckInReminderForCallingProcess(): Unit
  
  def IsOffline(): Boolean
  
  def IsOnline(): Boolean
  
  def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags
  
  def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags
}
object IVaultClientOperations {
  
  inline def apply(
    DisableCheckInReminderForCallingProcess: () => Unit,
    EnableCheckInReminderForCallingProcess: () => Unit,
    IsOffline: () => Boolean,
    IsOnline: () => Boolean,
    SetVaultToOffline: Double => MFOfflineTransitionResultFlags,
    SetVaultToOnline: Double => MFOnlineTransitionResultFlags
  ): IVaultClientOperations = {
    val __obj = js.Dynamic.literal(DisableCheckInReminderForCallingProcess = js.Any.fromFunction0(DisableCheckInReminderForCallingProcess), EnableCheckInReminderForCallingProcess = js.Any.fromFunction0(EnableCheckInReminderForCallingProcess), IsOffline = js.Any.fromFunction0(IsOffline), IsOnline = js.Any.fromFunction0(IsOnline), SetVaultToOffline = js.Any.fromFunction1(SetVaultToOffline), SetVaultToOnline = js.Any.fromFunction1(SetVaultToOnline))
    __obj.asInstanceOf[IVaultClientOperations]
  }
  
  extension [Self <: IVaultClientOperations](x: Self) {
    
    inline def setDisableCheckInReminderForCallingProcess(value: () => Unit): Self = StObject.set(x, "DisableCheckInReminderForCallingProcess", js.Any.fromFunction0(value))
    
    inline def setEnableCheckInReminderForCallingProcess(value: () => Unit): Self = StObject.set(x, "EnableCheckInReminderForCallingProcess", js.Any.fromFunction0(value))
    
    inline def setIsOffline(value: () => Boolean): Self = StObject.set(x, "IsOffline", js.Any.fromFunction0(value))
    
    inline def setIsOnline(value: () => Boolean): Self = StObject.set(x, "IsOnline", js.Any.fromFunction0(value))
    
    inline def setSetVaultToOffline(value: Double => MFOfflineTransitionResultFlags): Self = StObject.set(x, "SetVaultToOffline", js.Any.fromFunction1(value))
    
    inline def setSetVaultToOnline(value: Double => MFOnlineTransitionResultFlags): Self = StObject.set(x, "SetVaultToOnline", js.Any.fromFunction1(value))
  }
}
