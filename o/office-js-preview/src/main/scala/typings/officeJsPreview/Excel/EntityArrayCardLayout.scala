package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.EntityCardLayoutType.array
import typings.officeJsPreview.officeJsPreviewStrings.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a card layout that is best used for an array.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait EntityArrayCardLayout
  extends StObject
     with CardLayout {
  
  /**
    * Represents name of the property that contains the array shown in the card.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var arrayProperty: String
  
  /**
    * Represents the count of columns which the card claims are in the array. A card may report a different number of columns than it actually has to display smaller amounts of preview data.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var columnsToReport: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents name of the property that contains the array shown in the card. Default value is "Array".
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Represents whether the first row of the array is treated as a header.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var firstRowIsHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the type of this layout.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var layout: array | Array
  
  /**
    * Represents the count of rows which the card claims are in the array. A card may report a different number of rows than it actually has to display smaller amounts of preview data.
    *
    * @remarks
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var rowsToReport: js.UndefOr[Double] = js.undefined
}
object EntityArrayCardLayout {
  
  inline def apply(arrayProperty: String, layout: array | Array): EntityArrayCardLayout = {
    val __obj = js.Dynamic.literal(arrayProperty = arrayProperty.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityArrayCardLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityArrayCardLayout] (val x: Self) extends AnyVal {
    
    inline def setArrayProperty(value: String): Self = StObject.set(x, "arrayProperty", value.asInstanceOf[js.Any])
    
    inline def setColumnsToReport(value: Double): Self = StObject.set(x, "columnsToReport", value.asInstanceOf[js.Any])
    
    inline def setColumnsToReportUndefined: Self = StObject.set(x, "columnsToReport", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFirstRowIsHeader(value: Boolean): Self = StObject.set(x, "firstRowIsHeader", value.asInstanceOf[js.Any])
    
    inline def setFirstRowIsHeaderUndefined: Self = StObject.set(x, "firstRowIsHeader", js.undefined)
    
    inline def setLayout(value: array | Array): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setRowsToReport(value: Double): Self = StObject.set(x, "rowsToReport", value.asInstanceOf[js.Any])
    
    inline def setRowsToReportUndefined: Self = StObject.set(x, "rowsToReport", js.undefined)
  }
}
