package typings.openfin.anon

import typings.openfin.windowOptionMod.CustomRequestHeaders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `6` extends StObject {
  
  var newVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
  
  var oldVal: js.UndefOr[js.Array[CustomRequestHeaders]] = js.native
}
object `6` {
  
  @scala.inline
  def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setNewValVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "newVal", js.Array(value :_*))
    
    @scala.inline
    def setOldVal(value: js.Array[CustomRequestHeaders]): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
    
    @scala.inline
    def setOldValVarargs(value: CustomRequestHeaders*): Self = StObject.set(x, "oldVal", js.Array(value :_*))
  }
}
