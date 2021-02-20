package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewVal extends StObject {
  
  var newVal: js.UndefOr[Double] = js.native
  
  var oldVal: js.UndefOr[Double] = js.native
}
object NewVal {
  
  @scala.inline
  def apply(): NewVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewVal]
  }
  
  @scala.inline
  implicit class NewValMutableBuilder[Self <: NewVal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: Double): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setOldVal(value: Double): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
