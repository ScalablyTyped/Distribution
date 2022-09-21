package typings.node.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name[K /* <: String */] extends StObject {
  
  var name: K
}
object Name {
  
  inline def apply[K /* <: String */](name: K): Name[K] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name[K]]
  }
  
  extension [Self <: Name[?], K /* <: String */](x: Self & Name[K]) {
    
    inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
