package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the layout of a section of a card in card view.
  *
  * @remarks
  * [Api set: ExcelApi BETA (PREVIEW ONLY)]
  * @beta
  */
/* Rewritten from type alias, can be one of: 
  - typings.officeJsPreview.Excel.CardLayoutListSection
  - typings.officeJsPreview.Excel.CardLayoutTableSection
*/
trait CardLayoutSection extends StObject
object CardLayoutSection {
  
  inline def CardLayoutListSection(properties: js.Array[String]): typings.officeJsPreview.Excel.CardLayoutListSection = {
    val __obj = js.Dynamic.literal(layout = "List", properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJsPreview.Excel.CardLayoutListSection]
  }
  
  inline def CardLayoutTableSection(properties: js.Array[String]): typings.officeJsPreview.Excel.CardLayoutTableSection = {
    val __obj = js.Dynamic.literal(layout = "Table", properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.officeJsPreview.Excel.CardLayoutTableSection]
  }
}
