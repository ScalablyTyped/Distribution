package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RsaOAEP
  extends StObject
     with IParams {
  
  var hashAlg: Double
  
  var mgf: Double
  
  var source: Double
  
  var sourceData: js.UndefOr[Buffer] = js.undefined
}
object RsaOAEP {
  
  @scala.inline
  def apply(hashAlg: Double, mgf: Double, source: Double, `type`: Double): RsaOAEP = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], mgf = mgf.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOAEP]
  }
  
  @scala.inline
  implicit class RsaOAEPMutableBuilder[Self <: RsaOAEP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHashAlg(value: Double): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMgf(value: Double): Self = StObject.set(x, "mgf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceData(value: Buffer): Self = StObject.set(x, "sourceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDataUndefined: Self = StObject.set(x, "sourceData", js.undefined)
  }
}
