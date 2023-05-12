package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileEvidence
  extends StObject
     with AlertEvidence {
  
  // The status of the detection.The possible values are: detected, blocked, prevented, unknownFutureValue.
  var detectionStatus: js.UndefOr[NullableOption[DetectionStatus]] = js.undefined
  
  // The file details.
  var fileDetails: js.UndefOr[NullableOption[FileDetails]] = js.undefined
  
  // A unique identifier assigned to a device by Microsoft Defender for Endpoint.
  var mdeDeviceId: js.UndefOr[NullableOption[String]] = js.undefined
}
object FileEvidence {
  
  inline def apply(): FileEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileEvidence] (val x: Self) extends AnyVal {
    
    inline def setDetectionStatus(value: NullableOption[DetectionStatus]): Self = StObject.set(x, "detectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDetectionStatusNull: Self = StObject.set(x, "detectionStatus", null)
    
    inline def setDetectionStatusUndefined: Self = StObject.set(x, "detectionStatus", js.undefined)
    
    inline def setFileDetails(value: NullableOption[FileDetails]): Self = StObject.set(x, "fileDetails", value.asInstanceOf[js.Any])
    
    inline def setFileDetailsNull: Self = StObject.set(x, "fileDetails", null)
    
    inline def setFileDetailsUndefined: Self = StObject.set(x, "fileDetails", js.undefined)
    
    inline def setMdeDeviceId(value: NullableOption[String]): Self = StObject.set(x, "mdeDeviceId", value.asInstanceOf[js.Any])
    
    inline def setMdeDeviceIdNull: Self = StObject.set(x, "mdeDeviceId", null)
    
    inline def setMdeDeviceIdUndefined: Self = StObject.set(x, "mdeDeviceId", js.undefined)
  }
}
