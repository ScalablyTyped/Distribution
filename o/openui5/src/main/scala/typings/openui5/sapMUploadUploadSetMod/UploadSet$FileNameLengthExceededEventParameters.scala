package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$FileNameLengthExceededEventParameters extends StObject {
  
  /**
    * The file that fails to meet the file name length restriction specified in the `maxFileNameLength` property.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$FileNameLengthExceededEventParameters {
  
  inline def apply(): UploadSet$FileNameLengthExceededEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$FileNameLengthExceededEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$FileNameLengthExceededEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
