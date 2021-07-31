package typings.multiselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOption extends StObject {
  
  var index: js.UndefOr[Double] = js.undefined
  
  var nested: js.UndefOr[String] = js.undefined
  
  var text: String
  
  var value: String
}
object AddOption {
  
  @scala.inline
  def apply(text: String, value: String): AddOption = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOption]
  }
  
  @scala.inline
  implicit class AddOptionMutableBuilder[Self <: AddOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNested(value: String): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
