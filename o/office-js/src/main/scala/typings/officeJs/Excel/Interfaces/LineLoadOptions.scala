package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a line inside a worksheet. To get the corresponding Shape object, use `Line.shape`.
  *
  * [Api set: ExcelApi 1.9]
  */
@js.native
trait LineLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the length of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadLength: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the style of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width of the arrowhead at the beginning of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginArrowheadWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the shape to which the beginning of the specified line is attached.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedShape: js.UndefOr[ShapeLoadOptions] = js.native
  /**
    *
    * Represents the connection site to which the beginning of a connector is connected. Returns null when the beginning of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var beginConnectedSite: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the connector type for the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var connectorType: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the length of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadLength: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the style of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadStyle: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width of the arrowhead at the end of the specified line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endArrowheadWidth: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the shape to which the end of the specified line is attached.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedShape: js.UndefOr[ShapeLoadOptions] = js.native
  /**
    *
    * Represents the connection site to which the end of a connector is connected. Returns null when the end of the line is not attached to any shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var endConnectedSite: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the shape identifier.
    *
    * [Api set: ExcelApi 1.9]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the beginning of the specified line is connected to a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isBeginConnected: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies if the end of the specified line is connected to a shape.
    *
    * [Api set: ExcelApi 1.9]
    */
  var isEndConnected: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns the Shape object associated with the line.
    *
    * [Api set: ExcelApi 1.9]
    */
  var shape: js.UndefOr[ShapeLoadOptions] = js.native
}

object LineLoadOptions {
  @scala.inline
  def apply(): LineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineLoadOptions]
  }
  @scala.inline
  implicit class LineLoadOptionsOps[Self <: LineLoadOptions] (val x: Self) extends AnyVal {
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
    def setBeginArrowheadLength(value: Boolean): Self = this.set("beginArrowheadLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginArrowheadLength: Self = this.set("beginArrowheadLength", js.undefined)
    @scala.inline
    def setBeginArrowheadStyle(value: Boolean): Self = this.set("beginArrowheadStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginArrowheadStyle: Self = this.set("beginArrowheadStyle", js.undefined)
    @scala.inline
    def setBeginArrowheadWidth(value: Boolean): Self = this.set("beginArrowheadWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginArrowheadWidth: Self = this.set("beginArrowheadWidth", js.undefined)
    @scala.inline
    def setBeginConnectedShape(value: ShapeLoadOptions): Self = this.set("beginConnectedShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginConnectedShape: Self = this.set("beginConnectedShape", js.undefined)
    @scala.inline
    def setBeginConnectedSite(value: Boolean): Self = this.set("beginConnectedSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeginConnectedSite: Self = this.set("beginConnectedSite", js.undefined)
    @scala.inline
    def setConnectorType(value: Boolean): Self = this.set("connectorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectorType: Self = this.set("connectorType", js.undefined)
    @scala.inline
    def setEndArrowheadLength(value: Boolean): Self = this.set("endArrowheadLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndArrowheadLength: Self = this.set("endArrowheadLength", js.undefined)
    @scala.inline
    def setEndArrowheadStyle(value: Boolean): Self = this.set("endArrowheadStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndArrowheadStyle: Self = this.set("endArrowheadStyle", js.undefined)
    @scala.inline
    def setEndArrowheadWidth(value: Boolean): Self = this.set("endArrowheadWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndArrowheadWidth: Self = this.set("endArrowheadWidth", js.undefined)
    @scala.inline
    def setEndConnectedShape(value: ShapeLoadOptions): Self = this.set("endConnectedShape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndConnectedShape: Self = this.set("endConnectedShape", js.undefined)
    @scala.inline
    def setEndConnectedSite(value: Boolean): Self = this.set("endConnectedSite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndConnectedSite: Self = this.set("endConnectedSite", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsBeginConnected(value: Boolean): Self = this.set("isBeginConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsBeginConnected: Self = this.set("isBeginConnected", js.undefined)
    @scala.inline
    def setIsEndConnected(value: Boolean): Self = this.set("isEndConnected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEndConnected: Self = this.set("isEndConnected", js.undefined)
    @scala.inline
    def setShape(value: ShapeLoadOptions): Self = this.set("shape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
  }
  
}

