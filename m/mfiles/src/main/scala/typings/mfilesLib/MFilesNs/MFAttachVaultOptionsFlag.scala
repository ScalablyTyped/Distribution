package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFAttachVaultOptionsFlag extends js.Object

@JSGlobal("MFiles.MFAttachVaultOptionsFlag")
@js.native
object MFAttachVaultOptionsFlag extends js.Object {
  @js.native
  sealed trait EventHandlers
    extends mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  
  @js.native
  sealed trait ExportImportJobs
    extends mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  
  @js.native
  sealed trait ExportedDataSets
    extends mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  
  @js.native
  sealed trait ExternalObjectTypes
    extends mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  
  @js.native
  sealed trait ExternalSources
    extends mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  
  @js.native
  sealed trait ExternalUserGroups
    extends mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFAttachVaultOptionsFlag
  
  /* 32 */ val EventHandlers: EventHandlers with scala.Double = js.native
  /* 8 */ val ExportImportJobs: ExportImportJobs with scala.Double = js.native
  /* 4 */ val ExportedDataSets: ExportedDataSets with scala.Double = js.native
  /* 1 */ val ExternalObjectTypes: ExternalObjectTypes with scala.Double = js.native
  /* 2 */ val ExternalSources: ExternalSources with scala.Double = js.native
  /* 16 */ val ExternalUserGroups: ExternalUserGroups with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFAttachVaultOptionsFlag with scala.Double] = js.native
}

