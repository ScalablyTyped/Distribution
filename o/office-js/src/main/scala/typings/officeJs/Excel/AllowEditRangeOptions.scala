package typings.officeJs.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface used to construct optional fields of the `AllowEditRange` object.
  *
  * @remarks
  * [Api set: ExcelApiOnline 1.1]
  */
trait AllowEditRangeOptions extends StObject {
  
  /**
    * The password associated with the `AllowEditRange`.
    *
    * @remarks
    * [Api set: ExcelApiOnline 1.1]
    */
  var password: js.UndefOr[String] = js.undefined
}
object AllowEditRangeOptions {
  
  inline def apply(): AllowEditRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowEditRangeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowEditRangeOptions] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
  }
}
