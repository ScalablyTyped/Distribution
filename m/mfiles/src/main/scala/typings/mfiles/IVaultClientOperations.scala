package typings.mfiles

import typings.mfiles.MFiles.MFOfflineTransitionResultFlags
import typings.mfiles.MFiles.MFOnlineTransitionResultFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultClientOperations extends StObject {
  
  def DisableCheckInReminderForCallingProcess(): Unit = js.native
  
  def EnableCheckInReminderForCallingProcess(): Unit = js.native
  
  def IsOffline(): Boolean = js.native
  
  def IsOnline(): Boolean = js.native
  
  def SetVaultToOffline(ParentWindow: Double): MFOfflineTransitionResultFlags = js.native
  
  def SetVaultToOnline(ParentWindow: Double): MFOnlineTransitionResultFlags = js.native
}
object IVaultClientOperations {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IVaultClientOperationsMutableBuilder[Self <: IVaultClientOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableCheckInReminderForCallingProcess(value: () => Unit): Self = StObject.set(x, "DisableCheckInReminderForCallingProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableCheckInReminderForCallingProcess(value: () => Unit): Self = StObject.set(x, "EnableCheckInReminderForCallingProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOffline(value: () => Boolean): Self = StObject.set(x, "IsOffline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOnline(value: () => Boolean): Self = StObject.set(x, "IsOnline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVaultToOffline(value: Double => MFOfflineTransitionResultFlags): Self = StObject.set(x, "SetVaultToOffline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVaultToOnline(value: Double => MFOnlineTransitionResultFlags): Self = StObject.set(x, "SetVaultToOnline", js.Any.fromFunction1(value))
  }
}
