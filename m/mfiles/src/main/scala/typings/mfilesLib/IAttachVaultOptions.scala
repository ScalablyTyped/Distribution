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

object IAttachVaultOptions {
  @scala.inline
  def apply(
    Clone: () => IAttachVaultOptions,
    DisableAll: () => scala.Unit,
    DisableEventHandlers: scala.Boolean,
    DisableExportImportJobs: scala.Boolean,
    DisableExportedDataSets: scala.Boolean,
    DisableExternalObjectTypes: scala.Boolean,
    DisableExternalSources: scala.Boolean,
    DisableExternalUserGroups: scala.Boolean,
    Flags: mfilesLib.MFilesNs.MFAttachVaultOptionsFlag,
    UpdateAttachmentGUID: scala.Boolean
  ): IAttachVaultOptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisableAll = js.Any.fromFunction0(DisableAll), DisableEventHandlers = DisableEventHandlers, DisableExportImportJobs = DisableExportImportJobs, DisableExportedDataSets = DisableExportedDataSets, DisableExternalObjectTypes = DisableExternalObjectTypes, DisableExternalSources = DisableExternalSources, DisableExternalUserGroups = DisableExternalUserGroups, Flags = Flags, UpdateAttachmentGUID = UpdateAttachmentGUID)
  
    __obj.asInstanceOf[IAttachVaultOptions]
  }
}

