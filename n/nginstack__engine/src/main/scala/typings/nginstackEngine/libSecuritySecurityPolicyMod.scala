package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSecuritySecurityPolicyMod {
  
  inline def apply(computerAddress: String, computerName: String, userKey: Double): Unit = (^.asInstanceOf[js.Dynamic].apply(computerAddress.asInstanceOf[js.Any], computerName.asInstanceOf[js.Any], userKey.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/security/SecurityPolicy", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SecurityPolicy {
    def this(computerAddress: String, computerName: String, userKey: Double) = this()
    
    /* CompleteClass */
    override def checkComputer(): Boolean = js.native
    
    /* CompleteClass */
    override def checkEnabledApplication(appId: SecurityPolicyApplication): Boolean = js.native
    
    /* CompleteClass */
    override def checkEngineRestartAllowed(): Boolean = js.native
    
    /* CompleteClass */
    var computerAddress: String = js.native
    
    /* CompleteClass */
    var computerName: String = js.native
    
    /* CompleteClass */
    var computerPolicyKey: Double = js.native
    
    /* CompleteClass */
    var groupsAndUsers: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    var hostKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var hosts: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* private */ /* CompleteClass */
    var initialize: Any = js.native
    
    /* CompleteClass */
    var networkKeys: js.Array[Any] = js.native
    
    /* CompleteClass */
    var networkUtilities: typings.nginstackEngine.libNetNetworkUtilitiesMod.^ = js.native
    
    /* CompleteClass */
    var networks: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    var securityPolicies: typings.nginstackEngine.libDatasetDataSetMod.^ = js.native
    
    /* CompleteClass */
    var userKey: String = js.native
    
    /* CompleteClass */
    var userPolicyKey: Double = js.native
    
    /* CompleteClass */
    override def validateLogin(appId: String): Unit = js.native
  }
  @JSImport("@nginstack/engine/lib/security/SecurityPolicy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def userCanAccessRemotely(userKey: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("userCanAccessRemotely")(userKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait SecurityPolicy extends StObject {
    
    def checkComputer(): Boolean
    
    def checkEnabledApplication(appId: SecurityPolicyApplication): Boolean
    
    def checkEngineRestartAllowed(): Boolean
    
    var computerAddress: String
    
    var computerName: String
    
    var computerPolicyKey: Double
    
    var groupsAndUsers: typings.nginstackEngine.libDatasetDataSetMod.^
    
    var hostKeys: js.Array[Any]
    
    var hosts: typings.nginstackEngine.libDatasetDataSetMod.^
    
    /* private */ var initialize: Any
    
    var networkKeys: js.Array[Any]
    
    var networkUtilities: typings.nginstackEngine.libNetNetworkUtilitiesMod.^
    
    var networks: typings.nginstackEngine.libDatasetDataSetMod.^
    
    var securityPolicies: typings.nginstackEngine.libDatasetDataSetMod.^
    
    var userKey: String
    
    var userPolicyKey: Double
    
    def validateLogin(appId: String): Unit
  }
  object SecurityPolicy {
    
    inline def apply(
      checkComputer: () => Boolean,
      checkEnabledApplication: SecurityPolicyApplication => Boolean,
      checkEngineRestartAllowed: () => Boolean,
      computerAddress: String,
      computerName: String,
      computerPolicyKey: Double,
      groupsAndUsers: typings.nginstackEngine.libDatasetDataSetMod.^,
      hostKeys: js.Array[Any],
      hosts: typings.nginstackEngine.libDatasetDataSetMod.^,
      initialize: Any,
      networkKeys: js.Array[Any],
      networkUtilities: typings.nginstackEngine.libNetNetworkUtilitiesMod.^,
      networks: typings.nginstackEngine.libDatasetDataSetMod.^,
      securityPolicies: typings.nginstackEngine.libDatasetDataSetMod.^,
      userKey: String,
      userPolicyKey: Double,
      validateLogin: String => Unit
    ): SecurityPolicy = {
      val __obj = js.Dynamic.literal(checkComputer = js.Any.fromFunction0(checkComputer), checkEnabledApplication = js.Any.fromFunction1(checkEnabledApplication), checkEngineRestartAllowed = js.Any.fromFunction0(checkEngineRestartAllowed), computerAddress = computerAddress.asInstanceOf[js.Any], computerName = computerName.asInstanceOf[js.Any], computerPolicyKey = computerPolicyKey.asInstanceOf[js.Any], groupsAndUsers = groupsAndUsers.asInstanceOf[js.Any], hostKeys = hostKeys.asInstanceOf[js.Any], hosts = hosts.asInstanceOf[js.Any], initialize = initialize.asInstanceOf[js.Any], networkKeys = networkKeys.asInstanceOf[js.Any], networkUtilities = networkUtilities.asInstanceOf[js.Any], networks = networks.asInstanceOf[js.Any], securityPolicies = securityPolicies.asInstanceOf[js.Any], userKey = userKey.asInstanceOf[js.Any], userPolicyKey = userPolicyKey.asInstanceOf[js.Any], validateLogin = js.Any.fromFunction1(validateLogin))
      __obj.asInstanceOf[SecurityPolicy]
    }
    
    extension [Self <: SecurityPolicy](x: Self) {
      
      inline def setCheckComputer(value: () => Boolean): Self = StObject.set(x, "checkComputer", js.Any.fromFunction0(value))
      
      inline def setCheckEnabledApplication(value: SecurityPolicyApplication => Boolean): Self = StObject.set(x, "checkEnabledApplication", js.Any.fromFunction1(value))
      
      inline def setCheckEngineRestartAllowed(value: () => Boolean): Self = StObject.set(x, "checkEngineRestartAllowed", js.Any.fromFunction0(value))
      
      inline def setComputerAddress(value: String): Self = StObject.set(x, "computerAddress", value.asInstanceOf[js.Any])
      
      inline def setComputerName(value: String): Self = StObject.set(x, "computerName", value.asInstanceOf[js.Any])
      
      inline def setComputerPolicyKey(value: Double): Self = StObject.set(x, "computerPolicyKey", value.asInstanceOf[js.Any])
      
      inline def setGroupsAndUsers(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "groupsAndUsers", value.asInstanceOf[js.Any])
      
      inline def setHostKeys(value: js.Array[Any]): Self = StObject.set(x, "hostKeys", value.asInstanceOf[js.Any])
      
      inline def setHostKeysVarargs(value: Any*): Self = StObject.set(x, "hostKeys", js.Array(value*))
      
      inline def setHosts(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: Any): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
      
      inline def setNetworkKeys(value: js.Array[Any]): Self = StObject.set(x, "networkKeys", value.asInstanceOf[js.Any])
      
      inline def setNetworkKeysVarargs(value: Any*): Self = StObject.set(x, "networkKeys", js.Array(value*))
      
      inline def setNetworkUtilities(value: typings.nginstackEngine.libNetNetworkUtilitiesMod.^): Self = StObject.set(x, "networkUtilities", value.asInstanceOf[js.Any])
      
      inline def setNetworks(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
      
      inline def setSecurityPolicies(value: typings.nginstackEngine.libDatasetDataSetMod.^): Self = StObject.set(x, "securityPolicies", value.asInstanceOf[js.Any])
      
      inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
      
      inline def setUserPolicyKey(value: Double): Self = StObject.set(x, "userPolicyKey", value.asInstanceOf[js.Any])
      
      inline def setValidateLogin(value: String => Unit): Self = StObject.set(x, "validateLogin", js.Any.fromFunction1(value))
    }
  }
  
  trait SecurityPolicyApplication extends StObject {
    
    var FrameworkHTML: String
    
    var IDE: String
    
    var iWeb: String
  }
  object SecurityPolicyApplication {
    
    inline def apply(FrameworkHTML: String, IDE: String, iWeb: String): SecurityPolicyApplication = {
      val __obj = js.Dynamic.literal(FrameworkHTML = FrameworkHTML.asInstanceOf[js.Any], IDE = IDE.asInstanceOf[js.Any], iWeb = iWeb.asInstanceOf[js.Any])
      __obj.asInstanceOf[SecurityPolicyApplication]
    }
    
    extension [Self <: SecurityPolicyApplication](x: Self) {
      
      inline def setFrameworkHTML(value: String): Self = StObject.set(x, "FrameworkHTML", value.asInstanceOf[js.Any])
      
      inline def setIDE(value: String): Self = StObject.set(x, "IDE", value.asInstanceOf[js.Any])
      
      inline def setIWeb(value: String): Self = StObject.set(x, "iWeb", value.asInstanceOf[js.Any])
    }
  }
}
