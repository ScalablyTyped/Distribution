package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCollisionGroup extends StObject {
  
  var filterCallback: js.UndefOr[js.Function] = js.undefined
  
  var filterCollisionGroup: js.UndefOr[Double] = js.undefined
  
  var filterCollisionMask: js.UndefOr[Double] = js.undefined
  
  var filterTags: js.UndefOr[js.Array[Any]] = js.undefined
  
  var sort: js.UndefOr[Boolean] = js.undefined
}
object FilterCollisionGroup {
  
  inline def apply(): FilterCollisionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCollisionGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterCollisionGroup] (val x: Self) extends AnyVal {
    
    inline def setFilterCallback(value: js.Function): Self = StObject.set(x, "filterCallback", value.asInstanceOf[js.Any])
    
    inline def setFilterCallbackUndefined: Self = StObject.set(x, "filterCallback", js.undefined)
    
    inline def setFilterCollisionGroup(value: Double): Self = StObject.set(x, "filterCollisionGroup", value.asInstanceOf[js.Any])
    
    inline def setFilterCollisionGroupUndefined: Self = StObject.set(x, "filterCollisionGroup", js.undefined)
    
    inline def setFilterCollisionMask(value: Double): Self = StObject.set(x, "filterCollisionMask", value.asInstanceOf[js.Any])
    
    inline def setFilterCollisionMaskUndefined: Self = StObject.set(x, "filterCollisionMask", js.undefined)
    
    inline def setFilterTags(value: js.Array[Any]): Self = StObject.set(x, "filterTags", value.asInstanceOf[js.Any])
    
    inline def setFilterTagsUndefined: Self = StObject.set(x, "filterTags", js.undefined)
    
    inline def setFilterTagsVarargs(value: Any*): Self = StObject.set(x, "filterTags", js.Array(value*))
    
    inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
