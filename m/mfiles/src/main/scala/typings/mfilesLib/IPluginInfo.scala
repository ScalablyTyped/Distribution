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

