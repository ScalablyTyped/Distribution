package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICopyVaultJob extends js.Object {
  var CopyflagAllData: scala.Boolean
  var CopyflagAllExceptData: scala.Boolean
  var CopyflagApplications: scala.Boolean
  var CopyflagDataSets: scala.Boolean
  var CopyflagDocumentProfiles: scala.Boolean
  var CopyflagDocuments: scala.Boolean
  var CopyflagEventLog: scala.Boolean
  var CopyflagExternalLocations: scala.Boolean
  var CopyflagFiles: scala.Boolean
  var CopyflagInternalEventHandlers: scala.Boolean
  var CopyflagLanguagesAndTranslations: scala.Boolean
  var CopyflagPropertyDefinitions: scala.Boolean
  var CopyflagScheduledExportAndImportJobs: scala.Boolean
  var CopyflagUseTargetGUID: scala.Boolean
  var CopyflagUserAccounts: scala.Boolean
  var CopyflagValueListContent: scala.Boolean
  var CopyflagValueLists: scala.Boolean
  var CopyflagViews: scala.Boolean
  var CopyflagWorkflows: scala.Boolean
  var VaultGUID: java.lang.String
  var VaultProperties: IVaultProperties
  def Clone(): ICopyVaultJob
}

