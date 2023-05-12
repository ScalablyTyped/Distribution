package typings.officeJsPreview.Excel

import typings.officeJsPreview.Excel.EntityCardLayoutType.entity
import typings.officeJsPreview.officeJsPreviewStrings.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a card layout that is best used for an array.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait EntityCardLayout
  extends StObject
     with CardLayoutStandardProperties
     with CardLayout {
  
  /**
    * Represents the type of this layout.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var layout: js.UndefOr[entity | Entity] = js.undefined
}
object EntityCardLayout {
  
  inline def apply(): EntityCardLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityCardLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityCardLayout] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: entity | Entity): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
