package typings.popoto.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<popoto.popoto/query.QueryStructure, 'whereElements' | 'parameters'> */
trait PickQueryStructurewhereEl extends StObject {
  
  var parameters: StringDictionary[Any]
  
  var whereElements: js.Array[String]
}
object PickQueryStructurewhereEl {
  
  inline def apply(parameters: StringDictionary[Any], whereElements: js.Array[String]): PickQueryStructurewhereEl = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], whereElements = whereElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickQueryStructurewhereEl]
  }
  
  extension [Self <: PickQueryStructurewhereEl](x: Self) {
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setWhereElements(value: js.Array[String]): Self = StObject.set(x, "whereElements", value.asInstanceOf[js.Any])
    
    inline def setWhereElementsVarargs(value: String*): Self = StObject.set(x, "whereElements", js.Array(value*))
  }
}
