package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a section of a card that is arranged as a table in card view.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CardLayoutTableSection
  extends StObject
     with CardLayoutSectionStandardProperties
     with CardLayoutSection {
  
  /**
    * Represents the type of layout for this section.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var layout: typings.officeJsPreview.officeJsPreviewStrings.Table
}
object CardLayoutTableSection {
  
  inline def apply(properties: js.Array[String]): CardLayoutTableSection = {
    val __obj = js.Dynamic.literal(layout = "Table", properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardLayoutTableSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardLayoutTableSection] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: typings.officeJsPreview.officeJsPreviewStrings.Table): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
