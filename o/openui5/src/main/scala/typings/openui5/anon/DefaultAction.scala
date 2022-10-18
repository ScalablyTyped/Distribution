package typings.openui5.anon

import typings.openui5.sapUiCoreLibraryMod.CSSColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultAction extends StObject {
  
  /**
    * Denotes if the color has been chosen by selecting the "Default Color" button (true or false).
    */
  var defaultAction: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The selected color value.
    */
  var value: js.UndefOr[CSSColor] = js.undefined
}
object DefaultAction {
  
  inline def apply(): DefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultAction]
  }
  
  extension [Self <: DefaultAction](x: Self) {
    
    inline def setDefaultAction(value: Boolean): Self = StObject.set(x, "defaultAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionUndefined: Self = StObject.set(x, "defaultAction", js.undefined)
    
    inline def setValue(value: CSSColor): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
