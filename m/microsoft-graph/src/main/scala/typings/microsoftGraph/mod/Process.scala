package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Process extends StObject {
  
  // User account identifier (user account context the process ran under) for example, AccountName, SID, and so on.
  var accountName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The full process invocation commandline including all parameters.
  var commandLine: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * Time at which the process was started. The Timestamp type represents date and time information using ISO 8601 format
    * and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Complex type containing file hashes (cryptographic and location-sensitive).
  var fileHash: js.UndefOr[NullableOption[FileHash]] = js.undefined
  
  // The integrity level of the process. Possible values are: unknown, untrusted, low, medium, high, system.
  var integrityLevel: js.UndefOr[NullableOption[ProcessIntegrityLevel]] = js.undefined
  
  // True if the process is elevated.
  var isElevated: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The name of the process' Image file.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * DateTime at which the parent process was started. The Timestamp type represents date and time information using ISO
    * 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
    */
  var parentProcessCreatedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Process ID (PID) of the parent process.
  var parentProcessId: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The name of the image file of the parent process.
  var parentProcessName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Full path, including filename.
  var path: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Process ID (PID) of the process.
  var processId: js.UndefOr[NullableOption[Double]] = js.undefined
}
object Process {
  
  inline def apply(): Process = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Process]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Process] (val x: Self) extends AnyVal {
    
    inline def setAccountName(value: NullableOption[String]): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameNull: Self = StObject.set(x, "accountName", null)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setCommandLine(value: NullableOption[String]): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
    
    inline def setCommandLineNull: Self = StObject.set(x, "commandLine", null)
    
    inline def setCommandLineUndefined: Self = StObject.set(x, "commandLine", js.undefined)
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setFileHash(value: NullableOption[FileHash]): Self = StObject.set(x, "fileHash", value.asInstanceOf[js.Any])
    
    inline def setFileHashNull: Self = StObject.set(x, "fileHash", null)
    
    inline def setFileHashUndefined: Self = StObject.set(x, "fileHash", js.undefined)
    
    inline def setIntegrityLevel(value: NullableOption[ProcessIntegrityLevel]): Self = StObject.set(x, "integrityLevel", value.asInstanceOf[js.Any])
    
    inline def setIntegrityLevelNull: Self = StObject.set(x, "integrityLevel", null)
    
    inline def setIntegrityLevelUndefined: Self = StObject.set(x, "integrityLevel", js.undefined)
    
    inline def setIsElevated(value: NullableOption[Boolean]): Self = StObject.set(x, "isElevated", value.asInstanceOf[js.Any])
    
    inline def setIsElevatedNull: Self = StObject.set(x, "isElevated", null)
    
    inline def setIsElevatedUndefined: Self = StObject.set(x, "isElevated", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentProcessCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "parentProcessCreatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setParentProcessCreatedDateTimeNull: Self = StObject.set(x, "parentProcessCreatedDateTime", null)
    
    inline def setParentProcessCreatedDateTimeUndefined: Self = StObject.set(x, "parentProcessCreatedDateTime", js.undefined)
    
    inline def setParentProcessId(value: NullableOption[Double]): Self = StObject.set(x, "parentProcessId", value.asInstanceOf[js.Any])
    
    inline def setParentProcessIdNull: Self = StObject.set(x, "parentProcessId", null)
    
    inline def setParentProcessIdUndefined: Self = StObject.set(x, "parentProcessId", js.undefined)
    
    inline def setParentProcessName(value: NullableOption[String]): Self = StObject.set(x, "parentProcessName", value.asInstanceOf[js.Any])
    
    inline def setParentProcessNameNull: Self = StObject.set(x, "parentProcessName", null)
    
    inline def setParentProcessNameUndefined: Self = StObject.set(x, "parentProcessName", js.undefined)
    
    inline def setPath(value: NullableOption[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProcessId(value: NullableOption[Double]): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdNull: Self = StObject.set(x, "processId", null)
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
  }
}
