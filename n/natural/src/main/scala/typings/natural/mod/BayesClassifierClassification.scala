package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BayesClassifierClassification extends StObject {
  
  var label: String
  
  var value: Double
}
object BayesClassifierClassification {
  
  inline def apply(label: String, value: Double): BayesClassifierClassification = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BayesClassifierClassification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BayesClassifierClassification] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
