package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotGuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidProperty
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotGuid
}
object GuidProperty {
  
  inline def apply(name: String): GuidProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Guid")
    __obj.asInstanceOf[GuidProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GuidProperty] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotGuid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
