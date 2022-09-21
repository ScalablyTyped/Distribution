package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CombinatorRaws extends StObject {
  
  var spaces: js.UndefOr[After] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object CombinatorRaws {
  
  inline def apply(): CombinatorRaws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinatorRaws]
  }
  
  extension [Self <: CombinatorRaws](x: Self) {
    
    inline def setSpaces(value: After): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
