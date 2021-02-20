package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EJSONableCustomType extends StObject {
  
  @JSName("clone")
  var clone_FEJSONableCustomType: js.UndefOr[js.Function0[this.type]] = js.native
  
  @JSName("equals")
  var equals_FEJSONableCustomType: js.UndefOr[js.Function1[/* other */ js.Object, Boolean]] = js.native
  
  def toJSONValue(): JSONable = js.native
  
  def typeName(): String = js.native
}
object EJSONableCustomType {
  
  @scala.inline
  def apply(toJSONValue: () => JSONable, typeName: () => String): EJSONableCustomType = {
    val __obj = js.Dynamic.literal(toJSONValue = js.Any.fromFunction0(toJSONValue), typeName = js.Any.fromFunction0(typeName))
    __obj.asInstanceOf[EJSONableCustomType]
  }
  
  @scala.inline
  implicit class EJSONableCustomTypeMutableBuilder[Self <: EJSONableCustomType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone_(value: () => EJSONableCustomType): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
    
    @scala.inline
    def setEquals_(value: /* other */ js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
    
    @scala.inline
    def setToJSONValue(value: () => JSONable): Self = StObject.set(x, "toJSONValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTypeName(value: () => String): Self = StObject.set(x, "typeName", js.Any.fromFunction0(value))
  }
}
