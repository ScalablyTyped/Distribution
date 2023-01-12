package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mergeablepulls extends StObject {
  
  var mergeable_pulls: js.UndefOr[Double] = js.undefined
  
  var merged_pulls: js.UndefOr[Double] = js.undefined
  
  var total_pulls: js.UndefOr[Double] = js.undefined
  
  var unmergeable_pulls: js.UndefOr[Double] = js.undefined
}
object Mergeablepulls {
  
  inline def apply(): Mergeablepulls = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mergeablepulls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mergeablepulls] (val x: Self) extends AnyVal {
    
    inline def setMergeable_pulls(value: Double): Self = StObject.set(x, "mergeable_pulls", value.asInstanceOf[js.Any])
    
    inline def setMergeable_pullsUndefined: Self = StObject.set(x, "mergeable_pulls", js.undefined)
    
    inline def setMerged_pulls(value: Double): Self = StObject.set(x, "merged_pulls", value.asInstanceOf[js.Any])
    
    inline def setMerged_pullsUndefined: Self = StObject.set(x, "merged_pulls", js.undefined)
    
    inline def setTotal_pulls(value: Double): Self = StObject.set(x, "total_pulls", value.asInstanceOf[js.Any])
    
    inline def setTotal_pullsUndefined: Self = StObject.set(x, "total_pulls", js.undefined)
    
    inline def setUnmergeable_pulls(value: Double): Self = StObject.set(x, "unmergeable_pulls", value.asInstanceOf[js.Any])
    
    inline def setUnmergeable_pullsUndefined: Self = StObject.set(x, "unmergeable_pulls", js.undefined)
  }
}
