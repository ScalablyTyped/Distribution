package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Encapsulates the properties for a region map chart.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait ChartMapOptionsLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the series map labels strategy of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var labelStrategy: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the series mapping level of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var level: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the series projection type of a region map chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var projectionType: js.UndefOr[Boolean] = js.native
}

object ChartMapOptionsLoadOptions {
  @scala.inline
  def apply(): ChartMapOptionsLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMapOptionsLoadOptions]
  }
  @scala.inline
  implicit class ChartMapOptionsLoadOptionsOps[Self <: ChartMapOptionsLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setLabelStrategy(value: Boolean): Self = this.set("labelStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelStrategy: Self = this.set("labelStrategy", js.undefined)
    @scala.inline
    def setLevel(value: Boolean): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setProjectionType(value: Boolean): Self = this.set("projectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectionType: Self = this.set("projectionType", js.undefined)
  }
  
}

