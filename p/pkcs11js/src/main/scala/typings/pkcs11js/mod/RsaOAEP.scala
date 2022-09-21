package typings.pkcs11js.mod

import typings.node.bufferMod.global.Buffer
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
  
  inline def apply(hashAlg: Double, mgf: Double, source: Double, `type`: Double): RsaOAEP = {
    val __obj = js.Dynamic.literal(hashAlg = hashAlg.asInstanceOf[js.Any], mgf = mgf.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOAEP]
  }
  
  extension [Self <: RsaOAEP](x: Self) {
    
    inline def setHashAlg(value: Double): Self = StObject.set(x, "hashAlg", value.asInstanceOf[js.Any])
    
    inline def setMgf(value: Double): Self = StObject.set(x, "mgf", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Double): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceData(value: Buffer): Self = StObject.set(x, "sourceData", value.asInstanceOf[js.Any])
    
    inline def setSourceDataUndefined: Self = StObject.set(x, "sourceData", js.undefined)
  }
}
