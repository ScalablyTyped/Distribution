package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationLengthEquals extends StObject {
  
  var aggregationLengthEquals: LengthName
}
object AggregationLengthEquals {
  
  inline def apply(aggregationLengthEquals: LengthName): AggregationLengthEquals = {
    val __obj = js.Dynamic.literal(aggregationLengthEquals = aggregationLengthEquals.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationLengthEquals]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationLengthEquals] (val x: Self) extends AnyVal {
    
    inline def setAggregationLengthEquals(value: LengthName): Self = StObject.set(x, "aggregationLengthEquals", value.asInstanceOf[js.Any])
  }
}
