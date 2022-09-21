package typings.mfiles.global.MFiles

import typings.mfiles.IAccessControlList
import typings.mfiles.IImpersonation
import typings.mfiles.IImportContentJob
import typings.mfiles.IMetadataStructureSelectors
import typings.mfiles.MFiles.MFImportContentFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ImportContentJob")
@js.native
open class ImportContentJob ()
  extends StObject
     with IImportContentJob {
  
  /* CompleteClass */
  var ActivateAutomaticPermissionsForNewOrChangedDefinitions: Boolean = js.native
  
  /* CompleteClass */
  override def Clone(): IImportContentJob = js.native
  
  /* CompleteClass */
  var DisableImportedExternalObjectTypeConnections: Boolean = js.native
  
  /* CompleteClass */
  var DisableImportedExternalUserGroups: Boolean = js.native
  
  /* CompleteClass */
  var DisableImportedVaultEventHandlers: Boolean = js.native
  
  /* CompleteClass */
  var Flags: MFImportContentFlag = js.native
  
  /* CompleteClass */
  var IgnoreAutomaticPermissionsDefinedByObjects: Boolean = js.native
  
  /* CompleteClass */
  var Impersonation: IImpersonation = js.native
  
  /* CompleteClass */
  var MetadataStructureSelectors: IMetadataStructureSelectors = js.native
  
  /* CompleteClass */
  var Permissions: IAccessControlList = js.native
  
  /* CompleteClass */
  var ResetExportTimestamps: Boolean = js.native
  
  /* CompleteClass */
  var SourceLocation: String = js.native
  
  /* CompleteClass */
  var UseDefaultObjectTypePermissions: Boolean = js.native
  
  /* CompleteClass */
  var UseNamesAsAliases: Boolean = js.native
  
  /* CompleteClass */
  var UsePermissions: Boolean = js.native
}
