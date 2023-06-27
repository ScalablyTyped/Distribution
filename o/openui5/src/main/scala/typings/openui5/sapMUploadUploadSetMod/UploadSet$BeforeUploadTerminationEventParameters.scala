package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$BeforeUploadTerminationEventParameters extends StObject {
  
  /**
    * The file whose upload is about to be terminated.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$BeforeUploadTerminationEventParameters {
  
  inline def apply(): UploadSet$BeforeUploadTerminationEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$BeforeUploadTerminationEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$BeforeUploadTerminationEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
