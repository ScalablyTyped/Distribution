package typings.mfiles.global.MFiles

import typings.mfiles.IExportContentJob
import typings.mfiles.IExportStructureItems
import typings.mfiles.IImpersonation
import typings.mfiles.ISearchConditions
import typings.mfiles.ITimestamp
import typings.mfiles.MFiles.MFExportContentFlag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ExportContentJob")
@js.native
class ExportContentJob ()
  extends StObject
     with IExportContentJob {
  
  /* CompleteClass */
  override def Clone(): IExportContentJob = js.native
  
  /* CompleteClass */
  var ExportContent: Boolean = js.native
  
  /* CompleteClass */
  var ExportStructureItems: Boolean = js.native
  
  /* CompleteClass */
  var Flags: MFExportContentFlag = js.native
  
  /* CompleteClass */
  var IgnoreChangesBefore: ITimestamp = js.native
  
  /* CompleteClass */
  var Impersonation: IImpersonation = js.native
  
  /* CompleteClass */
  var IncludePrivateUISettingsWithStructure: Boolean = js.native
  
  /* CompleteClass */
  var IncludeValueListItemsWithStructure: Boolean = js.native
  
  /* CompleteClass */
  var SearchConditions: ISearchConditions = js.native
  
  /* CompleteClass */
  override def SetExportAllStructureItems(IncludeValueListItems: Boolean): Unit = js.native
  
  /* CompleteClass */
  var StructureItems: IExportStructureItems = js.native
  
  /* CompleteClass */
  var TargetLocation: String = js.native
  
  /* CompleteClass */
  var UseIgnoreChangesBefore: Boolean = js.native
  
  /* CompleteClass */
  var UseSearchConditions: Boolean = js.native
}
