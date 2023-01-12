package typings.powerbiVisualsTools.mod

import typings.powerbiVisualsTools.mod.data.ISQConstantExpr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValueDefinition
  extends StObject
     with _StructuralObjectValue {
  
  var identityFieldsValues: js.UndefOr[js.Array[ISQConstantExpr]] = js.undefined
  
  var value: ISQConstantExpr
}
object DefaultValueDefinition {
  
  inline def apply(value: ISQConstantExpr): DefaultValueDefinition = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValueDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultValueDefinition] (val x: Self) extends AnyVal {
    
    inline def setIdentityFieldsValues(value: js.Array[ISQConstantExpr]): Self = StObject.set(x, "identityFieldsValues", value.asInstanceOf[js.Any])
    
    inline def setIdentityFieldsValuesUndefined: Self = StObject.set(x, "identityFieldsValues", js.undefined)
    
    inline def setIdentityFieldsValuesVarargs(value: ISQConstantExpr*): Self = StObject.set(x, "identityFieldsValues", js.Array(value*))
    
    inline def setValue(value: ISQConstantExpr): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
