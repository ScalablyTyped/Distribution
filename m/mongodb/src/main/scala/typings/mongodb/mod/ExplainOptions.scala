package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExplainOptions extends StObject {
  
  /** Specifies the verbosity mode for the explain output. */
  var explain: js.UndefOr[ExplainVerbosityLike] = js.undefined
}
object ExplainOptions {
  
  inline def apply(): ExplainOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplainOptions]
  }
  
  extension [Self <: ExplainOptions](x: Self) {
    
    inline def setExplain(value: ExplainVerbosityLike): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
  }
}
