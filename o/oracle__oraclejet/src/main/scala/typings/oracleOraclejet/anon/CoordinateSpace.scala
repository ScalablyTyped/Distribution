package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinateSpace extends StObject {
  
  var coordinateSpace: js.Any = js.native
  
  var id: js.Any = js.native
  
  var labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout = js.native
  
  var path: String = js.native
}
object CoordinateSpace {
  
  @scala.inline
  def apply(
    coordinateSpace: js.Any,
    id: js.Any,
    labelLayout: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout,
    path: String
  ): CoordinateSpace = {
    val __obj = js.Dynamic.literal(coordinateSpace = coordinateSpace.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], labelLayout = labelLayout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordinateSpace]
  }
  
  @scala.inline
  implicit class CoordinateSpaceMutableBuilder[Self <: CoordinateSpace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinateSpace(value: js.Any): Self = StObject.set(x, "coordinateSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelLayout(value: typings.oracleOraclejet.ojdiagramUtilsMod.LabelLayout): Self = StObject.set(x, "labelLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
