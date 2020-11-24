package typings.mssql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPool extends js.Object {
  
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
  implicit class IPoolOps[Self <: IPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPromise(value: js.Any): Self = this.set("Promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("Promise", js.undefined)
    
    @scala.inline
    def setAcquireTimeoutMillis(value: Double): Self = this.set("acquireTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcquireTimeoutMillis: Self = this.set("acquireTimeoutMillis", js.undefined)
    
    @scala.inline
    def setAutostart(value: Boolean): Self = this.set("autostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutostart: Self = this.set("autostart", js.undefined)
    
    @scala.inline
    def setEvictionRunIntervalMillis(value: Double): Self = this.set("evictionRunIntervalMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvictionRunIntervalMillis: Self = this.set("evictionRunIntervalMillis", js.undefined)
    
    @scala.inline
    def setFifo(value: Boolean): Self = this.set("fifo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFifo: Self = this.set("fifo", js.undefined)
    
    @scala.inline
    def setIdleTimeoutMillis(value: Double): Self = this.set("idleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeoutMillis: Self = this.set("idleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxWaitingClients(value: Double): Self = this.set("maxWaitingClients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWaitingClients: Self = this.set("maxWaitingClients", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNumTestsPerRun(value: Double): Self = this.set("numTestsPerRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTestsPerRun: Self = this.set("numTestsPerRun", js.undefined)
    
    @scala.inline
    def setPriorityRange(value: Double): Self = this.set("priorityRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorityRange: Self = this.set("priorityRange", js.undefined)
    
    @scala.inline
    def setSoftIdleTimeoutMillis(value: Double): Self = this.set("softIdleTimeoutMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftIdleTimeoutMillis: Self = this.set("softIdleTimeoutMillis", js.undefined)
    
    @scala.inline
    def setTestOnBorrow(value: Boolean): Self = this.set("testOnBorrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestOnBorrow: Self = this.set("testOnBorrow", js.undefined)
  }
}
