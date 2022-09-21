package typings.mssql.mod

import typings.tarn.poolMod.Callback
import typings.tarn.poolMod.CallbackOrPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<tarn.tarn/dist/Pool.PoolOptions<T>, 'create' | 'destroy' | 'min' | 'max'> */
trait PoolOpts[T] extends StObject {
  
  var acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var create: js.UndefOr[CallbackOrPromise[T]] = js.undefined
  
  var createRetryIntervalMillis: js.UndefOr[Double] = js.undefined
  
  var createTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var destroy: js.UndefOr[js.Function1[/* resource */ T, Any]] = js.undefined
  
  var destroyTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var log: js.UndefOr[js.Function1[/* msg */ String, Any]] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var propagateCreateError: js.UndefOr[Boolean] = js.undefined
  
  var reapIntervalMillis: js.UndefOr[Double] = js.undefined
  
  var validate: js.UndefOr[js.Function1[/* resource */ T, Boolean]] = js.undefined
}
object PoolOpts {
  
  inline def apply[T](): PoolOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoolOpts[T]]
  }
  
  extension [Self <: PoolOpts[?], T](x: Self & PoolOpts[T]) {
    
    inline def setAcquireTimeoutMillis(value: Double): Self = StObject.set(x, "acquireTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setAcquireTimeoutMillisUndefined: Self = StObject.set(x, "acquireTimeoutMillis", js.undefined)
    
    inline def setCreate(value: /* cb */ Callback[T] => Any | js.Function0[js.Promise[T]]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setCreateRetryIntervalMillis(value: Double): Self = StObject.set(x, "createRetryIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setCreateRetryIntervalMillisUndefined: Self = StObject.set(x, "createRetryIntervalMillis", js.undefined)
    
    inline def setCreateTimeoutMillis(value: Double): Self = StObject.set(x, "createTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeoutMillisUndefined: Self = StObject.set(x, "createTimeoutMillis", js.undefined)
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setDestroy(value: /* resource */ T => Any): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
    
    inline def setDestroyTimeoutMillis(value: Double): Self = StObject.set(x, "destroyTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setDestroyTimeoutMillisUndefined: Self = StObject.set(x, "destroyTimeoutMillis", js.undefined)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    inline def setLog(value: /* msg */ String => Any): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPropagateCreateError(value: Boolean): Self = StObject.set(x, "propagateCreateError", value.asInstanceOf[js.Any])
    
    inline def setPropagateCreateErrorUndefined: Self = StObject.set(x, "propagateCreateError", js.undefined)
    
    inline def setReapIntervalMillis(value: Double): Self = StObject.set(x, "reapIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setReapIntervalMillisUndefined: Self = StObject.set(x, "reapIntervalMillis", js.undefined)
    
    inline def setValidate(value: /* resource */ T => Boolean): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
