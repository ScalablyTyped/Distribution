package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultManagementOperations extends js.Object {
  def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): Unit = js.native
  def ExportContent(ExportContentJob: IExportContentJob): Unit = js.native
  def GetEventHandlers(): IEventHandlers = js.native
  def GetVaultProperties(): IVaultProperties = js.native
  def ImportContent(ImportContentJob: IImportContentJob): Unit = js.native
  def ImportContentAsync(ImportContentJob: IImportContentJob): Double = js.native
  def IsAsyncJobRunning(JobID: Double): Boolean = js.native
  def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: String): Unit = js.native
  def RebuildFullTextSearchIndex(Metadata: Boolean, FileContents: Boolean): Unit = js.native
  def SetEventHandlers(EventHandlers: IEventHandlers): Unit = js.native
  def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: Boolean): Unit = js.native
  def VerifyVault(VerifyVaultJob: IVerifyVaultJob): IVerifyVaultJobOutput = js.native
  def WaitAsyncJob(JobID: Double): Unit = js.native
}

object IVaultManagementOperations {
  @scala.inline
  def apply(
    ArchiveOldVersions: IArchiveOldVersionsJob => Unit,
    ExportContent: IExportContentJob => Unit,
    GetEventHandlers: () => IEventHandlers,
    GetVaultProperties: () => IVaultProperties,
    ImportContent: IImportContentJob => Unit,
    ImportContentAsync: IImportContentJob => Double,
    IsAsyncJobRunning: Double => Boolean,
    PreviewImportContent: (IImportContentJob, String) => Unit,
    RebuildFullTextSearchIndex: (Boolean, Boolean) => Unit,
    SetEventHandlers: IEventHandlers => Unit,
    UpdateVaultProperties: (IVaultProperties, Boolean) => Unit,
    VerifyVault: IVerifyVaultJob => IVerifyVaultJobOutput,
    WaitAsyncJob: Double => Unit
  ): IVaultManagementOperations = {
    val __obj = js.Dynamic.literal(ArchiveOldVersions = js.Any.fromFunction1(ArchiveOldVersions), ExportContent = js.Any.fromFunction1(ExportContent), GetEventHandlers = js.Any.fromFunction0(GetEventHandlers), GetVaultProperties = js.Any.fromFunction0(GetVaultProperties), ImportContent = js.Any.fromFunction1(ImportContent), ImportContentAsync = js.Any.fromFunction1(ImportContentAsync), IsAsyncJobRunning = js.Any.fromFunction1(IsAsyncJobRunning), PreviewImportContent = js.Any.fromFunction2(PreviewImportContent), RebuildFullTextSearchIndex = js.Any.fromFunction2(RebuildFullTextSearchIndex), SetEventHandlers = js.Any.fromFunction1(SetEventHandlers), UpdateVaultProperties = js.Any.fromFunction2(UpdateVaultProperties), VerifyVault = js.Any.fromFunction1(VerifyVault), WaitAsyncJob = js.Any.fromFunction1(WaitAsyncJob))
    __obj.asInstanceOf[IVaultManagementOperations]
  }
  @scala.inline
  implicit class IVaultManagementOperationsOps[Self <: IVaultManagementOperations] (val x: Self) extends AnyVal {
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
    def setArchiveOldVersions(value: IArchiveOldVersionsJob => Unit): Self = this.set("ArchiveOldVersions", js.Any.fromFunction1(value))
    @scala.inline
    def setExportContent(value: IExportContentJob => Unit): Self = this.set("ExportContent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetEventHandlers(value: () => IEventHandlers): Self = this.set("GetEventHandlers", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVaultProperties(value: () => IVaultProperties): Self = this.set("GetVaultProperties", js.Any.fromFunction0(value))
    @scala.inline
    def setImportContent(value: IImportContentJob => Unit): Self = this.set("ImportContent", js.Any.fromFunction1(value))
    @scala.inline
    def setImportContentAsync(value: IImportContentJob => Double): Self = this.set("ImportContentAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setIsAsyncJobRunning(value: Double => Boolean): Self = this.set("IsAsyncJobRunning", js.Any.fromFunction1(value))
    @scala.inline
    def setPreviewImportContent(value: (IImportContentJob, String) => Unit): Self = this.set("PreviewImportContent", js.Any.fromFunction2(value))
    @scala.inline
    def setRebuildFullTextSearchIndex(value: (Boolean, Boolean) => Unit): Self = this.set("RebuildFullTextSearchIndex", js.Any.fromFunction2(value))
    @scala.inline
    def setSetEventHandlers(value: IEventHandlers => Unit): Self = this.set("SetEventHandlers", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateVaultProperties(value: (IVaultProperties, Boolean) => Unit): Self = this.set("UpdateVaultProperties", js.Any.fromFunction2(value))
    @scala.inline
    def setVerifyVault(value: IVerifyVaultJob => IVerifyVaultJobOutput): Self = this.set("VerifyVault", js.Any.fromFunction1(value))
    @scala.inline
    def setWaitAsyncJob(value: Double => Unit): Self = this.set("WaitAsyncJob", js.Any.fromFunction1(value))
  }
  
}

