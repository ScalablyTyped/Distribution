package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Views extends StObject {
  
  /** @example 14850 */
  var count: Double
  
  /** @example 3782 */
  var uniques: Double
  
  var views: js.Array[Uniques]
}
object Views {
  
  inline def apply(count: Double, uniques: Double, views: js.Array[Uniques]): Views = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Views]
  }
  
  extension [Self <: Views](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
    
    inline def setViews(value: js.Array[Uniques]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: Uniques*): Self = StObject.set(x, "views", js.Array(value*))
  }
}
