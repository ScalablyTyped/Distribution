package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewObjectWithId extends StObject {
  
  var id: String
  
  var `object`: DataViewObject
}
object DataViewObjectWithId {
  
  inline def apply(id: String, `object`: DataViewObject): DataViewObjectWithId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewObjectWithId]
  }
  
  extension [Self <: DataViewObjectWithId](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setObject(value: DataViewObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
