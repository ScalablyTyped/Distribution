package typings.mfiles.global.MFiles

import typings.mfiles.IAttachVaultOptions
import typings.mfiles.MFiles.MFAttachVaultOptionsFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.AttachVaultOptions")
@js.native
open class AttachVaultOptions ()
  extends StObject
     with IAttachVaultOptions {
  
  /* CompleteClass */
  override def Clone(): IAttachVaultOptions = js.native
  
  /* CompleteClass */
  override def DisableAll(): Unit = js.native
  
  /* CompleteClass */
  var DisableEventHandlers: Boolean = js.native
  
  /* CompleteClass */
  var DisableExportImportJobs: Boolean = js.native
  
  /* CompleteClass */
  var DisableExportedDataSets: Boolean = js.native
  
  /* CompleteClass */
  var DisableExternalObjectTypes: Boolean = js.native
  
  /* CompleteClass */
  var DisableExternalSources: Boolean = js.native
  
  /* CompleteClass */
  var DisableExternalUserGroups: Boolean = js.native
  
  /* CompleteClass */
  var Flags: MFAttachVaultOptionsFlag = js.native
  
  /* CompleteClass */
  var UpdateAttachmentGUID: Boolean = js.native
}
