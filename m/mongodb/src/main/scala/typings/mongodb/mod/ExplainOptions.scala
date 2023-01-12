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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExplainOptions] (val x: Self) extends AnyVal {
    
    inline def setExplain(value: ExplainVerbosityLike): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
  }
}
