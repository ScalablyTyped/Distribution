package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height[K, D] extends StObject {
  
  var height: enable | disable
  
  var width: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.undefined
}
object Height {
  
  inline def apply[K, D](height: enable | disable): Height[K, D] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height[K, D]]
  }
  
  extension [Self <: Height[?, ?], K, D](x: Self & (Height[K, D])) {
    
    inline def setHeight(value: enable | disable): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: (js.Function1[/* context */ HeaderContext[K, D], String]) | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthFunction1(value: /* context */ HeaderContext[K, D] => String): Self = StObject.set(x, "width", js.Any.fromFunction1(value))
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
