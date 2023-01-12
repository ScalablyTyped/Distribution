package typings.officeJsPreview.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an Office.js binding that is defined in the workbook.
  *
  * @remarks
  * [Api set: ExcelApi 1.1]
  */
trait BindingLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents the binding identifier.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns the type of the binding. See `Excel.BindingType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object BindingLoadOptions {
  
  inline def apply(): BindingLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindingLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
