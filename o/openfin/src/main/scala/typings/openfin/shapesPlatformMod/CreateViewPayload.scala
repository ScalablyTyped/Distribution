package typings.openfin.shapesPlatformMod

import typings.openfin.shapesIdentityMod.Identity
import typings.openfin.viewViewMod.ViewCreationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateViewPayload extends StObject {
  
  var opts: ViewCreationOptions
  
  var target: Identity
}
object CreateViewPayload {
  
  inline def apply(opts: ViewCreationOptions, target: Identity): CreateViewPayload = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateViewPayload]
  }
  
  extension [Self <: CreateViewPayload](x: Self) {
    
    inline def setOpts(value: ViewCreationOptions): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
