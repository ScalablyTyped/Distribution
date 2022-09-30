package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IOriginatorIdentifierOrKey> */
trait OriginatorIdentifierOrKeyParameters extends StObject {
  
  var schema: js.UndefOr[SchemaType] = js.undefined
  
  var value: js.UndefOr[Any] = js.undefined
  
  var variant: js.UndefOr[Double] = js.undefined
}
object OriginatorIdentifierOrKeyParameters {
  
  inline def apply(): OriginatorIdentifierOrKeyParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OriginatorIdentifierOrKeyParameters]
  }
  
  extension [Self <: OriginatorIdentifierOrKeyParameters](x: Self) {
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setVariant(value: Double): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    
    inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
  }
}
