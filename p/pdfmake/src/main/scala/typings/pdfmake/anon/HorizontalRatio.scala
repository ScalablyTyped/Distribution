package typings.pdfmake.anon

import typings.pdfmake.interfacesMod.PageOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HorizontalRatio extends js.Object {
  
  var horizontalRatio: Double = js.native
  
  var left: Double = js.native
  
  var pageInnerHeight: Double = js.native
  
  var pageInnerWidth: Double = js.native
  
  var pageNumber: Double = js.native
  
  var pageOrientation: PageOrientation = js.native
  
  var top: Double = js.native
  
  var verticalRatio: Double = js.native
}
object HorizontalRatio {
  
  @scala.inline
  def apply(
    horizontalRatio: Double,
    left: Double,
    pageInnerHeight: Double,
    pageInnerWidth: Double,
    pageNumber: Double,
    pageOrientation: PageOrientation,
    top: Double,
    verticalRatio: Double
  ): HorizontalRatio = {
    val __obj = js.Dynamic.literal(horizontalRatio = horizontalRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pageInnerHeight = pageInnerHeight.asInstanceOf[js.Any], pageInnerWidth = pageInnerWidth.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], verticalRatio = verticalRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalRatio]
  }
  
  @scala.inline
  implicit class HorizontalRatioOps[Self <: HorizontalRatio] (val x: Self) extends AnyVal {
    
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
    def setHorizontalRatio(value: Double): Self = this.set("horizontalRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInnerHeight(value: Double): Self = this.set("pageInnerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageInnerWidth(value: Double): Self = this.set("pageInnerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumber(value: Double): Self = this.set("pageNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageOrientation(value: PageOrientation): Self = this.set("pageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalRatio(value: Double): Self = this.set("verticalRatio", value.asInstanceOf[js.Any])
  }
}
