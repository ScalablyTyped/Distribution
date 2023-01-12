package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a string reference of the form "SheetName!A1:B5", or a global or local named range.
  *
  * @remarks
  * [Api set: ExcelApi 1.2]
  */
trait RangeReference extends StObject {
  
  /**
    * The address of the range, for example "SheetName!A1:B5".
    *
    * @remarks
    * [Api set: ExcelApi 1.2]
    */
  var address: String
}
object RangeReference {
  
  inline def apply(address: String): RangeReference = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangeReference] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
  }
}
