package typings.ol.shaderBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.helperMod.UniformValue
import typings.ol.pointsLayerMod.CustomAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleParseResult extends js.Object {
  
  var attributes: js.Array[CustomAttribute] = js.native
  
  var builder: ShaderBuilder = js.native
  
  var uniforms: StringDictionary[UniformValue] = js.native
}
object StyleParseResult {
  
  @scala.inline
  def apply(
    attributes: js.Array[CustomAttribute],
    builder: ShaderBuilder,
    uniforms: StringDictionary[UniformValue]
  ): StyleParseResult = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], builder = builder.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleParseResult]
  }
  
  @scala.inline
  implicit class StyleParseResultOps[Self <: StyleParseResult] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: CustomAttribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[CustomAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuilder(value: ShaderBuilder): Self = this.set("builder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniforms(value: StringDictionary[UniformValue]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
  }
}
