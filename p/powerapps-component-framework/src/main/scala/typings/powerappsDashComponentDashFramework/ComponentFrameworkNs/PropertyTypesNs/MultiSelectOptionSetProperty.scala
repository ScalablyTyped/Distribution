package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyTypesNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.OptionSetMetadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is MultiSelectOptionSet
		 */
trait MultiSelectOptionSetProperty extends Property {
  var attributes: js.UndefOr[OptionSetMetadata] = js.undefined
  @JSName("raw")
  var raw_MultiSelectOptionSetProperty: js.Array[Double] | Null
}

object MultiSelectOptionSetProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: OptionSetMetadata = null,
    formatted: String = null,
    raw: js.Array[Double] = null,
    security: SecurityValues = null
  ): MultiSelectOptionSetProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[MultiSelectOptionSetProperty]
  }
}

