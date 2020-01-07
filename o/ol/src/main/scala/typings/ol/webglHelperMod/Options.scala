package typings.ol.webglHelperMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var postProcesses: js.UndefOr[js.Array[PostProcessesOptions]] = js.undefined
  var uniforms: js.UndefOr[StringDictionary[UniformValue]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    postProcesses: js.Array[PostProcessesOptions] = null,
    uniforms: StringDictionary[UniformValue] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (postProcesses != null) __obj.updateDynamic("postProcesses")(postProcesses.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

