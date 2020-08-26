package typings.orientjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomField extends js.Object {
  /**
    * Get the value of the given custom field.
    *
    * @param  key The name of the field to get.
    * @return      The field value, or undefined if it doesn't exist.
    */
  def get(key: String): CustomField = js.native
  /**
    * Set a custom field.
    *
    * @param   key   The key to set, or map of keys to values.
    * @param          value The value to set, if `key` is not an object.
    * @promise {Object|null}         The new set of custom fields, or null if none are present.
    */
  def set(key: String, value: js.Any): CustomField = js.native
  /**
    * Unset the custom field with the given name,
    *
    * @param        key The name of the custom field to remove.
    * @promise {Object|null}     The new set of custom fields, or null if none are present.
    */
  def unset(key: String): CustomField = js.native
}

object CustomField {
  @scala.inline
  def apply(get: String => CustomField, set: (String, js.Any) => CustomField, unset: String => CustomField): CustomField = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction2(set), unset = js.Any.fromFunction1(unset))
    __obj.asInstanceOf[CustomField]
  }
  @scala.inline
  implicit class CustomFieldOps[Self <: CustomField] (val x: Self) extends AnyVal {
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
    def setGet(value: String => CustomField): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, js.Any) => CustomField): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setUnset(value: String => CustomField): Self = this.set("unset", js.Any.fromFunction1(value))
  }
  
}

