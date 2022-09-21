package typings.mfiles.global.MFiles

import typings.mfiles.ICLSIDs
import typings.mfiles.global.MFiles.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ApplicationPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ApplicationPath").asInstanceOf[String]

inline def CLSID: ICLSIDs = ^.asInstanceOf[js.Dynamic].selectDynamic("CLSID").asInstanceOf[ICLSIDs]

inline def CreateInstance(name: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateInstance")(name.asInstanceOf[js.Any]).asInstanceOf[Any]

inline def CreateObjectCLR(assemblyFile: String, className: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateObjectCLR")(assemblyFile.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def CurrentApplicationPlatform: Any = ^.asInstanceOf[js.Dynamic].selectDynamic("CurrentApplicationPlatform").asInstanceOf[Any]

inline def DeleteRegistryKey(userSpecific: Boolean, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeleteRegistryKey")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def DeleteRegistryValue(userSpecific: Boolean, key: String, valueName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("DeleteRegistryValue")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any], valueName.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def EnableExceptionPropagation(exception: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EnableExceptionPropagation")(exception.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def ExecuteURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ExecuteURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def GetErrorDescription(exception: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetErrorDescription")(exception.asInstanceOf[js.Any]).asInstanceOf[String]

inline def GetLongErrorDescription(exception: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetLongErrorDescription")(exception.asInstanceOf[js.Any]).asInstanceOf[String]

inline def GetStringResource(resource: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetStringResource")(resource.asInstanceOf[js.Any]).asInstanceOf[String]

inline def KillTimer(timerId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("KillTimer")(timerId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def LaunchHelp(helpID: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("LaunchHelp")(helpID.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def PersistStringData(name: String, privateData: Boolean, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PersistStringData")(name.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ReadFromRegistry(userSpecific: Boolean, key: String, valueName: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("ReadFromRegistry")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any], valueName.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def ReadTextFile(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ReadTextFile")(filename.asInstanceOf[js.Any]).asInstanceOf[String]

inline def ReportException(exception: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ReportException")(exception.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def RetrieveStringData(name: String, privateData: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("RetrieveStringData")(name.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[String]

inline def SetTimer(timeoutInMs: Double, callbackMethod: js.Function0[Unit]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTimer")(timeoutInMs.asInstanceOf[js.Any], callbackMethod.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def ThrowError(description: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ThrowError")(description.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def WriteToRegistry(userSpecific: Boolean, key: String, valueName: String, value: Any, valueType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteToRegistry")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any], valueName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[Unit]
