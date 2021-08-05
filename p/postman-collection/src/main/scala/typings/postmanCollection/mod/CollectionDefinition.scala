package typings.postmanCollection.mod

import typings.postmanCollection.anon.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionDefinition
  extends StObject
     with ItemGroupDefinition {
  
  var info: js.UndefOr[Id] = js.undefined
  
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}
object CollectionDefinition {
  
  inline def apply(): CollectionDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionDefinition]
  }
  
  extension [Self <: CollectionDefinition](x: Self) {
    
    inline def setInfo(value: Id): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setVariable(value: js.Array[VariableDefinition]): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    inline def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
    
    inline def setVariableVarargs(value: VariableDefinition*): Self = StObject.set(x, "variable", js.Array(value :_*))
  }
}
