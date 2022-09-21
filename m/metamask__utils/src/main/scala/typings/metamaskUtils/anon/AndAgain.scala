package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndAgain extends StObject {
  
  var andAgain: Again
}
object AndAgain {
  
  inline def apply(andAgain: Again): AndAgain = {
    val __obj = js.Dynamic.literal(andAgain = andAgain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndAgain]
  }
  
  extension [Self <: AndAgain](x: Self) {
    
    inline def setAndAgain(value: Again): Self = StObject.set(x, "andAgain", value.asInstanceOf[js.Any])
  }
}
