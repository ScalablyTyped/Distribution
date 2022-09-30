package typings.pkijs.mod

import typings.asn1js.mod.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined pkijs.pkijs.PkiObjectParameters & std.Partial<pkijs.pkijs.IGeneralSubtree> */
trait GeneralSubtreeParameters extends StObject {
  
  var base: js.UndefOr[GeneralName] = js.undefined
  
  var maximum: js.UndefOr[Double | Integer] = js.undefined
  
  var minimum: js.UndefOr[Double | Integer] = js.undefined
  
  var schema: js.UndefOr[SchemaType] = js.undefined
}
object GeneralSubtreeParameters {
  
  inline def apply(): GeneralSubtreeParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneralSubtreeParameters]
  }
  
  extension [Self <: GeneralSubtreeParameters](x: Self) {
    
    inline def setBase(value: GeneralName): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setMaximum(value: Double | Integer): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Double | Integer): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setSchema(value: SchemaType): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
