package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.OptionSetMetadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is OptionSet
		 */
trait OptionSetProperty extends Property {
  var attributes: js.UndefOr[OptionSetMetadata] = js.undefined
  @JSName("raw")
  var raw_OptionSetProperty: Double | Null
}

object OptionSetProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: OptionSetMetadata = null,
    formatted: String = null,
    raw: Int | Double = null,
    security: SecurityValues = null
  ): OptionSetProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[OptionSetProperty]
  }
}

