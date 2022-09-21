package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Add
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Remove
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Replace
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.add_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.remove_
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.replace_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Op extends StObject {
  
  /** @enum {string} */
  var op: add_ | Add | remove_ | Remove | replace_ | Replace
  
  var path: js.UndefOr[String] = js.undefined
  
  /** @description Can be any value - string, number, array or object. */
  var value: js.UndefOr[Any] = js.undefined
}
object Op {
  
  inline def apply(op: add_ | Add | remove_ | Remove | replace_ | Replace): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  
  extension [Self <: Op](x: Self) {
    
    inline def setOp(value: add_ | Add | remove_ | Remove | replace_ | Replace): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
