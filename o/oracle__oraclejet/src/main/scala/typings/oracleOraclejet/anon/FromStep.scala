package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromStep
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var fromStep: String
  
  var toStep: String
}
object FromStep {
  
  inline def apply(fromStep: String, toStep: String): FromStep = {
    val __obj = js.Dynamic.literal(fromStep = fromStep.asInstanceOf[js.Any], toStep = toStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromStep]
  }
  
  extension [Self <: FromStep](x: Self) {
    
    inline def setFromStep(value: String): Self = StObject.set(x, "fromStep", value.asInstanceOf[js.Any])
    
    inline def setToStep(value: String): Self = StObject.set(x, "toStep", value.asInstanceOf[js.Any])
  }
}
