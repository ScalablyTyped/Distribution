package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumn extends StObject {
  
  var name: String
  
  var properties: IColumnProperties
  
  var `type`: DataType
}
object IColumn {
  
  inline def apply(name: String, properties: IColumnProperties, `type`: DataType): IColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IColumn] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IColumnProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setType(value: DataType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
