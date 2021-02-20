package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExportStructureItem extends StObject {
  
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
  implicit class IExportStructureItemMutableBuilder[Self <: IExportStructureItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IExportStructureItem): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStructureItemGUID(value: String): Self = StObject.set(x, "StructureItemGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemID(value: Double): Self = StObject.set(x, "StructureItemID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructureItemType(value: MFMetadataStructureItem): Self = StObject.set(x, "StructureItemType", value.asInstanceOf[js.Any])
  }
}
