package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a collection of linked workbook objects.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
trait LinkedWorkbookCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: The original URL pointing to the linked workbook. It is unique across all linked workbooks in the collection.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
}
object LinkedWorkbookCollectionLoadOptions {
  
  inline def apply(): LinkedWorkbookCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedWorkbookCollectionLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedWorkbookCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
