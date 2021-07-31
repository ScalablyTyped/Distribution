package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationDateOptions extends StObject {
  
  var formatLength: js.UndefOr[String] = js.undefined
  
  var selector: js.UndefOr[String] = js.undefined
}
object GlobalizationDateOptions {
  
  @scala.inline
  def apply(): GlobalizationDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalizationDateOptions]
  }
  
  @scala.inline
  implicit class GlobalizationDateOptionsMutableBuilder[Self <: GlobalizationDateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormatLength(value: String): Self = StObject.set(x, "formatLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatLengthUndefined: Self = StObject.set(x, "formatLength", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
  }
}
