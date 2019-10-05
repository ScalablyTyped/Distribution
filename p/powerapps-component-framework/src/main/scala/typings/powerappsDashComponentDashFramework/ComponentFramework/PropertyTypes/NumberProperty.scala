package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.Metadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.FieldPropertyMetadata.NumberMetadata
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.SecurityValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is Whole.None|FP|Decimal
		 */
trait NumberProperty extends Property {
  var attributes: js.UndefOr[NumberMetadata] = js.undefined
  @JSName("raw")
  var raw_NumberProperty: Double | Null
}

object NumberProperty {
  @scala.inline
  def apply(
    error: Boolean,
    errorMessage: String,
    `type`: String,
    attribute: Metadata = null,
    attributes: NumberMetadata = null,
    formatted: String = null,
    raw: Int | Double = null,
    security: SecurityValues = null
  ): NumberProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[NumberProperty]
  }
}

