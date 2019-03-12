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

object ISessionInfo {
  @scala.inline
  def apply(
    ACLMode: mfilesLib.MFilesNs.MFACLMode,
    AccountName: java.lang.String,
    AuthenticationType: mfilesLib.MFilesNs.MFAuthType,
    CanCreateObjects: scala.Boolean,
    CanForceUndoCheckout: scala.Boolean,
    CanManageCommonUISettings: scala.Boolean,
    CanManageCommonViews: scala.Boolean,
    CanManageTraditionalFolders: scala.Boolean,
    CanMaterializeViews: scala.Boolean,
    CanSeeAllObjects: scala.Boolean,
    CanSeeDeletedObjects: scala.Boolean,
    CheckObjectAccess: (IAccessControlList, mfilesLib.MFilesNs.MFObjectAccess) => scala.Boolean,
    CheckObjectTypeAccess: (IAccessControlList, mfilesLib.MFilesNs.MFObjectTypeAccess) => scala.Boolean,
    CheckPropertyDefAccess: (IAccessControlList, mfilesLib.MFilesNs.MFPropertyDefAccess) => scala.Boolean,
    CheckVaultAccess: mfilesLib.MFilesNs.MFVaultAccess => scala.Boolean,
    ClientCulture: java.lang.String,
    CloneFrom: ISessionInfo => scala.Unit,
    InternalUser: scala.Boolean,
    IsLoggedOnUserSubstituteOfUser: scala.Double => scala.Boolean,
    IsSharingPublicLinksAllowed: scala.Boolean,
    IsSharingPublicLinksToLatestVersionAllowed: scala.Boolean,
    KeepAliveIntervalInSeconds: scala.Double,
    Language: scala.Double,
    LicenseAllowsModifications: scala.Boolean,
    LocalComputerName: java.lang.String,
    ProductMode: mfilesLib.MFilesNs.MFProductMode,
    ServerVersion: scala.Double,
    TimeZoneInfo: ITimeZoneInformation,
    UserAndGroupMemberships: IUserOrUserGroupIDs,
    UserAndSubstitutedByMe: IUserOrUserGroupIDs,
    UserID: scala.Double,
    VaultGUID: java.lang.String
  ): ISessionInfo = {
    val __obj = js.Dynamic.literal(ACLMode = ACLMode, AccountName = AccountName, AuthenticationType = AuthenticationType, CanCreateObjects = CanCreateObjects, CanForceUndoCheckout = CanForceUndoCheckout, CanManageCommonUISettings = CanManageCommonUISettings, CanManageCommonViews = CanManageCommonViews, CanManageTraditionalFolders = CanManageTraditionalFolders, CanMaterializeViews = CanMaterializeViews, CanSeeAllObjects = CanSeeAllObjects, CanSeeDeletedObjects = CanSeeDeletedObjects, CheckObjectAccess = js.Any.fromFunction2(CheckObjectAccess), CheckObjectTypeAccess = js.Any.fromFunction2(CheckObjectTypeAccess), CheckPropertyDefAccess = js.Any.fromFunction2(CheckPropertyDefAccess), CheckVaultAccess = js.Any.fromFunction1(CheckVaultAccess), ClientCulture = ClientCulture, CloneFrom = js.Any.fromFunction1(CloneFrom), InternalUser = InternalUser, IsLoggedOnUserSubstituteOfUser = js.Any.fromFunction1(IsLoggedOnUserSubstituteOfUser), IsSharingPublicLinksAllowed = IsSharingPublicLinksAllowed, IsSharingPublicLinksToLatestVersionAllowed = IsSharingPublicLinksToLatestVersionAllowed, KeepAliveIntervalInSeconds = KeepAliveIntervalInSeconds, Language = Language, LicenseAllowsModifications = LicenseAllowsModifications, LocalComputerName = LocalComputerName, ProductMode = ProductMode, ServerVersion = ServerVersion, TimeZoneInfo = TimeZoneInfo, UserAndGroupMemberships = UserAndGroupMemberships, UserAndSubstitutedByMe = UserAndSubstitutedByMe, UserID = UserID, VaultGUID = VaultGUID)
  
    __obj.asInstanceOf[ISessionInfo]
  }
}

