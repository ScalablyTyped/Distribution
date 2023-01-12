package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndSessionOptions extends StObject {
  
  /* Excluded from this release type: error */
  var force: js.UndefOr[Boolean] = js.undefined
  
  var forceClear: js.UndefOr[Boolean] = js.undefined
}
object EndSessionOptions {
  
  inline def apply(): EndSessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndSessionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndSessionOptions] (val x: Self) extends AnyVal {
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceClear(value: Boolean): Self = StObject.set(x, "forceClear", value.asInstanceOf[js.Any])
    
    inline def setForceClearUndefined: Self = StObject.set(x, "forceClear", js.undefined)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
