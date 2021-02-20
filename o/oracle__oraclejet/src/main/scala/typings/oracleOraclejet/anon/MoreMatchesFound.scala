package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoreMatchesFound extends StObject {
  
  var filterFurther: js.UndefOr[String] = js.native
  
  var moreMatchesFound: js.UndefOr[String] = js.native
  
  var noMatchesFound: js.UndefOr[String] = js.native
  
  var oneMatchesFound: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Hint] = js.native
  
  var searchField: js.UndefOr[String] = js.native
}
object MoreMatchesFound {
  
  @scala.inline
  def apply(): MoreMatchesFound = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoreMatchesFound]
  }
  
  @scala.inline
  implicit class MoreMatchesFoundMutableBuilder[Self <: MoreMatchesFound] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFurther(value: String): Self = StObject.set(x, "filterFurther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFurtherUndefined: Self = StObject.set(x, "filterFurther", js.undefined)
    
    @scala.inline
    def setMoreMatchesFound(value: String): Self = StObject.set(x, "moreMatchesFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoreMatchesFoundUndefined: Self = StObject.set(x, "moreMatchesFound", js.undefined)
    
    @scala.inline
    def setNoMatchesFound(value: String): Self = StObject.set(x, "noMatchesFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMatchesFoundUndefined: Self = StObject.set(x, "noMatchesFound", js.undefined)
    
    @scala.inline
    def setOneMatchesFound(value: String): Self = StObject.set(x, "oneMatchesFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneMatchesFoundUndefined: Self = StObject.set(x, "oneMatchesFound", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setSearchField(value: String): Self = StObject.set(x, "searchField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchFieldUndefined: Self = StObject.set(x, "searchField", js.undefined)
  }
}
