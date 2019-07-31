package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyTypesNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.WholeNumberMetadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None
		 */
trait WholeNumberProperty extends NumberProperty {
  @JSName("attributes")
  var attributes_WholeNumberProperty: js.UndefOr[WholeNumberMetadata] = js.undefined
}

object WholeNumberProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: WholeNumberMetadata = null,
    formatted: String = null,
    raw: Int | Double = null,
    security: SecurityValues = null
  ): WholeNumberProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[WholeNumberProperty]
  }
}

