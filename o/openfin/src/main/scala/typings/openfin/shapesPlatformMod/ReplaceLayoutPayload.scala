package typings.openfin.shapesPlatformMod

import typings.openfin.shapesIdentityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceLayoutPayload extends StObject {
  
  var opts: ReplaceLayoutOpts
  
  var target: Identity
}
object ReplaceLayoutPayload {
  
  inline def apply(opts: ReplaceLayoutOpts, target: Identity): ReplaceLayoutPayload = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceLayoutPayload]
  }
  
  extension [Self <: ReplaceLayoutPayload](x: Self) {
    
    inline def setOpts(value: ReplaceLayoutOpts): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Identity): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
