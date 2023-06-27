package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldSize extends StObject {
  
  var control: js.UndefOr[this.type] = js.undefined
  
  var oldSize: Width
  
  var size: Width
  
  var target: typings.std.Element
}
object OldSize {
  
  inline def apply(oldSize: Width, size: Width, target: typings.std.Element): OldSize = {
    val __obj = js.Dynamic.literal(oldSize = oldSize.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldSize] (val x: Self) extends AnyVal {
    
    inline def setControl(value: OldSize): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "control", js.undefined)
    
    inline def setOldSize(value: Width): Self = StObject.set(x, "oldSize", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Width): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: typings.std.Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
