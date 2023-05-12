package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelsTotalcount extends StObject {
  
  var labels: js.Array[NameType]
  
  var total_count: Double
}
object LabelsTotalcount {
  
  inline def apply(labels: js.Array[NameType], total_count: Double): LabelsTotalcount = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: js.Array[NameType]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: NameType*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
