package typings.pkijs.anon

import typings.pkijs.mod.DigestInfoSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iterations extends StObject {
  
  var iterations: js.UndefOr[String] = js.undefined
  
  var mac: js.UndefOr[DigestInfoSchema] = js.undefined
  
  var macSalt: js.UndefOr[String] = js.undefined
}
object Iterations {
  
  inline def apply(): Iterations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iterations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iterations] (val x: Self) extends AnyVal {
    
    inline def setIterations(value: String): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
    
    inline def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
    
    inline def setMac(value: DigestInfoSchema): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
    
    inline def setMacSalt(value: String): Self = StObject.set(x, "macSalt", value.asInstanceOf[js.Any])
    
    inline def setMacSaltUndefined: Self = StObject.set(x, "macSalt", js.undefined)
    
    inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
  }
}
