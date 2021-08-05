package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetViewsResponseData extends StObject {
  
  var count: Double
  
  var uniques: Double
  
  var views: js.Array[Count]
}
object ReposGetViewsResponseData {
  
  inline def apply(count: Double, uniques: Double, views: js.Array[Count]): ReposGetViewsResponseData = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any], views = views.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetViewsResponseData]
  }
  
  extension [Self <: ReposGetViewsResponseData](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
    
    inline def setViews(value: js.Array[Count]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsVarargs(value: Count*): Self = StObject.set(x, "views", js.Array(value :_*))
  }
}
