package typings.pleasejs.PleaseJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MakeColorOption extends js.Object {
  
  var base_color: js.UndefOr[String] = js.native
  
  var colors_returned: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var full_random: js.UndefOr[Boolean] = js.native
  
  var golden: js.UndefOr[Boolean] = js.native
  
  var grayscale: js.UndefOr[Boolean] = js.native
  
  var greyscale: js.UndefOr[Boolean] = js.native
  
  var hue: js.UndefOr[Double] = js.native
  
  var saturation: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object MakeColorOption {
  
  @scala.inline
  def apply(): MakeColorOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MakeColorOption]
  }
  
  @scala.inline
  implicit class MakeColorOptionOps[Self <: MakeColorOption] (val x: Self) extends AnyVal {
    
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
    def setBase_color(value: String): Self = this.set("base_color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase_color: Self = this.set("base_color", js.undefined)
    
    @scala.inline
    def setColors_returned(value: Double): Self = this.set("colors_returned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors_returned: Self = this.set("colors_returned", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFull_random(value: Boolean): Self = this.set("full_random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFull_random: Self = this.set("full_random", js.undefined)
    
    @scala.inline
    def setGolden(value: Boolean): Self = this.set("golden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGolden: Self = this.set("golden", js.undefined)
    
    @scala.inline
    def setGrayscale(value: Boolean): Self = this.set("grayscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrayscale: Self = this.set("grayscale", js.undefined)
    
    @scala.inline
    def setGreyscale(value: Boolean): Self = this.set("greyscale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreyscale: Self = this.set("greyscale", js.undefined)
    
    @scala.inline
    def setHue(value: Double): Self = this.set("hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHue: Self = this.set("hue", js.undefined)
    
    @scala.inline
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
