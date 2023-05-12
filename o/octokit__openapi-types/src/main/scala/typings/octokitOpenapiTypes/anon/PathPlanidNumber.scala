package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPlanidNumber extends StObject {
  
  var path: PlanidNumber
  
  var query: PagePerpageSort
}
object PathPlanidNumber {
  
  inline def apply(path: PlanidNumber, query: PagePerpageSort): PathPlanidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPlanidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPlanidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: PlanidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: PagePerpageSort): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
