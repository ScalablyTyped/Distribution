package typings.next.anon

import typings.next.distServerLoadComponentsMod.LoadComponentsReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Components extends StObject {
  
  var components: LoadComponentsReturnType
  
  var query: Dictx
}
object Components {
  
  inline def apply(components: LoadComponentsReturnType, query: Dictx): Components = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Components]
  }
  
  extension [Self <: Components](x: Self) {
    
    inline def setComponents(value: LoadComponentsReturnType): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Dictx): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
