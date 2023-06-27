package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotDateTimeOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeOffsetProperty
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
  var `type`: EdmDotDateTimeOffset
}
object DateTimeOffsetProperty {
  
  inline def apply(name: String): DateTimeOffsetProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.DateTimeOffset")
    __obj.asInstanceOf[DateTimeOffsetProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeOffsetProperty] (val x: Self) extends AnyVal {
    
    inline def setPrecision(value: String): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setType(value: EdmDotDateTimeOffset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
