package typings
package opentypeDotJsLib.opentypeDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends js.Object {
  var features: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]] = js.undefined
  var kerning: js.UndefOr[scala.Boolean] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var script: js.UndefOr[java.lang.String] = js.undefined
  var xScale: js.UndefOr[scala.Double] = js.undefined
  var yScale: js.UndefOr[scala.Double] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    features: org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    kerning: js.UndefOr[scala.Boolean] = js.undefined,
    language: java.lang.String = null,
    script: java.lang.String = null,
    xScale: scala.Int | scala.Double = null,
    yScale: scala.Int | scala.Double = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (!js.isUndefined(kerning)) __obj.updateDynamic("kerning")(kerning)
    if (language != null) __obj.updateDynamic("language")(language)
    if (script != null) __obj.updateDynamic("script")(script)
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderOptions]
  }
}

