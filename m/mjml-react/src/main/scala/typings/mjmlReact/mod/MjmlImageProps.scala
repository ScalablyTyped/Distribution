package typings.mjmlReact.mod

import typings.csstype.mod.BackgroundColorProperty
import typings.csstype.mod.BorderProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MjmlImageProps extends js.Object {
  
  var align: js.UndefOr[String] = js.native
  
  var alt: js.UndefOr[String] = js.native
  
  var border: js.UndefOr[BorderProperty[String | Double]] = js.native
  
  var borderRadius: js.UndefOr[String | Double] = js.native
  
  var containerBackgroundColor: js.UndefOr[BackgroundColorProperty] = js.native
  
  var fluidOnMobile: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[String | Double] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var srcset: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String | Double] = js.native
}
object MjmlImageProps {
  
  @scala.inline
  def apply(): MjmlImageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MjmlImageProps]
  }
  
  @scala.inline
  implicit class MjmlImagePropsOps[Self <: MjmlImageProps] (val x: Self) extends AnyVal {
    
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
    def setAlign(value: String): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    
    @scala.inline
    def setBorder(value: BorderProperty[String | Double]): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: String | Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setContainerBackgroundColor(value: BackgroundColorProperty): Self = this.set("containerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerBackgroundColor: Self = this.set("containerBackgroundColor", js.undefined)
    
    @scala.inline
    def setFluidOnMobile(value: String): Self = this.set("fluidOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFluidOnMobile: Self = this.set("fluidOnMobile", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrc: Self = this.set("src", js.undefined)
    
    @scala.inline
    def setSrcset(value: String): Self = this.set("srcset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSrcset: Self = this.set("srcset", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
