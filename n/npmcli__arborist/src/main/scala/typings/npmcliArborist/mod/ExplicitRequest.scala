package typings.npmcliArborist.mod

import typings.npmcliArborist.npmcliArboristStrings.DELETE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplicitRequest extends StObject {
  
  var action: js.UndefOr[DELETE] = js.undefined
  
  var from: Node
  
  var name: String
}
object ExplicitRequest {
  
  inline def apply(from: Node, name: String): ExplicitRequest = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitRequest]
  }
  
  extension [Self <: ExplicitRequest](x: Self) {
    
    inline def setAction(value: DELETE): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setFrom(value: Node): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
