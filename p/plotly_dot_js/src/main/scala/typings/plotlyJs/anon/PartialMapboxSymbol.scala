package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.`bottom center`
import typings.plotlyJs.plotlyJsStrings.`bottom left`
import typings.plotlyJs.plotlyJsStrings.`bottom right`
import typings.plotlyJs.plotlyJsStrings.`line-center`
import typings.plotlyJs.plotlyJsStrings.`middle center`
import typings.plotlyJs.plotlyJsStrings.`top center`
import typings.plotlyJs.plotlyJsStrings.`top left`
import typings.plotlyJs.plotlyJsStrings.`top right`
import typings.plotlyJs.plotlyJsStrings.line
import typings.plotlyJs.plotlyJsStrings.point
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<plotly.js.plotly.js.MapboxSymbol> */
trait PartialMapboxSymbol extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var iconsize: js.UndefOr[Double] = js.undefined
  var placement: js.UndefOr[point | line | `line-center`] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var textfont: js.UndefOr[Partial[typings.plotlyJs.mod.Font]] = js.undefined
  var textposition: js.UndefOr[
    (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`)
  ] = js.undefined
}

object PartialMapboxSymbol {
  @scala.inline
  def apply(
    icon: String = null,
    iconsize: js.UndefOr[Double] = js.undefined,
    placement: point | line | `line-center` = null,
    text: String = null,
    textfont: Partial[typings.plotlyJs.mod.Font] = null,
    textposition: (`top left`) | (`top center`) | (`top right`) | (`middle center`) | (`bottom left`) | (`bottom center`) | (`bottom right`) = null
  ): PartialMapboxSymbol = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(iconsize)) __obj.updateDynamic("iconsize")(iconsize.get.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textfont != null) __obj.updateDynamic("textfont")(textfont.asInstanceOf[js.Any])
    if (textposition != null) __obj.updateDynamic("textposition")(textposition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialMapboxSymbol]
  }
}

