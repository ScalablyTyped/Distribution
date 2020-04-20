package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPluginInfo extends js.Object {
  var AssemblyName: String
  var BridgeClassName: String
  var Configuration: INamedValues
  var ConfigurationScope: String
  var ConfigurationSource: INamedValues
  var ConfigurationVaultGUID: String
  var IsDefault: Boolean
  var IsScopeIndependent: Boolean
  var Name: String
  def Clone(): IPluginInfo
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
}

