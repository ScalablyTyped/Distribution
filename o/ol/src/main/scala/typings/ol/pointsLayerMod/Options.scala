package typings.ol.pointsLayerMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.helperMod.UniformValue
import typings.ol.webglLayerMod.PostProcessesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var attributes: js.UndefOr[js.Array[CustomAttribute]] = js.undefined
  var fragmentShader: String
  var hitFragmentShader: js.UndefOr[String] = js.undefined
  var hitVertexShader: js.UndefOr[String] = js.undefined
  var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
  var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
  var vertexShader: String
}

object Options {
  @scala.inline
  def apply(
    fragmentShader: String,
    vertexShader: String,
    attributes: js.Array[CustomAttribute] = null,
    hitFragmentShader: String = null,
    hitVertexShader: String = null,
    postProcesses: js.Array[PostProcessesOptions] = null,
    uniforms: StringDictionary[UniformValue] = null
  ): Options = {
    val __obj = js.Dynamic.literal(fragmentShader = fragmentShader.asInstanceOf[js.Any], vertexShader = vertexShader.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (hitFragmentShader != null) __obj.updateDynamic("hitFragmentShader")(hitFragmentShader.asInstanceOf[js.Any])
    if (hitVertexShader != null) __obj.updateDynamic("hitVertexShader")(hitVertexShader.asInstanceOf[js.Any])
    if (postProcesses != null) __obj.updateDynamic("postProcesses")(postProcesses.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

