package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndAgainAndAgain extends StObject {
  
  var andAgain: AndAgain
}
object AndAgainAndAgain {
  
  inline def apply(andAgain: AndAgain): AndAgainAndAgain = {
    val __obj = js.Dynamic.literal(andAgain = andAgain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndAgainAndAgain]
  }
  
  extension [Self <: AndAgainAndAgain](x: Self) {
    
    inline def setAndAgain(value: AndAgain): Self = StObject.set(x, "andAgain", value.asInstanceOf[js.Any])
  }
}
