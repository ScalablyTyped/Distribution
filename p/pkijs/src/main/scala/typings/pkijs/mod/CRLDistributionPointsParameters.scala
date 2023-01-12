package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.ICRLDistributionPoints> */
trait CRLDistributionPointsParameters extends StObject {
  
  var distributionPoints: js.UndefOr[js.Array[DistributionPoint]] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object CRLDistributionPointsParameters {
  
  inline def apply(): CRLDistributionPointsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CRLDistributionPointsParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CRLDistributionPointsParameters] (val x: Self) extends AnyVal {
    
    inline def setDistributionPoints(value: js.Array[DistributionPoint]): Self = StObject.set(x, "distributionPoints", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointsUndefined: Self = StObject.set(x, "distributionPoints", js.undefined)
    
    inline def setDistributionPointsVarargs(value: DistributionPoint*): Self = StObject.set(x, "distributionPoints", js.Array(value*))
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
