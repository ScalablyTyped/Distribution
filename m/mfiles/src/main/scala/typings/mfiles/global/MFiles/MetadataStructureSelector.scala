package typings.mfiles.global.MFiles

import typings.mfiles.IMetadataStructureSelector
import typings.mfiles.MFiles.MFMetadataStructureItem
import typings.mfiles.MFiles.MFMetadataStructureSelectorFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.MetadataStructureSelector")
@js.native
open class MetadataStructureSelector ()
  extends StObject
     with IMetadataStructureSelector {
  
  /* CompleteClass */
  override def Clone(): IMetadataStructureSelector = js.native
  
  /* CompleteClass */
  var Flags: MFMetadataStructureSelectorFlags = js.native
  
  /* CompleteClass */
  var ID: String = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var StructureItemGUID: String = js.native
  
  /* CompleteClass */
  var StructureItemID: Double = js.native
  
  /* CompleteClass */
  var StructureItemSemanticAlias: String = js.native
  
  /* CompleteClass */
  var StructureItemType: MFMetadataStructureItem = js.native
}
