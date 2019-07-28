package typings.mfiles.MFilesNs

import typings.mfiles.ICLSIDs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles")
@js.native
object ^ extends js.Object {
  val ApplicationPath: String = js.native
  val CLSID: ICLSIDs = js.native
  val CurrentApplicationPlatform: js.Any = js.native
  def CreateInstance(name: String): js.Any = js.native
  def CreateObjectCLR(assemblyFile: String, className: String): js.Any = js.native
  def DeleteRegistryKey(userSpecific: Boolean, key: String): Unit = js.native
  def DeleteRegistryValue(userSpecific: Boolean, key: String, valueName: String): Unit = js.native
  def EnableExceptionPropagation(exception: js.Any): Unit = js.native
  def ExecuteURL(url: String): Unit = js.native
  def GetErrorDescription(exception: js.Any): String = js.native
  def GetLongErrorDescription(exception: js.Any): String = js.native
  def GetStringResource(resource: Double): String = js.native
  def KillTimer(timerId: Double): Unit = js.native
  def LaunchHelp(helpID: String): Unit = js.native
  def PersistStringData(name: String, privateData: Boolean, data: String): Unit = js.native
  def ReadFromRegistry(userSpecific: Boolean, key: String, valueName: String): js.Any = js.native
  def ReadTextFile(filename: String): String = js.native
  def ReportException(exception: js.Any): Unit = js.native
  def RetrieveStringData(name: String, privateData: Boolean): String = js.native
  def SetTimer(timeoutInMs: Double, callbackMethod: js.Function0[Unit]): Double = js.native
  def ThrowError(description: String): Unit = js.native
  def WriteToRegistry(userSpecific: Boolean, key: String, valueName: String, value: js.Any, valueType: String): Unit = js.native
}

