package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyTypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * Interface for context.parameters.[property_key]
		 */
trait Property extends js.Object {
  var attribute: js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata
  ] = js.undefined
  var error: scala.Boolean
  var errorMessage: java.lang.String
  var formatted: js.UndefOr[java.lang.String] = js.undefined
  var raw: js.Any
  var security: js.UndefOr[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.SecurityValues
  ] = js.undefined
  var `type`: java.lang.String
}

object Property {
  @scala.inline
  def apply(
    error: scala.Boolean,
    errorMessage: java.lang.String,
    raw: js.Any,
    `type`: java.lang.String,
    attribute: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.FieldPropertyMetadataNs.Metadata = null,
    formatted: java.lang.String = null,
    security: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.SecurityValues = null
  ): Property = {
    val __obj = js.Dynamic.literal(error = error, errorMessage = errorMessage, raw = raw)
    __obj.updateDynamic("type")(`type`)
    if (attribute != null) __obj.updateDynamic("attribute")(attribute)
    if (formatted != null) __obj.updateDynamic("formatted")(formatted)
    if (security != null) __obj.updateDynamic("security")(security)
    __obj.asInstanceOf[Property]
  }
}

