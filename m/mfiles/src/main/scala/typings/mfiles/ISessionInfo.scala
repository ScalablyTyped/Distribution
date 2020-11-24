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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISessionInfo extends js.Object {
  
  val ACLMode: MFACLMode = js.native
  
  val AccountName: String = js.native
  
  val AuthenticationType: MFAuthType = js.native
  
  val CanCreateObjects: Boolean = js.native
  
  val CanForceUndoCheckout: Boolean = js.native
  
  val CanManageCommonUISettings: Boolean = js.native
  
  val CanManageCommonViews: Boolean = js.native
  
  val CanManageTraditionalFolders: Boolean = js.native
  
  val CanMaterializeViews: Boolean = js.native
  
  val CanSeeAllObjects: Boolean = js.native
  
  val CanSeeDeletedObjects: Boolean = js.native
  
  def CheckObjectAccess(ObjectAccessControlList: IAccessControlList, DesiredObjectAccess: MFObjectAccess): Boolean = js.native
  
  def CheckObjectTypeAccess(ObjectTypeAccessControlList: IAccessControlList, DesiredObjectTypeAccess: MFObjectTypeAccess): Boolean = js.native
  
  def CheckPropertyDefAccess(PropertyDefAccessControlList: IAccessControlList, DesiredPropertyDefAccess: MFPropertyDefAccess): Boolean = js.native
  
  def CheckVaultAccess(DesiredVaultAccess: MFVaultAccess): Boolean = js.native
  
  val ClientCulture: String = js.native
  
  def CloneFrom(SessionInfo: ISessionInfo): Unit = js.native
  
  val InternalUser: Boolean = js.native
  
  def IsLoggedOnUserSubstituteOfUser(UserID: Double): Boolean = js.native
  
  val IsSharingPublicLinksAllowed: Boolean = js.native
  
  val IsSharingPublicLinksToLatestVersionAllowed: Boolean = js.native
  
  val KeepAliveIntervalInSeconds: Double = js.native
  
  val Language: Double = js.native
  
  val LicenseAllowsModifications: Boolean = js.native
  
  val LocalComputerName: String = js.native
  
  val ProductMode: MFProductMode = js.native
  
  val ServerVersion: Double = js.native
  
  val TimeZoneInfo: ITimeZoneInformation = js.native
  
  val UserAndGroupMemberships: IUserOrUserGroupIDs = js.native
  
  val UserAndSubstitutedByMe: IUserOrUserGroupIDs = js.native
  
  val UserID: Double = js.native
  
  val VaultGUID: String = js.native
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
  
  @scala.inline
  implicit class ISessionInfoOps[Self <: ISessionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setACLMode(value: MFACLMode): Self = this.set("ACLMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountName(value: String): Self = this.set("AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationType(value: MFAuthType): Self = this.set("AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateObjects(value: Boolean): Self = this.set("CanCreateObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanForceUndoCheckout(value: Boolean): Self = this.set("CanForceUndoCheckout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageCommonUISettings(value: Boolean): Self = this.set("CanManageCommonUISettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageCommonViews(value: Boolean): Self = this.set("CanManageCommonViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageTraditionalFolders(value: Boolean): Self = this.set("CanManageTraditionalFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMaterializeViews(value: Boolean): Self = this.set("CanMaterializeViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSeeAllObjects(value: Boolean): Self = this.set("CanSeeAllObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSeeDeletedObjects(value: Boolean): Self = this.set("CanSeeDeletedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckObjectAccess(value: (IAccessControlList, MFObjectAccess) => Boolean): Self = this.set("CheckObjectAccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckObjectTypeAccess(value: (IAccessControlList, MFObjectTypeAccess) => Boolean): Self = this.set("CheckObjectTypeAccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckPropertyDefAccess(value: (IAccessControlList, MFPropertyDefAccess) => Boolean): Self = this.set("CheckPropertyDefAccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckVaultAccess(value: MFVaultAccess => Boolean): Self = this.set("CheckVaultAccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClientCulture(value: String): Self = this.set("ClientCulture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneFrom(value: ISessionInfo => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInternalUser(value: Boolean): Self = this.set("InternalUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoggedOnUserSubstituteOfUser(value: Double => Boolean): Self = this.set("IsLoggedOnUserSubstituteOfUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSharingPublicLinksAllowed(value: Boolean): Self = this.set("IsSharingPublicLinksAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharingPublicLinksToLatestVersionAllowed(value: Boolean): Self = this.set("IsSharingPublicLinksToLatestVersionAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveIntervalInSeconds(value: Double): Self = this.set("KeepAliveIntervalInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Double): Self = this.set("Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAllowsModifications(value: Boolean): Self = this.set("LicenseAllowsModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalComputerName(value: String): Self = this.set("LocalComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductMode(value: MFProductMode): Self = this.set("ProductMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVersion(value: Double): Self = this.set("ServerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneInfo(value: ITimeZoneInformation): Self = this.set("TimeZoneInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAndGroupMemberships(value: IUserOrUserGroupIDs): Self = this.set("UserAndGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAndSubstitutedByMe(value: IUserOrUserGroupIDs): Self = this.set("UserAndSubstitutedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: Double): Self = this.set("UserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultGUID(value: String): Self = this.set("VaultGUID", value.asInstanceOf[js.Any])
  }
}
