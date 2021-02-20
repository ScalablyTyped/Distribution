package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISemanticAliases extends StObject {
  
  def Clone(): ISemanticAliases = js.native
  
  var Value: String = js.native
}
object ISemanticAliases {
  
  @scala.inline
  def apply(Clone: () => ISemanticAliases, Value: String): ISemanticAliases = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticAliases]
  }
  
  @scala.inline
  implicit class ISemanticAliasesMutableBuilder[Self <: ISemanticAliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => ISemanticAliases): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
