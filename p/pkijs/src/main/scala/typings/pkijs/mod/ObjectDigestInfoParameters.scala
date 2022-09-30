package typings.pkijs.mod

import typings.asn1js.mod.BitString
import typings.asn1js.mod.Enumerated
import typings.asn1js.mod.ObjectIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IObjectDigestInfo> */
trait ObjectDigestInfoParameters extends StObject {
  
  var digestAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var digestedObjectType: js.UndefOr[Enumerated] = js.undefined
  
  var objectDigest: js.UndefOr[BitString] = js.undefined
  
  var otherObjectTypeID: js.UndefOr[ObjectIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object ObjectDigestInfoParameters {
  
  inline def apply(): ObjectDigestInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectDigestInfoParameters]
  }
  
  extension [Self <: ObjectDigestInfoParameters](x: Self) {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setDigestedObjectType(value: Enumerated): Self = StObject.set(x, "digestedObjectType", value.asInstanceOf[js.Any])
    
    inline def setDigestedObjectTypeUndefined: Self = StObject.set(x, "digestedObjectType", js.undefined)
    
    inline def setObjectDigest(value: BitString): Self = StObject.set(x, "objectDigest", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestUndefined: Self = StObject.set(x, "objectDigest", js.undefined)
    
    inline def setOtherObjectTypeID(value: ObjectIdentifier): Self = StObject.set(x, "otherObjectTypeID", value.asInstanceOf[js.Any])
    
    inline def setOtherObjectTypeIDUndefined: Self = StObject.set(x, "otherObjectTypeID", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
