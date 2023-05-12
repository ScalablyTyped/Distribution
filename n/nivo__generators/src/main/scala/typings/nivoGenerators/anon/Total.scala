package typings.nivoGenerators.anon

import typings.nivoGenerators.distTypesWaffleMod.WaffleDatumSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Total[D /* <: WaffleDatumSpec */] extends StObject {
  
  var groups: js.Array[D]
  
  var total: Double
}
object Total {
  
  inline def apply[D /* <: WaffleDatumSpec */](groups: js.Array[D], total: Double): Total[D] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Total[D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Total[?], D /* <: WaffleDatumSpec */] (val x: Self & Total[D]) extends AnyVal {
    
    inline def setGroups(value: js.Array[D]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: D*): Self = StObject.set(x, "groups", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
