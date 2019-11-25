package typings.mfiles

import typings.mfiles.MFiles.MFMetadataStructureItem
import typings.mfiles.MFiles.MFMetadataStructureSelectorFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMetadataStructureSelector extends js.Object {
  var Flags: MFMetadataStructureSelectorFlags
  var ID: String
  var Name: String
  var StructureItemGUID: String
  var StructureItemID: Double
  var StructureItemSemanticAlias: String
  var StructureItemType: MFMetadataStructureItem
  def Clone(): IMetadataStructureSelector
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
}

