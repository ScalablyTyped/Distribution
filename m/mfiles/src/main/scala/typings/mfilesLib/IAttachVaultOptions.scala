package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAttachVaultOptions extends js.Object {
  var DisableEventHandlers: scala.Boolean
  var DisableExportImportJobs: scala.Boolean
  var DisableExportedDataSets: scala.Boolean
  var DisableExternalObjectTypes: scala.Boolean
  var DisableExternalSources: scala.Boolean
  var DisableExternalUserGroups: scala.Boolean
  var Flags: mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  var UpdateAttachmentGUID: scala.Boolean
  def Clone(): IAttachVaultOptions
  def DisableAll(): scala.Unit
}

