package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultValueDefinition extends _StructuralObjectValue {
  var identityFieldsValues: js.UndefOr[
    js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQConstantExpr
    ]
  ] = js.undefined
  var value: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQConstantExpr
}

object DefaultValueDefinition {
  @scala.inline
  def apply(
    value: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQConstantExpr,
    identityFieldsValues: js.Array[
      powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.ISQConstantExpr
    ] = null
  ): DefaultValueDefinition = {
    val __obj = js.Dynamic.literal(value = value)
    if (identityFieldsValues != null) __obj.updateDynamic("identityFieldsValues")(identityFieldsValues)
    __obj.asInstanceOf[DefaultValueDefinition]
  }
}

