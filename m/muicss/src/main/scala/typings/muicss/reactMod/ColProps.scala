package typings.muicss.reactMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColProps extends HTMLAttributes[HTMLDivElement] {
  
  var lg: js.UndefOr[Double] = js.native
  
  var `lg-offset`: js.UndefOr[Double] = js.native
  
  var md: js.UndefOr[Double] = js.native
  
  var `md-offset`: js.UndefOr[Double] = js.native
  
  var sm: js.UndefOr[Double] = js.native
  
  var `sm-offset`: js.UndefOr[Double] = js.native
  
  var xl: js.UndefOr[Double] = js.native
  
  var `xl-offset`: js.UndefOr[Double] = js.native
  
  var xs: js.UndefOr[Double] = js.native
  
  var `xs-offset`: js.UndefOr[Double] = js.native
}
object ColProps {
  
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  
  @scala.inline
  implicit class ColPropsOps[Self <: ColProps] (val x: Self) extends AnyVal {
    
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
    def setLg(value: Double): Self = this.set("lg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLg: Self = this.set("lg", js.undefined)
    
    @scala.inline
    def `setLg-offset`(value: Double): Self = this.set("lg-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteLg-offset`: Self = this.set("lg-offset", js.undefined)
    
    @scala.inline
    def setMd(value: Double): Self = this.set("md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd: Self = this.set("md", js.undefined)
    
    @scala.inline
    def `setMd-offset`(value: Double): Self = this.set("md-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMd-offset`: Self = this.set("md-offset", js.undefined)
    
    @scala.inline
    def setSm(value: Double): Self = this.set("sm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSm: Self = this.set("sm", js.undefined)
    
    @scala.inline
    def `setSm-offset`(value: Double): Self = this.set("sm-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSm-offset`: Self = this.set("sm-offset", js.undefined)
    
    @scala.inline
    def setXl(value: Double): Self = this.set("xl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXl: Self = this.set("xl", js.undefined)
    
    @scala.inline
    def `setXl-offset`(value: Double): Self = this.set("xl-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXl-offset`: Self = this.set("xl-offset", js.undefined)
    
    @scala.inline
    def setXs(value: Double): Self = this.set("xs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXs: Self = this.set("xs", js.undefined)
    
    @scala.inline
    def `setXs-offset`(value: Double): Self = this.set("xs-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteXs-offset`: Self = this.set("xs-offset", js.undefined)
  }
}
