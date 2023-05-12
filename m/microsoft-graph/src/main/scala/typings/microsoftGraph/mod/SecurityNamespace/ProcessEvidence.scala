package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessEvidence
  extends StObject
     with AlertEvidence {
  
  // The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
  var detectionStatus: js.UndefOr[NullableOption[DetectionStatus]] = js.undefined
  
  // Image file details.
  var imageFile: js.UndefOr[NullableOption[FileDetails]] = js.undefined
  
  // A unique identifier assigned to a device by Microsoft Defender for Endpoint.
  var mdeDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time when the parent of the process was created.
  var parentProcessCreationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Process ID (PID) of the parent process that spawned the process.
  var parentProcessId: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // Parent process image file details.
  var parentProcessImageFile: js.UndefOr[NullableOption[FileDetails]] = js.undefined
  
  // Command line used to create the new process.
  var processCommandLine: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Date and time the process was created.
  var processCreationDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Process ID (PID) of the newly created process.
  var processId: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // User details of the user that ran the process.
  var userAccount: js.UndefOr[NullableOption[UserAccount]] = js.undefined
}
object ProcessEvidence {
  
  inline def apply(): ProcessEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessEvidence] (val x: Self) extends AnyVal {
    
    inline def setDetectionStatus(value: NullableOption[DetectionStatus]): Self = StObject.set(x, "detectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDetectionStatusNull: Self = StObject.set(x, "detectionStatus", null)
    
    inline def setDetectionStatusUndefined: Self = StObject.set(x, "detectionStatus", js.undefined)
    
    inline def setImageFile(value: NullableOption[FileDetails]): Self = StObject.set(x, "imageFile", value.asInstanceOf[js.Any])
    
    inline def setImageFileNull: Self = StObject.set(x, "imageFile", null)
    
    inline def setImageFileUndefined: Self = StObject.set(x, "imageFile", js.undefined)
    
    inline def setMdeDeviceId(value: NullableOption[String]): Self = StObject.set(x, "mdeDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMdeDeviceIdNull: Self = StObject.set(x, "mdeDeviceId", null)
    
    inline def setMdeDeviceIdUndefined: Self = StObject.set(x, "mdeDeviceId", js.undefined)
    
    inline def setParentProcessCreationDateTime(value: NullableOption[String]): Self = StObject.set(x, "parentProcessCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setParentProcessCreationDateTimeNull: Self = StObject.set(x, "parentProcessCreationDateTime", null)
    
    inline def setParentProcessCreationDateTimeUndefined: Self = StObject.set(x, "parentProcessCreationDateTime", js.undefined)
    
    inline def setParentProcessId(value: NullableOption[Double]): Self = StObject.set(x, "parentProcessId", value.asInstanceOf[js.Any])
    
    inline def setParentProcessIdNull: Self = StObject.set(x, "parentProcessId", null)
    
    inline def setParentProcessIdUndefined: Self = StObject.set(x, "parentProcessId", js.undefined)
    
    inline def setParentProcessImageFile(value: NullableOption[FileDetails]): Self = StObject.set(x, "parentProcessImageFile", value.asInstanceOf[js.Any])
    
    inline def setParentProcessImageFileNull: Self = StObject.set(x, "parentProcessImageFile", null)
    
    inline def setParentProcessImageFileUndefined: Self = StObject.set(x, "parentProcessImageFile", js.undefined)
    
    inline def setProcessCommandLine(value: NullableOption[String]): Self = StObject.set(x, "processCommandLine", value.asInstanceOf[js.Any])
    
    inline def setProcessCommandLineNull: Self = StObject.set(x, "processCommandLine", null)
    
    inline def setProcessCommandLineUndefined: Self = StObject.set(x, "processCommandLine", js.undefined)
    
    inline def setProcessCreationDateTime(value: NullableOption[String]): Self = StObject.set(x, "processCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setProcessCreationDateTimeNull: Self = StObject.set(x, "processCreationDateTime", null)
    
    inline def setProcessCreationDateTimeUndefined: Self = StObject.set(x, "processCreationDateTime", js.undefined)
    
    inline def setProcessId(value: NullableOption[Double]): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdNull: Self = StObject.set(x, "processId", null)
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setUserAccount(value: NullableOption[UserAccount]): Self = StObject.set(x, "userAccount", value.asInstanceOf[js.Any])
    
    inline def setUserAccountNull: Self = StObject.set(x, "userAccount", null)
    
    inline def setUserAccountUndefined: Self = StObject.set(x, "userAccount", js.undefined)
  }
}
