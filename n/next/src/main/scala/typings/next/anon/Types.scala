package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Types extends StObject {
  
  var types: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BabelTypes */ Any
}
object Types {
  
  inline def apply(types: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BabelTypes */ Any): Types = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  
  extension [Self <: Types](x: Self) {
    
    inline def setTypes(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BabelTypes */ Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
