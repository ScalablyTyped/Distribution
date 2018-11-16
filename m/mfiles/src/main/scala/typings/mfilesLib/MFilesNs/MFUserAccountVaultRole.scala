package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFUserAccountVaultRole extends js.Object

@JSGlobal("MFiles.MFUserAccountVaultRole")
@js.native
object MFUserAccountVaultRole extends js.Object {
  @js.native
  sealed trait ChangeMetadataStructure
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait ChangeObjectSecurity
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait CreateObjects
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait DefaultRoles
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait DefineTemplates
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait DestroyObjects
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait ForceUndoCheckout
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait FullControl
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait InternalUser
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait LogIn
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait ManageCommonViews
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait ManageTraditionalFolders
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait ManageUserAccounts
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait ManageWorkflows
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait SeeAllObjects
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  @js.native
  sealed trait UndeleteObjects
    extends mfilesLib.MFilesNs.MFUserAccountVaultRole
  
  /* 256 */ val ChangeMetadataStructure: ChangeMetadataStructure with scala.Double = js.native
  /* 128 */ val ChangeObjectSecurity: ChangeObjectSecurity with scala.Double = js.native
  /* 4 */ val CreateObjects: CreateObjects with scala.Double = js.native
  /* 3078 */ val DefaultRoles: DefaultRoles with scala.Double = js.native
  /* 4096 */ val DefineTemplates: DefineTemplates with scala.Double = js.native
  /* 32 */ val DestroyObjects: DestroyObjects with scala.Double = js.native
  /* 64 */ val ForceUndoCheckout: ForceUndoCheckout with scala.Double = js.native
  /* 1 */ val FullControl: FullControl with scala.Double = js.native
  /* 1024 */ val InternalUser: InternalUser with scala.Double = js.native
  /* 2 */ val LogIn: LogIn with scala.Double = js.native
  /* 8192 */ val ManageCommonViews: ManageCommonViews with scala.Double = js.native
  /* 2048 */ val ManageTraditionalFolders: ManageTraditionalFolders with scala.Double = js.native
  /* 512 */ val ManageUserAccounts: ManageUserAccounts with scala.Double = js.native
  /* 16384 */ val ManageWorkflows: ManageWorkflows with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8 */ val SeeAllObjects: SeeAllObjects with scala.Double = js.native
  /* 16 */ val UndeleteObjects: UndeleteObjects with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFUserAccountVaultRole with scala.Double] = js.native
}

