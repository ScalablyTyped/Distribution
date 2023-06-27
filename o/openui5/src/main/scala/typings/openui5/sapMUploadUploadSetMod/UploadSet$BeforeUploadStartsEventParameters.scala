package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$BeforeUploadStartsEventParameters extends StObject {
  
  /**
    * The file whose upload is just about to start.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$BeforeUploadStartsEventParameters {
  
  inline def apply(): UploadSet$BeforeUploadStartsEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$BeforeUploadStartsEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$BeforeUploadStartsEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
