package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncludesparentsPage extends StObject {
  
  /** @description Include rulesets configured at higher levels that apply to this repository */
  var includes_parents: js.UndefOr[Boolean] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
}
object IncludesparentsPage {
  
  inline def apply(): IncludesparentsPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludesparentsPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IncludesparentsPage] (val x: Self) extends AnyVal {
    
    inline def setIncludes_parents(value: Boolean): Self = StObject.set(x, "includes_parents", value.asInstanceOf[js.Any])
    
    inline def setIncludes_parentsUndefined: Self = StObject.set(x, "includes_parents", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
  }
}
