package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$AfterItemEditedEventParameters extends StObject {
  
  /**
    * The item edited.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$AfterItemEditedEventParameters {
  
  inline def apply(): UploadSet$AfterItemEditedEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$AfterItemEditedEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$AfterItemEditedEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
