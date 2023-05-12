package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.asc
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.created_at
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastusedbefore extends StObject {
  
  var direction: js.UndefOr[asc | desc] = js.undefined
  
  var last_used_after: js.UndefOr[String] = js.undefined
  
  var last_used_before: js.UndefOr[String] = js.undefined
  
  var owner: js.UndefOr[js.Array[String]] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var per_page: js.UndefOr[Double] = js.undefined
  
  var permission: js.UndefOr[String] = js.undefined
  
  var repository: js.UndefOr[String] = js.undefined
  
  var sort: js.UndefOr[created_at] = js.undefined
}
object Lastusedbefore {
  
  inline def apply(): Lastusedbefore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lastusedbefore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Lastusedbefore] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: asc | desc): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLast_used_after(value: String): Self = StObject.set(x, "last_used_after", value.asInstanceOf[js.Any])
    
    inline def setLast_used_afterUndefined: Self = StObject.set(x, "last_used_after", js.undefined)
    
    inline def setLast_used_before(value: String): Self = StObject.set(x, "last_used_before", value.asInstanceOf[js.Any])
    
    inline def setLast_used_beforeUndefined: Self = StObject.set(x, "last_used_before", js.undefined)
    
    inline def setOwner(value: js.Array[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setOwnerVarargs(value: String*): Self = StObject.set(x, "owner", js.Array(value*))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPer_page(value: Double): Self = StObject.set(x, "per_page", value.asInstanceOf[js.Any])
    
    inline def setPer_pageUndefined: Self = StObject.set(x, "per_page", js.undefined)
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSort(value: created_at): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
