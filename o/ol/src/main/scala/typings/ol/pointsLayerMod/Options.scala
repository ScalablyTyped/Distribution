package typings.ol.pointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.helperMod.UniformValue
import typings.ol.webglLayerMod.PostProcessesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var attributes: js.UndefOr[js.Array[CustomAttribute]] = js.native
  var fragmentShader: String = js.native
  var hitFragmentShader: js.UndefOr[String] = js.native
  var hitVertexShader: js.UndefOr[String] = js.native
  var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.native
  var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
  var vertexShader: String = js.native
}

object Options {
  @scala.inline
  def apply(fragmentShader: String, vertexShader: String): Options = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFragmentShader(value: String): Self = this.set("fragmentShader", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertexShader(value: String): Self = this.set("vertexShader", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributesVarargs(value: CustomAttribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[CustomAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setHitFragmentShader(value: String): Self = this.set("hitFragmentShader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitFragmentShader: Self = this.set("hitFragmentShader", js.undefined)
    @scala.inline
    def setHitVertexShader(value: String): Self = this.set("hitVertexShader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitVertexShader: Self = this.set("hitVertexShader", js.undefined)
    @scala.inline
    def setPostProcessesVarargs(value: PostProcessesOptions*): Self = this.set("postProcesses", js.Array(value :_*))
    @scala.inline
    def setPostProcesses(value: js.Array[PostProcessesOptions]): Self = this.set("postProcesses", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostProcesses: Self = this.set("postProcesses", js.undefined)
    @scala.inline
    def setUniforms(value: StringDictionary[UniformValue]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
  }
  
}

