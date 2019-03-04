package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomField extends js.Object {
  /**
    * Get the value of the given custom field.
    *
    * @param  key The name of the field to get.
    * @return      The field value, or undefined if it doesn't exist.
    */
  def get(key: java.lang.String): CustomField
  /**
    * Set a custom field.
    *
    * @param   key   The key to set, or map of keys to values.
    * @param          value The value to set, if `key` is not an object.
    * @promise {Object|null}         The new set of custom fields, or null if none are present.
    */
  def set(key: java.lang.String, value: js.Any): CustomField
  /**
    * Unset the custom field with the given name,
    *
    * @param        key The name of the custom field to remove.
    * @promise {Object|null}     The new set of custom fields, or null if none are present.
    */
  def unset(key: java.lang.String): CustomField
}

object CustomField {
  @scala.inline
  def apply(
    get: js.Function1[java.lang.String, CustomField],
    set: js.Function2[java.lang.String, js.Any, CustomField],
    unset: js.Function1[java.lang.String, CustomField]
  ): CustomField = {
    val __obj = js.Dynamic.literal(get = get, set = set, unset = unset)
  
    __obj.asInstanceOf[CustomField]
  }
}

