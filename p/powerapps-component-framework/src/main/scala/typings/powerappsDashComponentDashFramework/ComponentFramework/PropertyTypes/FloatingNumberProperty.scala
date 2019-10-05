package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.FloatingNumberMetadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is FP
		 */
trait FloatingNumberProperty extends NumberProperty {
  @JSName("attributes")
  var attributes_FloatingNumberProperty: js.UndefOr[FloatingNumberMetadata] = js.undefined
}

object FloatingNumberProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: FloatingNumberMetadata = null,
    formatted: String = null,
    raw: Int | Double = null,
    security: SecurityValues = null
  ): FloatingNumberProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[FloatingNumberProperty]
  }
}

