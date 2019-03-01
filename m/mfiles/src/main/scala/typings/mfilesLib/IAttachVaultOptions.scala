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
    Clone: js.Function0[IAttachVaultOptions],
    DisableAll: js.Function0[scala.Unit],
    DisableEventHandlers: scala.Boolean,
    DisableExportImportJobs: scala.Boolean,
    DisableExportedDataSets: scala.Boolean,
    DisableExternalObjectTypes: scala.Boolean,
    DisableExternalSources: scala.Boolean,
    DisableExternalUserGroups: scala.Boolean,
    Flags: mfilesLib.MFilesNs.MFAttachVaultOptionsFlag,
    UpdateAttachmentGUID: scala.Boolean
  ): IAttachVaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("DisableAll")(DisableAll)
    __obj.updateDynamic("DisableEventHandlers")(DisableEventHandlers)
    __obj.updateDynamic("DisableExportImportJobs")(DisableExportImportJobs)
    __obj.updateDynamic("DisableExportedDataSets")(DisableExportedDataSets)
    __obj.updateDynamic("DisableExternalObjectTypes")(DisableExternalObjectTypes)
    __obj.updateDynamic("DisableExternalSources")(DisableExternalSources)
    __obj.updateDynamic("DisableExternalUserGroups")(DisableExternalUserGroups)
    __obj.updateDynamic("Flags")(Flags)
    __obj.updateDynamic("UpdateAttachmentGUID")(UpdateAttachmentGUID)
    __obj.asInstanceOf[IAttachVaultOptions]
  }
}

