package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.DateTimeMetadata
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.SecurityValues
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Property Interface for context.parameters.[property_key], when property manifest type starts from DateTime
  */
trait DateTimeProperty extends Property {
  @JSName("attributes")
  var attributes_DateTimeProperty: js.UndefOr[DateTimeMetadata] = js.undefined
  @JSName("raw")
  var raw_DateTimeProperty: Date | Null
}

object DateTimeProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attributes: DateTimeMetadata = null,
    formatted: String = null,
    raw: Date = null,
    security: SecurityValues = null
  ): DateTimeProperty = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeProperty]
  }
}

