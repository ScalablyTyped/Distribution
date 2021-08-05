package typings.osrm.mod

import typings.osrm.osrmStrings.distance
import typings.osrm.osrmStrings.duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Computes duration tables for the given locations. Allows for both symmetric and asymmetric tables.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#table
  */
trait TableOptions
  extends StObject
     with Options {
  
  /**
    * specify which table results to return.
    */
  var annotations: js.UndefOr[js.Array[duration | distance]] = js.undefined
  
  /**
    * to use location with given index as destination. Default is to use all.
    */
  var destinations: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * to use location with given index as source. Default is to use all.
    */
  var sources: js.UndefOr[js.Array[Double]] = js.undefined
}
object TableOptions {
  
  inline def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  extension [Self <: TableOptions](x: Self) {
    
    inline def setAnnotations(value: js.Array[duration | distance]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: (duration | distance)*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    inline def setDestinations(value: js.Array[Double]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Double*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    inline def setSources(value: js.Array[Double]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: Double*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
