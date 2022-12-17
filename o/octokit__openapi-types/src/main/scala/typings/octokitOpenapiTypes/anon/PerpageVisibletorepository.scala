package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerpageVisibletorepository extends StObject {
  
  /** Page number of the results to fetch. */
  var page: js.UndefOr[Double] = js.undefined
  
  /** The number of results per page (max 100). */
  var per_page: js.UndefOr[Double] = js.undefined
  
  /** Only return runner groups that are allowed to be used by this repository. */
  var visible_to_repository: js.UndefOr[String] = js.undefined
}
object PerpageVisibletorepository {
  
  inline def apply(): PerpageVisibletorepository = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerpageVisibletorepository]
  }
  
  extension [Self <: PerpageVisibletorepository](x: Self) {
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setVisible_to_repository(value: String): Self = StObject.set(x, "visible_to_repository", value.asInstanceOf[js.Any])
    
    inline def setVisible_to_repositoryUndefined: Self = StObject.set(x, "visible_to_repository", js.undefined)
  }
}
