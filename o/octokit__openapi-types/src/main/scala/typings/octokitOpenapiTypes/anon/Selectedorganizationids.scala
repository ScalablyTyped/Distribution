package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectedorganizationids extends StObject {
  
  /** @description List of organization IDs that can access the runner group. */
  var selected_organization_ids: js.Array[Double]
}
object Selectedorganizationids {
  
  inline def apply(selected_organization_ids: js.Array[Double]): Selectedorganizationids = {
    val __obj = js.Dynamic.literal(selected_organization_ids = selected_organization_ids.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectedorganizationids]
  }
  
  extension [Self <: Selectedorganizationids](x: Self) {
    
    inline def setSelected_organization_ids(value: js.Array[Double]): Self = StObject.set(x, "selected_organization_ids", value.asInstanceOf[js.Any])
    
    inline def setSelected_organization_idsVarargs(value: Double*): Self = StObject.set(x, "selected_organization_ids", js.Array(value*))
  }
}
