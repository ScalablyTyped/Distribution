package typings.maximMazurokGapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathFilter extends StObject {
  
  /** Filter on an event to be applied to some part of the path. */
  var eventFilters: js.UndefOr[js.Array[EventFilter]] = js.native
  
  /** Indicates the position of the path the filter should match to (first, last, or any event in path). */
  var pathMatchPosition: js.UndefOr[String] = js.native
}
object PathFilter {
  
  @scala.inline
  def apply(): PathFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathFilter]
  }
  
  @scala.inline
  implicit class PathFilterMutableBuilder[Self <: PathFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventFilters(value: js.Array[EventFilter]): Self = StObject.set(x, "eventFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventFiltersUndefined: Self = StObject.set(x, "eventFilters", js.undefined)
    
    @scala.inline
    def setEventFiltersVarargs(value: EventFilter*): Self = StObject.set(x, "eventFilters", js.Array(value :_*))
    
    @scala.inline
    def setPathMatchPosition(value: String): Self = StObject.set(x, "pathMatchPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathMatchPositionUndefined: Self = StObject.set(x, "pathMatchPosition", js.undefined)
  }
}
