package typings.officeJs.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents page zoom properties.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait PageLayoutZoomOptions extends js.Object {
  
  /**
    *
    * Number of pages to fit horizontally. This value can be null if percentage scale is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var horizontalFitToPages: js.UndefOr[Double] = js.native
  
  /**
    *
    * Print page scale value can be between 10 and 400. This value can be null if fit to page tall or wide is specified.
    *
    * [Api set: ExcelApi 1.9]
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    *
    * Number of pages to fit vertically. This value can be null if percentage scale is used.
    *
    * [Api set: ExcelApi 1.9]
    */
  var verticalFitToPages: js.UndefOr[Double] = js.native
}
object PageLayoutZoomOptions {
  
  @scala.inline
  def apply(): PageLayoutZoomOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLayoutZoomOptions]
  }
  
  @scala.inline
  implicit class PageLayoutZoomOptionsOps[Self <: PageLayoutZoomOptions] (val x: Self) extends AnyVal {
    
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
    def setHorizontalFitToPages(value: Double): Self = this.set("horizontalFitToPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalFitToPages: Self = this.set("horizontalFitToPages", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setVerticalFitToPages(value: Double): Self = this.set("verticalFitToPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalFitToPages: Self = this.set("verticalFitToPages", js.undefined)
  }
}
