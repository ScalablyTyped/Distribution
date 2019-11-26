package typings.officeDashJsDashPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for how to insert data to the selection.
  */
trait SetSelectedDataOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
    * Use only with binding type table and when a TableData object is passed for the data parameter. An array of objects that specify a range of 
    * columns, rows, or cells and specify, as key-value pairs, the cell formatting to apply to that range. 
    * 
    * Example: `[{cells: Office.Table.Data, format: {fontColor: "yellow"}}, {cells: {row: 3, column: 4}, format: {borderColor: "white", fontStyle: "bold"}}]`
    */
  var cellFormat: js.UndefOr[js.Array[RangeFormatConfiguration]] = js.undefined
  /**
    * Explicitly sets the shape of the data object. If not supplied is inferred from the data type.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.undefined
  /**
    * This option is applicable for inserting images. Indicates the image height. If this option is provided without the imageWidth, the image 
    * will scale to match the value of the image height. If both image width and image height are provided, the image will be resized accordingly. 
    * If neither the image height or width is provided, the default image size and aspect ratio will be used. This value is in points.
    */
  var imageHeight: js.UndefOr[Double] = js.undefined
  /**
    * This option is applicable for inserting images. Indicates the insert location in relation to the left side of the slide for PowerPoint, and 
    * its relation to the currently selected cell in Excel. This value is ignored for Word. This value is in points.
    */
  var imageLeft: js.UndefOr[Double] = js.undefined
  /**
    * This option is applicable for inserting images. Indicates the insert location in relation to the top of the slide for PowerPoint, and its 
    * relation to the currently selected cell in Excel. This value is ignored for Word. This value is in points.
    */
  var imageTop: js.UndefOr[Double] = js.undefined
  /**
    * This option is applicable for inserting images. Indicates the image width. If this option is provided without the imageHeight, the image 
    * will scale to match the value of the image width. If both image width and image height are provided, the image will be resized accordingly. 
    * If neither the image height or width is provided, the default image size and aspect ratio will be used. This value is in points.
    */
  var imageWidth: js.UndefOr[Double] = js.undefined
  /**
    * For an inserted table, a list of key-value pairs that specify table formatting options, such as header row, total row, and banded rows. 
    * Example: `{bandedRows: true,  filterButton: false}`
    */
  var tableOptions: js.UndefOr[js.Object] = js.undefined
}

object SetSelectedDataOptions {
  @scala.inline
  def apply(
    asyncContext: js.Any = null,
    cellFormat: js.Array[RangeFormatConfiguration] = null,
    coercionType: CoercionType | String = null,
    imageHeight: Int | Double = null,
    imageLeft: Int | Double = null,
    imageTop: Int | Double = null,
    imageWidth: Int | Double = null,
    tableOptions: js.Object = null
  ): SetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext.asInstanceOf[js.Any])
    if (cellFormat != null) __obj.updateDynamic("cellFormat")(cellFormat.asInstanceOf[js.Any])
    if (coercionType != null) __obj.updateDynamic("coercionType")(coercionType.asInstanceOf[js.Any])
    if (imageHeight != null) __obj.updateDynamic("imageHeight")(imageHeight.asInstanceOf[js.Any])
    if (imageLeft != null) __obj.updateDynamic("imageLeft")(imageLeft.asInstanceOf[js.Any])
    if (imageTop != null) __obj.updateDynamic("imageTop")(imageTop.asInstanceOf[js.Any])
    if (imageWidth != null) __obj.updateDynamic("imageWidth")(imageWidth.asInstanceOf[js.Any])
    if (tableOptions != null) __obj.updateDynamic("tableOptions")(tableOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSelectedDataOptions]
  }
}

