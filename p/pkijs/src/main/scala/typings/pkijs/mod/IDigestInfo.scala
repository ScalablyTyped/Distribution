package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDigestInfo extends StObject {
  
  var digest: OctetString
  
  var digestAlgorithm: AlgorithmIdentifier
}
object IDigestInfo {
  
  inline def apply(digest: OctetString, digestAlgorithm: AlgorithmIdentifier): IDigestInfo = {
    val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDigestInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDigestInfo] (val x: Self) extends AnyVal {
    
    inline def setDigest(value: OctetString): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
  }
}
