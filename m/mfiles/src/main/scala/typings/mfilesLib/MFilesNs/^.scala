package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles")
@js.native
object ^ extends js.Object {
  val ApplicationPath: java.lang.String = js.native
  val CLSID: mfilesLib.ICLSIDs = js.native
  val CurrentApplicationPlatform: js.Any = js.native
  def CreateInstance(name: java.lang.String): js.Any = js.native
  def CreateObjectCLR(assemblyFile: java.lang.String, className: java.lang.String): js.Any = js.native
  def DeleteRegistryKey(userSpecific: scala.Boolean, key: java.lang.String): scala.Unit = js.native
  def DeleteRegistryValue(userSpecific: scala.Boolean, key: java.lang.String, valueName: java.lang.String): scala.Unit = js.native
  def EnableExceptionPropagation(exception: js.Any): scala.Unit = js.native
  def ExecuteURL(url: java.lang.String): scala.Unit = js.native
  def GetErrorDescription(exception: js.Any): java.lang.String = js.native
  def GetLongErrorDescription(exception: js.Any): java.lang.String = js.native
  def GetStringResource(resource: scala.Double): java.lang.String = js.native
  def KillTimer(timerId: scala.Double): scala.Unit = js.native
  def LaunchHelp(helpID: java.lang.String): scala.Unit = js.native
  def PersistStringData(name: java.lang.String, privateData: scala.Boolean, data: java.lang.String): scala.Unit = js.native
  def ReadFromRegistry(userSpecific: scala.Boolean, key: java.lang.String, valueName: java.lang.String): js.Any = js.native
  def ReadTextFile(filename: java.lang.String): java.lang.String = js.native
  def ReportException(exception: js.Any): scala.Unit = js.native
  def RetrieveStringData(name: java.lang.String, privateData: scala.Boolean): java.lang.String = js.native
  def SetTimer(timeoutInMs: scala.Double, callbackMethod: js.Function0[scala.Unit]): scala.Double = js.native
  def ThrowError(description: java.lang.String): scala.Unit = js.native
  def WriteToRegistry(
    userSpecific: scala.Boolean,
    key: java.lang.String,
    valueName: java.lang.String,
    value: js.Any,
    valueType: java.lang.String
  ): scala.Unit = js.native
}

