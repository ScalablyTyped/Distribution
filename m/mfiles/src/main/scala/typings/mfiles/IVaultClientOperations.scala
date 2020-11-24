package typings.mfiles

import typings.mfiles.MFiles.MFOfflineTransitionResultFlags
import typings.mfiles.MFiles.MFOnlineTransitionResultFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultClientOperations extends js.Object {
  
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
  implicit class IVaultClientOperationsOps[Self <: IVaultClientOperations] (val x: Self) extends AnyVal {
    
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
    def setDisableCheckInReminderForCallingProcess(value: () => Unit): Self = this.set("DisableCheckInReminderForCallingProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableCheckInReminderForCallingProcess(value: () => Unit): Self = this.set("EnableCheckInReminderForCallingProcess", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOffline(value: () => Boolean): Self = this.set("IsOffline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsOnline(value: () => Boolean): Self = this.set("IsOnline", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetVaultToOffline(value: Double => MFOfflineTransitionResultFlags): Self = this.set("SetVaultToOffline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetVaultToOnline(value: Double => MFOnlineTransitionResultFlags): Self = this.set("SetVaultToOnline", js.Any.fromFunction1(value))
  }
}
