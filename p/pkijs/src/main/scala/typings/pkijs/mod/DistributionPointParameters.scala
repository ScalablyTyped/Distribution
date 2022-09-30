package typings.pkijs.mod

import typings.asn1js.mod.BitString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IDistributionPoint> */
trait DistributionPointParameters extends StObject {
  
  var cRLIssuer: js.UndefOr[js.Array[GeneralName]] = js.undefined
  
  var distributionPoint: js.UndefOr[DistributionPointName] = js.undefined
  
  var reasons: js.UndefOr[BitString] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object DistributionPointParameters {
  
  inline def apply(): DistributionPointParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPointParameters]
  }
  
  extension [Self <: DistributionPointParameters](x: Self) {
    
    inline def setCRLIssuer(value: js.Array[GeneralName]): Self = StObject.set(x, "cRLIssuer", value.asInstanceOf[js.Any])
    
    inline def setCRLIssuerUndefined: Self = StObject.set(x, "cRLIssuer", js.undefined)
    
    inline def setCRLIssuerVarargs(value: GeneralName*): Self = StObject.set(x, "cRLIssuer", js.Array(value*))
    
    inline def setDistributionPoint(value: DistributionPointName): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
    
    inline def setDistributionPointVarargs(value: GeneralName*): Self = StObject.set(x, "distributionPoint", js.Array(value*))
    
    inline def setReasons(value: BitString): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
