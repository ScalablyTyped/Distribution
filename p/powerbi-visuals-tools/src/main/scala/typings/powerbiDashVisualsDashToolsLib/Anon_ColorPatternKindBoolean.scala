package typings
package powerbiDashVisualsDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorPatternKindBoolean extends js.Object {
  var color: js.UndefOr[scala.Boolean] = js.undefined
  var patternKind: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ColorPatternKindBoolean {
  @scala.inline
  def apply(
    color: js.UndefOr[scala.Boolean] = js.undefined,
    patternKind: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ColorPatternKindBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(color)) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(patternKind)) __obj.updateDynamic("patternKind")(patternKind)
    __obj.asInstanceOf[Anon_ColorPatternKindBoolean]
  }
}

