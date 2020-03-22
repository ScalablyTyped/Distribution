package typings.pixiJs

import typings.pixiJs.PIXI.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPluginName extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var pluginName: js.UndefOr[String] = js.undefined
  var program: js.UndefOr[Program] = js.undefined
  var tint: js.UndefOr[Double] = js.undefined
  var uniforms: js.UndefOr[js.Any] = js.undefined
}

object AnonPluginName {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    pluginName: String = null,
    program: Program = null,
    tint: Int | Double = null,
    uniforms: js.Any = null
  ): AnonPluginName = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (pluginName != null) __obj.updateDynamic("pluginName")(pluginName.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (tint != null) __obj.updateDynamic("tint")(tint.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPluginName]
  }
}

