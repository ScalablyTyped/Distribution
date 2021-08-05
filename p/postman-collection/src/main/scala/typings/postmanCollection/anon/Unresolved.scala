package typings.postmanCollection.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Unresolved extends StObject {
  
  var unresolved: Boolean
}
object Unresolved {
  
  inline def apply(unresolved: Boolean): Unresolved = {
    val __obj = js.Dynamic.literal(unresolved = unresolved.asInstanceOf[js.Any])
    __obj.asInstanceOf[Unresolved]
  }
  
  extension [Self <: Unresolved](x: Self) {
    
    inline def setUnresolved(value: Boolean): Self = StObject.set(x, "unresolved", value.asInstanceOf[js.Any])
  }
}
