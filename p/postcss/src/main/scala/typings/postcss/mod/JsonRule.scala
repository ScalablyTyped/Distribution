package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonRule
  extends StObject
     with JsonContainer {
  
  /**
    * The rule's full selector. If there are multiple comma-separated selectors,
    * the entire group will be included.
    */
  var selector: js.UndefOr[String] = js.undefined
  
  /**
    * An array containing the rule's individual selectors.
    * Groups of selectors are split at commas.
    */
  var selectors: js.UndefOr[js.Array[String]] = js.undefined
}
object JsonRule {
  
  inline def apply(): JsonRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonRule]
  }
  
  extension [Self <: JsonRule](x: Self) {
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value :_*))
  }
}
