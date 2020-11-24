package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import typings.mfiles.MFiles.MFMetadataStructureSelectorFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataStructureSelector extends js.Object {
  
  def Clone(): IMetadataStructureSelector = js.native
  
  var Flags: MFMetadataStructureSelectorFlags = js.native
  
  var ID: String = js.native
  
  var Name: String = js.native
  
  var StructureItemGUID: String = js.native
  
  var StructureItemID: Double = js.native
  
  var StructureItemSemanticAlias: String = js.native
  
  var StructureItemType: MFMetadataStructureItem = js.native
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
  implicit class IMetadataStructureSelectorOps[Self <: IMetadataStructureSelector] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IMetadataStructureSelector): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlags(value: MFMetadataStructureSelectorFlags): Self = this.set("Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemGUID(value: String): Self = this.set("StructureItemGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemID(value: Double): Self = this.set("StructureItemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemSemanticAlias(value: String): Self = this.set("StructureItemSemanticAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemType(value: MFMetadataStructureItem): Self = this.set("StructureItemType", value.asInstanceOf[js.Any])
  }
}
