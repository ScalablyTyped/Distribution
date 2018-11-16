package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IExportContentJob extends js.Object {
  var ExportContent: scala.Boolean
  var ExportStructureItems: scala.Boolean
  var Flags: mfilesLib.MFilesNs.MFExportContentFlag
  var IgnoreChangesBefore: ITimestamp
  var Impersonation: IImpersonation
  var IncludePrivateUISettingsWithStructure: scala.Boolean
  var IncludeValueListItemsWithStructure: scala.Boolean
  var SearchConditions: ISearchConditions
  var StructureItems: IExportStructureItems
  var TargetLocation: java.lang.String
  var UseIgnoreChangesBefore: scala.Boolean
  var UseSearchConditions: scala.Boolean
  def Clone(): IExportContentJob
  def SetExportAllStructureItems(IncludeValueListItems: scala.Boolean): scala.Unit
}

