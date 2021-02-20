package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `geometricShape.toJSON()`. */
@js.native
trait GeometricShapeData extends StObject {
  
  /**
    *
    * Returns the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.native
}
object GeometricShapeData {
  
  @scala.inline
  def apply(): GeometricShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometricShapeData]
  }
  
  @scala.inline
  implicit class GeometricShapeDataMutableBuilder[Self <: GeometricShapeData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
