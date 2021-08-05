package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonAtRule
  extends StObject
     with JsonContainer {
  
  /**
    * The identifier that immediately follows the @.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * These are the values that follow the at-rule's name, but precede any {}
    * block. The spec refers to this area as the at-rule's "prelude".
    */
  var params: js.UndefOr[String] = js.undefined
}
object JsonAtRule {
  
  inline def apply(): JsonAtRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonAtRule]
  }
  
  extension [Self <: JsonAtRule](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
