package typings.mfiles

import typings.mfiles.MFilesNs.MFAttachVaultOptionsFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAttachVaultOptions extends js.Object {
  var DisableEventHandlers: Boolean
  var DisableExportImportJobs: Boolean
  var DisableExportedDataSets: Boolean
  var DisableExternalObjectTypes: Boolean
  var DisableExternalSources: Boolean
  var DisableExternalUserGroups: Boolean
  var Flags: MFAttachVaultOptionsFlag
  var UpdateAttachmentGUID: Boolean
  def Clone(): IAttachVaultOptions
  def DisableAll(): Unit
}

object IAttachVaultOptions {
  @scala.inline
  def apply(
    Clone: () => IAttachVaultOptions,
    DisableAll: () => Unit,
    DisableEventHandlers: Boolean,
    DisableExportImportJobs: Boolean,
    DisableExportedDataSets: Boolean,
    DisableExternalObjectTypes: Boolean,
    DisableExternalSources: Boolean,
    DisableExternalUserGroups: Boolean,
    Flags: MFAttachVaultOptionsFlag,
    UpdateAttachmentGUID: Boolean
  ): IAttachVaultOptions = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisableAll = js.Any.fromFunction0(DisableAll), DisableEventHandlers = DisableEventHandlers, DisableExportImportJobs = DisableExportImportJobs, DisableExportedDataSets = DisableExportedDataSets, DisableExternalObjectTypes = DisableExternalObjectTypes, DisableExternalSources = DisableExternalSources, DisableExternalUserGroups = DisableExternalUserGroups, Flags = Flags, UpdateAttachmentGUID = UpdateAttachmentGUID)
  
    __obj.asInstanceOf[IAttachVaultOptions]
  }
}

