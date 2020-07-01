package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.OptionSetMetadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type is MultiSelectOptionSet
  */
trait MultiSelectOptionSetProperty extends Property {
  @JSName("attributes")
  var attributes_MultiSelectOptionSetProperty: js.UndefOr[OptionSetMetadata] = js.undefined
  @JSName("raw")
  var raw_MultiSelectOptionSetProperty: js.Array[Double] | Null
}

object MultiSelectOptionSetProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attributes: OptionSetMetadata = null,
    formatted: String = null,
    raw: js.Array[Double] = null,
    security: SecurityValues = null
  ): MultiSelectOptionSetProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSelectOptionSetProperty]
  }
}

