package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandleUrl extends StObject {
  
  var handleUrl: js.UndefOr[Boolean] = js.undefined
}
object HandleUrl {
  
  inline def apply(): HandleUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleUrl]
  }
  
  extension [Self <: HandleUrl](x: Self) {
    
    inline def setHandleUrl(value: Boolean): Self = StObject.set(x, "handleUrl", value.asInstanceOf[js.Any])
    
    inline def setHandleUrlUndefined: Self = StObject.set(x, "handleUrl", js.undefined)
  }
}
