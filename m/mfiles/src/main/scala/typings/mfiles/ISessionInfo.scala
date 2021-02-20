package typings.mfiles

import typings.mfiles.MFiles.MFACLMode
import typings.mfiles.MFiles.MFAuthType
import typings.mfiles.MFiles.MFObjectAccess
import typings.mfiles.MFiles.MFObjectTypeAccess
import typings.mfiles.MFiles.MFProductMode
import typings.mfiles.MFiles.MFPropertyDefAccess
import typings.mfiles.MFiles.MFVaultAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISessionInfo extends StObject {
  
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
  implicit class ISessionInfoMutableBuilder[Self <: ISessionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setACLMode(value: MFACLMode): Self = StObject.set(x, "ACLMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "AccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationType(value: MFAuthType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCreateObjects(value: Boolean): Self = StObject.set(x, "CanCreateObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanForceUndoCheckout(value: Boolean): Self = StObject.set(x, "CanForceUndoCheckout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageCommonUISettings(value: Boolean): Self = StObject.set(x, "CanManageCommonUISettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageCommonViews(value: Boolean): Self = StObject.set(x, "CanManageCommonViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanManageTraditionalFolders(value: Boolean): Self = StObject.set(x, "CanManageTraditionalFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanMaterializeViews(value: Boolean): Self = StObject.set(x, "CanMaterializeViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSeeAllObjects(value: Boolean): Self = StObject.set(x, "CanSeeAllObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSeeDeletedObjects(value: Boolean): Self = StObject.set(x, "CanSeeDeletedObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckObjectAccess(value: (IAccessControlList, MFObjectAccess) => Boolean): Self = StObject.set(x, "CheckObjectAccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckObjectTypeAccess(value: (IAccessControlList, MFObjectTypeAccess) => Boolean): Self = StObject.set(x, "CheckObjectTypeAccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckPropertyDefAccess(value: (IAccessControlList, MFPropertyDefAccess) => Boolean): Self = StObject.set(x, "CheckPropertyDefAccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCheckVaultAccess(value: MFVaultAccess => Boolean): Self = StObject.set(x, "CheckVaultAccess", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClientCulture(value: String): Self = StObject.set(x, "ClientCulture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneFrom(value: ISessionInfo => Unit): Self = StObject.set(x, "CloneFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInternalUser(value: Boolean): Self = StObject.set(x, "InternalUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLoggedOnUserSubstituteOfUser(value: Double => Boolean): Self = StObject.set(x, "IsLoggedOnUserSubstituteOfUser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsSharingPublicLinksAllowed(value: Boolean): Self = StObject.set(x, "IsSharingPublicLinksAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSharingPublicLinksToLatestVersionAllowed(value: Boolean): Self = StObject.set(x, "IsSharingPublicLinksToLatestVersionAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepAliveIntervalInSeconds(value: Double): Self = StObject.set(x, "KeepAliveIntervalInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Double): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseAllowsModifications(value: Boolean): Self = StObject.set(x, "LicenseAllowsModifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalComputerName(value: String): Self = StObject.set(x, "LocalComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductMode(value: MFProductMode): Self = StObject.set(x, "ProductMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerVersion(value: Double): Self = StObject.set(x, "ServerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneInfo(value: ITimeZoneInformation): Self = StObject.set(x, "TimeZoneInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAndGroupMemberships(value: IUserOrUserGroupIDs): Self = StObject.set(x, "UserAndGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAndSubstitutedByMe(value: IUserOrUserGroupIDs): Self = StObject.set(x, "UserAndSubstitutedByMe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserID(value: Double): Self = StObject.set(x, "UserID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVaultGUID(value: String): Self = StObject.set(x, "VaultGUID", value.asInstanceOf[js.Any])
  }
}
