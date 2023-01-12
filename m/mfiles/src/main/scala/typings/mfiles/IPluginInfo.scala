package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPluginInfo extends StObject {
  
  var AssemblyName: String
  
  var BridgeClassName: String
  
  def Clone(): IPluginInfo
  
  var Configuration: INamedValues
  
  var ConfigurationScope: String
  
  var ConfigurationSource: INamedValues
  
  var ConfigurationVaultGUID: String
  
  var IsDefault: Boolean
  
  var IsScopeIndependent: Boolean
  
  var Name: String
}
object IPluginInfo {
  
  inline def apply(
    AssemblyName: String,
    BridgeClassName: String,
    Clone: () => IPluginInfo,
    Configuration: INamedValues,
    ConfigurationScope: String,
    ConfigurationSource: INamedValues,
    ConfigurationVaultGUID: String,
    IsDefault: Boolean,
    IsScopeIndependent: Boolean,
    Name: String
  ): IPluginInfo = {
    val __obj = js.Dynamic.literal(AssemblyName = AssemblyName.asInstanceOf[js.Any], BridgeClassName = BridgeClassName.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Configuration = Configuration.asInstanceOf[js.Any], ConfigurationScope = ConfigurationScope.asInstanceOf[js.Any], ConfigurationSource = ConfigurationSource.asInstanceOf[js.Any], ConfigurationVaultGUID = ConfigurationVaultGUID.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], IsScopeIndependent = IsScopeIndependent.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPluginInfo] (val x: Self) extends AnyVal {
    
    inline def setAssemblyName(value: String): Self = StObject.set(x, "AssemblyName", value.asInstanceOf[js.Any])
    
    inline def setBridgeClassName(value: String): Self = StObject.set(x, "BridgeClassName", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => IPluginInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setConfiguration(value: INamedValues): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationScope(value: String): Self = StObject.set(x, "ConfigurationScope", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSource(value: INamedValues): Self = StObject.set(x, "ConfigurationSource", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVaultGUID(value: String): Self = StObject.set(x, "ConfigurationVaultGUID", value.asInstanceOf[js.Any])
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsScopeIndependent(value: Boolean): Self = StObject.set(x, "IsScopeIndependent", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
