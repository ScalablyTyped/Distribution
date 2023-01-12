package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IterationCount extends StObject {
  
  var iterationCount: js.UndefOr[String] = js.undefined
  
  var keyLength: js.UndefOr[String] = js.undefined
  
  var prf: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var saltConstructed: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var saltPrimitive: js.UndefOr[String] = js.undefined
}
object IterationCount {
  
  inline def apply(): IterationCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IterationCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IterationCount] (val x: Self) extends AnyVal {
    
    inline def setIterationCount(value: String): Self = StObject.set(x, "iterationCount", value.asInstanceOf[js.Any])
    
    inline def setIterationCountUndefined: Self = StObject.set(x, "iterationCount", js.undefined)
    
    inline def setKeyLength(value: String): Self = StObject.set(x, "keyLength", value.asInstanceOf[js.Any])
    
    inline def setKeyLengthUndefined: Self = StObject.set(x, "keyLength", js.undefined)
    
    inline def setPrf(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "prf", value.asInstanceOf[js.Any])
    
    inline def setPrfUndefined: Self = StObject.set(x, "prf", js.undefined)
    
    inline def setSaltConstructed(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "saltConstructed", value.asInstanceOf[js.Any])
    
    inline def setSaltConstructedUndefined: Self = StObject.set(x, "saltConstructed", js.undefined)
    
    inline def setSaltPrimitive(value: String): Self = StObject.set(x, "saltPrimitive", value.asInstanceOf[js.Any])
    
    inline def setSaltPrimitiveUndefined: Self = StObject.set(x, "saltPrimitive", js.undefined)
  }
}
