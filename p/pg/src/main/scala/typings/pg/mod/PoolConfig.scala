package typings.pg.mod

import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoolConfig
  extends StObject
     with ClientConfig {
  
  var Promise: js.UndefOr[PromiseConstructorLike] = js.undefined
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  
  // properties from module 'node-pool'
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object PoolConfig {
  
  @scala.inline
  def apply(): PoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolConfig]
  }
  
  @scala.inline
  implicit class PoolConfigMutableBuilder[Self <: PoolConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setLog(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPromise(value: PromiseConstructorLike): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
  }
}
