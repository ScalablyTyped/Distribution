package typings.pg.mod

import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolConfig
  extends StObject
     with ClientConfig {
  
  var Promise: js.UndefOr[PromiseConstructorLike] = js.undefined
  
  var allowExitOnIdle: js.UndefOr[Boolean] = js.undefined
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var log: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
  
  // properties from module 'node-pool'
  var max: js.UndefOr[Double] = js.undefined
  
  var maxUses: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object PoolConfig {
  
  inline def apply(): PoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PoolConfig] (val x: Self) extends AnyVal {
    
    inline def setAllowExitOnIdle(value: Boolean): Self = StObject.set(x, "allowExitOnIdle", value.asInstanceOf[js.Any])
    
    inline def setAllowExitOnIdleUndefined: Self = StObject.set(x, "allowExitOnIdle", js.undefined)
    
    inline def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    inline def setLog(value: /* repeated */ Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxUses(value: Double): Self = StObject.set(x, "maxUses", value.asInstanceOf[js.Any])
    
    inline def setMaxUsesUndefined: Self = StObject.set(x, "maxUses", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPromise(value: PromiseConstructorLike): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
  }
}
