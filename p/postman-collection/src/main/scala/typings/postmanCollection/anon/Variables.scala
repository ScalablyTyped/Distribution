package typings.postmanCollection.anon

import typings.postmanCollection.mod.VariableList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Variables extends StObject {
  
  var variables: VariableList
}
object Variables {
  
  inline def apply(variables: VariableList): Variables = {
    val __obj = js.Dynamic.literal(variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variables]
  }
  
  extension [Self <: Variables](x: Self) {
    
    inline def setVariables(value: VariableList): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
  }
}
