package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CausalConsistency extends StObject {
  
  var causalConsistency: Boolean
}
object CausalConsistency {
  
  inline def apply(causalConsistency: Boolean): CausalConsistency = {
    val __obj = js.Dynamic.literal(causalConsistency = causalConsistency.asInstanceOf[js.Any])
    __obj.asInstanceOf[CausalConsistency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CausalConsistency] (val x: Self) extends AnyVal {
    
    inline def setCausalConsistency(value: Boolean): Self = StObject.set(x, "causalConsistency", value.asInstanceOf[js.Any])
  }
}
