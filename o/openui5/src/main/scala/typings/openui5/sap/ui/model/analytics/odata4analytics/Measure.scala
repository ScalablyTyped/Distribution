package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measure extends js.Object {
  /**
    * Get the text property associated to the raw value property holding theformatted value related to
    * this measure
    * @returns The DataJS object representing the property holding the         formatted value text of
    * this measure or null if this measure         does not have a unit
    */
  def getFormattedValueProperty(): js.Any
  /**
    * Get label
    * @returns The (possibly language-dependent) label text for this         measure
    */
  def getLabelText(): String
  /**
    * Get the name of the measure
    * @returns The name of the measure, which is identical to the name         of the measure raw value
    * property in the entity type
    */
  def getName(): String
  /**
    * Get the raw value property
    * @returns The DataJS object representing the property holding the         raw value of this measure
    */
  def getRawValueProperty(): js.Any
  /**
    * Get the unit property related to this measure
    * @returns The DataJS object representing the unit property or         null if this measure does not
    * have a unit
    */
  def getUnitProperty(): js.Any
  /**
    * Get indicator whether or not the measure is updatable
    * @returns True iff the measure is updatable
    */
  def isUpdatable(): Boolean
}

object Measure {
  @scala.inline
  def apply(
    getFormattedValueProperty: () => js.Any,
    getLabelText: () => String,
    getName: () => String,
    getRawValueProperty: () => js.Any,
    getUnitProperty: () => js.Any,
    isUpdatable: () => Boolean
  ): Measure = {
    val __obj = js.Dynamic.literal(getFormattedValueProperty = js.Any.fromFunction0(getFormattedValueProperty), getLabelText = js.Any.fromFunction0(getLabelText), getName = js.Any.fromFunction0(getName), getRawValueProperty = js.Any.fromFunction0(getRawValueProperty), getUnitProperty = js.Any.fromFunction0(getUnitProperty), isUpdatable = js.Any.fromFunction0(isUpdatable))
    __obj.asInstanceOf[Measure]
  }
}

