package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.openui5Strings.EdmDotInt64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Int64Property
  extends StObject
     with AbstractProperty
     with Property {
  
  /**
    * The type name
    */
  var `type`: EdmDotInt64
}
object Int64Property {
  
  inline def apply(name: String): Int64Property = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Edm.Int64")
    __obj.asInstanceOf[Int64Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Int64Property] (val x: Self) extends AnyVal {
    
    inline def setType(value: EdmDotInt64): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
