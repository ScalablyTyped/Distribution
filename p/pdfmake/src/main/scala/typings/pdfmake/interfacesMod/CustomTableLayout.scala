package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTableLayout
  extends StObject
     with _TableLayout {
  
  var defaultBorder: js.UndefOr[Boolean] = js.undefined
  
  var fillColor: js.UndefOr[String | DynamicLayout[String]] = js.undefined
  
  var fillOpacity: js.UndefOr[Double | DynamicLayout[Double]] = js.undefined
  
  var hLineColor: js.UndefOr[String | DynamicLayout[String]] = js.undefined
  
  var hLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.undefined
  
  var hLineWidth: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  var paddingBottom: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  var paddingLeft: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  var paddingRight: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  var paddingTop: js.UndefOr[DynamicLayout[Double]] = js.undefined
  
  var vLineColor: js.UndefOr[String | DynamicLayout[String]] = js.undefined
  
  var vLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.undefined
  
  var vLineWidth: js.UndefOr[DynamicLayout[Double]] = js.undefined
}
object CustomTableLayout {
  
  inline def apply(): CustomTableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTableLayout]
  }
  
  extension [Self <: CustomTableLayout](x: Self) {
    
    inline def setDefaultBorder(value: Boolean): Self = StObject.set(x, "defaultBorder", value.asInstanceOf[js.Any])
    
    inline def setDefaultBorderUndefined: Self = StObject.set(x, "defaultBorder", js.undefined)
    
    inline def setFillColor(value: String | DynamicLayout[String]): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
    
    inline def setFillColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = StObject.set(x, "fillColor", js.Any.fromFunction3(value))
    
    inline def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
    
    inline def setFillOpacity(value: Double | DynamicLayout[Double]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = StObject.set(x, "fillOpacity", js.Any.fromFunction3(value))
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setHLineColor(value: String | DynamicLayout[String]): Self = StObject.set(x, "hLineColor", value.asInstanceOf[js.Any])
    
    inline def setHLineColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = StObject.set(x, "hLineColor", js.Any.fromFunction3(value))
    
    inline def setHLineColorUndefined: Self = StObject.set(x, "hLineColor", js.undefined)
    
    inline def setHLineStyle(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null]
    ): Self = StObject.set(x, "hLineStyle", js.Any.fromFunction3(value))
    
    inline def setHLineStyleUndefined: Self = StObject.set(x, "hLineStyle", js.undefined)
    
    inline def setHLineWidth(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = StObject.set(x, "hLineWidth", js.Any.fromFunction3(value))
    
    inline def setHLineWidthUndefined: Self = StObject.set(x, "hLineWidth", js.undefined)
    
    inline def setPaddingBottom(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = StObject.set(x, "paddingBottom", js.Any.fromFunction3(value))
    
    inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    inline def setPaddingLeft(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = StObject.set(x, "paddingLeft", js.Any.fromFunction3(value))
    
    inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    inline def setPaddingRight(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = StObject.set(x, "paddingRight", js.Any.fromFunction3(value))
    
    inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    inline def setPaddingTop(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = StObject.set(x, "paddingTop", js.Any.fromFunction3(value))
    
    inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    inline def setVLineColor(value: String | DynamicLayout[String]): Self = StObject.set(x, "vLineColor", value.asInstanceOf[js.Any])
    
    inline def setVLineColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = StObject.set(x, "vLineColor", js.Any.fromFunction3(value))
    
    inline def setVLineColorUndefined: Self = StObject.set(x, "vLineColor", js.undefined)
    
    inline def setVLineStyle(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null]
    ): Self = StObject.set(x, "vLineStyle", js.Any.fromFunction3(value))
    
    inline def setVLineStyleUndefined: Self = StObject.set(x, "vLineStyle", js.undefined)
    
    inline def setVLineWidth(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = StObject.set(x, "vLineWidth", js.Any.fromFunction3(value))
    
    inline def setVLineWidthUndefined: Self = StObject.set(x, "vLineWidth", js.undefined)
  }
}
