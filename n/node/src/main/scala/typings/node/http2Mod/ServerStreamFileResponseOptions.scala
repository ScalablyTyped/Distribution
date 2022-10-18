package typings.node.http2Mod

import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.nodeColonfsMod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerStreamFileResponseOptions extends StObject {
  
  var length: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var statCheck: js.UndefOr[
    js.Function3[
      /* stats */ Stats, 
      /* headers */ OutgoingHttpHeaders, 
      /* statOptions */ StatOptions, 
      Unit | Boolean
    ]
  ] = js.undefined
  
  var waitForTrailers: js.UndefOr[Boolean] = js.undefined
}
object ServerStreamFileResponseOptions {
  
  inline def apply(): ServerStreamFileResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamFileResponseOptions]
  }
  
  extension [Self <: ServerStreamFileResponseOptions](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setStatCheck(
      value: (/* stats */ Stats, /* headers */ OutgoingHttpHeaders, /* statOptions */ StatOptions) => Unit | Boolean
    ): Self = StObject.set(x, "statCheck", js.Any.fromFunction3(value))
    
    inline def setStatCheckUndefined: Self = StObject.set(x, "statCheck", js.undefined)
    
    inline def setWaitForTrailers(value: Boolean): Self = StObject.set(x, "waitForTrailers", value.asInstanceOf[js.Any])
    
    inline def setWaitForTrailersUndefined: Self = StObject.set(x, "waitForTrailers", js.undefined)
  }
}
