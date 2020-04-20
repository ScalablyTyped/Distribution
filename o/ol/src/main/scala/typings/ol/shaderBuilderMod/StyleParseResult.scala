package typings.ol.shaderBuilderMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.helperMod.UniformValue
import typings.ol.pointsLayerMod.CustomAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleParseResult extends js.Object {
  var attributes: js.Array[CustomAttribute]
  var builder: ShaderBuilder
  var uniforms: StringDictionary[UniformValue]
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
}

