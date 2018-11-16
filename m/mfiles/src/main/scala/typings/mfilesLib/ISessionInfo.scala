package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ISessionInfo extends js.Object {
  val ACLMode: mfilesLib.MFilesNs.MFACLMode
  val AccountName: java.lang.String
  val AuthenticationType: mfilesLib.MFilesNs.MFAuthType
  val CanCreateObjects: scala.Boolean
  val CanForceUndoCheckout: scala.Boolean
  val CanManageCommonUISettings: scala.Boolean
  val CanManageCommonViews: scala.Boolean
  val CanManageTraditionalFolders: scala.Boolean
  val CanMaterializeViews: scala.Boolean
  val CanSeeAllObjects: scala.Boolean
  val CanSeeDeletedObjects: scala.Boolean
  val ClientCulture: java.lang.String
  val InternalUser: scala.Boolean
  val IsSharingPublicLinksAllowed: scala.Boolean
  val IsSharingPublicLinksToLatestVersionAllowed: scala.Boolean
  val KeepAliveIntervalInSeconds: scala.Double
  val Language: scala.Double
  val LicenseAllowsModifications: scala.Boolean
  val LocalComputerName: java.lang.String
  val ProductMode: mfilesLib.MFilesNs.MFProductMode
  val ServerVersion: scala.Double
  val TimeZoneInfo: ITimeZoneInformation
  val UserAndGroupMemberships: IUserOrUserGroupIDs
  val UserAndSubstitutedByMe: IUserOrUserGroupIDs
  val UserID: scala.Double
  val VaultGUID: java.lang.String
  def CheckObjectAccess(
    ObjectAccessControlList: IAccessControlList,
    DesiredObjectAccess: mfilesLib.MFilesNs.MFObjectAccess
  ): scala.Boolean
  def CheckObjectTypeAccess(
    ObjectTypeAccessControlList: IAccessControlList,
    DesiredObjectTypeAccess: mfilesLib.MFilesNs.MFObjectTypeAccess
  ): scala.Boolean
  def CheckPropertyDefAccess(
    PropertyDefAccessControlList: IAccessControlList,
    DesiredPropertyDefAccess: mfilesLib.MFilesNs.MFPropertyDefAccess
  ): scala.Boolean
  def CheckVaultAccess(DesiredVaultAccess: mfilesLib.MFilesNs.MFVaultAccess): scala.Boolean
  def CloneFrom(SessionInfo: ISessionInfo): scala.Unit
  def IsLoggedOnUserSubstituteOfUser(UserID: scala.Double): scala.Boolean
}

