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
    Clone: js.Function0[IPluginInfo],
    Configuration: INamedValues,
    ConfigurationScope: java.lang.String,
    ConfigurationSource: INamedValues,
    ConfigurationVaultGUID: java.lang.String,
    IsDefault: scala.Boolean,
    IsScopeIndependent: scala.Boolean,
    Name: java.lang.String
  ): IPluginInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AssemblyName")(AssemblyName)
    __obj.updateDynamic("BridgeClassName")(BridgeClassName)
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("Configuration")(Configuration)
    __obj.updateDynamic("ConfigurationScope")(ConfigurationScope)
    __obj.updateDynamic("ConfigurationSource")(ConfigurationSource)
    __obj.updateDynamic("ConfigurationVaultGUID")(ConfigurationVaultGUID)
    __obj.updateDynamic("IsDefault")(IsDefault)
    __obj.updateDynamic("IsScopeIndependent")(IsScopeIndependent)
    __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[IPluginInfo]
  }
}

