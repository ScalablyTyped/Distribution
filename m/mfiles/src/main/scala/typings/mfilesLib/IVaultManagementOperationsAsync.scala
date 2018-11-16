package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultManagementOperationsAsync extends js.Object {
  def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob): scala.Unit = js.native
  def ArchiveOldVersions(ArchiveOldVersionsJob: IArchiveOldVersionsJob, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ArchiveOldVersions(
    ArchiveOldVersionsJob: IArchiveOldVersionsJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ArchiveOldVersions(
    ArchiveOldVersionsJob: IArchiveOldVersionsJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ExportContent(ExportContentJob: IExportContentJob): scala.Unit = js.native
  def ExportContent(ExportContentJob: IExportContentJob, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ExportContent(
    ExportContentJob: IExportContentJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ExportContent(
    ExportContentJob: IExportContentJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetEventHandlers(): scala.Unit = js.native
  def GetEventHandlers(successCallback: js.Function1[/* result */ IEventHandlers, scala.Unit]): scala.Unit = js.native
  def GetEventHandlers(
    successCallback: js.Function1[/* result */ IEventHandlers, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetEventHandlers(
    successCallback: js.Function1[/* result */ IEventHandlers, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def GetVaultProperties(): scala.Unit = js.native
  def GetVaultProperties(successCallback: js.Function1[/* result */ IVaultProperties, scala.Unit]): scala.Unit = js.native
  def GetVaultProperties(
    successCallback: js.Function1[/* result */ IVaultProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def GetVaultProperties(
    successCallback: js.Function1[/* result */ IVaultProperties, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ImportContent(ImportContentJob: IImportContentJob): scala.Unit = js.native
  def ImportContent(ImportContentJob: IImportContentJob, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def ImportContent(
    ImportContentJob: IImportContentJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ImportContent(
    ImportContentJob: IImportContentJob,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def ImportContentAsync(ImportContentJob: IImportContentJob): scala.Unit = js.native
  def ImportContentAsync(
    ImportContentJob: IImportContentJob,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def ImportContentAsync(
    ImportContentJob: IImportContentJob,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def ImportContentAsync(
    ImportContentJob: IImportContentJob,
    successCallback: js.Function1[/* result */ scala.Double, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def IsAsyncJobRunning(JobID: scala.Double): scala.Unit = js.native
  def IsAsyncJobRunning(JobID: scala.Double, successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def IsAsyncJobRunning(
    JobID: scala.Double,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def IsAsyncJobRunning(
    JobID: scala.Double,
    successCallback: js.Function1[/* result */ scala.Boolean, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def PreviewImportContent(ImportContentJob: IImportContentJob, SummaryFile: java.lang.String): scala.Unit = js.native
  def PreviewImportContent(
    ImportContentJob: IImportContentJob,
    SummaryFile: java.lang.String,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def PreviewImportContent(
    ImportContentJob: IImportContentJob,
    SummaryFile: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def PreviewImportContent(
    ImportContentJob: IImportContentJob,
    SummaryFile: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def RebuildFullTextSearchIndex(Metadata: scala.Boolean, FileContents: scala.Boolean): scala.Unit = js.native
  def RebuildFullTextSearchIndex(Metadata: scala.Boolean, FileContents: scala.Boolean, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def RebuildFullTextSearchIndex(
    Metadata: scala.Boolean,
    FileContents: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def RebuildFullTextSearchIndex(
    Metadata: scala.Boolean,
    FileContents: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def SetEventHandlers(EventHandlers: IEventHandlers): scala.Unit = js.native
  def SetEventHandlers(EventHandlers: IEventHandlers, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def SetEventHandlers(
    EventHandlers: IEventHandlers,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def SetEventHandlers(
    EventHandlers: IEventHandlers,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateVaultProperties(VaultProperties: IVaultProperties, RegistrationDataOnly: scala.Boolean): scala.Unit = js.native
  def UpdateVaultProperties(
    VaultProperties: IVaultProperties,
    RegistrationDataOnly: scala.Boolean,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def UpdateVaultProperties(
    VaultProperties: IVaultProperties,
    RegistrationDataOnly: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def UpdateVaultProperties(
    VaultProperties: IVaultProperties,
    RegistrationDataOnly: scala.Boolean,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def VerifyVault(VerifyVaultJob: IVerifyVaultJob): scala.Unit = js.native
  def VerifyVault(
    VerifyVaultJob: IVerifyVaultJob,
    successCallback: js.Function1[/* result */ IVerifyVaultJobOutput, scala.Unit]
  ): scala.Unit = js.native
  def VerifyVault(
    VerifyVaultJob: IVerifyVaultJob,
    successCallback: js.Function1[/* result */ IVerifyVaultJobOutput, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def VerifyVault(
    VerifyVaultJob: IVerifyVaultJob,
    successCallback: js.Function1[/* result */ IVerifyVaultJobOutput, scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def WaitAsyncJob(JobID: scala.Double): scala.Unit = js.native
  def WaitAsyncJob(JobID: scala.Double, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def WaitAsyncJob(
    JobID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def WaitAsyncJob(
    JobID: scala.Double,
    successCallback: js.Function0[scala.Unit],
    errorCallback: js.Function3[
      /* shorterror */ java.lang.String, 
      /* longerror */ java.lang.String, 
      /* errorobj */ js.Any, 
      scala.Unit
    ],
    finallyCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
}

