package typings.mobx.atomMod

import typings.mobx.coreObservableMod.IObservable
import typings.mobx.derivationMod.IDerivation
import typings.mobx.derivationMod.IDerivationState
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAtom extends IObservable {
  def reportChanged(): js.Any = js.native
  def reportObserved(): js.Any = js.native
}

object IAtom {
  @scala.inline
  def apply(
    diffValue: Double,
    isBeingObserved: Boolean,
    isPendingUnobservation: Boolean,
    lastAccessedBy: Double,
    lowestObserverState: IDerivationState,
    name: String,
    observers: Set[IDerivation],
    onBecomeObserved: () => Unit,
    onBecomeUnobserved: () => Unit,
    reportChanged: () => js.Any,
    reportObserved: () => js.Any
  ): IAtom = {
    val __obj = js.Dynamic.literal(diffValue = diffValue.asInstanceOf[js.Any], isBeingObserved = isBeingObserved.asInstanceOf[js.Any], isPendingUnobservation = isPendingUnobservation.asInstanceOf[js.Any], lastAccessedBy = lastAccessedBy.asInstanceOf[js.Any], lowestObserverState = lowestObserverState.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], observers = observers.asInstanceOf[js.Any], onBecomeObserved = js.Any.fromFunction0(onBecomeObserved), onBecomeUnobserved = js.Any.fromFunction0(onBecomeUnobserved), reportChanged = js.Any.fromFunction0(reportChanged), reportObserved = js.Any.fromFunction0(reportObserved))
    __obj.asInstanceOf[IAtom]
  }
  @scala.inline
  implicit class IAtomOps[Self <: IAtom] (val x: Self) extends AnyVal {
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
    def setReportChanged(value: () => js.Any): Self = this.set("reportChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setReportObserved(value: () => js.Any): Self = this.set("reportObserved", js.Any.fromFunction0(value))
  }
  
}

