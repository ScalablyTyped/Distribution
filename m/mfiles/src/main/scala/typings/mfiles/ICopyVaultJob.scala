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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), CopyflagAllData = CopyflagAllData, CopyflagAllExceptData = CopyflagAllExceptData, CopyflagApplications = CopyflagApplications, CopyflagDataSets = CopyflagDataSets, CopyflagDocumentProfiles = CopyflagDocumentProfiles, CopyflagDocuments = CopyflagDocuments, CopyflagEventLog = CopyflagEventLog, CopyflagExternalLocations = CopyflagExternalLocations, CopyflagFiles = CopyflagFiles, CopyflagInternalEventHandlers = CopyflagInternalEventHandlers, CopyflagLanguagesAndTranslations = CopyflagLanguagesAndTranslations, CopyflagPropertyDefinitions = CopyflagPropertyDefinitions, CopyflagScheduledExportAndImportJobs = CopyflagScheduledExportAndImportJobs, CopyflagUseTargetGUID = CopyflagUseTargetGUID, CopyflagUserAccounts = CopyflagUserAccounts, CopyflagValueListContent = CopyflagValueListContent, CopyflagValueLists = CopyflagValueLists, CopyflagViews = CopyflagViews, CopyflagWorkflows = CopyflagWorkflows, VaultGUID = VaultGUID, VaultProperties = VaultProperties)
  
    __obj.asInstanceOf[ICopyVaultJob]
  }
}

