package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Limits the search to segments with given bearing in degrees towards true north in clockwise direction. Null or array with [{value},{range}]
    */
  var bearings: js.UndefOr[js.Array[Bearing] | Null] = js.undefined
  
  /**
    * The coordinates this request will use. Array with [{lon},{lat}] values, in decimal degrees.
    */
  var coordinates: js.UndefOr[js.Array[Coordinate]] = js.undefined
  
  /**
    * Adds a Hint to the response which can be used in subsequent requests, see hints parameter.
    */
  var generate_hints: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hint to derive position in street network. Base64 string
    */
  var hints: js.UndefOr[js.Array[Hint]] = js.undefined
  
  /**
    * Limits the search to given radius in meters. null or double >= 0 or unlimited (default)
    */
  var radiuses: js.UndefOr[js.Array[Radius] | Null] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setBearings(value: js.Array[Bearing]): Self = StObject.set(x, "bearings", value.asInstanceOf[js.Any])
    
    inline def setBearingsNull: Self = StObject.set(x, "bearings", null)
    
    inline def setBearingsUndefined: Self = StObject.set(x, "bearings", js.undefined)
    
    inline def setBearingsVarargs(value: Bearing*): Self = StObject.set(x, "bearings", js.Array(value :_*))
    
    inline def setCoordinates(value: js.Array[Coordinate]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesUndefined: Self = StObject.set(x, "coordinates", js.undefined)
    
    inline def setCoordinatesVarargs(value: Coordinate*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
    
    inline def setGenerate_hints(value: Boolean): Self = StObject.set(x, "generate_hints", value.asInstanceOf[js.Any])
    
    inline def setGenerate_hintsUndefined: Self = StObject.set(x, "generate_hints", js.undefined)
    
    inline def setHints(value: js.Array[Hint]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHintsVarargs(value: Hint*): Self = StObject.set(x, "hints", js.Array(value :_*))
    
    inline def setRadiuses(value: js.Array[Radius]): Self = StObject.set(x, "radiuses", value.asInstanceOf[js.Any])
    
    inline def setRadiusesNull: Self = StObject.set(x, "radiuses", null)
    
    inline def setRadiusesUndefined: Self = StObject.set(x, "radiuses", js.undefined)
    
    inline def setRadiusesVarargs(value: Radius*): Self = StObject.set(x, "radiuses", js.Array(value :_*))
  }
}
