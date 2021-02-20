package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPluginInfo extends StObject {
  
  var AssemblyName: String = js.native
  
  var BridgeClassName: String = js.native
  
  def Clone(): IPluginInfo = js.native
  
  var Configuration: INamedValues = js.native
  
  var ConfigurationScope: String = js.native
  
  var ConfigurationSource: INamedValues = js.native
  
  var ConfigurationVaultGUID: String = js.native
  
  var IsDefault: Boolean = js.native
  
  var IsScopeIndependent: Boolean = js.native
  
  var Name: String = js.native
}
object IPluginInfo {
  
  @scala.inline
  def apply(
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
  implicit class IPluginInfoMutableBuilder[Self <: IPluginInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssemblyName(value: String): Self = StObject.set(x, "AssemblyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeClassName(value: String): Self = StObject.set(x, "BridgeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IPluginInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConfiguration(value: INamedValues): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationScope(value: String): Self = StObject.set(x, "ConfigurationScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSource(value: INamedValues): Self = StObject.set(x, "ConfigurationSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVaultGUID(value: String): Self = StObject.set(x, "ConfigurationVaultGUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScopeIndependent(value: Boolean): Self = StObject.set(x, "IsScopeIndependent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
