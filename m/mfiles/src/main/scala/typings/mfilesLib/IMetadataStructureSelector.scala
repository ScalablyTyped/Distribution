package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataStructureSelector extends js.Object {
  var Flags: mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags
  var ID: java.lang.String
  var Name: java.lang.String
  var StructureItemGUID: java.lang.String
  var StructureItemID: scala.Double
  var StructureItemSemanticAlias: java.lang.String
  var StructureItemType: mfilesLib.MFilesNs.MFMetadataStructureItem
  def Clone(): IMetadataStructureSelector
}

object IMetadataStructureSelector {
  @scala.inline
  def apply(
    Clone: js.Function0[IMetadataStructureSelector],
    Flags: mfilesLib.MFilesNs.MFMetadataStructureSelectorFlags,
    ID: java.lang.String,
    Name: java.lang.String,
    StructureItemGUID: java.lang.String,
    StructureItemID: scala.Double,
    StructureItemSemanticAlias: java.lang.String,
    StructureItemType: mfilesLib.MFilesNs.MFMetadataStructureItem
  ): IMetadataStructureSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Flags")(Flags)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("StructureItemGUID")(StructureItemGUID)
    __obj.updateDynamic("StructureItemID")(StructureItemID)
    __obj.updateDynamic("StructureItemSemanticAlias")(StructureItemSemanticAlias)
    __obj.updateDynamic("StructureItemType")(StructureItemType)
    __obj.asInstanceOf[IMetadataStructureSelector]
  }
}

