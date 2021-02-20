package typings.pixiJs.anon

import typings.pixiJs.PIXI.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alpha extends StObject {
  
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
  implicit class AlphaMutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    @scala.inline
    def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
    
    @scala.inline
    def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    @scala.inline
    def setTint(value: Double): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTintUndefined: Self = StObject.set(x, "tint", js.undefined)
    
    @scala.inline
    def setUniforms(value: js.Any): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
  }
}
