package typings.openfin.windowWindowMod

import typings.openfin.openfinStrings.longEdge
import typings.openfin.openfinStrings.shortEdge
import typings.openfin.openfinStrings.simplex
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintOptions extends js.Object {
  
  var collate: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[Boolean] = js.native
  
  var copies: js.UndefOr[Double] = js.native
  
  var deviceName: js.UndefOr[String] = js.native
  
  var dpi: js.UndefOr[Dpi] = js.native
  
  var duplexMode: js.UndefOr[simplex | shortEdge | longEdge] = js.native
  
  var landscape: js.UndefOr[Boolean] = js.native
  
  var margins: js.UndefOr[Margins] = js.native
  
  var pageRanges: js.UndefOr[Record[String, Double]] = js.native
  
  var pagesPerSheet: js.UndefOr[Double] = js.native
  
  var printBackground: js.UndefOr[Boolean] = js.native
  
  var scaleFactor: js.UndefOr[Double] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object PrintOptions {
  
  @scala.inline
  def apply(): PrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOptions]
  }
  
  @scala.inline
  implicit class PrintOptionsOps[Self <: PrintOptions] (val x: Self) extends AnyVal {
    
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
    def setCollate(value: Boolean): Self = this.set("collate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollate: Self = this.set("collate", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCopies(value: Double): Self = this.set("copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopies: Self = this.set("copies", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = this.set("deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceName: Self = this.set("deviceName", js.undefined)
    
    @scala.inline
    def setDpi(value: Dpi): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpi: Self = this.set("dpi", js.undefined)
    
    @scala.inline
    def setDuplexMode(value: simplex | shortEdge | longEdge): Self = this.set("duplexMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuplexMode: Self = this.set("duplexMode", js.undefined)
    
    @scala.inline
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    
    @scala.inline
    def setMargins(value: Margins): Self = this.set("margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    
    @scala.inline
    def setPageRanges(value: Record[String, Double]): Self = this.set("pageRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageRanges: Self = this.set("pageRanges", js.undefined)
    
    @scala.inline
    def setPagesPerSheet(value: Double): Self = this.set("pagesPerSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePagesPerSheet: Self = this.set("pagesPerSheet", js.undefined)
    
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleFactor: Self = this.set("scaleFactor", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
