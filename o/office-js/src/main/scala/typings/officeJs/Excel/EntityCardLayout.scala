package typings.officeJs.Excel

import typings.officeJs.officeJsStrings.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a card layout best used for an entity.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait EntityCardLayout
  extends StObject
     with CardLayoutStandardProperties {
  
  /**
    * Represents the type of this layout.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var layout: js.UndefOr[Entity] = js.undefined
}
object EntityCardLayout {
  
  inline def apply(): EntityCardLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityCardLayout]
  }
  
  extension [Self <: EntityCardLayout](x: Self) {
    
    inline def setLayout(value: Entity): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
