package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPluginInfo extends js.Object {
  var AssemblyName: java.lang.String
  var BridgeClassName: java.lang.String
  var Configuration: INamedValues
  var ConfigurationScope: java.lang.String
  var ConfigurationSource: INamedValues
  var ConfigurationVaultGUID: java.lang.String
  var IsDefault: scala.Boolean
  var IsScopeIndependent: scala.Boolean
  var Name: java.lang.String
  def Clone(): IPluginInfo
}

object IPluginInfo {
  @scala.inline
  def apply(
    AssemblyName: java.lang.String,
    BridgeClassName: java.lang.String,
    Clone: () => IPluginInfo,
    Configuration: INamedValues,
    ConfigurationScope: java.lang.String,
    ConfigurationSource: INamedValues,
    ConfigurationVaultGUID: java.lang.String,
    IsDefault: scala.Boolean,
    IsScopeIndependent: scala.Boolean,
    Name: java.lang.String
  ): IPluginInfo = {
    val __obj = js.Dynamic.literal(AssemblyName = AssemblyName, BridgeClassName = BridgeClassName, Clone = js.Any.fromFunction0(Clone), Configuration = Configuration, ConfigurationScope = ConfigurationScope, ConfigurationSource = ConfigurationSource, ConfigurationVaultGUID = ConfigurationVaultGUID, IsDefault = IsDefault, IsScopeIndependent = IsScopeIndependent, Name = Name)
  
    __obj.asInstanceOf[IPluginInfo]
  }
}

