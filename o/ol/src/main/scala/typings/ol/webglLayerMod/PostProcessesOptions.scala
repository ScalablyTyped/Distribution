package typings.ol.webglLayerMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.helperMod.UniformValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostProcessesOptions extends js.Object {
  var fragmentShader: js.UndefOr[String] = js.native
  var scaleRatio: js.UndefOr[Double] = js.native
  var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.native
  var vertexShader: js.UndefOr[String] = js.native
}

object PostProcessesOptions {
  @scala.inline
  def apply(): PostProcessesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostProcessesOptions]
  }
  @scala.inline
  implicit class PostProcessesOptionsOps[Self <: PostProcessesOptions] (val x: Self) extends AnyVal {
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
    def deleteFragmentShader: Self = this.set("fragmentShader", js.undefined)
    @scala.inline
    def setScaleRatio(value: Double): Self = this.set("scaleRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleRatio: Self = this.set("scaleRatio", js.undefined)
    @scala.inline
    def setUniforms(value: StringDictionary[UniformValue]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
    @scala.inline
    def setVertexShader(value: String): Self = this.set("vertexShader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexShader: Self = this.set("vertexShader", js.undefined)
  }
  
}

