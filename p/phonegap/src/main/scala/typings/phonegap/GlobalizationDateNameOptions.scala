package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalizationDateNameOptions extends StObject {
  
  var item: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object GlobalizationDateNameOptions {
  
  @scala.inline
  def apply(): GlobalizationDateNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalizationDateNameOptions]
  }
  
  @scala.inline
  implicit class GlobalizationDateNameOptionsMutableBuilder[Self <: GlobalizationDateNameOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
