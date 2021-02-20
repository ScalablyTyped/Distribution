package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `shapeGroup.toJSON()`. */
@js.native
trait ShapeGroupData extends StObject {
  
  /**
    *
    * Specifies the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns the collection of Shape objects.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shapes: js.UndefOr[js.Array[ShapeData]] = js.native
}
object ShapeGroupData {
  
  @scala.inline
  def apply(): ShapeGroupData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeGroupData]
  }
  
  @scala.inline
  implicit class ShapeGroupDataMutableBuilder[Self <: ShapeGroupData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setShapes(value: js.Array[ShapeData]): Self = StObject.set(x, "shapes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapesUndefined: Self = StObject.set(x, "shapes", js.undefined)
    
    @scala.inline
    def setShapesVarargs(value: ShapeData*): Self = StObject.set(x, "shapes", js.Array(value :_*))
  }
}
