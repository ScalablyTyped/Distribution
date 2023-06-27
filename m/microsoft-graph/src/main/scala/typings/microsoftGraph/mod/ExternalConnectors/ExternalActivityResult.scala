package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import typings.microsoftGraph.mod.PublicError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalActivityResult
  extends StObject
     with ExternalActivity {
  
  // Error information that explains the failure to process an external activity.
  var error: js.UndefOr[NullableOption[PublicError]] = js.undefined
}
object ExternalActivityResult {
  
  inline def apply(): ExternalActivityResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalActivityResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExternalActivityResult] (val x: Self) extends AnyVal {
    
    inline def setError(value: NullableOption[PublicError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
