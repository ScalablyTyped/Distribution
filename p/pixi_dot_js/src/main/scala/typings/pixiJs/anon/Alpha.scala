package typings.pixiJs.anon

import typings.pixiJs.PIXI.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alpha extends js.Object {
  
  var alpha: js.UndefOr[Double] = js.native
  
  var pluginName: js.UndefOr[String] = js.native
  
  var program: js.UndefOr[Program] = js.native
  
  var tint: js.UndefOr[Double] = js.native
  
  var uniforms: js.UndefOr[js.Any] = js.native
}
object Alpha {
  
  @scala.inline
  def apply(): Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Alpha]
  }
  
  @scala.inline
  implicit class AlphaOps[Self <: Alpha] (val x: Self) extends AnyVal {
    
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
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setPluginName(value: String): Self = this.set("pluginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluginName: Self = this.set("pluginName", js.undefined)
    
    @scala.inline
    def setProgram(value: Program): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setTint(value: Double): Self = this.set("tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTint: Self = this.set("tint", js.undefined)
    
    @scala.inline
    def setUniforms(value: js.Any): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
  }
}
