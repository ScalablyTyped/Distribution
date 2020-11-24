package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTableLayout extends _TableLayout {
  
  var defaultBorder: js.UndefOr[Boolean] = js.native
  
  var fillColor: js.UndefOr[String | DynamicLayout[String]] = js.native
  
  var fillOpacity: js.UndefOr[Double | DynamicLayout[Double]] = js.native
  
  var hLineColor: js.UndefOr[String | DynamicLayout[String]] = js.native
  
  var hLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.native
  
  var hLineWidth: js.UndefOr[DynamicLayout[Double]] = js.native
  
  var paddingBottom: js.UndefOr[DynamicLayout[Double]] = js.native
  
  var paddingLeft: js.UndefOr[DynamicLayout[Double]] = js.native
  
  var paddingRight: js.UndefOr[DynamicLayout[Double]] = js.native
  
  var paddingTop: js.UndefOr[DynamicLayout[Double]] = js.native
  
  var vLineColor: js.UndefOr[String | DynamicLayout[String]] = js.native
  
  var vLineStyle: js.UndefOr[DynamicLayout[LineStyle]] = js.native
  
  var vLineWidth: js.UndefOr[DynamicLayout[Double]] = js.native
}
object CustomTableLayout {
  
  @scala.inline
  def apply(): CustomTableLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTableLayout]
  }
  
  @scala.inline
  implicit class CustomTableLayoutOps[Self <: CustomTableLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultBorder(value: Boolean): Self = this.set("defaultBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultBorder: Self = this.set("defaultBorder", js.undefined)
    
    @scala.inline
    def setFillColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = this.set("fillColor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFillColor(value: String | DynamicLayout[String]): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    
    @scala.inline
    def setFillOpacityFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = this.set("fillOpacity", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFillOpacity(value: Double | DynamicLayout[Double]): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    
    @scala.inline
    def setHLineColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = this.set("hLineColor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHLineColor(value: String | DynamicLayout[String]): Self = this.set("hLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHLineColor: Self = this.set("hLineColor", js.undefined)
    
    @scala.inline
    def setHLineStyle(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null]
    ): Self = this.set("hLineStyle", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHLineStyle: Self = this.set("hLineStyle", js.undefined)
    
    @scala.inline
    def setHLineWidth(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = this.set("hLineWidth", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHLineWidth: Self = this.set("hLineWidth", js.undefined)
    
    @scala.inline
    def setPaddingBottom(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = this.set("paddingBottom", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingLeft(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = this.set("paddingLeft", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = this.set("paddingRight", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = this.set("paddingTop", js.Any.fromFunction3(value))
    
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    
    @scala.inline
    def setVLineColorFunction3(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[String | Null]
    ): Self = this.set("vLineColor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVLineColor(value: String | DynamicLayout[String]): Self = this.set("vLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVLineColor: Self = this.set("vLineColor", js.undefined)
    
    @scala.inline
    def setVLineStyle(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[LineStyle | Null]
    ): Self = this.set("vLineStyle", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteVLineStyle: Self = this.set("vLineStyle", js.undefined)
    
    @scala.inline
    def setVLineWidth(
      value: (/* rowIndex */ Double, /* node */ ContentTable, /* columnIndex */ Double) => js.UndefOr[Double | Null]
    ): Self = this.set("vLineWidth", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteVLineWidth: Self = this.set("vLineWidth", js.undefined)
  }
}
