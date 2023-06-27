package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotDateTime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeProperty
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
  var `type`: EdmDotDateTime
}
object DateTimeProperty {
  
  inline def apply(name: String): DateTimeProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.DateTime")
    __obj.asInstanceOf[DateTimeProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeProperty] (val x: Self) extends AnyVal {
    
    inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setType(value: EdmDotDateTime): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
