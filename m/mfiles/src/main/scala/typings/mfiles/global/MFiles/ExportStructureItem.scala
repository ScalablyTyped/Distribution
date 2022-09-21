package typings.mfiles.global.MFiles

import typings.mfiles.IExportStructureItem
import typings.mfiles.MFiles.MFMetadataStructureItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.ExportStructureItem")
@js.native
open class ExportStructureItem ()
  extends StObject
     with IExportStructureItem {
  
  /* CompleteClass */
  override def Clone(): IExportStructureItem = js.native
  
  /* CompleteClass */
  var StructureItemGUID: String = js.native
  
  /* CompleteClass */
  var StructureItemID: Double = js.native
  
  /* CompleteClass */
  var StructureItemType: MFMetadataStructureItem = js.native
}
