package typings.mfiles

import typings.mfiles.MFiles.MFNamedACLType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultNamedACLOperations extends StObject {
  
  def AddNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): INamedACLAdmin = js.native
  
  def GetMatchingNamedACLForAccessControlList(
    AccessControlList: IAccessControlList,
    ExplicitLinkOnly: Boolean,
    ActiveAccessControlComponentsOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  
  def GetMatchingNamedACLForAccessControlListComponent(
    AccessControlListComponent: IAccessControlListComponent,
    ExplicitLinkOnly: Boolean,
    RefreshFromServer: Boolean
  ): INamedACL = js.native
  
  def GetNamedACL(NamedACLID: Double): INamedACL = js.native
  
  def GetNamedACLAdmin(NamedACLID: Double): INamedACLAdmin = js.native
  
  def GetNamedACLIDByAlias(Alias: String): Double = js.native
  
  def GetNamedACLIDByGUID(NamedACLGUID: String): Double = js.native
  
  def GetNamedACLWithRefresh(NamedACLID: Double, RefreshFromServer: Boolean): INamedACL = js.native
  
  def GetNamedACLs(): INamedACLs = js.native
  
  def GetNamedACLsByTypeAdmin(Type: MFNamedACLType): INamedACLsAdmin = js.native
  
  def GetNamedACLsWithRefresh(RefreshFromServer: Boolean): INamedACLs = js.native
  
  def IsNamedACLUsedInAutomaticPermissionsAdmin(NamedACLID: Double): Boolean = js.native
  
  def RemoveNamedACLWithPropagationAdmin(NamedACLID: Double, AllowPropagation: Boolean): Unit = js.native
  
  def UpdateNamedACLAdmin(NamedACLAdmin: INamedACLAdmin): Unit = js.native
  
  def UpdateNamedACLWithPropagationAdmin(NamedACLAdmin: INamedACLAdmin, MaintainLinks: Boolean, AllowPropagation: Boolean): Unit = js.native
}
object IVaultNamedACLOperations {
  
  @scala.inline
  def apply(
    AddNamedACLAdmin: INamedACLAdmin => INamedACLAdmin,
    GetMatchingNamedACLForAccessControlList: (IAccessControlList, Boolean, Boolean, Boolean) => INamedACL,
    GetMatchingNamedACLForAccessControlListComponent: (IAccessControlListComponent, Boolean, Boolean) => INamedACL,
    GetNamedACL: Double => INamedACL,
    GetNamedACLAdmin: Double => INamedACLAdmin,
    GetNamedACLIDByAlias: String => Double,
    GetNamedACLIDByGUID: String => Double,
    GetNamedACLWithRefresh: (Double, Boolean) => INamedACL,
    GetNamedACLs: () => INamedACLs,
    GetNamedACLsByTypeAdmin: MFNamedACLType => INamedACLsAdmin,
    GetNamedACLsWithRefresh: Boolean => INamedACLs,
    IsNamedACLUsedInAutomaticPermissionsAdmin: Double => Boolean,
    RemoveNamedACLWithPropagationAdmin: (Double, Boolean) => Unit,
    UpdateNamedACLAdmin: INamedACLAdmin => Unit,
    UpdateNamedACLWithPropagationAdmin: (INamedACLAdmin, Boolean, Boolean) => Unit
  ): IVaultNamedACLOperations = {
    val __obj = js.Dynamic.literal(AddNamedACLAdmin = js.Any.fromFunction1(AddNamedACLAdmin), GetMatchingNamedACLForAccessControlList = js.Any.fromFunction4(GetMatchingNamedACLForAccessControlList), GetMatchingNamedACLForAccessControlListComponent = js.Any.fromFunction3(GetMatchingNamedACLForAccessControlListComponent), GetNamedACL = js.Any.fromFunction1(GetNamedACL), GetNamedACLAdmin = js.Any.fromFunction1(GetNamedACLAdmin), GetNamedACLIDByAlias = js.Any.fromFunction1(GetNamedACLIDByAlias), GetNamedACLIDByGUID = js.Any.fromFunction1(GetNamedACLIDByGUID), GetNamedACLWithRefresh = js.Any.fromFunction2(GetNamedACLWithRefresh), GetNamedACLs = js.Any.fromFunction0(GetNamedACLs), GetNamedACLsByTypeAdmin = js.Any.fromFunction1(GetNamedACLsByTypeAdmin), GetNamedACLsWithRefresh = js.Any.fromFunction1(GetNamedACLsWithRefresh), IsNamedACLUsedInAutomaticPermissionsAdmin = js.Any.fromFunction1(IsNamedACLUsedInAutomaticPermissionsAdmin), RemoveNamedACLWithPropagationAdmin = js.Any.fromFunction2(RemoveNamedACLWithPropagationAdmin), UpdateNamedACLAdmin = js.Any.fromFunction1(UpdateNamedACLAdmin), UpdateNamedACLWithPropagationAdmin = js.Any.fromFunction3(UpdateNamedACLWithPropagationAdmin))
    __obj.asInstanceOf[IVaultNamedACLOperations]
  }
  
  @scala.inline
  implicit class IVaultNamedACLOperationsMutableBuilder[Self <: IVaultNamedACLOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddNamedACLAdmin(value: INamedACLAdmin => INamedACLAdmin): Self = StObject.set(x, "AddNamedACLAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetMatchingNamedACLForAccessControlList(value: (IAccessControlList, Boolean, Boolean, Boolean) => INamedACL): Self = StObject.set(x, "GetMatchingNamedACLForAccessControlList", js.Any.fromFunction4(value))
    
    @scala.inline
    def setGetMatchingNamedACLForAccessControlListComponent(value: (IAccessControlListComponent, Boolean, Boolean) => INamedACL): Self = StObject.set(x, "GetMatchingNamedACLForAccessControlListComponent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetNamedACL(value: Double => INamedACL): Self = StObject.set(x, "GetNamedACL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedACLAdmin(value: Double => INamedACLAdmin): Self = StObject.set(x, "GetNamedACLAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedACLIDByAlias(value: String => Double): Self = StObject.set(x, "GetNamedACLIDByAlias", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedACLIDByGUID(value: String => Double): Self = StObject.set(x, "GetNamedACLIDByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedACLWithRefresh(value: (Double, Boolean) => INamedACL): Self = StObject.set(x, "GetNamedACLWithRefresh", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetNamedACLs(value: () => INamedACLs): Self = StObject.set(x, "GetNamedACLs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNamedACLsByTypeAdmin(value: MFNamedACLType => INamedACLsAdmin): Self = StObject.set(x, "GetNamedACLsByTypeAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetNamedACLsWithRefresh(value: Boolean => INamedACLs): Self = StObject.set(x, "GetNamedACLsWithRefresh", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsNamedACLUsedInAutomaticPermissionsAdmin(value: Double => Boolean): Self = StObject.set(x, "IsNamedACLUsedInAutomaticPermissionsAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveNamedACLWithPropagationAdmin(value: (Double, Boolean) => Unit): Self = StObject.set(x, "RemoveNamedACLWithPropagationAdmin", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdateNamedACLAdmin(value: INamedACLAdmin => Unit): Self = StObject.set(x, "UpdateNamedACLAdmin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateNamedACLWithPropagationAdmin(value: (INamedACLAdmin, Boolean, Boolean) => Unit): Self = StObject.set(x, "UpdateNamedACLWithPropagationAdmin", js.Any.fromFunction3(value))
  }
}
