package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the properties for Map chart.
  *
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ChartMapOptionsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var labelStrategy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets series map area of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var level: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * Returns or sets series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var projectionType: js.UndefOr[scala.Boolean] = js.undefined
}

object ChartMapOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    labelStrategy: js.UndefOr[scala.Boolean] = js.undefined,
    level: js.UndefOr[scala.Boolean] = js.undefined,
    projectionType: js.UndefOr[scala.Boolean] = js.undefined
  ): ChartMapOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(labelStrategy)) __obj.updateDynamic("labelStrategy")(labelStrategy)
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(projectionType)) __obj.updateDynamic("projectionType")(projectionType)
    __obj.asInstanceOf[ChartMapOptionsLoadOptions]
  }
}

