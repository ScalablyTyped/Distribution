package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.DateTimeMetadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.SecurityValues
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type starts from DateTime
		 */
trait DateTimeProperty extends Property {
  var attributes: js.UndefOr[DateTimeMetadata] = js.undefined
  @JSName("raw")
  var raw_DateTimeProperty: Date | Null
}

object DateTimeProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: DateTimeMetadata = null,
    formatted: String = null,
    raw: Date = null,
    security: SecurityValues = null
  ): DateTimeProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[DateTimeProperty]
  }
}

