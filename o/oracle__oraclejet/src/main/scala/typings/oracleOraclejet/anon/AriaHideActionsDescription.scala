package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaHideActionsDescription extends StObject {
  
  var ariaHideActionsDescription: js.UndefOr[String] = js.undefined
  
  var ariaShowEndActionsDescription: js.UndefOr[String] = js.undefined
  
  var ariaShowStartActionsDescription: js.UndefOr[String] = js.undefined
}
object AriaHideActionsDescription {
  
  inline def apply(): AriaHideActionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaHideActionsDescription]
  }
  
  extension [Self <: AriaHideActionsDescription](x: Self) {
    
    inline def setAriaHideActionsDescription(value: String): Self = StObject.set(x, "ariaHideActionsDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaHideActionsDescriptionUndefined: Self = StObject.set(x, "ariaHideActionsDescription", js.undefined)
    
    inline def setAriaShowEndActionsDescription(value: String): Self = StObject.set(x, "ariaShowEndActionsDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaShowEndActionsDescriptionUndefined: Self = StObject.set(x, "ariaShowEndActionsDescription", js.undefined)
    
    inline def setAriaShowStartActionsDescription(value: String): Self = StObject.set(x, "ariaShowStartActionsDescription", value.asInstanceOf[js.Any])
    
    inline def setAriaShowStartActionsDescriptionUndefined: Self = StObject.set(x, "ariaShowStartActionsDescription", js.undefined)
  }
}
