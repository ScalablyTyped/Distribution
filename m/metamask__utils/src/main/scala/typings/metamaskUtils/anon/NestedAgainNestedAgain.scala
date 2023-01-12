package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedAgainNestedAgain extends StObject {
  
  var nestedAgain: NestedAgain
}
object NestedAgainNestedAgain {
  
  inline def apply(nestedAgain: NestedAgain): NestedAgainNestedAgain = {
    val __obj = js.Dynamic.literal(nestedAgain = nestedAgain.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedAgainNestedAgain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedAgainNestedAgain] (val x: Self) extends AnyVal {
    
    inline def setNestedAgain(value: NestedAgain): Self = StObject.set(x, "nestedAgain", value.asInstanceOf[js.Any])
  }
}
