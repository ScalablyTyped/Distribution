package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBooleanValue extends StObject {
  
  def Clone(): IBooleanValue
  
  var Value: Boolean
}
object IBooleanValue {
  
  @scala.inline
  def apply(Clone: () => IBooleanValue, Value: Boolean): IBooleanValue = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBooleanValue]
  }
  
  @scala.inline
  implicit class IBooleanValueMutableBuilder[Self <: IBooleanValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IBooleanValue): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
