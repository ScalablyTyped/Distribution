package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPool extends StObject {
  
  var Promise: js.UndefOr[js.Any] = js.undefined
  
  var acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var autostart: js.UndefOr[Boolean] = js.undefined
  
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined
  
  var fifo: js.UndefOr[Boolean] = js.undefined
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var maxWaitingClients: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var numTestsPerRun: js.UndefOr[Double] = js.undefined
  
  var priorityRange: js.UndefOr[Double] = js.undefined
  
  var softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined
  
  var testOnBorrow: js.UndefOr[Boolean] = js.undefined
}
object IPool {
  
  inline def apply(): IPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPool]
  }
  
  extension [Self <: IPool](x: Self) {
    
    inline def setAcquireTimeoutMillis(value: Double): Self = StObject.set(x, "acquireTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setAcquireTimeoutMillisUndefined: Self = StObject.set(x, "acquireTimeoutMillis", js.undefined)
    
    inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    inline def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
    
    inline def setEvictionRunIntervalMillis(value: Double): Self = StObject.set(x, "evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setEvictionRunIntervalMillisUndefined: Self = StObject.set(x, "evictionRunIntervalMillis", js.undefined)
    
    inline def setFifo(value: Boolean): Self = StObject.set(x, "fifo", value.asInstanceOf[js.Any])
    
    inline def setFifoUndefined: Self = StObject.set(x, "fifo", js.undefined)
    
    inline def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxWaitingClients(value: Double): Self = StObject.set(x, "maxWaitingClients", value.asInstanceOf[js.Any])
    
    inline def setMaxWaitingClientsUndefined: Self = StObject.set(x, "maxWaitingClients", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNumTestsPerRun(value: Double): Self = StObject.set(x, "numTestsPerRun", value.asInstanceOf[js.Any])
    
    inline def setNumTestsPerRunUndefined: Self = StObject.set(x, "numTestsPerRun", js.undefined)
    
    inline def setPriorityRange(value: Double): Self = StObject.set(x, "priorityRange", value.asInstanceOf[js.Any])
    
    inline def setPriorityRangeUndefined: Self = StObject.set(x, "priorityRange", js.undefined)
    
    inline def setPromise(value: js.Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    inline def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    
    inline def setSoftIdleTimeoutMillis(value: Double): Self = StObject.set(x, "softIdleTimeoutMillis", value.asInstanceOf[js.Any])
    
    inline def setSoftIdleTimeoutMillisUndefined: Self = StObject.set(x, "softIdleTimeoutMillis", js.undefined)
    
    inline def setTestOnBorrow(value: Boolean): Self = StObject.set(x, "testOnBorrow", value.asInstanceOf[js.Any])
    
    inline def setTestOnBorrowUndefined: Self = StObject.set(x, "testOnBorrow", js.undefined)
  }
}
