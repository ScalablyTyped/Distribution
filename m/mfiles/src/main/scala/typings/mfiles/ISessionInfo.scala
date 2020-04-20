package typings.mfiles

import typings.mfiles.MFiles.MFACLMode
import typings.mfiles.MFiles.MFAuthType
import typings.mfiles.MFiles.MFObjectAccess
import typings.mfiles.MFiles.MFObjectTypeAccess
import typings.mfiles.MFiles.MFProductMode
import typings.mfiles.MFiles.MFPropertyDefAccess
import typings.mfiles.MFiles.MFVaultAccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISessionInfo extends js.Object {
  val ACLMode: MFACLMode
  val AccountName: String
  val AuthenticationType: MFAuthType
  val CanCreateObjects: Boolean
  val CanForceUndoCheckout: Boolean
  val CanManageCommonUISettings: Boolean
  val CanManageCommonViews: Boolean
  val CanManageTraditionalFolders: Boolean
  val CanMaterializeViews: Boolean
  val CanSeeAllObjects: Boolean
  val CanSeeDeletedObjects: Boolean
  val ClientCulture: String
  val InternalUser: Boolean
  val IsSharingPublicLinksAllowed: Boolean
  val IsSharingPublicLinksToLatestVersionAllowed: Boolean
  val KeepAliveIntervalInSeconds: Double
  val Language: Double
  val LicenseAllowsModifications: Boolean
  val LocalComputerName: String
  val ProductMode: MFProductMode
  val ServerVersion: Double
  val TimeZoneInfo: ITimeZoneInformation
  val UserAndGroupMemberships: IUserOrUserGroupIDs
  val UserAndSubstitutedByMe: IUserOrUserGroupIDs
  val UserID: Double
  val VaultGUID: String
  def CheckObjectAccess(ObjectAccessControlList: IAccessControlList, DesiredObjectAccess: MFObjectAccess): Boolean
  def CheckObjectTypeAccess(ObjectTypeAccessControlList: IAccessControlList, DesiredObjectTypeAccess: MFObjectTypeAccess): Boolean
  def CheckPropertyDefAccess(PropertyDefAccessControlList: IAccessControlList, DesiredPropertyDefAccess: MFPropertyDefAccess): Boolean
  def CheckVaultAccess(DesiredVaultAccess: MFVaultAccess): Boolean
  def CloneFrom(SessionInfo: ISessionInfo): Unit
  def IsLoggedOnUserSubstituteOfUser(UserID: Double): Boolean
}

object ISessionInfo {
  @scala.inline
  def apply(
    ACLMode: MFACLMode,
    AccountName: String,
    AuthenticationType: MFAuthType,
    CanCreateObjects: Boolean,
    CanForceUndoCheckout: Boolean,
    CanManageCommonUISettings: Boolean,
    CanManageCommonViews: Boolean,
    CanManageTraditionalFolders: Boolean,
    CanMaterializeViews: Boolean,
    CanSeeAllObjects: Boolean,
    CanSeeDeletedObjects: Boolean,
    CheckObjectAccess: (IAccessControlList, MFObjectAccess) => Boolean,
    CheckObjectTypeAccess: (IAccessControlList, MFObjectTypeAccess) => Boolean,
    CheckPropertyDefAccess: (IAccessControlList, MFPropertyDefAccess) => Boolean,
    CheckVaultAccess: MFVaultAccess => Boolean,
    ClientCulture: String,
    CloneFrom: ISessionInfo => Unit,
    InternalUser: Boolean,
    IsLoggedOnUserSubstituteOfUser: Double => Boolean,
    IsSharingPublicLinksAllowed: Boolean,
    IsSharingPublicLinksToLatestVersionAllowed: Boolean,
    KeepAliveIntervalInSeconds: Double,
    Language: Double,
    LicenseAllowsModifications: Boolean,
    LocalComputerName: String,
    ProductMode: MFProductMode,
    ServerVersion: Double,
    TimeZoneInfo: ITimeZoneInformation,
    UserAndGroupMemberships: IUserOrUserGroupIDs,
    UserAndSubstitutedByMe: IUserOrUserGroupIDs,
    UserID: Double,
    VaultGUID: String
  ): ISessionInfo = {
    val __obj = js.Dynamic.literal(ACLMode = ACLMode.asInstanceOf[js.Any], AccountName = AccountName.asInstanceOf[js.Any], AuthenticationType = AuthenticationType.asInstanceOf[js.Any], CanCreateObjects = CanCreateObjects.asInstanceOf[js.Any], CanForceUndoCheckout = CanForceUndoCheckout.asInstanceOf[js.Any], CanManageCommonUISettings = CanManageCommonUISettings.asInstanceOf[js.Any], CanManageCommonViews = CanManageCommonViews.asInstanceOf[js.Any], CanManageTraditionalFolders = CanManageTraditionalFolders.asInstanceOf[js.Any], CanMaterializeViews = CanMaterializeViews.asInstanceOf[js.Any], CanSeeAllObjects = CanSeeAllObjects.asInstanceOf[js.Any], CanSeeDeletedObjects = CanSeeDeletedObjects.asInstanceOf[js.Any], CheckObjectAccess = js.Any.fromFunction2(CheckObjectAccess), CheckObjectTypeAccess = js.Any.fromFunction2(CheckObjectTypeAccess), CheckPropertyDefAccess = js.Any.fromFunction2(CheckPropertyDefAccess), CheckVaultAccess = js.Any.fromFunction1(CheckVaultAccess), ClientCulture = ClientCulture.asInstanceOf[js.Any], CloneFrom = js.Any.fromFunction1(CloneFrom), InternalUser = InternalUser.asInstanceOf[js.Any], IsLoggedOnUserSubstituteOfUser = js.Any.fromFunction1(IsLoggedOnUserSubstituteOfUser), IsSharingPublicLinksAllowed = IsSharingPublicLinksAllowed.asInstanceOf[js.Any], IsSharingPublicLinksToLatestVersionAllowed = IsSharingPublicLinksToLatestVersionAllowed.asInstanceOf[js.Any], KeepAliveIntervalInSeconds = KeepAliveIntervalInSeconds.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], LicenseAllowsModifications = LicenseAllowsModifications.asInstanceOf[js.Any], LocalComputerName = LocalComputerName.asInstanceOf[js.Any], ProductMode = ProductMode.asInstanceOf[js.Any], ServerVersion = ServerVersion.asInstanceOf[js.Any], TimeZoneInfo = TimeZoneInfo.asInstanceOf[js.Any], UserAndGroupMemberships = UserAndGroupMemberships.asInstanceOf[js.Any], UserAndSubstitutedByMe = UserAndSubstitutedByMe.asInstanceOf[js.Any], UserID = UserID.asInstanceOf[js.Any], VaultGUID = VaultGUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISessionInfo]
  }
}

