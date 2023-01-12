package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p2beta1TextAnnotationDetectedBreak extends StObject {
  
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[Boolean] = js.undefined
  
  /** Detected break type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p2beta1TextAnnotationDetectedBreak {
  
  inline def apply(): GoogleCloudVisionV1p2beta1TextAnnotationDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1TextAnnotationDetectedBreak]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVisionV1p2beta1TextAnnotationDetectedBreak] (val x: Self) extends AnyVal {
    
    inline def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    inline def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
