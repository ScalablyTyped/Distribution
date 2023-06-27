package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelsArray extends StObject {
  
  /** @description The names of the custom labels to add to the runner. */
  var labels: js.Array[String]
}
object LabelsArray {
  
  inline def apply(labels: js.Array[String]): LabelsArray = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelsArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelsArray] (val x: Self) extends AnyVal {
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
  }
}
