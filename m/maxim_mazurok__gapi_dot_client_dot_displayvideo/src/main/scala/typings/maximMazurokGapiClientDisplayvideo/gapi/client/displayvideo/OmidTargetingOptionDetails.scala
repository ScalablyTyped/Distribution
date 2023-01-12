package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmidTargetingOptionDetails extends StObject {
  
  /** Output only. The type of Open Measurement enabled inventory. */
  var omid: js.UndefOr[String] = js.undefined
}
object OmidTargetingOptionDetails {
  
  inline def apply(): OmidTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmidTargetingOptionDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmidTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    inline def setOmid(value: String): Self = StObject.set(x, "omid", value.asInstanceOf[js.Any])
    
    inline def setOmidUndefined: Self = StObject.set(x, "omid", js.undefined)
  }
}
