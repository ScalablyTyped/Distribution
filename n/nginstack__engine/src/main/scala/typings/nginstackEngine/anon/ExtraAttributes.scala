package typings.nginstackEngine.anon

import typings.nginstackEngine.libDbkeyDbkeyMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtraAttributes extends StObject {
  
  var extraAttributes: js.UndefOr[Any] = js.undefined
  
  var key: js.UndefOr[Double] = js.undefined
  
  var mimeType: js.UndefOr[Double | ^] = js.undefined
}
object ExtraAttributes {
  
  inline def apply(): ExtraAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtraAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtraAttributes] (val x: Self) extends AnyVal {
    
    inline def setExtraAttributes(value: Any): Self = StObject.set(x, "extraAttributes", value.asInstanceOf[js.Any])
    
    inline def setExtraAttributesUndefined: Self = StObject.set(x, "extraAttributes", js.undefined)
    
    inline def setKey(value: Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMimeType(value: Double | ^): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
