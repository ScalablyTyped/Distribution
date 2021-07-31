package typings.natural.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogisticRegressionClassifierClassification extends StObject {
  
  var label: String
  
  var value: Double
}
object LogisticRegressionClassifierClassification {
  
  @scala.inline
  def apply(label: String, value: Double): LogisticRegressionClassifierClassification = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogisticRegressionClassifierClassification]
  }
  
  @scala.inline
  implicit class LogisticRegressionClassifierClassificationMutableBuilder[Self <: LogisticRegressionClassifierClassification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
