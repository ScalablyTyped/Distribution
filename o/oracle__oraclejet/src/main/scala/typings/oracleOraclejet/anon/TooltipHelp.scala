package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipHelp extends StObject {
  
  var tooltipHelp: js.UndefOr[String] = js.undefined
  
  var tooltipRequired: js.UndefOr[String] = js.undefined
}
object TooltipHelp {
  
  inline def apply(): TooltipHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipHelp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipHelp] (val x: Self) extends AnyVal {
    
    inline def setTooltipHelp(value: String): Self = StObject.set(x, "tooltipHelp", value.asInstanceOf[js.Any])
    
    inline def setTooltipHelpUndefined: Self = StObject.set(x, "tooltipHelp", js.undefined)
    
    inline def setTooltipRequired(value: String): Self = StObject.set(x, "tooltipRequired", value.asInstanceOf[js.Any])
    
    inline def setTooltipRequiredUndefined: Self = StObject.set(x, "tooltipRequired", js.undefined)
  }
}
