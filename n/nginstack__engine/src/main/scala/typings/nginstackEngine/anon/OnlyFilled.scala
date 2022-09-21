package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnlyFilled extends StObject {
  
  var onlyFilled: js.UndefOr[Boolean] = js.undefined
  
  var toLowerCase: js.UndefOr[Boolean] = js.undefined
}
object OnlyFilled {
  
  inline def apply(): OnlyFilled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlyFilled]
  }
  
  extension [Self <: OnlyFilled](x: Self) {
    
    inline def setOnlyFilled(value: Boolean): Self = StObject.set(x, "onlyFilled", value.asInstanceOf[js.Any])
    
    inline def setOnlyFilledUndefined: Self = StObject.set(x, "onlyFilled", js.undefined)
    
    inline def setToLowerCase(value: Boolean): Self = StObject.set(x, "toLowerCase", value.asInstanceOf[js.Any])
    
    inline def setToLowerCaseUndefined: Self = StObject.set(x, "toLowerCase", js.undefined)
  }
}
