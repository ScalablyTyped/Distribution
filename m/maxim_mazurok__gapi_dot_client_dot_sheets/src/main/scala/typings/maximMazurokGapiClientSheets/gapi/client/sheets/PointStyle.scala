package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointStyle extends StObject {
  
  /** The point shape. If empty or unspecified, a default shape is used. */
  var shape: js.UndefOr[String] = js.undefined
  
  /** The point size. If empty, a default size is used. */
  var size: js.UndefOr[Double] = js.undefined
}
object PointStyle {
  
  inline def apply(): PointStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointStyle]
  }
  
  extension [Self <: PointStyle](x: Self) {
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
