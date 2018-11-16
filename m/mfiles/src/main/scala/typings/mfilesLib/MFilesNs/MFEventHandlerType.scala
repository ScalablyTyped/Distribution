package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFEventHandlerType extends js.Object

@JSGlobal("MFiles.MFEventHandlerType")
@js.native
object MFEventHandlerType extends js.Object {
  @js.native
  sealed trait AfterBeginTransaction
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterBringOnline
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCancelCheckout
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCancelCheckoutFinalize
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCancelCreateObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCheckInChanges
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCheckInChangesFinalize
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCheckOut
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCreateLoginAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCreateNewObjectFinalize
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCreateNewValueListItem
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCreateUserAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCreateUserGroup
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterCreateView
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterDeleteObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterDeleteView
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterDestroyObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterDestroyObjectVersion
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterFileDownload
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterFileUpload
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterLoginToVault
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterLogoutFromVault
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterModifyLoginAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterModifyMFilesCredentials
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterModifyUserAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterModifyUserGroup
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterModifyView
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterRemoveLoginAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterRemoveUserAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterRemoveUserGroup
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterRunScheduledJob
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterSetObjectPermissions
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterSetProperties
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterUndeleteObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait AfterUndeleteObjectFinalize
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCancelCheckout
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCancelCreateObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCheckInChanges
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCheckInChangesFinalize
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCheckOut
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCommitTransaction
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCreateLoginAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCreateNewObjectFinalize
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCreateNewValueListItem
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCreateUserAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCreateUserGroup
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeCreateView
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeDeleteObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeDeleteView
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeDestroyObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeDestroyObjectVersion
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeFileDownload
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeFileUpload
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeLoginToVault
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeLogoutFromVault
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeModifyLoginAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeModifyMFilesCredentials
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeModifyUserAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeModifyUserGroup
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeModifyView
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeRemoveLoginAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeRemoveUserAccount
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeRemoveUserGroup
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeReturnView
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeRollbackTransaction
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeRunScheduledJob
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeSetObjectPermissions
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeSetProperties
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeTakeOffline
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait BeforeUndeleteObject
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait Replication_AfterCheckInChanges
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait Replication_AfterCreateNewObjectFinalize
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait TypeUndefined
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  @js.native
  sealed trait VaultExtensionMethod
    extends mfilesLib.MFilesNs.MFEventHandlerType
  
