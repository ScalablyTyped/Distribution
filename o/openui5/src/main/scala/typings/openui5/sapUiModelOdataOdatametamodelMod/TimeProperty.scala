package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The maximum number of fractional seconds
    */
  var precision: js.UndefOr[String] = js.undefined
  
  /**
    * The type name
    */
  var `type`: EdmDotTime
}
object TimeProperty {
  
  inline def apply(name: String): TimeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Time")
    __obj.asInstanceOf[TimeProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeProperty] (val x: Self) extends AnyVal {
    
    inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setType(value: EdmDotTime): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
