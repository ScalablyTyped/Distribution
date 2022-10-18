package typings.next

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibIsErrorMod {
  
  @JSImport("next/dist/lib/is-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(err: Any): /* is next.next/dist/lib/is-error.NextError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(err.asInstanceOf[js.Any]).asInstanceOf[/* is next.next/dist/lib/is-error.NextError */ Boolean]
  
  inline def getProperError(err: Any): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getProperError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  trait NextError
    extends StObject
       with Error {
    
    var cancelled: js.UndefOr[Boolean] = js.undefined
    
    var code: js.UndefOr[String | Double] = js.undefined
    
    var page: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object NextError {
    
    inline def apply(message: String, name: String): NextError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NextError]
    }
    
    extension [Self <: NextError](x: Self) {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
      
      inline def setCode(value: String | Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
