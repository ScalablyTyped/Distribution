package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilterFurther extends StObject {
  
  var filterFurther: js.UndefOr[String] = js.native
  
  var noMatchesFound: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Hint] = js.native
}
object FilterFurther {
  
  @scala.inline
  def apply(): FilterFurther = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterFurther]
  }
  
  @scala.inline
  implicit class FilterFurtherMutableBuilder[Self <: FilterFurther] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterFurther(value: String): Self = StObject.set(x, "filterFurther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterFurtherUndefined: Self = StObject.set(x, "filterFurther", js.undefined)
    
    @scala.inline
    def setNoMatchesFound(value: String): Self = StObject.set(x, "noMatchesFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoMatchesFoundUndefined: Self = StObject.set(x, "noMatchesFound", js.undefined)
    
    @scala.inline
    def setRequired(value: Hint): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
