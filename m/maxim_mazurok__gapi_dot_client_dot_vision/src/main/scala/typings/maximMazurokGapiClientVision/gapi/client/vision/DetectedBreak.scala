package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedBreak extends StObject {
  
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[Boolean] = js.undefined
  
  /** Detected break type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object DetectedBreak {
  
  inline def apply(): DetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedBreak]
  }
  
  extension [Self <: DetectedBreak](x: Self) {
    
    inline def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    inline def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
