package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExportStructureItem extends js.Object {
  var StructureItemGUID: java.lang.String
  var StructureItemID: scala.Double
  var StructureItemType: mfilesLib.MFilesNs.MFMetadataStructureItem
  def Clone(): IExportStructureItem
}

object IExportStructureItem {
  @scala.inline
  def apply(
    Clone: () => IExportStructureItem,
    StructureItemGUID: java.lang.String,
    StructureItemID: scala.Double,
    StructureItemType: mfilesLib.MFilesNs.MFMetadataStructureItem
  ): IExportStructureItem = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), StructureItemGUID = StructureItemGUID, StructureItemID = StructureItemID, StructureItemType = StructureItemType)
  
    __obj.asInstanceOf[IExportStructureItem]
  }
}

