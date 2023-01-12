package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the NamedItem object, for use in `namedItem.set({ ... })`. */
trait NamedItemUpdateData extends StObject {
  
  /**
    * Specifies the comment associated with this name.
    *
    * @remarks
    * [Api set: ExcelApi 1.4]
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * The formula of the named item. Formulas always start with an equal sign ("=").
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var formula: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies if the object is visible.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object NamedItemUpdateData {
  
  inline def apply(): NamedItemUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedItemUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NamedItemUpdateData] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setFormula(value: Any): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
