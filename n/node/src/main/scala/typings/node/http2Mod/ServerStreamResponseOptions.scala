package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStreamResponseOptions extends StObject {
  
  var endStream: js.UndefOr[Boolean] = js.undefined
  
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
}
object ServerStreamResponseOptions {
  
  inline def apply(): ServerStreamResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamResponseOptions]
  }
  
  extension [Self <: ServerStreamResponseOptions](x: Self) {
    
    inline def setEndStream(value: Boolean): Self = StObject.set(x, "endStream", value.asInstanceOf[js.Any])
    
    inline def setEndStreamUndefined: Self = StObject.set(x, "endStream", js.undefined)
    
    inline def setWaitForTrailers(value: Boolean): Self = StObject.set(x, "waitForTrailers", value.asInstanceOf[js.Any])
    
    inline def setWaitForTrailersUndefined: Self = StObject.set(x, "waitForTrailers", js.undefined)
  }
}
