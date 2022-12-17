package typings.pkijs.anon

import typings.pkijs.pkijsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var result: Any
  
  var verified: `true`
}
object Result {
  
  inline def apply(result: Any): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], verified = true)
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setVerified(value: `true`): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
  }
}
