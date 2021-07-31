package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import typings.mfiles.MFiles.MFMetadataStructureSelectorFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataStructureSelector extends StObject {
  
  def Clone(): IMetadataStructureSelector
  
  var Flags: MFMetadataStructureSelectorFlags
  
  var ID: String
  
  var Name: String
  
  var StructureItemGUID: String
  
  var StructureItemID: Double
  
  var StructureItemSemanticAlias: String
  
  var StructureItemType: MFMetadataStructureItem
}
object IMetadataStructureSelector {
  
  @scala.inline
  def apply(
    Clone: () => IMetadataStructureSelector,
    Flags: MFMetadataStructureSelectorFlags,
    ID: String,
    Name: String,
    StructureItemGUID: String,
    StructureItemID: Double,
    StructureItemSemanticAlias: String,
    StructureItemType: MFMetadataStructureItem
  ): IMetadataStructureSelector = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], StructureItemGUID = StructureItemGUID.asInstanceOf[js.Any], StructureItemID = StructureItemID.asInstanceOf[js.Any], StructureItemSemanticAlias = StructureItemSemanticAlias.asInstanceOf[js.Any], StructureItemType = StructureItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataStructureSelector]
  }
  
  @scala.inline
  implicit class IMetadataStructureSelectorMutableBuilder[Self <: IMetadataStructureSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IMetadataStructureSelector): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: MFMetadataStructureSelectorFlags): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemGUID(value: String): Self = StObject.set(x, "StructureItemGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemID(value: Double): Self = StObject.set(x, "StructureItemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemSemanticAlias(value: String): Self = StObject.set(x, "StructureItemSemanticAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemType(value: MFMetadataStructureItem): Self = StObject.set(x, "StructureItemType", value.asInstanceOf[js.Any])
  }
}
