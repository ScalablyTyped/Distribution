package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.EntityCardLayoutType.array
import typings.officeJsPreview.officeJsPreviewStrings.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the layout of a card in card view.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
/* Rewritten from type alias, can be one of: 
  - typings.officeJsPreview.Excel.EntityCardLayout
  - typings.officeJsPreview.Excel.EntityArrayCardLayout
*/
trait CardLayout extends StObject
object CardLayout {
  
  inline def EntityArrayCardLayout(arrayProperty: String, layout: array | Array): typings.officeJsPreview.Excel.EntityArrayCardLayout = {
    val __obj = js.Dynamic.literal(arrayProperty = arrayProperty.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJsPreview.Excel.EntityArrayCardLayout]
  }
  
  inline def EntityCardLayout(): typings.officeJsPreview.Excel.EntityCardLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.officeJsPreview.Excel.EntityCardLayout]
  }
}
