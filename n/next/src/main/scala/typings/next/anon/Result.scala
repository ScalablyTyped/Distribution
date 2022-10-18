package typings.next.anon

import typings.next.distLibTypescriptRunTypeCheckMod.TypeCheckResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result extends StObject {
  
  var result: js.UndefOr[TypeCheckResult] = js.undefined
  
  var version: String | Null
}
object Result {
  
  inline def apply(): Result = {
    val __obj = js.Dynamic.literal(version = null)
    __obj.asInstanceOf[Result]
  }
  
  extension [Self <: Result](x: Self) {
    
    inline def setResult(value: TypeCheckResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
