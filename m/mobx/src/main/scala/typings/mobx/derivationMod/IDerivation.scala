package typings.mobx.derivationMod

import typings.mobx.coreObservableMod.IDepTreeNode
import typings.mobx.coreObservableMod.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDerivation extends IDepTreeNode {
  
  var __mapid: String = js.native
  
  var dependenciesState: IDerivationState = js.native
  
  var isTracing: TraceMode = js.native
  
  var newObserving: Null | js.Array[IObservable] = js.native
  
  @JSName("observing")
  var observing_IDerivation: js.Array[IObservable] = js.native
  
  def onBecomeStale(): Unit = js.native
  
  /**
    *  warn if the derivation has no dependencies after creation/update
    */
  var requiresObservable: js.UndefOr[Boolean] = js.native
  
  /**
    * Id of the current run of a derivation. Each time the derivation is tracked
    * this number is increased by one. This number is globally unique
    */
  var runId: Double = js.native
  
  /**
    * amount of dependencies used by the derivation in this run, which has not been bound yet.
    */
  var unboundDepsCount: Double = js.native
}
object IDerivation {
  
  @scala.inline
  def apply(
    __mapid: String,
    dependenciesState: IDerivationState,
    isTracing: TraceMode,
    name: String,
    observing: js.Array[IObservable],
    onBecomeStale: () => Unit,
    runId: Double,
    unboundDepsCount: Double
  ): IDerivation = {
    val __obj = js.Dynamic.literal(__mapid = __mapid.asInstanceOf[js.Any], dependenciesState = dependenciesState.asInstanceOf[js.Any], isTracing = isTracing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observing = observing.asInstanceOf[js.Any], onBecomeStale = js.Any.fromFunction0(onBecomeStale), runId = runId.asInstanceOf[js.Any], unboundDepsCount = unboundDepsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDerivation]
  }
  
  @scala.inline
  implicit class IDerivationOps[Self <: IDerivation] (val x: Self) extends AnyVal {
    
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
    def set__mapid(value: String): Self = this.set("__mapid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependenciesState(value: IDerivationState): Self = this.set("dependenciesState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTracing(value: TraceMode): Self = this.set("isTracing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservingVarargs(value: IObservable*): Self = this.set("observing", js.Array(value :_*))
    
    @scala.inline
    def setObserving(value: js.Array[IObservable]): Self = this.set("observing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBecomeStale(value: () => Unit): Self = this.set("onBecomeStale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunId(value: Double): Self = this.set("runId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnboundDepsCount(value: Double): Self = this.set("unboundDepsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObservingVarargs(value: IObservable*): Self = this.set("newObserving", js.Array(value :_*))
    
    @scala.inline
    def setNewObserving(value: js.Array[IObservable]): Self = this.set("newObserving", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObservingNull: Self = this.set("newObserving", null)
    
    @scala.inline
    def setRequiresObservable(value: Boolean): Self = this.set("requiresObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiresObservable: Self = this.set("requiresObservable", js.undefined)
  }
}
