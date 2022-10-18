package typings.officeJs.Excel

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
  var layout: typings.officeJs.officeJsStrings.Table
}
object CardLayoutTableSection {
  
  inline def apply(properties: js.Array[String]): CardLayoutTableSection = {
    val __obj = js.Dynamic.literal(layout = "Table", properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardLayoutTableSection]
  }
  
  extension [Self <: CardLayoutTableSection](x: Self) {
    
    inline def setLayout(value: typings.officeJs.officeJsStrings.Table): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
