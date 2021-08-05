package typings.officeJsPreview.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides options for how to insert data to the selection.
  */
trait SetSelectedDataOptions extends StObject {
  
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
  
  inline def apply(): SetSelectedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSelectedDataOptions]
  }
  
  extension [Self <: SetSelectedDataOptions](x: Self) {
    
    inline def setAsyncContext(value: js.Any): Self = StObject.set(x, "asyncContext", value.asInstanceOf[js.Any])
    
    inline def setAsyncContextUndefined: Self = StObject.set(x, "asyncContext", js.undefined)
    
    inline def setCellFormat(value: js.Array[RangeFormatConfiguration]): Self = StObject.set(x, "cellFormat", value.asInstanceOf[js.Any])
    
    inline def setCellFormatUndefined: Self = StObject.set(x, "cellFormat", js.undefined)
    
    inline def setCellFormatVarargs(value: RangeFormatConfiguration*): Self = StObject.set(x, "cellFormat", js.Array(value :_*))
    
    inline def setCoercionType(value: CoercionType | String): Self = StObject.set(x, "coercionType", value.asInstanceOf[js.Any])
    
    inline def setCoercionTypeUndefined: Self = StObject.set(x, "coercionType", js.undefined)
    
    inline def setImageHeight(value: Double): Self = StObject.set(x, "imageHeight", value.asInstanceOf[js.Any])
    
    inline def setImageHeightUndefined: Self = StObject.set(x, "imageHeight", js.undefined)
    
    inline def setImageLeft(value: Double): Self = StObject.set(x, "imageLeft", value.asInstanceOf[js.Any])
    
    inline def setImageLeftUndefined: Self = StObject.set(x, "imageLeft", js.undefined)
    
    inline def setImageTop(value: Double): Self = StObject.set(x, "imageTop", value.asInstanceOf[js.Any])
    
    inline def setImageTopUndefined: Self = StObject.set(x, "imageTop", js.undefined)
    
    inline def setImageWidth(value: Double): Self = StObject.set(x, "imageWidth", value.asInstanceOf[js.Any])
    
    inline def setImageWidthUndefined: Self = StObject.set(x, "imageWidth", js.undefined)
    
    inline def setTableOptions(value: js.Object): Self = StObject.set(x, "tableOptions", value.asInstanceOf[js.Any])
    
    inline def setTableOptionsUndefined: Self = StObject.set(x, "tableOptions", js.undefined)
  }
}
