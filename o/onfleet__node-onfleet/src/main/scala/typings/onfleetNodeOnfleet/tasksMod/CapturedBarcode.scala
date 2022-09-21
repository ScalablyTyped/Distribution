package typings.onfleetNodeOnfleet.tasksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapturedBarcode extends StObject {
  
  /** The base64 string of the data contained in the captured barcode */
  var data: js.UndefOr[String] = js.undefined
  
  /** The ID of the captured barcode */
  var id: String
  
  /** The [ lon, lat ] coordinates where the barcode capture took place */
  var location: js.Tuple2[Double, Double]
  
  /** The symbology that was captured */
  var symbology: String
  
  /** The time at which the barcode capture happened */
  var time: Double
  
  /** Whether the barcode was captured as a result of a barcode request */
  var wasRequested: Boolean
}
object CapturedBarcode {
  
  inline def apply(
    id: String,
    location: js.Tuple2[Double, Double],
    symbology: String,
    time: Double,
    wasRequested: Boolean
  ): CapturedBarcode = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], symbology = symbology.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], wasRequested = wasRequested.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedBarcode]
  }
  
  extension [Self <: CapturedBarcode](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setSymbology(value: String): Self = StObject.set(x, "symbology", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setWasRequested(value: Boolean): Self = StObject.set(x, "wasRequested", value.asInstanceOf[js.Any])
  }
}
