package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterFurther extends StObject {
  
  var filterFurther: js.UndefOr[String] = js.undefined
  
  var noMatchesFound: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Hint] = js.undefined
}
object FilterFurther {
  
  inline def apply(): FilterFurther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterFurther]
  }
  
  extension [Self <: FilterFurther](x: Self) {
    
    inline def setFilterFurther(value: String): Self = StObject.set(x, "filterFurther", value.asInstanceOf[js.Any])
    
    inline def setFilterFurtherUndefined: Self = StObject.set(x, "filterFurther", js.undefined)
    
    inline def setNoMatchesFound(value: String): Self = StObject.set(x, "noMatchesFound", value.asInstanceOf[js.Any])
    
    inline def setNoMatchesFoundUndefined: Self = StObject.set(x, "noMatchesFound", js.undefined)
    
    inline def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
