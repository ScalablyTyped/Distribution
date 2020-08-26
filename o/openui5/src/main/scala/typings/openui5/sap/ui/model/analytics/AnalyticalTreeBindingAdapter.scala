package typings.openui5.sap.ui.model.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticalTreeBindingAdapter extends js.Object {
  /**
    * Retrieves the currently set number of expanded levels from the Binding (commonly an
    * AnalyticalBinding).
    * @returns the number of expanded levels
    */
  def getNumberOfExpandedLevels(): Double = js.native
  /**
    * Checks if the AnalyticalBinding has totaled measures available.Used for rendering sum rows.
    * @returns wether the binding has totaled measures or not
    */
  def hasTotaledMeasures(): Boolean = js.native
  /**
    * Sets the number of expanded levels on the TreeBinding (commonly an AnalyticalBinding).This is NOT
    * the same as AnalyticalTreeBindingAdapter#collapse or AnalyticalTreeBindingAdapter#expand.Setting the
    * number of expanded levels leads to different requests.This function is used by the AnalyticalTable
    * for the ungroup/ungroup-all feature.
    * @param iLevels the number of levels which should be expanded, minimum is 0
    */
  def setNumberOfExpandedLevels(iLevels: Double): Unit = js.native
}

object AnalyticalTreeBindingAdapter {
  @scala.inline
  def apply(
    getNumberOfExpandedLevels: () => Double,
    hasTotaledMeasures: () => Boolean,
    setNumberOfExpandedLevels: Double => Unit
  ): AnalyticalTreeBindingAdapter = {
    val __obj = js.Dynamic.literal(getNumberOfExpandedLevels = js.Any.fromFunction0(getNumberOfExpandedLevels), hasTotaledMeasures = js.Any.fromFunction0(hasTotaledMeasures), setNumberOfExpandedLevels = js.Any.fromFunction1(setNumberOfExpandedLevels))
    __obj.asInstanceOf[AnalyticalTreeBindingAdapter]
  }
  @scala.inline
  implicit class AnalyticalTreeBindingAdapterOps[Self <: AnalyticalTreeBindingAdapter] (val x: Self) extends AnyVal {
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
    def setGetNumberOfExpandedLevels(value: () => Double): Self = this.set("getNumberOfExpandedLevels", js.Any.fromFunction0(value))
    @scala.inline
    def setHasTotaledMeasures(value: () => Boolean): Self = this.set("hasTotaledMeasures", js.Any.fromFunction0(value))
    @scala.inline
    def setSetNumberOfExpandedLevels(value: Double => Unit): Self = this.set("setNumberOfExpandedLevels", js.Any.fromFunction1(value))
  }
  
}

