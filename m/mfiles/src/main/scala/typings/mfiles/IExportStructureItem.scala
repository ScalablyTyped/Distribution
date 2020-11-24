package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExportStructureItem extends js.Object {
  
  def Clone(): IExportStructureItem = js.native
  
  var StructureItemGUID: String = js.native
  
  var StructureItemID: Double = js.native
  
  var StructureItemType: MFMetadataStructureItem = js.native
}
object IExportStructureItem {
  
  @scala.inline
  def apply(
    Clone: () => IExportStructureItem,
    StructureItemGUID: String,
    StructureItemID: Double,
    StructureItemType: MFMetadataStructureItem
  ): IExportStructureItem = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), StructureItemGUID = StructureItemGUID.asInstanceOf[js.Any], StructureItemID = StructureItemID.asInstanceOf[js.Any], StructureItemType = StructureItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExportStructureItem]
  }
  
  @scala.inline
  implicit class IExportStructureItemOps[Self <: IExportStructureItem] (val x: Self) extends AnyVal {
    
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
    def setClone(value: () => IExportStructureItem): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructureItemGUID(value: String): Self = this.set("StructureItemGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemID(value: Double): Self = this.set("StructureItemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemType(value: MFMetadataStructureItem): Self = this.set("StructureItemType", value.asInstanceOf[js.Any])
  }
}
