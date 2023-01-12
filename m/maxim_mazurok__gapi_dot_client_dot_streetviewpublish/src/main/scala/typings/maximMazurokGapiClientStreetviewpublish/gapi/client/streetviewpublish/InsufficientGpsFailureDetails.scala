package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsufficientGpsFailureDetails extends StObject {
  
  /** The number of GPS points that were found in the video. */
  var gpsPointsFound: js.UndefOr[Double] = js.undefined
}
object InsufficientGpsFailureDetails {
  
  inline def apply(): InsufficientGpsFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsufficientGpsFailureDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsufficientGpsFailureDetails] (val x: Self) extends AnyVal {
    
    inline def setGpsPointsFound(value: Double): Self = StObject.set(x, "gpsPointsFound", value.asInstanceOf[js.Any])
    
    inline def setGpsPointsFoundUndefined: Self = StObject.set(x, "gpsPointsFound", js.undefined)
  }
}