  /* 57 */ val AfterBeginTransaction: AfterBeginTransaction with scala.Double = js.native
  /* 54 */ val AfterBringOnline: AfterBringOnline with scala.Double = js.native
  /* 9 */ val AfterCancelCheckout: AfterCancelCheckout with scala.Double = js.native
  /* 60 */ val AfterCancelCheckoutFinalize: AfterCancelCheckoutFinalize with scala.Double = js.native
  /* 30 */ val AfterCancelCreateObject: AfterCancelCreateObject with scala.Double = js.native
  /* 5 */ val AfterCheckInChanges: AfterCheckInChanges with scala.Double = js.native
  /* 56 */ val AfterCheckInChangesFinalize: AfterCheckInChangesFinalize with scala.Double = js.native
  /* 7 */ val AfterCheckOut: AfterCheckOut with scala.Double = js.native
  /* 37 */ val AfterCreateLoginAccount: AfterCreateLoginAccount with scala.Double = js.native
  /* 3 */ val AfterCreateNewObjectFinalize: AfterCreateNewObjectFinalize with scala.Double = js.native
  /* 21 */ val AfterCreateNewValueListItem: AfterCreateNewValueListItem with scala.Double = js.native
  /* 43 */ val AfterCreateUserAccount: AfterCreateUserAccount with scala.Double = js.native
  /* 49 */ val AfterCreateUserGroup: AfterCreateUserGroup with scala.Double = js.native
  /* 69 */ val AfterCreateView: AfterCreateView with scala.Double = js.native
  /* 11 */ val AfterDeleteObject: AfterDeleteObject with scala.Double = js.native
  /* 73 */ val AfterDeleteView: AfterDeleteView with scala.Double = js.native
  /* 13 */ val AfterDestroyObject: AfterDestroyObject with scala.Double = js.native
  /* 32 */ val AfterDestroyObjectVersion: AfterDestroyObjectVersion with scala.Double = js.native
  /* 19 */ val AfterFileDownload: AfterFileDownload with scala.Double = js.native
  /* 17 */ val AfterFileUpload: AfterFileUpload with scala.Double = js.native
  /* 23 */ val AfterLoginToVault: AfterLoginToVault with scala.Double = js.native
  /* 25 */ val AfterLogoutFromVault: AfterLogoutFromVault with scala.Double = js.native
  /* 39 */ val AfterModifyLoginAccount: AfterModifyLoginAccount with scala.Double = js.native
  /* 65 */ val AfterModifyMFilesCredentials: AfterModifyMFilesCredentials with scala.Double = js.native
  /* 45 */ val AfterModifyUserAccount: AfterModifyUserAccount with scala.Double = js.native
  /* 51 */ val AfterModifyUserGroup: AfterModifyUserGroup with scala.Double = js.native
  /* 71 */ val AfterModifyView: AfterModifyView with scala.Double = js.native
  /* 41 */ val AfterRemoveLoginAccount: AfterRemoveLoginAccount with scala.Double = js.native
  /* 47 */ val AfterRemoveUserAccount: AfterRemoveUserAccount with scala.Double = js.native
  /* 53 */ val AfterRemoveUserGroup: AfterRemoveUserGroup with scala.Double = js.native
  /* 27 */ val AfterRunScheduledJob: AfterRunScheduledJob with scala.Double = js.native
  /* 15 */ val AfterSetObjectPermissions: AfterSetObjectPermissions with scala.Double = js.native
  /* 2 */ val AfterSetProperties: AfterSetProperties with scala.Double = js.native
  /* 62 */ val AfterUndeleteObject: AfterUndeleteObject with scala.Double = js.native
  /* 63 */ val AfterUndeleteObjectFinalize: AfterUndeleteObjectFinalize with scala.Double = js.native
  /* 8 */ val BeforeCancelCheckout: BeforeCancelCheckout with scala.Double = js.native
  /* 29 */ val BeforeCancelCreateObject: BeforeCancelCreateObject with scala.Double = js.native
  /* 4 */ val BeforeCheckInChanges: BeforeCheckInChanges with scala.Double = js.native
  /* 67 */ val BeforeCheckInChangesFinalize: BeforeCheckInChangesFinalize with scala.Double = js.native
  /* 6 */ val BeforeCheckOut: BeforeCheckOut with scala.Double = js.native
  /* 58 */ val BeforeCommitTransaction: BeforeCommitTransaction with scala.Double = js.native
  /* 36 */ val BeforeCreateLoginAccount: BeforeCreateLoginAccount with scala.Double = js.native
  /* 28 */ val BeforeCreateNewObjectFinalize: BeforeCreateNewObjectFinalize with scala.Double = js.native
  /* 20 */ val BeforeCreateNewValueListItem: BeforeCreateNewValueListItem with scala.Double = js.native
  /* 42 */ val BeforeCreateUserAccount: BeforeCreateUserAccount with scala.Double = js.native
  /* 48 */ val BeforeCreateUserGroup: BeforeCreateUserGroup with scala.Double = js.native
  /* 68 */ val BeforeCreateView: BeforeCreateView with scala.Double = js.native
  /* 10 */ val BeforeDeleteObject: BeforeDeleteObject with scala.Double = js.native
  /* 72 */ val BeforeDeleteView: BeforeDeleteView with scala.Double = js.native
  /* 12 */ val BeforeDestroyObject: BeforeDestroyObject with scala.Double = js.native
  /* 31 */ val BeforeDestroyObjectVersion: BeforeDestroyObjectVersion with scala.Double = js.native
  /* 18 */ val BeforeFileDownload: BeforeFileDownload with scala.Double = js.native
  /* 16 */ val BeforeFileUpload: BeforeFileUpload with scala.Double = js.native
  /* 22 */ val BeforeLoginToVault: BeforeLoginToVault with scala.Double = js.native
  /* 24 */ val BeforeLogoutFromVault: BeforeLogoutFromVault with scala.Double = js.native
  /* 38 */ val BeforeModifyLoginAccount: BeforeModifyLoginAccount with scala.Double = js.native
  /* 64 */ val BeforeModifyMFilesCredentials: BeforeModifyMFilesCredentials with scala.Double = js.native
  /* 44 */ val BeforeModifyUserAccount: BeforeModifyUserAccount with scala.Double = js.native
  /* 50 */ val BeforeModifyUserGroup: BeforeModifyUserGroup with scala.Double = js.native
  /* 70 */ val BeforeModifyView: BeforeModifyView with scala.Double = js.native
  /* 40 */ val BeforeRemoveLoginAccount: BeforeRemoveLoginAccount with scala.Double = js.native
  /* 46 */ val BeforeRemoveUserAccount: BeforeRemoveUserAccount with scala.Double = js.native
  /* 52 */ val BeforeRemoveUserGroup: BeforeRemoveUserGroup with scala.Double = js.native
  /* 66 */ val BeforeReturnView: BeforeReturnView with scala.Double = js.native
  /* 59 */ val BeforeRollbackTransaction: BeforeRollbackTransaction with scala.Double = js.native
  /* 26 */ val BeforeRunScheduledJob: BeforeRunScheduledJob with scala.Double = js.native
  /* 14 */ val BeforeSetObjectPermissions: BeforeSetObjectPermissions with scala.Double = js.native
  /* 1 */ val BeforeSetProperties: BeforeSetProperties with scala.Double = js.native
  /* 55 */ val BeforeTakeOffline: BeforeTakeOffline with scala.Double = js.native
  /* 61 */ val BeforeUndeleteObject: BeforeUndeleteObject with scala.Double = js.native
  /* 34 */ val Replication_AfterCheckInChanges: Replication_AfterCheckInChanges with scala.Double = js.native
  /* 33 */ val Replication_AfterCreateNewObjectFinalize: Replication_AfterCreateNewObjectFinalize with scala.Double = js.native
  /* 0 */ val TypeUndefined: TypeUndefined with scala.Double = js.native
  /* 35 */ val VaultExtensionMethod: VaultExtensionMethod with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFEventHandlerType with scala.Double] = js.native
}

