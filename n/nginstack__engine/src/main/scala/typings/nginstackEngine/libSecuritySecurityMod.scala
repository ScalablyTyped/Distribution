package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecuritySecurityMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/Security", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Security
  @JSImport("@nginstack/engine/lib/security/Security", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getInstance(): Security = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[Security]
  
  type DataSet = typings.nginstackEngine.libDatasetDataSetMod.^
  
  @js.native
  trait Security extends StObject {
    
    def authenticateUser(userId: String, password: String): Double = js.native
    
    def authorizeToken(authToken: typings.nginstackEngine.libSecurityAuthTokenMod.^, userId: String, password: String): String = js.native
    
    def changePassword(userKey: Double, oldPassword: String, newPassword: String): Unit = js.native
    
    def createAuthToken(userId: String, password: String, expiration: js.Date, data: String, localAuthentication: Boolean): String = js.native
    
    def createGroup(groupName: String, groups: js.Array[Any]): Double = js.native
    
    def createUser(userName: String, password: String, groups: js.Array[Double]): Double = js.native
    
    def deleteGroup(groupKey: Double): Unit = js.native
    
    def deleteUser(userKey: Double): Unit = js.native
    
    def findUser(userId: String, password: Any, groups: Any): Double | Null = js.native
    
    def getAuthPolicy(userKey: Double): Double = js.native
    def getAuthPolicy(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^): Double = js.native
    
    def getAuthPolicyClass(userKey: Double): typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    def getAuthPolicyClass(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^): typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    def getMimeTypesWithPermissionControl(): js.Array[Double] = js.native
    
    def getPermission(classKeyOrVfsKey: Double, permissionFieldName: String, userKey: Double): Unit = js.native
    def getPermission(classKeyOrVfsKey: Double, permissionFieldName: String, userKey: Double, getMode: String): Unit = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Double,
      getMode: String,
      extraFilter: String
    ): Unit = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Double,
      getMode: String,
      extraFilter: js.Array[Any]
    ): Unit = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Double,
      getMode: Unit,
      extraFilter: String
    ): Unit = js.native
    def getPermission(
      classKeyOrVfsKey: Double,
      permissionFieldName: String,
      userKey: Double,
      getMode: Unit,
      extraFilter: js.Array[Any]
    ): Unit = js.native
    
    def getUserAndGroupsKeys(userKey: Double): js.Array[Any] = js.native
    
    def getUserScopes(userKey: Double): js.Array[String] = js.native
    def getUserScopes(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^): js.Array[String] = js.native
    
    def getUserStatus(userKey: Double): typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    def getUserStatus(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^): typings.nginstackEngine.libDbkeyDbkeyMod.^ = js.native
    
    def hasPermissionControl(key: Double): Boolean = js.native
    
    def isAdministrator(userKey: Double): Boolean = js.native
    
    def isDeveloper(userKey: Double): Boolean = js.native
    
    def restoreAuthToken(accessToken: String): typings.nginstackEngine.libSecurityAuthTokenMod.^ = js.native
    
    def revokeAuthToken(accessToken: String): Unit = js.native
    
    def revokeAuthTokenByKey(key: Double, userId: String, password: String): Unit = js.native
    
    def setPassword(userKey: Any, password: Any): Unit = js.native
    
    def setUserStatus(userKey: Double, status: typings.nginstackEngine.libDbkeyDbkeyMod.^): Unit = js.native
    def setUserStatus(
      userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      status: typings.nginstackEngine.libDbkeyDbkeyMod.^
    ): Unit = js.native
    
    def suggestPermissionApplyMode(parent: Double): Double | Null = js.native
    
    def updateAuthToken(token: typings.nginstackEngine.libSecurityAuthTokenMod.^, userId: String, password: String): Unit = js.native
    
    def userCanModifyKey(key: Double, classKey: Double): Boolean = js.native
    def userCanModifyKey(key: Double, classKey: Double, userKey: Double): Boolean = js.native
    
    /* private */ var userCanModifyKeyUnsafe_ : Any = js.native
    
    def userCanModifyRecord(ds: DataSet): Boolean = js.native
    def userCanModifyRecord(ds: DataSet, userKey: Double): Boolean = js.native
    
    def userHasScope(userKey: Double, scope: String): Boolean = js.native
    def userHasScope(userKey: Double, scope: Double): Boolean = js.native
    def userHasScope(userKey: Double, scope: typings.nginstackEngine.libDbkeyDbkeyMod.^): Boolean = js.native
    def userHasScope(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^, scope: String): Boolean = js.native
    def userHasScope(userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^, scope: Double): Boolean = js.native
    def userHasScope(
      userKey: typings.nginstackEngine.libDbkeyDbkeyMod.^,
      scope: typings.nginstackEngine.libDbkeyDbkeyMod.^
    ): Boolean = js.native
  }
}
