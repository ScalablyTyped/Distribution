package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeDistinguishedNamesJson extends StObject {
  
  var typesAndValues: js.Array[AttributeTypeAndValueJson]
}
object RelativeDistinguishedNamesJson {
  
  inline def apply(typesAndValues: js.Array[AttributeTypeAndValueJson]): RelativeDistinguishedNamesJson = {
    val __obj = js.Dynamic.literal(typesAndValues = typesAndValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeDistinguishedNamesJson]
  }
  
  extension [Self <: RelativeDistinguishedNamesJson](x: Self) {
    
    inline def setTypesAndValues(value: js.Array[AttributeTypeAndValueJson]): Self = StObject.set(x, "typesAndValues", value.asInstanceOf[js.Any])
    
    inline def setTypesAndValuesVarargs(value: AttributeTypeAndValueJson*): Self = StObject.set(x, "typesAndValues", js.Array(value*))
  }
}
