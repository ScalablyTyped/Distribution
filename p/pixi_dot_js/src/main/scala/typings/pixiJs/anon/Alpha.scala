package typings.pixiJs.anon

import typings.pixiJs.PIXI.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var pluginName: js.UndefOr[String] = js.undefined
  var program: js.UndefOr[Program] = js.undefined
  var tint: js.UndefOr[Double] = js.undefined
  var uniforms: js.UndefOr[js.Any] = js.undefined
}

object Alpha {
  @scala.inline
  def apply(
    alpha: js.UndefOr[Double] = js.undefined,
    pluginName: String = null,
    program: Program = null,
    tint: js.UndefOr[Double] = js.undefined,
    uniforms: js.Any = null
  ): Alpha = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (pluginName != null) __obj.updateDynamic("pluginName")(pluginName.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (!js.isUndefined(tint)) __obj.updateDynamic("tint")(tint.get.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha]
  }
}

