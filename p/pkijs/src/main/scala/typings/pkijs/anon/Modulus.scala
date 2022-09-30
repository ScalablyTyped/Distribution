package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Modulus extends StObject {
  
  var modulus: js.UndefOr[String] = js.undefined
  
  var publicExponent: js.UndefOr[String] = js.undefined
}
object Modulus {
  
  inline def apply(): Modulus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Modulus]
  }
  
  extension [Self <: Modulus](x: Self) {
    
    inline def setModulus(value: String): Self = StObject.set(x, "modulus", value.asInstanceOf[js.Any])
    
    inline def setModulusUndefined: Self = StObject.set(x, "modulus", js.undefined)
    
    inline def setPublicExponent(value: String): Self = StObject.set(x, "publicExponent", value.asInstanceOf[js.Any])
    
    inline def setPublicExponentUndefined: Self = StObject.set(x, "publicExponent", js.undefined)
  }
}
