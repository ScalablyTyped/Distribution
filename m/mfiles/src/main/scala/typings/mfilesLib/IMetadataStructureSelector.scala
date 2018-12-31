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

