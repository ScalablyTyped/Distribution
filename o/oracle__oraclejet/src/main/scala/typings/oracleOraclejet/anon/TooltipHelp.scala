package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipHelp extends StObject {
  
  var tooltipHelp: js.UndefOr[String] = js.native
  
  var tooltipRequired: js.UndefOr[String] = js.native
}
object TooltipHelp {
  
  @scala.inline
  def apply(): TooltipHelp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipHelp]
  }
  
  @scala.inline
  implicit class TooltipHelpMutableBuilder[Self <: TooltipHelp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltipHelp(value: String): Self = StObject.set(x, "tooltipHelp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipHelpUndefined: Self = StObject.set(x, "tooltipHelp", js.undefined)
    
    @scala.inline
    def setTooltipRequired(value: String): Self = StObject.set(x, "tooltipRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipRequiredUndefined: Self = StObject.set(x, "tooltipRequired", js.undefined)
  }
}
