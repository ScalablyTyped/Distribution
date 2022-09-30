package typings.pkijs.mod

import typings.asn1js.mod.BitStringJson
import typings.asn1js.mod.EnumeratedJson
import typings.asn1js.mod.ObjectIdentifierJson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectDigestInfoJson extends StObject {
  
  var digestAlgorithm: AlgorithmIdentifierJson
  
  var digestedObjectType: EnumeratedJson
  
  var objectDigest: BitStringJson
  
  var otherObjectTypeID: js.UndefOr[ObjectIdentifierJson] = js.undefined
}
object ObjectDigestInfoJson {
  
  inline def apply(
    digestAlgorithm: AlgorithmIdentifierJson,
    digestedObjectType: EnumeratedJson,
    objectDigest: BitStringJson
  ): ObjectDigestInfoJson = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], digestedObjectType = digestedObjectType.asInstanceOf[js.Any], objectDigest = objectDigest.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectDigestInfoJson]
  }
  
  extension [Self <: ObjectDigestInfoJson](x: Self) {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifierJson): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestedObjectType(value: EnumeratedJson): Self = StObject.set(x, "digestedObjectType", value.asInstanceOf[js.Any])
    
    inline def setObjectDigest(value: BitStringJson): Self = StObject.set(x, "objectDigest", value.asInstanceOf[js.Any])
    
    inline def setOtherObjectTypeID(value: ObjectIdentifierJson): Self = StObject.set(x, "otherObjectTypeID", value.asInstanceOf[js.Any])
    
    inline def setOtherObjectTypeIDUndefined: Self = StObject.set(x, "otherObjectTypeID", js.undefined)
  }
}
