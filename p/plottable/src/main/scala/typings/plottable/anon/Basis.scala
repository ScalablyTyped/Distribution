package typings.plottable.anon

import typings.plottable.plottableStrings.basis
import typings.plottable.plottableStrings.basisClosed
import typings.plottable.plottableStrings.basisOpen
import typings.plottable.plottableStrings.bundle
import typings.plottable.plottableStrings.cardinal
import typings.plottable.plottableStrings.cardinalClosed
import typings.plottable.plottableStrings.cardinalOpen
import typings.plottable.plottableStrings.linear
import typings.plottable.plottableStrings.linearClosed
import typings.plottable.plottableStrings.monotone
import typings.plottable.plottableStrings.step
import typings.plottable.plottableStrings.stepAfter
import typings.plottable.plottableStrings.stepBefore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Basis extends js.Object {
  var basis: typings.plottable.plottableStrings.basis = js.native
  var basisClosed: typings.plottable.plottableStrings.basisClosed = js.native
  var basisOpen: typings.plottable.plottableStrings.basisOpen = js.native
  var bundle: typings.plottable.plottableStrings.bundle = js.native
  var cardinal: typings.plottable.plottableStrings.cardinal = js.native
  var cardinalClosed: typings.plottable.plottableStrings.cardinalClosed = js.native
  var cardinalOpen: typings.plottable.plottableStrings.cardinalOpen = js.native
  var linear: typings.plottable.plottableStrings.linear = js.native
  var linearClosed: typings.plottable.plottableStrings.linearClosed = js.native
  var monotone: typings.plottable.plottableStrings.monotone = js.native
  var step: typings.plottable.plottableStrings.step = js.native
  var stepAfter: typings.plottable.plottableStrings.stepAfter = js.native
  var stepBefore: typings.plottable.plottableStrings.stepBefore = js.native
}

object Basis {
  @scala.inline
  def apply(
    basis: basis,
    basisClosed: basisClosed,
    basisOpen: basisOpen,
    bundle: bundle,
    cardinal: cardinal,
    cardinalClosed: cardinalClosed,
    cardinalOpen: cardinalOpen,
    linear: linear,
    linearClosed: linearClosed,
    monotone: monotone,
    step: step,
    stepAfter: stepAfter,
    stepBefore: stepBefore
  ): Basis = {
    val __obj = js.Dynamic.literal(basis = basis.asInstanceOf[js.Any], basisClosed = basisClosed.asInstanceOf[js.Any], basisOpen = basisOpen.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], cardinal = cardinal.asInstanceOf[js.Any], cardinalClosed = cardinalClosed.asInstanceOf[js.Any], cardinalOpen = cardinalOpen.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], linearClosed = linearClosed.asInstanceOf[js.Any], monotone = monotone.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], stepAfter = stepAfter.asInstanceOf[js.Any], stepBefore = stepBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basis]
  }
  @scala.inline
  implicit class BasisOps[Self <: Basis] (val x: Self) extends AnyVal {
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
    def setBasis(value: basis): Self = this.set("basis", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasisClosed(value: basisClosed): Self = this.set("basisClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasisOpen(value: basisOpen): Self = this.set("basisOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setBundle(value: bundle): Self = this.set("bundle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardinal(value: cardinal): Self = this.set("cardinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardinalClosed(value: cardinalClosed): Self = this.set("cardinalClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardinalOpen(value: cardinalOpen): Self = this.set("cardinalOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinear(value: linear): Self = this.set("linear", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinearClosed(value: linearClosed): Self = this.set("linearClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonotone(value: monotone): Self = this.set("monotone", value.asInstanceOf[js.Any])
    @scala.inline
    def setStep(value: step): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepAfter(value: stepAfter): Self = this.set("stepAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def setStepBefore(value: stepBefore): Self = this.set("stepBefore", value.asInstanceOf[js.Any])
  }
  
}

