package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordinateSpace extends StObject {
  
  var coordinateSpace: Any
  
  var id: Any
  
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout
  
  var path: String
}
object CoordinateSpace {
  
  inline def apply(
    coordinateSpace: Any,
    id: Any,
    labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    path: String
  ): CoordinateSpace = {
    val __obj = js.Dynamic.literal(coordinateSpace = coordinateSpace.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateSpace]
  }
  
  extension [Self <: CoordinateSpace](x: Self) {
    
    inline def setCoordinateSpace(value: Any): Self = StObject.set(x, "coordinateSpace", value.asInstanceOf[js.Any])
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabelLayout(value: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
