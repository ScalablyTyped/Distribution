package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IDigestInfo> */
trait DigestInfoParameters extends StObject {
  
  var digest: js.UndefOr[OctetString] = js.undefined
  
  var digestAlgorithm: js.UndefOr[AlgorithmIdentifier] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object DigestInfoParameters {
  
  inline def apply(): DigestInfoParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DigestInfoParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DigestInfoParameters] (val x: Self) extends AnyVal {
    
    inline def setDigest(value: OctetString): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithm(value: AlgorithmIdentifier): Self = StObject.set(x, "digestAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setDigestAlgorithmUndefined: Self = StObject.set(x, "digestAlgorithm", js.undefined)
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
