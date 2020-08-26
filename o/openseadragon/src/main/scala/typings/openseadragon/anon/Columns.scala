package typings.openseadragon.anon

import typings.openseadragon.openseadragonStrings.horizontal
import typings.openseadragon.openseadragonStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Columns extends js.Object {
  var columns: js.UndefOr[Double] = js.native
  var immediately: js.UndefOr[Boolean] = js.native
  var layout: js.UndefOr[horizontal | vertical] = js.native
  var rows: js.UndefOr[Double] = js.native
  var tileMargin: js.UndefOr[Double] = js.native
  var tileSize: js.UndefOr[Double] = js.native
}

object Columns {
  @scala.inline
  def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  @scala.inline
  implicit class ColumnsOps[Self <: Columns] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setImmediately(value: Boolean): Self = this.set("immediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImmediately: Self = this.set("immediately", js.undefined)
    @scala.inline
    def setLayout(value: horizontal | vertical): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setTileMargin(value: Double): Self = this.set("tileMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileMargin: Self = this.set("tileMargin", js.undefined)
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
  }
  
}

