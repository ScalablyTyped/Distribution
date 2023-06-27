package typings.openui5.anon

import typings.openui5.sapUiCoreDateUi5dateMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  /**
    * Largest value allowed for this type; values for constraints must use the same type as configured via
    * `oFormatOptions.source`. Use {@link module:sap/ui/core/date/UI5Date.getInstance} to create new date instances
    */
  var maximum: js.UndefOr[js.Date | default | String] = js.undefined
  
  /**
    * Smallest value allowed for this type; values for constraints must use the same type as configured via
    * `oFormatOptions.source`. Use {@link module:sap/ui/core/date/UI5Date.getInstance} to create new date instances
    */
  var minimum: js.UndefOr[js.Date | default | String] = js.undefined
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `14`] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: js.Date | default | String): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: js.Date | default | String): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
  }
}
