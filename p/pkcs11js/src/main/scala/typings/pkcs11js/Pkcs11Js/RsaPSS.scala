package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RsaPSS extends IParams {
  
  var hashAlg: Double = js.native
  
  var mgf: Double = js.native
  
  var saltLen: Double = js.native
}
object RsaPSS {
  
  @scala.inline
  def apply(hashAlg: Double, mgf: Double, saltLen: Double, `type`: Double): RsaPSS = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], mgf = mgf.asInstanceOf[js.Any], saltLen = saltLen.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPSS]
  }
  
  @scala.inline
  implicit class RsaPSSMutableBuilder[Self <: RsaPSS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashAlg(value: Double): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMgf(value: Double): Self = StObject.set(x, "mgf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaltLen(value: Double): Self = StObject.set(x, "saltLen", value.asInstanceOf[js.Any])
  }
}
