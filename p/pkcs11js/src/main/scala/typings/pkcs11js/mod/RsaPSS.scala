package typings.pkcs11js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaPSS
  extends StObject
     with IParams {
  
  var hashAlg: Double
  
  var mgf: Double
  
  var saltLen: Double
}
object RsaPSS {
  
  inline def apply(hashAlg: Double, mgf: Double, saltLen: Double, `type`: Double): RsaPSS = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], mgf = mgf.asInstanceOf[js.Any], saltLen = saltLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPSS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RsaPSS] (val x: Self) extends AnyVal {
    
    inline def setHashAlg(value: Double): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setMgf(value: Double): Self = StObject.set(x, "mgf", value.asInstanceOf[js.Any])
    
    inline def setSaltLen(value: Double): Self = StObject.set(x, "saltLen", value.asInstanceOf[js.Any])
  }
}
