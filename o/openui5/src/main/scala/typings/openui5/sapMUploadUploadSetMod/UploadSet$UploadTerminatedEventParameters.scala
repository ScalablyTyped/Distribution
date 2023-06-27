package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$UploadTerminatedEventParameters extends StObject {
  
  /**
    * The file whose upload has just been terminated.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$UploadTerminatedEventParameters {
  
  inline def apply(): UploadSet$UploadTerminatedEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$UploadTerminatedEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$UploadTerminatedEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
