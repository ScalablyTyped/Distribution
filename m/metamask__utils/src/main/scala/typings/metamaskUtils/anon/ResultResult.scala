package typings.metamaskUtils.anon

import typings.metamaskUtils.distJsonMod.Json
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultResult[Result /* <: Json */] extends StObject {
  
  var result: Result
}
object ResultResult {
  
  inline def apply[Result /* <: Json */](result: Result): ResultResult[Result] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultResult[Result]]
  }
  
  extension [Self <: ResultResult[?], Result /* <: Json */](x: Self & ResultResult[Result]) {
    
    inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
