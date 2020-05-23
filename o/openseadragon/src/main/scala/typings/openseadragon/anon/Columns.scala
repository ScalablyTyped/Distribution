package typings.openseadragon.anon

import typings.openseadragon.openseadragonStrings.horizontal
import typings.openseadragon.openseadragonStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columns extends js.Object {
  var columns: js.UndefOr[Double] = js.undefined
  var immediately: js.UndefOr[Boolean] = js.undefined
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var tileMargin: js.UndefOr[Double] = js.undefined
  var tileSize: js.UndefOr[Double] = js.undefined
}

object Columns {
  @scala.inline
  def apply(
    columns: js.UndefOr[Double] = js.undefined,
    immediately: js.UndefOr[Boolean] = js.undefined,
    layout: horizontal | vertical = null,
    rows: js.UndefOr[Double] = js.undefined,
    tileMargin: js.UndefOr[Double] = js.undefined,
    tileSize: js.UndefOr[Double] = js.undefined
  ): Columns = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immediately)) __obj.updateDynamic("immediately")(immediately.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileMargin)) __obj.updateDynamic("tileMargin")(tileMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tileSize)) __obj.updateDynamic("tileSize")(tileSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columns]
  }
}

