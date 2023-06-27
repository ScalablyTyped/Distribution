package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$BeforeItemAddedEventParameters extends StObject {
  
  /**
    * The file to be added to the set of items to be uploaded.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$BeforeItemAddedEventParameters {
  
  inline def apply(): UploadSet$BeforeItemAddedEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$BeforeItemAddedEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$BeforeItemAddedEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
