package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Defaults_
  extends StObject
     with ClientConfig {
  
  var binary: js.UndefOr[Boolean] = js.undefined
  
  var parseInt8: js.UndefOr[Boolean] = js.undefined
  
  var poolIdleTimeout: js.UndefOr[Double] = js.undefined
  
  var poolSize: js.UndefOr[Double] = js.undefined
  
  var reapIntervalMillis: js.UndefOr[Double] = js.undefined
}
object Defaults_ {
  
  inline def apply(): Defaults_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Defaults_]
  }
  
  extension [Self <: Defaults_](x: Self) {
    
    inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setParseInt8(value: Boolean): Self = StObject.set(x, "parseInt8", value.asInstanceOf[js.Any])
    
    inline def setParseInt8Undefined: Self = StObject.set(x, "parseInt8", js.undefined)
    
    inline def setPoolIdleTimeout(value: Double): Self = StObject.set(x, "poolIdleTimeout", value.asInstanceOf[js.Any])
    
    inline def setPoolIdleTimeoutUndefined: Self = StObject.set(x, "poolIdleTimeout", js.undefined)
    
    inline def setPoolSize(value: Double): Self = StObject.set(x, "poolSize", value.asInstanceOf[js.Any])
    
    inline def setPoolSizeUndefined: Self = StObject.set(x, "poolSize", js.undefined)
    
    inline def setReapIntervalMillis(value: Double): Self = StObject.set(x, "reapIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setReapIntervalMillisUndefined: Self = StObject.set(x, "reapIntervalMillis", js.undefined)
  }
}
