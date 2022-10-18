package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebpackHMR extends StObject {
  
  var webpackHMR: js.UndefOr[Any] = js.undefined
}
object WebpackHMR {
  
  inline def apply(): WebpackHMR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpackHMR]
  }
  
  extension [Self <: WebpackHMR](x: Self) {
    
    inline def setWebpackHMR(value: Any): Self = StObject.set(x, "webpackHMR", value.asInstanceOf[js.Any])
    
    inline def setWebpackHMRUndefined: Self = StObject.set(x, "webpackHMR", js.undefined)
  }
}
