package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFVaultAccess extends js.Object

@JSGlobal("MFiles.MFVaultAccess")
@js.native
object MFVaultAccess extends js.Object {
  @js.native
  sealed trait ChangeAssignments
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ChangeDocSecurity
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ChangeFullControlRole
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ChangeMetaDataStructure
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ChangeObjectStates
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait CreateDocs
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait DestroyDocs
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait EditAllDocs
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ExportContent
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ForceUndoCheckout
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ImportContent
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait LicenseAllowsModifications
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageCommonNotificationRules
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageCommonUISettings
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageCommonViews
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageEvents
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageExternalLocations
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageTraditionalFolders
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageUserAccounts
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait ManageVLItemsFromClient
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait MateriakizeViews
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait MaterializeViews
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait SeeAllDocs
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait SeeDeletedDocs
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait UndeleteDocs
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  @js.native
  sealed trait VerifyVault
    extends mfilesLib.MFilesNs.MFVaultAccess
  
  /* 8388608 */ val ChangeAssignments: ChangeAssignments with scala.Double = js.native
  /* 32 */ val ChangeDocSecurity: ChangeDocSecurity with scala.Double = js.native
  /* 256 */ val ChangeFullControlRole: ChangeFullControlRole with scala.Double = js.native
  /* 64 */ val ChangeMetaDataStructure: ChangeMetaDataStructure with scala.Double = js.native
  /* 4194304 */ val ChangeObjectStates: ChangeObjectStates with scala.Double = js.native
  /* 1 */ val CreateDocs: CreateDocs with scala.Double = js.native
  /* 8 */ val DestroyDocs: DestroyDocs with scala.Double = js.native
  /* 2048 */ val EditAllDocs: EditAllDocs with scala.Double = js.native
  /* 8192 */ val ExportContent: ExportContent with scala.Double = js.native
  /* 16 */ val ForceUndoCheckout: ForceUndoCheckout with scala.Double = js.native
  /* 16384 */ val ImportContent: ImportContent with scala.Double = js.native
  /* 262144 */ val LicenseAllowsModifications: LicenseAllowsModifications with scala.Double = js.native
  /* 134217728 */ val ManageCommonNotificationRules: ManageCommonNotificationRules with scala.Double = js.native
  /* 33554432 */ val ManageCommonUISettings: ManageCommonUISettings with scala.Double = js.native
  /* 16777216 */ val ManageCommonViews: ManageCommonViews with scala.Double = js.native
  /* 524288 */ val ManageEvents: ManageEvents with scala.Double = js.native
  /* 131072 */ val ManageExternalLocations: ManageExternalLocations with scala.Double = js.native
  /* 1048576 */ val ManageTraditionalFolders: ManageTraditionalFolders with scala.Double = js.native
  /* 128 */ val ManageUserAccounts: ManageUserAccounts with scala.Double = js.native
  /* 65536 */ val ManageVLItemsFromClient: ManageVLItemsFromClient with scala.Double = js.native
  /* 536870912 */ val MateriakizeViews: MateriakizeViews with scala.Double = js.native
  /* 536870912 */ val MaterializeViews: MaterializeViews with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val SeeAllDocs: SeeAllDocs with scala.Double = js.native
  /* 268435456 */ val SeeDeletedDocs: SeeDeletedDocs with scala.Double = js.native
  /* 4 */ val UndeleteDocs: UndeleteDocs with scala.Double = js.native
  /* 1024 */ val VerifyVault: VerifyVault with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFVaultAccess with scala.Double] = js.native
}

