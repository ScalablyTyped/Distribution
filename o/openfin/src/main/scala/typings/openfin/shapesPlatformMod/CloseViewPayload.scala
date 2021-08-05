package typings.openfin.shapesPlatformMod

import typings.openfin.shapesIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseViewPayload extends StObject {
  
  var view: Identity
}
object CloseViewPayload {
  
  inline def apply(view: Identity): CloseViewPayload = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseViewPayload]
  }
  
  extension [Self <: CloseViewPayload](x: Self) {
    
    inline def setView(value: Identity): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
