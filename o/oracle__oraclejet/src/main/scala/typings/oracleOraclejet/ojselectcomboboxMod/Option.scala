package typings.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var value: js.Object = js.native
}
object Option {
  
  @scala.inline
  def apply(value: js.Object): Option = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setValue(value: js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
