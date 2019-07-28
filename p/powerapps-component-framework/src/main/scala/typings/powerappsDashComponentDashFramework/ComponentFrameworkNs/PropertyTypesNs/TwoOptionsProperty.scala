package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyTypesNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.TwoOptionMetadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is TwoOptions
		 */
trait TwoOptionsProperty extends Property {
  var attributes: js.UndefOr[TwoOptionMetadata] = js.undefined
  @JSName("raw")
  var raw_TwoOptionsProperty: Boolean
}

object TwoOptionsProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    raw: Boolean,
    `type`: String,
    attribute: Metadata = null,
    attributes: TwoOptionMetadata = null,
    formatted: String = null,
    security: SecurityValues = null
  ): TwoOptionsProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage, raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[TwoOptionsProperty]
  }
}

