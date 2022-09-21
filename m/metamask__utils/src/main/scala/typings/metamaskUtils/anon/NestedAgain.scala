package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedAgain extends StObject {
  
  var nestedAgain: AndAgainAndAgain
}
object NestedAgain {
  
  inline def apply(nestedAgain: AndAgainAndAgain): NestedAgain = {
    val __obj = js.Dynamic.literal(nestedAgain = nestedAgain.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedAgain]
  }
  
  extension [Self <: NestedAgain](x: Self) {
    
    inline def setNestedAgain(value: AndAgainAndAgain): Self = StObject.set(x, "nestedAgain", value.asInstanceOf[js.Any])
  }
}
