package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsnFromBerResult extends StObject {
  
  var offset: Double
  
  var result: Any
}
object AsnFromBerResult {
  
  inline def apply(offset: Double, result: Any): AsnFromBerResult = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsnFromBerResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsnFromBerResult] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
