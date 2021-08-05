package typings.openfin.windowMod

import typings.openfin.openfinStrings.`load-failed`
import typings.openfin.openfinStrings.`load-started`
import typings.openfin.openfinStrings.`load-succeeded`
import typings.openfin.openfinStrings.failed
import typings.openfin.openfinStrings.succeeded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadScriptInfoRunning extends StObject {
  
  var state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded
}
object PreloadScriptInfoRunning {
  
  inline def apply(state: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): PreloadScriptInfoRunning = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptInfoRunning]
  }
  
  extension [Self <: PreloadScriptInfoRunning](x: Self) {
    
    inline def setState(value: `load-started` | `load-failed` | `load-succeeded` | failed | succeeded): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
