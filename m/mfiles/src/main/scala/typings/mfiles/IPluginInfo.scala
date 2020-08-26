package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPluginInfo extends js.Object {
  var AssemblyName: String = js.native
  var BridgeClassName: String = js.native
  var Configuration: INamedValues = js.native
  var ConfigurationScope: String = js.native
  var ConfigurationSource: INamedValues = js.native
  var ConfigurationVaultGUID: String = js.native
  var IsDefault: Boolean = js.native
  var IsScopeIndependent: Boolean = js.native
  var Name: String = js.native
  def Clone(): IPluginInfo = js.native
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
  implicit class IPluginInfoOps[Self <: IPluginInfo] (val x: Self) extends AnyVal {
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
    def setAssemblyName(value: String): Self = this.set("AssemblyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBridgeClassName(value: String): Self = this.set("BridgeClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IPluginInfo): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setConfiguration(value: INamedValues): Self = this.set("Configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationScope(value: String): Self = this.set("ConfigurationScope", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationSource(value: INamedValues): Self = this.set("ConfigurationSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationVaultGUID(value: String): Self = this.set("ConfigurationVaultGUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsScopeIndependent(value: Boolean): Self = this.set("IsScopeIndependent", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

