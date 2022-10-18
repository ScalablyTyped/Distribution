package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectors extends StObject {
  
  /**
    * The IDs of the components or the subtree.
    */
  var selectors: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * The type of the execution scope, one of 'global', 'subtree' or 'components'.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object Selectors {
  
  inline def apply(): Selectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selectors]
  }
  
  extension [Self <: Selectors](x: Self) {
    
    inline def setSelectors(value: String | js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
