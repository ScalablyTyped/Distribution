package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$FileTypeMismatchEventParameters extends StObject {
  
  /**
    * The file that fails to meet the file type restriction specified in the `fileType` property.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$FileTypeMismatchEventParameters {
  
  inline def apply(): UploadSet$FileTypeMismatchEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$FileTypeMismatchEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$FileTypeMismatchEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
