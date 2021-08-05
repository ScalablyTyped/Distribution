package typings.openfin.windowMod

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadScriptInfo extends StObject {
  
  var state: `load-failed` | failed | succeeded
}
object PreloadScriptInfo {
  
  inline def apply(state: `load-failed` | failed | succeeded): PreloadScriptInfo = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptInfo]
  }
  
  extension [Self <: PreloadScriptInfo](x: Self) {
    
    inline def setState(value: `load-failed` | failed | succeeded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
