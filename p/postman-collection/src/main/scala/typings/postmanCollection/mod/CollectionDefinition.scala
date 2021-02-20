package typings.postmanCollection.mod

import typings.postmanCollection.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionDefinition extends ItemGroupDefinition {
  
  var info: js.UndefOr[Id] = js.native
  
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.native
}
object CollectionDefinition {
  
  @scala.inline
  def apply(): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDefinition]
  }
  
  @scala.inline
  implicit class CollectionDefinitionMutableBuilder[Self <: CollectionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: Id): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setVariable(value: js.Array[VariableDefinition]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    @scala.inline
    def setVariableVarargs(value: VariableDefinition*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
