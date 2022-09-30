package typings.pkijs.mod

import typings.asn1js.mod.OctetStringJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestInfoJson extends StObject {
  
  var digest: OctetStringJson
  
  var digestAlgorithm: AlgorithmIdentifierJson
}
object DigestInfoJson {
  
  inline def apply(digest: OctetStringJson, digestAlgorithm: AlgorithmIdentifierJson): DigestInfoJson = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DigestInfoJson]
  }
  
  extension [Self <: DigestInfoJson](x: Self) {
    
    inline def setDigest(value: OctetStringJson): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
  }
}
