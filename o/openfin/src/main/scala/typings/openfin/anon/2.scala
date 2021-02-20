package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var newVal: js.UndefOr[String] = js.native
  
  var oldVal: js.UndefOr[String] = js.native
}
object `2` {
  
  @scala.inline
  def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: String): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setOldVal(value: String): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
