package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISemanticAliases extends StObject {
  
  def Clone(): ISemanticAliases
  
  var Value: String
}
object ISemanticAliases {
  
  inline def apply(Clone: () => ISemanticAliases, Value: String): ISemanticAliases = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticAliases]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISemanticAliases] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => ISemanticAliases): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
