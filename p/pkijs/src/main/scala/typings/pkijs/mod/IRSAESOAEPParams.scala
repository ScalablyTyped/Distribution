package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRSAESOAEPParams extends StObject {
  
  var hashAlgorithm: AlgorithmIdentifier
  
  var maskGenAlgorithm: AlgorithmIdentifier
  
  var pSourceAlgorithm: AlgorithmIdentifier
}
object IRSAESOAEPParams {
  
  inline def apply(
    hashAlgorithm: AlgorithmIdentifier,
    maskGenAlgorithm: AlgorithmIdentifier,
    pSourceAlgorithm: AlgorithmIdentifier
  ): IRSAESOAEPParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], pSourceAlgorithm = pSourceAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRSAESOAEPParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRSAESOAEPParams] (val x: Self) extends AnyVal {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setPSourceAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "pSourceAlgorithm", value.asInstanceOf[js.Any])
  }
}
