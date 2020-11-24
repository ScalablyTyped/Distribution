package typings.ol.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontParameters extends js.Object {
  
  var families: js.Array[String] = js.native
  
  var family: String = js.native
  
  var lineHeight: String = js.native
  
  var size: String = js.native
  
  var style: String = js.native
  
  var variant: String = js.native
  
  var weight: String = js.native
}
object FontParameters {
  
  @scala.inline
  def apply(
    families: js.Array[String],
    family: String,
    lineHeight: String,
    size: String,
    style: String,
    variant: String,
    weight: String
  ): FontParameters = {
    val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontParameters]
  }
  
  @scala.inline
  implicit class FontParametersOps[Self <: FontParameters] (val x: Self) extends AnyVal {
    
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
    def setFamiliesVarargs(value: String*): Self = this.set("families", js.Array(value :_*))
    
    @scala.inline
    def setFamilies(value: js.Array[String]): Self = this.set("families", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
  }
}
