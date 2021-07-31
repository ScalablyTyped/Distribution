package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EJSONableCustomType extends StObject {
  
  def equals(other: js.Object): Boolean
  
  def toJSONValue(): JSONable
  
  def typeName(): String
}
object EJSONableCustomType {
  
  @scala.inline
  def apply(equals_ : js.Object => Boolean, toJSONValue: () => JSONable, typeName: () => String): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[EJSONableCustomType]
  }
  
  @scala.inline
  implicit class EJSONableCustomTypeMutableBuilder[Self <: EJSONableCustomType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEquals_(value: js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSONValue(value: () => JSONable): Self = StObject.set(x, "toJSONValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypeName(value: () => String): Self = StObject.set(x, "typeName", js.Any.fromFunction0(value))
  }
}
