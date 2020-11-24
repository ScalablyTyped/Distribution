package typings.pixiJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chars extends js.Object {
  
  var chars: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  var padding: js.UndefOr[Double] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var textureHeight: js.UndefOr[Double] = js.native
  
  var textureWidth: js.UndefOr[Double] = js.native
}
object Chars {
  
  @scala.inline
  def apply(): Chars = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chars]
  }
  
  @scala.inline
  implicit class CharsOps[Self <: Chars] (val x: Self) extends AnyVal {
    
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
    def setCharsVarargs(value: (js.Array[String] | String)*): Self = this.set("chars", js.Array(value :_*))
    
    @scala.inline
    def setChars(value: String | (js.Array[js.Array[String] | String])): Self = this.set("chars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChars: Self = this.set("chars", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setTextureHeight(value: Double): Self = this.set("textureHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureHeight: Self = this.set("textureHeight", js.undefined)
    
    @scala.inline
    def setTextureWidth(value: Double): Self = this.set("textureWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextureWidth: Self = this.set("textureWidth", js.undefined)
  }
}
