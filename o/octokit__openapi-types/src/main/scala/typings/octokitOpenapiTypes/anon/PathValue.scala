package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.add_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remove_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.replace_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathValue extends StObject {
  
  /** @enum {string} */
  var op: add_ | remove_ | replace_
  
  var path: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[String | StringDictionary[Any] | js.Array[Any]] = js.undefined
}
object PathValue {
  
  inline def apply(op: add_ | remove_ | replace_): PathValue = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathValue]
  }
  
  extension [Self <: PathValue](x: Self) {
    
    inline def setOp(value: add_ | remove_ | replace_): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValue(value: String | StringDictionary[Any] | js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
