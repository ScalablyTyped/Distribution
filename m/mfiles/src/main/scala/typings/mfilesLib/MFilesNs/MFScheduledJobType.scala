package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFScheduledJobType extends js.Object

@JSGlobal("MFiles.MFScheduledJobType")
@js.native
object MFScheduledJobType extends js.Object {
  @js.native
  sealed trait ArchiveOldVersions
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait Backup
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait CopyVault
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait ExportContent
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait ImportContent
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait MigrateVault
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait OptimizeVault
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait Recalculate
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait Restore
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait Uninitialized
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  @js.native
  sealed trait VerifyVault
    extends mfilesLib.MFilesNs.MFScheduledJobType
  
  /* 6 */ val ArchiveOldVersions: ArchiveOldVersions with scala.Double = js.native
  /* 1 */ val Backup: Backup with scala.Double = js.native
  /* 3 */ val CopyVault: CopyVault with scala.Double = js.native
  /* 5 */ val ExportContent: ExportContent with scala.Double = js.native
  /* 7 */ val ImportContent: ImportContent with scala.Double = js.native
  /* 10 */ val MigrateVault: MigrateVault with scala.Double = js.native
  /* 8 */ val OptimizeVault: OptimizeVault with scala.Double = js.native
  /* 9 */ val Recalculate: Recalculate with scala.Double = js.native
  /* 2 */ val Restore: Restore with scala.Double = js.native
  /* 0 */ val Uninitialized: Uninitialized with scala.Double = js.native
  /* 4 */ val VerifyVault: VerifyVault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFScheduledJobType with scala.Double] = js.native
}

