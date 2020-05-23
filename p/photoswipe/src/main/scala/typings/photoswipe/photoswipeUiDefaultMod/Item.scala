package typings.photoswipe.photoswipeUiDefaultMod

import typings.photoswipe.anon.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Item
  extends typings.photoswipe.mod.Item {
  /**
    * The caption for this item.
    */
  var title: js.UndefOr[String] = js.undefined
}

object Item {
  @scala.inline
  def apply(
    bounds: js.Any = null,
    fitRatio: js.UndefOr[Double] = js.undefined,
    h: js.UndefOr[Double] = js.undefined,
    html: String = null,
    initialPosition: js.Any = null,
    initialZoomLevel: js.UndefOr[Double] = js.undefined,
    loadError: js.UndefOr[Boolean] = js.undefined,
    msrc: String = null,
    src: String = null,
    title: String = null,
    vGap: Top = null,
    w: js.UndefOr[Double] = js.undefined
  ): Item = {
    val __obj = js.Dynamic.literal()
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(fitRatio)) __obj.updateDynamic("fitRatio")(fitRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (initialPosition != null) __obj.updateDynamic("initialPosition")(initialPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(initialZoomLevel)) __obj.updateDynamic("initialZoomLevel")(initialZoomLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loadError)) __obj.updateDynamic("loadError")(loadError.get.asInstanceOf[js.Any])
    if (msrc != null) __obj.updateDynamic("msrc")(msrc.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (vGap != null) __obj.updateDynamic("vGap")(vGap.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
}

