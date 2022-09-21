package typings.nginstackEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@nginstack/engine.@nginstack/engine/lib/schema/DataModelSchema.DataModelSchemaOptions> */
trait PartialDataModelSchemaOpt extends StObject {
  
  var baseClass: js.UndefOr[Double] = js.undefined
  
  var ignoreClassDefErrors: js.UndefOr[Boolean] = js.undefined
}
object PartialDataModelSchemaOpt {
  
  inline def apply(): PartialDataModelSchemaOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDataModelSchemaOpt]
  }
  
  extension [Self <: PartialDataModelSchemaOpt](x: Self) {
    
    inline def setBaseClass(value: Double): Self = StObject.set(x, "baseClass", value.asInstanceOf[js.Any])
    
    inline def setBaseClassUndefined: Self = StObject.set(x, "baseClass", js.undefined)
    
    inline def setIgnoreClassDefErrors(value: Boolean): Self = StObject.set(x, "ignoreClassDefErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreClassDefErrorsUndefined: Self = StObject.set(x, "ignoreClassDefErrors", js.undefined)
  }
}
