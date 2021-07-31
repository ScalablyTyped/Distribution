package typings.openfin.anon

import typings.openfin.shapesMod.Hotkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldVal extends StObject {
  
  var newVal: js.UndefOr[js.Array[Hotkey]] = js.undefined
  
  var oldVal: js.UndefOr[js.Array[Hotkey]] = js.undefined
}
object OldVal {
  
  @scala.inline
  def apply(): OldVal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OldVal]
  }
  
  @scala.inline
  implicit class OldValMutableBuilder[Self <: OldVal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewVal(value: js.Array[Hotkey]): Self = StObject.set(x, "newVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValUndefined: Self = StObject.set(x, "newVal", js.undefined)
    
    @scala.inline
    def setNewValVarargs(value: Hotkey*): Self = StObject.set(x, "newVal", js.Array(value :_*))
    
    @scala.inline
    def setOldVal(value: js.Array[Hotkey]): Self = StObject.set(x, "oldVal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValUndefined: Self = StObject.set(x, "oldVal", js.undefined)
    
    @scala.inline
    def setOldValVarargs(value: Hotkey*): Self = StObject.set(x, "oldVal", js.Array(value :_*))
  }
}
