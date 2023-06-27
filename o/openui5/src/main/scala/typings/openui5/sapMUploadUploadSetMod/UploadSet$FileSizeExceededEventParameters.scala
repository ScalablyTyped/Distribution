package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$FileSizeExceededEventParameters extends StObject {
  
  /**
    * The file that fails to meet the file size restriction specified in the `maxFileSize` property.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$FileSizeExceededEventParameters {
  
  inline def apply(): UploadSet$FileSizeExceededEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$FileSizeExceededEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$FileSizeExceededEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
