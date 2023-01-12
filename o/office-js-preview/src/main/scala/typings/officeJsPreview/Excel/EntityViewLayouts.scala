package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents layout information for various views of the entity.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait EntityViewLayouts extends StObject {
  
  /**
    * Represents the layout of this entity in card view.
    * If the `CardLayout` object does not have a layout property, it is assumed to be "Entity".
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var card: js.UndefOr[CardLayout] = js.undefined
  
  /**
    * Represents the layout used when there is limited space to represent the entity.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var compact: js.UndefOr[CompactLayout] = js.undefined
}
object EntityViewLayouts {
  
  inline def apply(): EntityViewLayouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityViewLayouts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityViewLayouts] (val x: Self) extends AnyVal {
    
    inline def setCard(value: CardLayout): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardUndefined: Self = StObject.set(x, "card", js.undefined)
    
    inline def setCompact(value: CompactLayout): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    inline def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
  }
}
