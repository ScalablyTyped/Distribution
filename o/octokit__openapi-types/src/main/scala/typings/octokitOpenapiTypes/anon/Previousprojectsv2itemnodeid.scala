package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Previousprojectsv2itemnodeid extends StObject {
  
  var previous_projects_v2_item_node_id: js.UndefOr[FromTo] = js.undefined
}
object Previousprojectsv2itemnodeid {
  
  inline def apply(): Previousprojectsv2itemnodeid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Previousprojectsv2itemnodeid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Previousprojectsv2itemnodeid] (val x: Self) extends AnyVal {
    
    inline def setPrevious_projects_v2_item_node_id(value: FromTo): Self = StObject.set(x, "previous_projects_v2_item_node_id", value.asInstanceOf[js.Any])
    
    inline def setPrevious_projects_v2_item_node_idUndefined: Self = StObject.set(x, "previous_projects_v2_item_node_id", js.undefined)
  }
}
