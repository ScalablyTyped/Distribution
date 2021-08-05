package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ApplicationPath: java.lang.String = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].selectDynamic("ApplicationPath").asInstanceOf[java.lang.String]

inline def CLSID: typings.mfiles.ICLSIDs = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].selectDynamic("CLSID").asInstanceOf[typings.mfiles.ICLSIDs]

inline def CreateInstance(name: java.lang.String): js.Any = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("CreateInstance")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]

inline def CreateObjectCLR(assemblyFile: java.lang.String, className: java.lang.String): js.Any = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("CreateObjectCLR")(assemblyFile.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def CurrentApplicationPlatform: js.Any = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].selectDynamic("CurrentApplicationPlatform").asInstanceOf[js.Any]

inline def DeleteRegistryKey(userSpecific: scala.Boolean, key: java.lang.String): scala.Unit = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("DeleteRegistryKey")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def DeleteRegistryValue(userSpecific: scala.Boolean, key: java.lang.String, valueName: java.lang.String): scala.Unit = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("DeleteRegistryValue")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any], valueName.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def EnableExceptionPropagation(exception: js.Any): scala.Unit = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("EnableExceptionPropagation")(exception.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def ExecuteURL(url: java.lang.String): scala.Unit = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("ExecuteURL")(url.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def GetErrorDescription(exception: js.Any): java.lang.String = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("GetErrorDescription")(exception.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def GetLongErrorDescription(exception: js.Any): java.lang.String = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("GetLongErrorDescription")(exception.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def GetStringResource(resource: scala.Double): java.lang.String = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("GetStringResource")(resource.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def KillTimer(timerId: scala.Double): scala.Unit = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("KillTimer")(timerId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def LaunchHelp(helpID: java.lang.String): scala.Unit = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("LaunchHelp")(helpID.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def PersistStringData(name: java.lang.String, privateData: scala.Boolean, data: java.lang.String): scala.Unit = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("PersistStringData")(name.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def ReadFromRegistry(userSpecific: scala.Boolean, key: java.lang.String, valueName: java.lang.String): js.Any = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("ReadFromRegistry")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any], valueName.asInstanceOf[js.Any])).asInstanceOf[js.Any]

inline def ReadTextFile(filename: java.lang.String): java.lang.String = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("ReadTextFile")(filename.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]

inline def ReportException(exception: js.Any): scala.Unit = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("ReportException")(exception.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def RetrieveStringData(name: java.lang.String, privateData: scala.Boolean): java.lang.String = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("RetrieveStringData")(name.asInstanceOf[js.Any], privateData.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]

inline def SetTimer(timeoutInMs: scala.Double, callbackMethod: js.Function0[scala.Unit]): scala.Double = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("SetTimer")(timeoutInMs.asInstanceOf[js.Any], callbackMethod.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def ThrowError(description: java.lang.String): scala.Unit = typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("ThrowError")(description.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def WriteToRegistry(
  userSpecific: scala.Boolean,
  key: java.lang.String,
  valueName: java.lang.String,
  value: js.Any,
  valueType: java.lang.String
): scala.Unit = (typings.mfiles.global.MFiles.^.asInstanceOf[js.Dynamic].applyDynamic("WriteToRegistry")(userSpecific.asInstanceOf[js.Any], key.asInstanceOf[js.Any], valueName.asInstanceOf[js.Any], value.asInstanceOf[js.Any], valueType.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
