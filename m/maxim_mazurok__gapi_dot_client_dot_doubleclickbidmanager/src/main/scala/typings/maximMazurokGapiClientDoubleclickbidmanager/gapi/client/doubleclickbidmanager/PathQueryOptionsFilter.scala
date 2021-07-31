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
  
  @scala.inline
  def apply(): PathQueryOptionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathQueryOptionsFilter]
  }
  
  @scala.inline
  implicit class PathQueryOptionsFilterMutableBuilder[Self <: PathQueryOptionsFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
