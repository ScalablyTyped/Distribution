package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selected extends StObject {
  
  /**
    * Checks whether the RadioButton is active or not.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
}
object Selected {
  
  inline def apply(): Selected = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Selected]
  }
  
  extension [Self <: Selected](x: Self) {
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
  }
}
