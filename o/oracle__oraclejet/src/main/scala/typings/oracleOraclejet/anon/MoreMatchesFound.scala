package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoreMatchesFound extends StObject {
  
  var filterFurther: js.UndefOr[String] = js.undefined
  
  var moreMatchesFound: js.UndefOr[String] = js.undefined
  
  var noMatchesFound: js.UndefOr[String] = js.undefined
  
  var oneMatchesFound: js.UndefOr[String] = js.undefined
  
  var required: js.UndefOr[Hint] = js.undefined
  
  var searchField: js.UndefOr[String] = js.undefined
}
object MoreMatchesFound {
  
  inline def apply(): MoreMatchesFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoreMatchesFound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoreMatchesFound] (val x: Self) extends AnyVal {
    
    inline def setFilterFurther(value: String): Self = StObject.set(x, "filterFurther", value.asInstanceOf[js.Any])
    
    inline def setFilterFurtherUndefined: Self = StObject.set(x, "filterFurther", js.undefined)
    
    inline def setMoreMatchesFound(value: String): Self = StObject.set(x, "moreMatchesFound", value.asInstanceOf[js.Any])
    
    inline def setMoreMatchesFoundUndefined: Self = StObject.set(x, "moreMatchesFound", js.undefined)
    
    inline def setNoMatchesFound(value: String): Self = StObject.set(x, "noMatchesFound", value.asInstanceOf[js.Any])
    
    inline def setNoMatchesFoundUndefined: Self = StObject.set(x, "noMatchesFound", js.undefined)
    
    inline def setOneMatchesFound(value: String): Self = StObject.set(x, "oneMatchesFound", value.asInstanceOf[js.Any])
    
    inline def setOneMatchesFoundUndefined: Self = StObject.set(x, "oneMatchesFound", js.undefined)
    
    inline def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSearchField(value: String): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
    
    inline def setSearchFieldUndefined: Self = StObject.set(x, "searchField", js.undefined)
  }
}
