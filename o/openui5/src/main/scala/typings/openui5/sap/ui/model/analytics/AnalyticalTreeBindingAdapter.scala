package typings.openui5.sap.ui.model.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticalTreeBindingAdapter extends StObject {
  
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
  implicit class AnalyticalTreeBindingAdapterMutableBuilder[Self <: AnalyticalTreeBindingAdapter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetNumberOfExpandedLevels(value: () => Double): Self = StObject.set(x, "getNumberOfExpandedLevels", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasTotaledMeasures(value: () => Boolean): Self = StObject.set(x, "hasTotaledMeasures", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetNumberOfExpandedLevels(value: Double => Unit): Self = StObject.set(x, "setNumberOfExpandedLevels", js.Any.fromFunction1(value))
  }
}
