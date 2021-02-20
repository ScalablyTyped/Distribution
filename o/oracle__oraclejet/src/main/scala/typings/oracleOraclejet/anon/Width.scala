package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdatagridMod.ojDataGrid.HeaderContext
import typings.oracleOraclejet.oracleOraclejetStrings.disable
import typings.oracleOraclejet.oracleOraclejetStrings.enable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Width[K, D] extends StObject {
  
  var height: js.UndefOr[(js.Function1[/* context */ HeaderContext[K, D], String]) | String | Null] = js.native
  
  var width: enable | disable = js.native
}
object Width {
  
  @scala.inline
  def apply[K, D](width: enable | disable): Width[K, D] = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width[K, D]]
  }
  
  @scala.inline
  implicit class WidthMutableBuilder[Self <: Width[_, _], K, D] (val x: Self with (Width[K, D])) extends AnyVal {
    
    @scala.inline
    def setHeight(value: (js.Function1[/* context */ HeaderContext[K, D], String]) | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightFunction1(value: /* context */ HeaderContext[K, D] => String): Self = StObject.set(x, "height", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeightNull: Self = StObject.set(x, "height", null)
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setWidth(value: enable | disable): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
