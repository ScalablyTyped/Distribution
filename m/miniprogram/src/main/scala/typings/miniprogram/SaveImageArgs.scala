package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveImageArgs
  extends StObject
     with AsyncVoidCallback {
  
  var showActionSheet: js.UndefOr[Boolean] = js.undefined
  
  var url: String
}
object SaveImageArgs {
  
  inline def apply(url: String): SaveImageArgs = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveImageArgs]
  }
  
  extension [Self <: SaveImageArgs](x: Self) {
    
    inline def setShowActionSheet(value: Boolean): Self = StObject.set(x, "showActionSheet", value.asInstanceOf[js.Any])
    
    inline def setShowActionSheetUndefined: Self = StObject.set(x, "showActionSheet", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
