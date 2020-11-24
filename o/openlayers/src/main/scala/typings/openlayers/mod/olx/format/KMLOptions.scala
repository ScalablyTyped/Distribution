package typings.openlayers.mod.olx.format

import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMLOptions extends js.Object {
  
  var defaultStyle: js.UndefOr[js.Array[Style]] = js.native
  
  var extractStyles: js.UndefOr[Boolean] = js.native
  
  var showPointNames: js.UndefOr[Boolean] = js.native
  
  var writeStyles: js.UndefOr[Boolean] = js.native
}
object KMLOptions {
  
  @scala.inline
  def apply(): KMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMLOptions]
  }
  
  @scala.inline
  implicit class KMLOptionsOps[Self <: KMLOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultStyleVarargs(value: Style*): Self = this.set("defaultStyle", js.Array(value :_*))
    
    @scala.inline
    def setDefaultStyle(value: js.Array[Style]): Self = this.set("defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultStyle: Self = this.set("defaultStyle", js.undefined)
    
    @scala.inline
    def setExtractStyles(value: Boolean): Self = this.set("extractStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractStyles: Self = this.set("extractStyles", js.undefined)
    
    @scala.inline
    def setShowPointNames(value: Boolean): Self = this.set("showPointNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPointNames: Self = this.set("showPointNames", js.undefined)
    
    @scala.inline
    def setWriteStyles(value: Boolean): Self = this.set("writeStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteStyles: Self = this.set("writeStyles", js.undefined)
  }
}
