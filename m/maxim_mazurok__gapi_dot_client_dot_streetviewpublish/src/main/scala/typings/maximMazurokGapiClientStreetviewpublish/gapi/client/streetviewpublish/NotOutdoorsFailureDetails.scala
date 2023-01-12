package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotOutdoorsFailureDetails extends StObject {
  
  /** Relative time (from the start of the video stream) when an indoor frame was found. */
  var startTime: js.UndefOr[String] = js.undefined
}
object NotOutdoorsFailureDetails {
  
  inline def apply(): NotOutdoorsFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotOutdoorsFailureDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotOutdoorsFailureDetails] (val x: Self) extends AnyVal {
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
