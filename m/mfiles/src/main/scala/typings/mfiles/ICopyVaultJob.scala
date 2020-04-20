package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyVaultJob extends js.Object {
  var CopyflagAllData: Boolean
  var CopyflagAllExceptData: Boolean
  var CopyflagApplications: Boolean
  var CopyflagDataSets: Boolean
  var CopyflagDocumentProfiles: Boolean
  var CopyflagDocuments: Boolean
  var CopyflagEventLog: Boolean
  var CopyflagExternalLocations: Boolean
  var CopyflagFiles: Boolean
  var CopyflagInternalEventHandlers: Boolean
  var CopyflagLanguagesAndTranslations: Boolean
  var CopyflagPropertyDefinitions: Boolean
  var CopyflagScheduledExportAndImportJobs: Boolean
  var CopyflagUseTargetGUID: Boolean
  var CopyflagUserAccounts: Boolean
  var CopyflagValueListContent: Boolean
  var CopyflagValueLists: Boolean
  var CopyflagViews: Boolean
  var CopyflagWorkflows: Boolean
  var VaultGUID: String
  var VaultProperties: IVaultProperties
  def Clone(): ICopyVaultJob
}

object ICopyVaultJob {
  @scala.inline
  def apply(
    Clone: () => ICopyVaultJob,
    CopyflagAllData: Boolean,
    CopyflagAllExceptData: Boolean,
    CopyflagApplications: Boolean,
    CopyflagDataSets: Boolean,
    CopyflagDocumentProfiles: Boolean,
    CopyflagDocuments: Boolean,
    CopyflagEventLog: Boolean,
    CopyflagExternalLocations: Boolean,
    CopyflagFiles: Boolean,
    CopyflagInternalEventHandlers: Boolean,
    CopyflagLanguagesAndTranslations: Boolean,
    CopyflagPropertyDefinitions: Boolean,
    CopyflagScheduledExportAndImportJobs: Boolean,
    CopyflagUseTargetGUID: Boolean,
    CopyflagUserAccounts: Boolean,
    CopyflagValueListContent: Boolean,
    CopyflagValueLists: Boolean,
    CopyflagViews: Boolean,
    CopyflagWorkflows: Boolean,
    VaultGUID: String,
    VaultProperties: IVaultProperties
  ): ICopyVaultJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CopyflagAllData = CopyflagAllData.asInstanceOf[js.Any], CopyflagAllExceptData = CopyflagAllExceptData.asInstanceOf[js.Any], CopyflagApplications = CopyflagApplications.asInstanceOf[js.Any], CopyflagDataSets = CopyflagDataSets.asInstanceOf[js.Any], CopyflagDocumentProfiles = CopyflagDocumentProfiles.asInstanceOf[js.Any], CopyflagDocuments = CopyflagDocuments.asInstanceOf[js.Any], CopyflagEventLog = CopyflagEventLog.asInstanceOf[js.Any], CopyflagExternalLocations = CopyflagExternalLocations.asInstanceOf[js.Any], CopyflagFiles = CopyflagFiles.asInstanceOf[js.Any], CopyflagInternalEventHandlers = CopyflagInternalEventHandlers.asInstanceOf[js.Any], CopyflagLanguagesAndTranslations = CopyflagLanguagesAndTranslations.asInstanceOf[js.Any], CopyflagPropertyDefinitions = CopyflagPropertyDefinitions.asInstanceOf[js.Any], CopyflagScheduledExportAndImportJobs = CopyflagScheduledExportAndImportJobs.asInstanceOf[js.Any], CopyflagUseTargetGUID = CopyflagUseTargetGUID.asInstanceOf[js.Any], CopyflagUserAccounts = CopyflagUserAccounts.asInstanceOf[js.Any], CopyflagValueListContent = CopyflagValueListContent.asInstanceOf[js.Any], CopyflagValueLists = CopyflagValueLists.asInstanceOf[js.Any], CopyflagViews = CopyflagViews.asInstanceOf[js.Any], CopyflagWorkflows = CopyflagWorkflows.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any], VaultProperties = VaultProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICopyVaultJob]
  }
}

