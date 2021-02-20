package typings.osrm.mod

import typings.osrm.osrmStrings.distance
import typings.osrm.osrmStrings.duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Computes duration tables for the given locations. Allows for both symmetric and asymmetric tables.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#table
  */
@js.native
trait TableOptions extends Options {
  
  /**
    * specify which table results to return.
    */
  var annotations: js.UndefOr[js.Array[duration | distance]] = js.native
  
  /**
    * to use location with given index as destination. Default is to use all.
    */
  var destinations: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * to use location with given index as source. Default is to use all.
    */
  var sources: js.UndefOr[js.Array[Double]] = js.native
}
object TableOptions {
  
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  
  @scala.inline
  implicit class TableOptionsMutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Array[duration | distance]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: (duration | distance)*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setDestinations(value: js.Array[Double]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: Double*): Self = StObject.set(x, "destinations", js.Array(value :_*))
    
    @scala.inline
    def setSources(value: js.Array[Double]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Double*): Self = StObject.set(x, "sources", js.Array(value :_*))
  }
}
