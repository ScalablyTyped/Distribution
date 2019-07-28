package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the properties for a region map chart.
  *
  * [Api set: ExcelApi 1.9]
  */
trait ChartMapOptionsLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the series map labels strategy of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the series mapping level of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the series projection type of a region map chart. Read/Write.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[Boolean] = js.undefined
}

object ChartMapOptionsLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    labelStrategy: js.UndefOr[Boolean] = js.undefined,
    level: js.UndefOr[Boolean] = js.undefined,
    projectionType: js.UndefOr[Boolean] = js.undefined
  ): ChartMapOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(labelStrategy)) __obj.updateDynamic("labelStrategy")(labelStrategy)
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level)
    if (!js.isUndefined(projectionType)) __obj.updateDynamic("projectionType")(projectionType)
    __obj.asInstanceOf[ChartMapOptionsLoadOptions]
  }
}

