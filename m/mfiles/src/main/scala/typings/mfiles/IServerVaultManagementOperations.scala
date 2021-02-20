package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IServerVaultManagementOperations extends StObject {
  
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
  implicit class IServerVaultManagementOperationsMutableBuilder[Self <: IServerVaultManagementOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachVault(value: (IVaultProperties, Boolean) => IVaultProperties): Self = StObject.set(x, "AttachVault", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAttachVaultWithOptions(value: (IVaultProperties, IAttachVaultOptions) => IVaultProperties): Self = StObject.set(x, "AttachVaultWithOptions", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBackupVault(value: IBackupJob => Unit): Self = StObject.set(x, "BackupVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBringVaultOnline(value: String => Unit): Self = StObject.set(x, "BringVaultOnline", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyVault(value: ICopyVaultJob => ICopyVaultJobOutputInfo): Self = StObject.set(x, "CopyVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateNewVault(value: IVaultProperties => String): Self = StObject.set(x, "CreateNewVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroyVault(value: String => Unit): Self = StObject.set(x, "DestroyVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDetachVault(value: String => Unit): Self = StObject.set(x, "DetachVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBackupFileContents(value: (String, String, IImpersonation) => IVaultProperties): Self = StObject.set(x, "GetBackupFileContents", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetVaultProperties(value: String => IVaultProperties): Self = StObject.set(x, "GetVaultProperties", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOptimizeVault(value: IOptimizeVaultJob => Unit): Self = StObject.set(x, "OptimizeVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestoreVault(value: IRestoreJob => Unit): Self = StObject.set(x, "RestoreVault", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTakeVaultOffline(value: (String, Boolean) => Unit): Self = StObject.set(x, "TakeVaultOffline", js.Any.fromFunction2(value))
  }
}
