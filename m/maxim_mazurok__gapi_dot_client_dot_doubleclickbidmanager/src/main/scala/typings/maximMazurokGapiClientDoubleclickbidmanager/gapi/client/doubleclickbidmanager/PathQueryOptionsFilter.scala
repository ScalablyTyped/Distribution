package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathQueryOptionsFilter extends StObject {
  
  /** Dimension the filter is applied to. */
  var filter: js.UndefOr[String] = js.undefined
  
  /** Indicates how the filter should be matched to the value. */
  var `match`: js.UndefOr[String] = js.undefined
  
  /** Value to filter on. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object PathQueryOptionsFilter {
  
  inline def apply(): PathQueryOptionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathQueryOptionsFilter]
  }
  
  extension [Self <: PathQueryOptionsFilter](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
