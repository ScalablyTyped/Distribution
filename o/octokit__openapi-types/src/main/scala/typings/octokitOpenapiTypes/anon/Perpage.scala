package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Perpage extends StObject {
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Only return runner groups that are allowed to be used by this organization. */
  var visible_to_organization: js.UndefOr[String] = js.undefined
}
object Perpage {
  
  inline def apply(): Perpage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Perpage]
  }
  
  extension [Self <: Perpage](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setVisible_to_organization(value: String): Self = StObject.set(x, "visible_to_organization", value.asInstanceOf[js.Any])
    
    inline def setVisible_to_organizationUndefined: Self = StObject.set(x, "visible_to_organization", js.undefined)
  }
}
