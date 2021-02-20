package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AriaHideActionsDescription extends StObject {
  
  var ariaHideActionsDescription: js.UndefOr[String] = js.native
  
  var ariaShowEndActionsDescription: js.UndefOr[String] = js.native
  
  var ariaShowStartActionsDescription: js.UndefOr[String] = js.native
}
object AriaHideActionsDescription {
  
  @scala.inline
  def apply(): AriaHideActionsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaHideActionsDescription]
  }
  
  @scala.inline
  implicit class AriaHideActionsDescriptionMutableBuilder[Self <: AriaHideActionsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaHideActionsDescription(value: String): Self = StObject.set(x, "ariaHideActionsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaHideActionsDescriptionUndefined: Self = StObject.set(x, "ariaHideActionsDescription", js.undefined)
    
    @scala.inline
    def setAriaShowEndActionsDescription(value: String): Self = StObject.set(x, "ariaShowEndActionsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaShowEndActionsDescriptionUndefined: Self = StObject.set(x, "ariaShowEndActionsDescription", js.undefined)
    
    @scala.inline
    def setAriaShowStartActionsDescription(value: String): Self = StObject.set(x, "ariaShowStartActionsDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaShowStartActionsDescriptionUndefined: Self = StObject.set(x, "ariaShowStartActionsDescription", js.undefined)
  }
}
