package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyInfoJson extends StObject {
  
  var algorithm: AlgorithmIdentifierJson
  
  var subjectPublicKey: BitStringJson
}
object PublicKeyInfoJson {
  
  inline def apply(algorithm: AlgorithmIdentifierJson, subjectPublicKey: BitStringJson): PublicKeyInfoJson = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyInfoJson] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKey(value: BitStringJson): Self = StObject.set(x, "subjectPublicKey", value.asInstanceOf[js.Any])
  }
}
