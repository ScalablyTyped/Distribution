package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPool extends StObject {
  
  var Promise: js.UndefOr[js.Any] = js.native
  
  var acquireTimeoutMillis: js.UndefOr[Double] = js.native
  
  var autostart: js.UndefOr[Boolean] = js.native
  
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.native
  
  var fifo: js.UndefOr[Boolean] = js.native
  
  var idleTimeoutMillis: js.UndefOr[Double] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var maxWaitingClients: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var numTestsPerRun: js.UndefOr[Double] = js.native
  
  var priorityRange: js.UndefOr[Double] = js.native
  
  var softIdleTimeoutMillis: js.UndefOr[Double] = js.native
  
  var testOnBorrow: js.UndefOr[Boolean] = js.native
}
object IPool {
  
  @scala.inline
  def apply(): IPool = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPool]
  }
  
  @scala.inline
  implicit class IPoolMutableBuilder[Self <: IPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcquireTimeoutMillis(value: Double): Self = StObject.set(x, "acquireTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquireTimeoutMillisUndefined: Self = StObject.set(x, "acquireTimeoutMillis", js.undefined)
    
    @scala.inline
    def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = StObject.set(x, "evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvictionRunIntervalMillisUndefined: Self = StObject.set(x, "evictionRunIntervalMillis", js.undefined)
    
    @scala.inline
    def setFifo(value: Boolean): Self = StObject.set(x, "fifo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFifoUndefined: Self = StObject.set(x, "fifo", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = StObject.set(x, "idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTimeoutMillisUndefined: Self = StObject.set(x, "idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMaxWaitingClients(value: Double): Self = StObject.set(x, "maxWaitingClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWaitingClientsUndefined: Self = StObject.set(x, "maxWaitingClients", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setNumTestsPerRun(value: Double): Self = StObject.set(x, "numTestsPerRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumTestsPerRunUndefined: Self = StObject.set(x, "numTestsPerRun", js.undefined)
    
    @scala.inline
    def setPriorityRange(value: Double): Self = StObject.set(x, "priorityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityRangeUndefined: Self = StObject.set(x, "priorityRange", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Any): Self = StObject.set(x, "Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromiseUndefined: Self = StObject.set(x, "Promise", js.undefined)
    
    @scala.inline
    def setSoftIdleTimeoutMillis(value: Double): Self = StObject.set(x, "softIdleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftIdleTimeoutMillisUndefined: Self = StObject.set(x, "softIdleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = StObject.set(x, "testOnBorrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestOnBorrowUndefined: Self = StObject.set(x, "testOnBorrow", js.undefined)
  }
}
