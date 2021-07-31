package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICopyVaultJob extends StObject {
  
  def Clone(): ICopyVaultJob
  
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
  implicit class ICopyVaultJobMutableBuilder[Self <: ICopyVaultJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ICopyVaultJob): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopyflagAllData(value: Boolean): Self = StObject.set(x, "CopyflagAllData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagAllExceptData(value: Boolean): Self = StObject.set(x, "CopyflagAllExceptData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagApplications(value: Boolean): Self = StObject.set(x, "CopyflagApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagDataSets(value: Boolean): Self = StObject.set(x, "CopyflagDataSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagDocumentProfiles(value: Boolean): Self = StObject.set(x, "CopyflagDocumentProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagDocuments(value: Boolean): Self = StObject.set(x, "CopyflagDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagEventLog(value: Boolean): Self = StObject.set(x, "CopyflagEventLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagExternalLocations(value: Boolean): Self = StObject.set(x, "CopyflagExternalLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagFiles(value: Boolean): Self = StObject.set(x, "CopyflagFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagInternalEventHandlers(value: Boolean): Self = StObject.set(x, "CopyflagInternalEventHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagLanguagesAndTranslations(value: Boolean): Self = StObject.set(x, "CopyflagLanguagesAndTranslations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagPropertyDefinitions(value: Boolean): Self = StObject.set(x, "CopyflagPropertyDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagScheduledExportAndImportJobs(value: Boolean): Self = StObject.set(x, "CopyflagScheduledExportAndImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagUseTargetGUID(value: Boolean): Self = StObject.set(x, "CopyflagUseTargetGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagUserAccounts(value: Boolean): Self = StObject.set(x, "CopyflagUserAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagValueListContent(value: Boolean): Self = StObject.set(x, "CopyflagValueListContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagValueLists(value: Boolean): Self = StObject.set(x, "CopyflagValueLists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagViews(value: Boolean): Self = StObject.set(x, "CopyflagViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyflagWorkflows(value: Boolean): Self = StObject.set(x, "CopyflagWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultProperties(value: IVaultProperties): Self = StObject.set(x, "VaultProperties", value.asInstanceOf[js.Any])
  }
}
