package typings.osrm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Snaps a coordinate to the street network and returns the nearest n matches.
  *
  * Note: coordinates in the general options only supports a single {longitude},{latitude} entry.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#nearest
  */
trait NearestOptions
  extends StObject
     with Options {
  
  /**
    * Number of nearest segments that should be returned. Must be an integer greater than or equal to 1. (optional, default 1)
    */
  var number: js.UndefOr[Double] = js.undefined
}
object NearestOptions {
  
  inline def apply(): NearestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NearestOptions]
  }
  
  extension [Self <: NearestOptions](x: Self) {
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
  }
}
