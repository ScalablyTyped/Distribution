package typings.opentypeJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var features: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var kerning: js.UndefOr[Boolean] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var script: js.UndefOr[String] = js.undefined
  var xScale: js.UndefOr[Double] = js.undefined
  var yScale: js.UndefOr[Double] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    features: StringDictionary[Boolean] = null,
    kerning: js.UndefOr[Boolean] = js.undefined,
    language: String = null,
    script: String = null,
    xScale: Int | Double = null,
    yScale: Int | Double = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (!js.isUndefined(kerning)) __obj.updateDynamic("kerning")(kerning.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

