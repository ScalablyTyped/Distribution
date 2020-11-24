package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for how to insert data to the selection.
  */
@js.native
trait SetSelectedDataOptions extends js.Object {
  
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  
  /**
    * Use only with binding type table and when a TableData object is passed for the data parameter. An array of objects that specify a range of 
    * columns, rows, or cells and specify, as key-value pairs, the cell formatting to apply to that range. 
    * 
    * Example: `[{cells: Office.Table.Data, format: {fontColor: "yellow"}}, {cells: {row: 3, column: 4}, format: {borderColor: "white", fontStyle: "bold"}}]`
    */
  var cellFormat: js.UndefOr[js.Array[RangeFormatConfiguration]] = js.native
  
  /**
    * Explicitly sets the shape of the data object. If not supplied is inferred from the data type.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.native
  
  /**
    * This option is applicable for inserting images. Indicates the image height. If this option is provided without the imageWidth, the image 
    * will scale to match the value of the image height. If both image width and image height are provided, the image will be resized accordingly. 
    * If neither the image height or width is provided, the default image size and aspect ratio will be used. This value is in points.
    */
  var imageHeight: js.UndefOr[Double] = js.native
  
  /**
    * This option is applicable for inserting images. Indicates the insert location in relation to the left side of the slide for PowerPoint, and 
    * its relation to the currently selected cell in Excel. This value is ignored for Word. This value is in points.
    */
  var imageLeft: js.UndefOr[Double] = js.native
  
  /**
    * This option is applicable for inserting images. Indicates the insert location in relation to the top of the slide for PowerPoint, and its 
    * relation to the currently selected cell in Excel. This value is ignored for Word. This value is in points.
    */
  var imageTop: js.UndefOr[Double] = js.native
  
  /**
    * This option is applicable for inserting images. Indicates the image width. If this option is provided without the imageHeight, the image 
    * will scale to match the value of the image width. If both image width and image height are provided, the image will be resized accordingly. 
    * If neither the image height or width is provided, the default image size and aspect ratio will be used. This value is in points.
    */
  var imageWidth: js.UndefOr[Double] = js.native
  
  /**
    * For an inserted table, a list of key-value pairs that specify table formatting options, such as header row, total row, and banded rows. 
    * Example: `{bandedRows: true,  filterButton: false}`
    */
  var tableOptions: js.UndefOr[js.Object] = js.native
}
object SetSelectedDataOptions {
  
  @scala.inline
  def apply(): SetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSelectedDataOptions]
  }
  
  @scala.inline
  implicit class SetSelectedDataOptionsOps[Self <: SetSelectedDataOptions] (val x: Self) extends AnyVal {
    
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    
    @scala.inline
    def setCellFormatVarargs(value: RangeFormatConfiguration*): Self = this.set("cellFormat", js.Array(value :_*))
    
    @scala.inline
    def setCellFormat(value: js.Array[RangeFormatConfiguration]): Self = this.set("cellFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellFormat: Self = this.set("cellFormat", js.undefined)
    
    @scala.inline
    def setCoercionType(value: CoercionType | String): Self = this.set("coercionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoercionType: Self = this.set("coercionType", js.undefined)
    
    @scala.inline
    def setImageHeight(value: Double): Self = this.set("imageHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageHeight: Self = this.set("imageHeight", js.undefined)
    
    @scala.inline
    def setImageLeft(value: Double): Self = this.set("imageLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageLeft: Self = this.set("imageLeft", js.undefined)
    
    @scala.inline
    def setImageTop(value: Double): Self = this.set("imageTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageTop: Self = this.set("imageTop", js.undefined)
    
    @scala.inline
    def setImageWidth(value: Double): Self = this.set("imageWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageWidth: Self = this.set("imageWidth", js.undefined)
    
    @scala.inline
    def setTableOptions(value: js.Object): Self = this.set("tableOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableOptions: Self = this.set("tableOptions", js.undefined)
  }
}
