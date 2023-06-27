package typings.openui5.sapMUploadUploadSetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadSet$MediaTypeMismatchEventParameters extends StObject {
  
  /**
    * The file that fails to meet the media type restriction specified in the `mediaTypes` property.
    */
  var item: js.UndefOr[typings.openui5.sapMUploadUploadSetItemMod.default] = js.undefined
}
object UploadSet$MediaTypeMismatchEventParameters {
  
  inline def apply(): UploadSet$MediaTypeMismatchEventParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSet$MediaTypeMismatchEventParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadSet$MediaTypeMismatchEventParameters] (val x: Self) extends AnyVal {
    
    inline def setItem(value: typings.openui5.sapMUploadUploadSetItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
