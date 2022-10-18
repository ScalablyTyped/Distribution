package typings.mmdbLib.libReaderResponseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostalRecord extends StObject {
  
  val code: String
  
  val confidence: js.UndefOr[Double] = js.undefined
}
object PostalRecord {
  
  inline def apply(code: String): PostalRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalRecord]
  }
  
  extension [Self <: PostalRecord](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
  }
}
