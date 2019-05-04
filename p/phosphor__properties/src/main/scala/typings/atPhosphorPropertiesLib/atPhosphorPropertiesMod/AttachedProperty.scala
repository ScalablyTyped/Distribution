package typings
package atPhosphorPropertiesLib.atPhosphorPropertiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/properties", "AttachedProperty")
@js.native
class AttachedProperty[T, U] protected () extends js.Object {
  /**
    * Construct a new attached property.
    *
    * @param options - The options for initializing the property.
    */
  def this(options: atPhosphorPropertiesLib.atPhosphorPropertiesMod.AttachedPropertyNs.IOptions[T, U]) = this()
  var _changed: js.Any = js.native
  var _coerce: js.Any = js.native
  var _compare: js.Any = js.native
  var _create: js.Any = js.native
  var _pid: js.Any = js.native
  /**
    * The human readable name for the property.
    */
  val name: java.lang.String = js.native
  /**
    * Coerce the value for the given owner.
    */
  /* private */ def _coerceValue(owner: js.Any, value: js.Any): js.Any = js.native
  /**
    * Compare the old value and new value for equality.
    */
  /* private */ def _compareValue(oldValue: js.Any, newValue: js.Any): js.Any = js.native
  /**
    * Get or create the default value for the given owner.
    */
  /* private */ def _createValue(owner: js.Any): js.Any = js.native
  /**
    * Run the change notification if the given values are different.
    */
  /* private */ def _maybeNotify(owner: js.Any, oldValue: js.Any, newValue: js.Any): js.Any = js.native
  /**
    * Explicitly coerce the current property value for a given owner.
    *
    * @param owner - The property owner of interest.
    *
    * #### Notes
    * If the value has not yet been set, the default value will be
    * computed and used as the previous value for the comparison.
    */
  def coerce(owner: T): scala.Unit = js.native
  /**
    * Get the current value of the property for a given owner.
    *
    * @param owner - The property owner of interest.
    *
    * @returns The current value of the property.
    *
    * #### Notes
    * If the value has not yet been set, the default value will be
    * computed and assigned as the current value of the property.
    */
  def get(owner: T): U = js.native
  /**
    * Set the current value of the property for a given owner.
    *
    * @param owner - The property owner of interest.
    *
    * @param value - The value for the property.
    *
    * #### Notes
    * If the value has not yet been set, the default value will be
    * computed and used as the previous value for the comparison.
    */
  def set(owner: T, value: U): scala.Unit = js.native
}

