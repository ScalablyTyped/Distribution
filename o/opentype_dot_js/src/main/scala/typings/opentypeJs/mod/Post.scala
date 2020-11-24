package typings.opentypeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Post extends js.Object {
  
  var glyphNameIndex: js.UndefOr[js.Array[Double]] = js.native
  
  var isFixedPitch: Double = js.native
  
  var italicAngle: Double = js.native
  
  var maxMemType1: Double = js.native
  
  var maxMemType42: Double = js.native
  
  var minMemType1: Double = js.native
  
  var minMemType42: Double = js.native
  
  var names: js.UndefOr[js.Array[String]] = js.native
  
  var numberOfGlyphs: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[js.Array[Double]] = js.native
  
  var underlinePosition: Double = js.native
  
  var underlineThickness: Double = js.native
  
  var version: Double = js.native
}
object Post {
  
  @scala.inline
  def apply(
    isFixedPitch: Double,
    italicAngle: Double,
    maxMemType1: Double,
    maxMemType42: Double,
    minMemType1: Double,
    minMemType42: Double,
    underlinePosition: Double,
    underlineThickness: Double,
    version: Double
  ): Post = {
    val __obj = js.Dynamic.literal(isFixedPitch = isFixedPitch.asInstanceOf[js.Any], italicAngle = italicAngle.asInstanceOf[js.Any], maxMemType1 = maxMemType1.asInstanceOf[js.Any], maxMemType42 = maxMemType42.asInstanceOf[js.Any], minMemType1 = minMemType1.asInstanceOf[js.Any], minMemType42 = minMemType42.asInstanceOf[js.Any], underlinePosition = underlinePosition.asInstanceOf[js.Any], underlineThickness = underlineThickness.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  
  @scala.inline
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
    
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
    def setIsFixedPitch(value: Double): Self = this.set("isFixedPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicAngle(value: Double): Self = this.set("italicAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMemType1(value: Double): Self = this.set("maxMemType1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMemType42(value: Double): Self = this.set("maxMemType42", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinMemType1(value: Double): Self = this.set("minMemType1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinMemType42(value: Double): Self = this.set("minMemType42", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlinePosition(value: Double): Self = this.set("underlinePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineThickness(value: Double): Self = this.set("underlineThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphNameIndexVarargs(value: Double*): Self = this.set("glyphNameIndex", js.Array(value :_*))
    
    @scala.inline
    def setGlyphNameIndex(value: js.Array[Double]): Self = this.set("glyphNameIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlyphNameIndex: Self = this.set("glyphNameIndex", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = this.set("names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("names", js.undefined)
    
    @scala.inline
    def setNumberOfGlyphs(value: Double): Self = this.set("numberOfGlyphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfGlyphs: Self = this.set("numberOfGlyphs", js.undefined)
    
    @scala.inline
    def setOffsetVarargs(value: Double*): Self = this.set("offset", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: js.Array[Double]): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
