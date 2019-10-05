package typings.openui5.sap.ui.model.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.AnalyticalTreeBindingAdapter")
@js.native
class AnalyticalTreeBindingAdapter () extends js.Object {
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

