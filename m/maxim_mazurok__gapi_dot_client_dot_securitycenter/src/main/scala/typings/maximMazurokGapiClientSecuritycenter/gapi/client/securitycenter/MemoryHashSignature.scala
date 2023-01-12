package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemoryHashSignature extends StObject {
  
  /** The binary family. */
  var binaryFamily: js.UndefOr[String] = js.undefined
  
  /** The list of memory hash detections contributing to the binary family match. */
  var detections: js.UndefOr[js.Array[Detection]] = js.undefined
}
object MemoryHashSignature {
  
  inline def apply(): MemoryHashSignature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemoryHashSignature]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemoryHashSignature] (val x: Self) extends AnyVal {
    
    inline def setBinaryFamily(value: String): Self = StObject.set(x, "binaryFamily", value.asInstanceOf[js.Any])
    
    inline def setBinaryFamilyUndefined: Self = StObject.set(x, "binaryFamily", js.undefined)
    
    inline def setDetections(value: js.Array[Detection]): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
    
    inline def setDetectionsUndefined: Self = StObject.set(x, "detections", js.undefined)
    
    inline def setDetectionsVarargs(value: Detection*): Self = StObject.set(x, "detections", js.Array(value*))
  }
}
