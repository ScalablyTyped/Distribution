package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Feature
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentOptions extends js.Object {
  
  var boxStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var extent: js.UndefOr[Extent_] = js.native
  
  var pixelTolerance: js.UndefOr[Double] = js.native
  
  var pointerStyle: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object ExtentOptions {
  
  @scala.inline
  def apply(): ExtentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtentOptions]
  }
  
  @scala.inline
  implicit class ExtentOptionsOps[Self <: ExtentOptions] (val x: Self) extends AnyVal {
    
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
    def setBoxStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = this.set("boxStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBoxStyleVarargs(value: Style*): Self = this.set("boxStyle", js.Array(value :_*))
    
    @scala.inline
    def setBoxStyle(value: Style | js.Array[Style] | StyleFunction): Self = this.set("boxStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxStyle: Self = this.set("boxStyle", js.undefined)
    
    @scala.inline
    def setExtent(value: Extent_): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setPixelTolerance(value: Double): Self = this.set("pixelTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelTolerance: Self = this.set("pixelTolerance", js.undefined)
    
    @scala.inline
    def setPointerStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = this.set("pointerStyle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPointerStyleVarargs(value: Style*): Self = this.set("pointerStyle", js.Array(value :_*))
    
    @scala.inline
    def setPointerStyle(value: Style | js.Array[Style] | StyleFunction): Self = this.set("pointerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerStyle: Self = this.set("pointerStyle", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
