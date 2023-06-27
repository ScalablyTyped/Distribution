package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.In
import typings.openui5.openui5Strings.InOut
import typings.openui5.openui5Strings.Out
import typings.openui5.openui5Strings.`false`
import typings.openui5.openui5Strings.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionImportParameter
  extends StObject
     with Annotatable {
  
  /**
    * The fixedLength constraint if supported by the function import parameter's type
    */
  var fixedLength: js.UndefOr[`false` | `true`] = js.undefined
  
  /**
    * The maxLength constraint if supported by the function import parameter's type
    */
  var maxLength: js.UndefOr[String] = js.undefined
  
  /**
    * The function import parameter's mode
    */
  var mode: js.UndefOr[In | InOut | Out] = js.undefined
  
  /**
    * The function import parameter's name
    */
  var name: String
  
  /**
    * The precision constraint if supported by the function import parameter's type
    */
  var precision: js.UndefOr[String] = js.undefined
  
  /**
    * The scale constraint if supported by the function import parameter's type
    */
  var scale: js.UndefOr[String] = js.undefined
  
  /**
    * The function import parameter's type; the value is identical to the corresponding XML attribute value
    * in the service metadata document.
    */
  var `type`: String
}
object FunctionImportParameter {
  
  inline def apply(name: String, `type`: String): FunctionImportParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionImportParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionImportParameter] (val x: Self) extends AnyVal {
    
    inline def setFixedLength(value: `false` | `true`): Self = StObject.set(x, "fixedLength", value.asInstanceOf[js.Any])
    
    inline def setFixedLengthUndefined: Self = StObject.set(x, "fixedLength", js.undefined)
    
    inline def setMaxLength(value: String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMode(value: In | InOut | Out): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
