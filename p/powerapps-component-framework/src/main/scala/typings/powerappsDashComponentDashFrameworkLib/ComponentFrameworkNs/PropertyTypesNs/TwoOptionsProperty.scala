package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Property Interface for context.parameters.[property_key], when property manifest type is TwoOptions
		 */
trait TwoOptionsProperty extends Property {
  var attributes: js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.TwoOptionMetadata
  ] = js.undefined
  @JSName("raw")
  var raw_TwoOptionsProperty: scala.Boolean
}

object TwoOptionsProperty {
  @scala.inline
  def apply(
    error: scala.Boolean,
    errorMessage: java.lang.String,
    raw: scala.Boolean,
    `type`: java.lang.String,
    attribute: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata = null,
    attributes: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.TwoOptionMetadata = null,
    formatted: java.lang.String = null,
    security: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.SecurityValues = null
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

