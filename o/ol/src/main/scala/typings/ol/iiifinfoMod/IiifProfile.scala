package typings.ol.iiifinfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IiifProfile extends js.Object {
  
  var formats: js.UndefOr[js.Array[String]] = js.native
  
  var maxArea: js.UndefOr[Double] = js.native
  
  var maxHeight: js.UndefOr[Double] = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var qualities: js.UndefOr[js.Array[String]] = js.native
  
  var supports: js.UndefOr[js.Array[String]] = js.native
}
object IiifProfile {
  
  @scala.inline
  def apply(): IiifProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IiifProfile]
  }
  
  @scala.inline
  implicit class IiifProfileOps[Self <: IiifProfile] (val x: Self) extends AnyVal {
    
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
    def setFormatsVarargs(value: String*): Self = this.set("formats", js.Array(value :_*))
    
    @scala.inline
    def setFormats(value: js.Array[String]): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormats: Self = this.set("formats", js.undefined)
    
    @scala.inline
    def setMaxArea(value: Double): Self = this.set("maxArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxArea: Self = this.set("maxArea", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeight: Self = this.set("maxHeight", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setQualitiesVarargs(value: String*): Self = this.set("qualities", js.Array(value :_*))
    
    @scala.inline
    def setQualities(value: js.Array[String]): Self = this.set("qualities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualities: Self = this.set("qualities", js.undefined)
    
    @scala.inline
    def setSupportsVarargs(value: String*): Self = this.set("supports", js.Array(value :_*))
    
    @scala.inline
    def setSupports(value: js.Array[String]): Self = this.set("supports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupports: Self = this.set("supports", js.undefined)
  }
}
