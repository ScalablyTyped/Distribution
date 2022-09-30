package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Enumerated
import typings.asn1js.mod.ObjectIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IObjectDigestInfo extends StObject {
  
  var digestAlgorithm: AlgorithmIdentifier
  
  var digestedObjectType: Enumerated
  
  var objectDigest: BitString
  
  var otherObjectTypeID: js.UndefOr[ObjectIdentifier] = js.undefined
}
object IObjectDigestInfo {
  
  inline def apply(digestAlgorithm: AlgorithmIdentifier, digestedObjectType: Enumerated, objectDigest: BitString): IObjectDigestInfo = {
    val __obj = js.Dynamic.literal(digestAlgorithm = digestAlgorithm.asInstanceOf[js.Any], digestedObjectType = digestedObjectType.asInstanceOf[js.Any], objectDigest = objectDigest.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectDigestInfo]
  }
  
  extension [Self <: IObjectDigestInfo](x: Self) {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestedObjectType(value: Enumerated): Self = StObject.set(x, "digestedObjectType", value.asInstanceOf[js.Any])
    
    inline def setObjectDigest(value: BitString): Self = StObject.set(x, "objectDigest", value.asInstanceOf[js.Any])
    
    inline def setOtherObjectTypeID(value: ObjectIdentifier): Self = StObject.set(x, "otherObjectTypeID", value.asInstanceOf[js.Any])
    
    inline def setOtherObjectTypeIDUndefined: Self = StObject.set(x, "otherObjectTypeID", js.undefined)
  }
}
