package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRSASSAPSSParams extends StObject {
  
  /**
    * Algorithms of hashing (DEFAULT sha1)
    */
  var hashAlgorithm: AlgorithmIdentifier
  
  /**
    * Salt length (DEFAULT 20)
    */
  var maskGenAlgorithm: AlgorithmIdentifier
  
  /**
    * Salt length (DEFAULT 20)
    */
  var saltLength: Double
  
  /**
    * (DEFAULT 1)
    */
  var trailerField: Double
}
object IRSASSAPSSParams {
  
  inline def apply(
    hashAlgorithm: AlgorithmIdentifier,
    maskGenAlgorithm: AlgorithmIdentifier,
    saltLength: Double,
    trailerField: Double
  ): IRSASSAPSSParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], trailerField = trailerField.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRSASSAPSSParams]
  }
  
  extension [Self <: IRSASSAPSSParams](x: Self) {
    
    inline def setHashAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "hashAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMaskGenAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "maskGenAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSaltLength(value: Double): Self = StObject.set(x, "saltLength", value.asInstanceOf[js.Any])
    
    inline def setTrailerField(value: Double): Self = StObject.set(x, "trailerField", value.asInstanceOf[js.Any])
  }
}
