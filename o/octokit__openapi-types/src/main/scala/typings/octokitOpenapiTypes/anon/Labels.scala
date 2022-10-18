package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Labels extends StObject {
  
  var labels: js.Array[Id]
  
  var total_count: Double
}
object Labels {
  
  inline def apply(labels: js.Array[Id], total_count: Double): Labels = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Labels]
  }
  
  extension [Self <: Labels](x: Self) {
    
    inline def setLabels(value: js.Array[Id]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: Id*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
