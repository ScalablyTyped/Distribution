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
    CheckObjectAccess: js.Function2[IAccessControlList, mfilesLib.MFilesNs.MFObjectAccess, scala.Boolean],
    CheckObjectTypeAccess: js.Function2[IAccessControlList, mfilesLib.MFilesNs.MFObjectTypeAccess, scala.Boolean],
    CheckPropertyDefAccess: js.Function2[IAccessControlList, mfilesLib.MFilesNs.MFPropertyDefAccess, scala.Boolean],
    CheckVaultAccess: js.Function1[mfilesLib.MFilesNs.MFVaultAccess, scala.Boolean],
    ClientCulture: java.lang.String,
    CloneFrom: js.Function1[ISessionInfo, scala.Unit],
    InternalUser: scala.Boolean,
    IsLoggedOnUserSubstituteOfUser: js.Function1[scala.Double, scala.Boolean],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ACLMode")(ACLMode)
    __obj.updateDynamic("AccountName")(AccountName)
    __obj.updateDynamic("AuthenticationType")(AuthenticationType)
    __obj.updateDynamic("CanCreateObjects")(CanCreateObjects)
    __obj.updateDynamic("CanForceUndoCheckout")(CanForceUndoCheckout)
    __obj.updateDynamic("CanManageCommonUISettings")(CanManageCommonUISettings)
    __obj.updateDynamic("CanManageCommonViews")(CanManageCommonViews)
    __obj.updateDynamic("CanManageTraditionalFolders")(CanManageTraditionalFolders)
    __obj.updateDynamic("CanMaterializeViews")(CanMaterializeViews)
    __obj.updateDynamic("CanSeeAllObjects")(CanSeeAllObjects)
    __obj.updateDynamic("CanSeeDeletedObjects")(CanSeeDeletedObjects)
    __obj.updateDynamic("CheckObjectAccess")(CheckObjectAccess)
    __obj.updateDynamic("CheckObjectTypeAccess")(CheckObjectTypeAccess)
    __obj.updateDynamic("CheckPropertyDefAccess")(CheckPropertyDefAccess)
    __obj.updateDynamic("CheckVaultAccess")(CheckVaultAccess)
    __obj.updateDynamic("ClientCulture")(ClientCulture)
    __obj.updateDynamic("CloneFrom")(CloneFrom)
    __obj.updateDynamic("InternalUser")(InternalUser)
    __obj.updateDynamic("IsLoggedOnUserSubstituteOfUser")(IsLoggedOnUserSubstituteOfUser)
    __obj.updateDynamic("IsSharingPublicLinksAllowed")(IsSharingPublicLinksAllowed)
    __obj.updateDynamic("IsSharingPublicLinksToLatestVersionAllowed")(IsSharingPublicLinksToLatestVersionAllowed)
    __obj.updateDynamic("KeepAliveIntervalInSeconds")(KeepAliveIntervalInSeconds)
    __obj.updateDynamic("Language")(Language)
    __obj.updateDynamic("LicenseAllowsModifications")(LicenseAllowsModifications)
    __obj.updateDynamic("LocalComputerName")(LocalComputerName)
    __obj.updateDynamic("ProductMode")(ProductMode)
    __obj.updateDynamic("ServerVersion")(ServerVersion)
    __obj.updateDynamic("TimeZoneInfo")(TimeZoneInfo)
    __obj.updateDynamic("UserAndGroupMemberships")(UserAndGroupMemberships)
    __obj.updateDynamic("UserAndSubstitutedByMe")(UserAndSubstitutedByMe)
    __obj.updateDynamic("UserID")(UserID)
    __obj.updateDynamic("VaultGUID")(VaultGUID)
    __obj.asInstanceOf[ISessionInfo]
  }
}

