package typings.openui5.anon

import typings.openui5.sapUiModelOdataOdatametadataMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  /**
    * The metadata object.
    */
  var metadata: js.UndefOr[default] = js.undefined
}
object `9` {
  
  inline def apply(): `9` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: default): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
