package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewValOldVal extends StObject {
  
  var newVal: js.UndefOr[Boolean] = js.native
  
  var oldVal: js.UndefOr[Boolean] = js.native
}
object NewValOldVal {
  
  @scala.inline
  def apply(): NewValOldVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewValOldVal]
  }
  
  @scala.inline
  implicit class NewValOldValMutableBuilder[Self <: NewValOldVal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: Boolean): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setOldVal(value: Boolean): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
