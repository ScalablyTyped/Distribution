package typings.pkijs.anon

import typings.pkijs.mod.AlgorithmIdentifierSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DigestAlgorithm extends StObject {
  
  var digestAlgorithm: js.UndefOr[AlgorithmIdentifierSchema] = js.undefined
  
  var digestedObjectType: js.UndefOr[String] = js.undefined
  
  var objectDigest: js.UndefOr[String] = js.undefined
  
  var otherObjectTypeID: js.UndefOr[String] = js.undefined
}
object DigestAlgorithm {
  
  inline def apply(): DigestAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigestAlgorithm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DigestAlgorithm] (val x: Self) extends AnyVal {
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifierSchema): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setDigestedObjectType(value: String): Self = StObject.set(x, "digestedObjectType", value.asInstanceOf[js.Any])
    
    inline def setDigestedObjectTypeUndefined: Self = StObject.set(x, "digestedObjectType", js.undefined)
    
    inline def setObjectDigest(value: String): Self = StObject.set(x, "objectDigest", value.asInstanceOf[js.Any])
    
    inline def setObjectDigestUndefined: Self = StObject.set(x, "objectDigest", js.undefined)
    
    inline def setOtherObjectTypeID(value: String): Self = StObject.set(x, "otherObjectTypeID", value.asInstanceOf[js.Any])
    
    inline def setOtherObjectTypeIDUndefined: Self = StObject.set(x, "otherObjectTypeID", js.undefined)
  }
}
