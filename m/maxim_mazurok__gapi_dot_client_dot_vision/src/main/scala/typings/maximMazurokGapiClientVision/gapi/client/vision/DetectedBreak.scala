package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetectedBreak extends StObject {
  
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[Boolean] = js.native
  
  /** Detected break type. */
  var `type`: js.UndefOr[String] = js.native
}
object DetectedBreak {
  
  @scala.inline
  def apply(): DetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedBreak]
  }
  
  @scala.inline
  implicit class DetectedBreakMutableBuilder[Self <: DetectedBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
