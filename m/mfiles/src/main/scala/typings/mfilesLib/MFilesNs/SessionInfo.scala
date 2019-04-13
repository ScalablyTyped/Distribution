package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SessionInfo")
@js.native
class SessionInfo ()
  extends mfilesLib.ISessionInfo {
  /* CompleteClass */
  override val ACLMode: MFACLMode = js.native
  /* CompleteClass */
  override val AccountName: java.lang.String = js.native
  /* CompleteClass */
  override val AuthenticationType: MFAuthType = js.native
  /* CompleteClass */
  override val CanCreateObjects: scala.Boolean = js.native
  /* CompleteClass */
  override val CanForceUndoCheckout: scala.Boolean = js.native
  /* CompleteClass */
  override val CanManageCommonUISettings: scala.Boolean = js.native
  /* CompleteClass */
  override val CanManageCommonViews: scala.Boolean = js.native
  /* CompleteClass */
  override val CanManageTraditionalFolders: scala.Boolean = js.native
  /* CompleteClass */
  override val CanMaterializeViews: scala.Boolean = js.native
  /* CompleteClass */
  override val CanSeeAllObjects: scala.Boolean = js.native
  /* CompleteClass */
  override val CanSeeDeletedObjects: scala.Boolean = js.native
  /* CompleteClass */
  override val ClientCulture: java.lang.String = js.native
  /* CompleteClass */
  override val InternalUser: scala.Boolean = js.native
  /* CompleteClass */
  override val IsSharingPublicLinksAllowed: scala.Boolean = js.native
  /* CompleteClass */
  override val IsSharingPublicLinksToLatestVersionAllowed: scala.Boolean = js.native
  /* CompleteClass */
  override val KeepAliveIntervalInSeconds: scala.Double = js.native
  /* CompleteClass */
  override val Language: scala.Double = js.native
  /* CompleteClass */
  override val LicenseAllowsModifications: scala.Boolean = js.native
  /* CompleteClass */
  override val LocalComputerName: java.lang.String = js.native
  /* CompleteClass */
  override val ProductMode: MFProductMode = js.native
  /* CompleteClass */
  override val ServerVersion: scala.Double = js.native
  /* CompleteClass */
  override val TimeZoneInfo: mfilesLib.ITimeZoneInformation = js.native
  /* CompleteClass */
  override val UserAndGroupMemberships: mfilesLib.IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override val UserAndSubstitutedByMe: mfilesLib.IUserOrUserGroupIDs = js.native
  /* CompleteClass */
  override val UserID: scala.Double = js.native
  /* CompleteClass */
  override val VaultGUID: java.lang.String = js.native
  /* CompleteClass */
  override def CheckObjectAccess(ObjectAccessControlList: mfilesLib.IAccessControlList, DesiredObjectAccess: MFObjectAccess): scala.Boolean = js.native
  /* CompleteClass */
  override def CheckObjectTypeAccess(
    ObjectTypeAccessControlList: mfilesLib.IAccessControlList,
    DesiredObjectTypeAccess: MFObjectTypeAccess
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def CheckPropertyDefAccess(
    PropertyDefAccessControlList: mfilesLib.IAccessControlList,
    DesiredPropertyDefAccess: MFPropertyDefAccess
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def CheckVaultAccess(DesiredVaultAccess: MFVaultAccess): scala.Boolean = js.native
  /* CompleteClass */
  override def CloneFrom(SessionInfo: mfilesLib.ISessionInfo): scala.Unit = js.native
  /* CompleteClass */
  override def IsLoggedOnUserSubstituteOfUser(UserID: scala.Double): scala.Boolean = js.native
}

@JSGlobal("MFiles.SessionInfo")
@js.native
object SessionInfo
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ISessionInfo]

