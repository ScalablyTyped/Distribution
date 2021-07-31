package typings.openfin.anon

import typings.openfin.windowOptionMod.Accelerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var newVal: js.UndefOr[Accelerator] = js.undefined
  
  var oldVal: js.UndefOr[Accelerator] = js.undefined
}
object `12` {
  
  @scala.inline
  def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: Accelerator): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setOldVal(value: Accelerator): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
  }
}
