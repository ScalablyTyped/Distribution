package typings.node.http2Mod

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSessionRequestOptions extends StObject {
  
  var endStream: js.UndefOr[Boolean] = js.undefined
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
  
  var parent: js.UndefOr[Double] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
  
  var weight: js.UndefOr[Double] = js.undefined
}
object ClientSessionRequestOptions {
  
  inline def apply(): ClientSessionRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSessionRequestOptions]
  }
  
  extension [Self <: ClientSessionRequestOptions](x: Self) {
    
    inline def setEndStream(value: Boolean): Self = StObject.set(x, "endStream", value.asInstanceOf[js.Any])
    
    inline def setEndStreamUndefined: Self = StObject.set(x, "endStream", js.undefined)
    
    inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
    
    inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setWaitForTrailers(value: Boolean): Self = StObject.set(x, "waitForTrailers", value.asInstanceOf[js.Any])
    
    inline def setWaitForTrailersUndefined: Self = StObject.set(x, "waitForTrailers", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
