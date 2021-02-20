package typings.paypalRestSdk.mod.invoice

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tax extends Cost {
  
  var id: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object Tax {
  
  @scala.inline
  def apply(): Tax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tax]
  }
  
  @scala.inline
  implicit class TaxMutableBuilder[Self <: Tax] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
