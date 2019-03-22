package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is Decimal
		 */
trait DecimalNumberProperty extends NumberProperty {
  @JSName("attributes")
  var attributes_DecimalNumberProperty: js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.DecimalNumberMetadata
  ] = js.undefined
}

object DecimalNumberProperty {
  @scala.inline
  def apply(
    error: scala.Boolean,
    errorMessage: java.lang.String,
    raw: scala.Double,
    `type`: java.lang.String,
    attribute: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata = null,
    attributes: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.DecimalNumberMetadata = null,
    formatted: java.lang.String = null,
    security: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.SecurityValues = null
  ): DecimalNumberProperty = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage, raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[DecimalNumberProperty]
  }
}

