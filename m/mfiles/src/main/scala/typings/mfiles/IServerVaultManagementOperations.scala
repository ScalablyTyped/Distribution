package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerVaultManagementOperations extends js.Object {
  
  def AttachVault(VaultProperties: IVaultProperties, UpdateAttachmentGUID: Boolean): IVaultProperties = js.native
  
  def AttachVaultWithOptions(VaultProperties: IVaultProperties, Options: IAttachVaultOptions): IVaultProperties = js.native
  
  def BackupVault(BackupJob: IBackupJob): Unit = js.native
  
  def BringVaultOnline(VaultGUID: String): Unit = js.native
  
  def CopyVault(CopyVaultJob: ICopyVaultJob): ICopyVaultJobOutputInfo = js.native
  
  def CreateNewVault(VaultProperties: IVaultProperties): String = js.native
  
  def DestroyVault(VaultGUID: String): Unit = js.native
  
  def DetachVault(VaultGUID: String): Unit = js.native
  
  def GetBackupFileContents(BackupFileFull: String, BackupFileDifferential: String, Impersonation: IImpersonation): IVaultProperties = js.native
  
  def GetVaultProperties(VaultGUID: String): IVaultProperties = js.native
  
  def OptimizeVault(OptimizeVaultJob: IOptimizeVaultJob): Unit = js.native
  
  def RestoreVault(RestoreJob: IRestoreJob): Unit = js.native
  
  def TakeVaultOffline(VaultGUID: String, DisconnectUsers: Boolean): Unit = js.native
}
object IServerVaultManagementOperations {
  
  @scala.inline
  def apply(
    AttachVault: (IVaultProperties, Boolean) => IVaultProperties,
    AttachVaultWithOptions: (IVaultProperties, IAttachVaultOptions) => IVaultProperties,
    BackupVault: IBackupJob => Unit,
    BringVaultOnline: String => Unit,
    CopyVault: ICopyVaultJob => ICopyVaultJobOutputInfo,
    CreateNewVault: IVaultProperties => String,
    DestroyVault: String => Unit,
    DetachVault: String => Unit,
    GetBackupFileContents: (String, String, IImpersonation) => IVaultProperties,
    GetVaultProperties: String => IVaultProperties,
    OptimizeVault: IOptimizeVaultJob => Unit,
    RestoreVault: IRestoreJob => Unit,
    TakeVaultOffline: (String, Boolean) => Unit
  ): IServerVaultManagementOperations = {
    val __obj = js.Dynamic.literal(AttachVault = js.Any.fromFunction2(AttachVault), AttachVaultWithOptions = js.Any.fromFunction2(AttachVaultWithOptions), BackupVault = js.Any.fromFunction1(BackupVault), BringVaultOnline = js.Any.fromFunction1(BringVaultOnline), CopyVault = js.Any.fromFunction1(CopyVault), CreateNewVault = js.Any.fromFunction1(CreateNewVault), DestroyVault = js.Any.fromFunction1(DestroyVault), DetachVault = js.Any.fromFunction1(DetachVault), GetBackupFileContents = js.Any.fromFunction3(GetBackupFileContents), GetVaultProperties = js.Any.fromFunction1(GetVaultProperties), OptimizeVault = js.Any.fromFunction1(OptimizeVault), RestoreVault = js.Any.fromFunction1(RestoreVault), TakeVaultOffline = js.Any.fromFunction2(TakeVaultOffline))
    __obj.asInstanceOf[IServerVaultManagementOperations]
  }
  
  @scala.inline
  implicit class IServerVaultManagementOperationsOps[Self <: IServerVaultManagementOperations] (val x: Self) extends AnyVal {
    
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
    def setAttachVault(value: (IVaultProperties, Boolean) => IVaultProperties): Self = this.set("AttachVault", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttachVaultWithOptions(value: (IVaultProperties, IAttachVaultOptions) => IVaultProperties): Self = this.set("AttachVaultWithOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBackupVault(value: IBackupJob => Unit): Self = this.set("BackupVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBringVaultOnline(value: String => Unit): Self = this.set("BringVaultOnline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyVault(value: ICopyVaultJob => ICopyVaultJobOutputInfo): Self = this.set("CopyVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNewVault(value: IVaultProperties => String): Self = this.set("CreateNewVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyVault(value: String => Unit): Self = this.set("DestroyVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetachVault(value: String => Unit): Self = this.set("DetachVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBackupFileContents(value: (String, String, IImpersonation) => IVaultProperties): Self = this.set("GetBackupFileContents", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetVaultProperties(value: String => IVaultProperties): Self = this.set("GetVaultProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptimizeVault(value: IOptimizeVaultJob => Unit): Self = this.set("OptimizeVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestoreVault(value: IRestoreJob => Unit): Self = this.set("RestoreVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTakeVaultOffline(value: (String, Boolean) => Unit): Self = this.set("TakeVaultOffline", js.Any.fromFunction2(value))
  }
}
