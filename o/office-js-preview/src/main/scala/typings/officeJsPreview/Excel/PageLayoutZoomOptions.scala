package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents page zoom properties.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait PageLayoutZoomOptions extends StObject {
  
  /**
    * Number of pages to fit horizontally. This value can be `null` if percentage scale is used.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var horizontalFitToPages: js.UndefOr[Double] = js.undefined
  
  /**
    * Print page scale value can be between 10 and 400. This value can be `null` if fit to page tall or wide is specified.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of pages to fit vertically. This value can be `null` if percentage scale is used.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var verticalFitToPages: js.UndefOr[Double] = js.undefined
}
object PageLayoutZoomOptions {
  
  inline def apply(): PageLayoutZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutZoomOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageLayoutZoomOptions] (val x: Self) extends AnyVal {
    
    inline def setHorizontalFitToPages(value: Double): Self = StObject.set(x, "horizontalFitToPages", value.asInstanceOf[js.Any])
    
    inline def setHorizontalFitToPagesUndefined: Self = StObject.set(x, "horizontalFitToPages", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setVerticalFitToPages(value: Double): Self = StObject.set(x, "verticalFitToPages", value.asInstanceOf[js.Any])
    
    inline def setVerticalFitToPagesUndefined: Self = StObject.set(x, "verticalFitToPages", js.undefined)
  }
}
