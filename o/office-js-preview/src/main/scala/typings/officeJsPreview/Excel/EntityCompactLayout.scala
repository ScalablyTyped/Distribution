package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The compact layout properties for an entity.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait EntityCompactLayout extends StObject {
  
  /**
    * Specifies the name of the icon which is used to open the card.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var icon: js.UndefOr[String | EntityCompactLayoutIcons] = js.undefined
}
object EntityCompactLayout {
  
  inline def apply(): EntityCompactLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityCompactLayout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityCompactLayout] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String | EntityCompactLayoutIcons): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
