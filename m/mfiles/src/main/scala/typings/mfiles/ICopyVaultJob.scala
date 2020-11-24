package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICopyVaultJob extends js.Object {
  
  def Clone(): ICopyVaultJob = js.native
  
  var CopyflagAllData: Boolean = js.native
  
  var CopyflagAllExceptData: Boolean = js.native
  
  var CopyflagApplications: Boolean = js.native
  
  var CopyflagDataSets: Boolean = js.native
  
  var CopyflagDocumentProfiles: Boolean = js.native
  
  var CopyflagDocuments: Boolean = js.native
  
  var CopyflagEventLog: Boolean = js.native
  
  var CopyflagExternalLocations: Boolean = js.native
  
  var CopyflagFiles: Boolean = js.native
  
  var CopyflagInternalEventHandlers: Boolean = js.native
  
  var CopyflagLanguagesAndTranslations: Boolean = js.native
  
  var CopyflagPropertyDefinitions: Boolean = js.native
  
  var CopyflagScheduledExportAndImportJobs: Boolean = js.native
  
  var CopyflagUseTargetGUID: Boolean = js.native
  
  var CopyflagUserAccounts: Boolean = js.native
  
  var CopyflagValueListContent: Boolean = js.native
  
  var CopyflagValueLists: Boolean = js.native
  
  var CopyflagViews: Boolean = js.native
  
  var CopyflagWorkflows: Boolean = js.native
  
  var VaultGUID: String = js.native
  
  var VaultProperties: IVaultProperties = js.native
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
  
  @scala.inline
  implicit class ICopyVaultJobOps[Self <: ICopyVaultJob] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => ICopyVaultJob): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyflagAllData(value: Boolean): Self = this.set("CopyflagAllData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagAllExceptData(value: Boolean): Self = this.set("CopyflagAllExceptData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagApplications(value: Boolean): Self = this.set("CopyflagApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagDataSets(value: Boolean): Self = this.set("CopyflagDataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagDocumentProfiles(value: Boolean): Self = this.set("CopyflagDocumentProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagDocuments(value: Boolean): Self = this.set("CopyflagDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagEventLog(value: Boolean): Self = this.set("CopyflagEventLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagExternalLocations(value: Boolean): Self = this.set("CopyflagExternalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagFiles(value: Boolean): Self = this.set("CopyflagFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagInternalEventHandlers(value: Boolean): Self = this.set("CopyflagInternalEventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagLanguagesAndTranslations(value: Boolean): Self = this.set("CopyflagLanguagesAndTranslations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagPropertyDefinitions(value: Boolean): Self = this.set("CopyflagPropertyDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagScheduledExportAndImportJobs(value: Boolean): Self = this.set("CopyflagScheduledExportAndImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagUseTargetGUID(value: Boolean): Self = this.set("CopyflagUseTargetGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagUserAccounts(value: Boolean): Self = this.set("CopyflagUserAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagValueListContent(value: Boolean): Self = this.set("CopyflagValueListContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagValueLists(value: Boolean): Self = this.set("CopyflagValueLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagViews(value: Boolean): Self = this.set("CopyflagViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagWorkflows(value: Boolean): Self = this.set("CopyflagWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultGUID(value: String): Self = this.set("VaultGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultProperties(value: IVaultProperties): Self = this.set("VaultProperties", value.asInstanceOf[js.Any])
  }
}
