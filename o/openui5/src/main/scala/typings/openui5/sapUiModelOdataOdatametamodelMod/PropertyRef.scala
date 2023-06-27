package typings.openui5.sapUiModelOdataOdatametamodelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyRef extends StObject {
  
  /**
    * The property name
    */
  var name: String
}
object PropertyRef {
  
  inline def apply(name: String): PropertyRef = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyRef] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
