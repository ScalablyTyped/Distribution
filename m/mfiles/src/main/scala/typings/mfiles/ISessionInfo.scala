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
    val __obj = js.Dynamic.literal(ACLMode = ACLMode, AccountName = AccountName, AuthenticationType = AuthenticationType, CanCreateObjects = CanCreateObjects, CanForceUndoCheckout = CanForceUndoCheckout, CanManageCommonUISettings = CanManageCommonUISettings, CanManageCommonViews = CanManageCommonViews, CanManageTraditionalFolders = CanManageTraditionalFolders, CanMaterializeViews = CanMaterializeViews, CanSeeAllObjects = CanSeeAllObjects, CanSeeDeletedObjects = CanSeeDeletedObjects, CheckObjectAccess = js.Any.fromFunction2(CheckObjectAccess), CheckObjectTypeAccess = js.Any.fromFunction2(CheckObjectTypeAccess), CheckPropertyDefAccess = js.Any.fromFunction2(CheckPropertyDefAccess), CheckVaultAccess = js.Any.fromFunction1(CheckVaultAccess), ClientCulture = ClientCulture, CloneFrom = js.Any.fromFunction1(CloneFrom), InternalUser = InternalUser, IsLoggedOnUserSubstituteOfUser = js.Any.fromFunction1(IsLoggedOnUserSubstituteOfUser), IsSharingPublicLinksAllowed = IsSharingPublicLinksAllowed, IsSharingPublicLinksToLatestVersionAllowed = IsSharingPublicLinksToLatestVersionAllowed, KeepAliveIntervalInSeconds = KeepAliveIntervalInSeconds, Language = Language, LicenseAllowsModifications = LicenseAllowsModifications, LocalComputerName = LocalComputerName, ProductMode = ProductMode, ServerVersion = ServerVersion, TimeZoneInfo = TimeZoneInfo, UserAndGroupMemberships = UserAndGroupMemberships, UserAndSubstitutedByMe = UserAndSubstitutedByMe, UserID = UserID, VaultGUID = VaultGUID)
  
    __obj.asInstanceOf[ISessionInfo]
  }
}

