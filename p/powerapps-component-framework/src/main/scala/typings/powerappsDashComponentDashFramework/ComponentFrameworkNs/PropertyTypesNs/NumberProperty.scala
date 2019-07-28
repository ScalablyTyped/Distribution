package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyTypesNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.NumberMetadata
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None|FP|Decimal
		 */
trait NumberProperty extends Property {
  var attributes: js.UndefOr[NumberMetadata] = js.undefined
  @JSName("raw")
  var raw_NumberProperty: Double
}

object NumberProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    raw: Double,
    `type`: String,
    attribute: Metadata = null,
    attributes: NumberMetadata = null,
    formatted: String = null,
    security: SecurityValues = null
  ): NumberProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage, raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[NumberProperty]
  }
}

