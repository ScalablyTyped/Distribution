package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `geometricShape.toJSON()`. */
trait GeometricShapeData extends StObject {
  
  /**
    * Returns the shape identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[String] = js.undefined
}
object GeometricShapeData {
  
  inline def apply(): GeometricShapeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometricShapeData]
  }
  
  extension [Self <: GeometricShapeData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
