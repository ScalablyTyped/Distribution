package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$SelectionChangedEventParameters extends StObject {
  
  /**
    * Items whose selection status has just been changed.
    */
  var items: js.UndefOr[js.Array[typings.openui5.sapMUploadUploadSetItemMod.default]] = js.undefined
}
object UploadSet$SelectionChangedEventParameters {
  
  inline def apply(): UploadSet$SelectionChangedEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$SelectionChangedEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$SelectionChangedEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[typings.openui5.sapMUploadUploadSetItemMod.default]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: typings.openui5.sapMUploadUploadSetItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
