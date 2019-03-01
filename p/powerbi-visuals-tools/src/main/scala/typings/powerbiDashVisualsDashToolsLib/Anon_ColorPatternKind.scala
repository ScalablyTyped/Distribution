package typings
package powerbiDashVisualsDashToolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorPatternKind extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var patternKind: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColorPatternKind {
  @scala.inline
  def apply(color: java.lang.String = null, patternKind: java.lang.String = null): Anon_ColorPatternKind = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (patternKind != null) __obj.updateDynamic("patternKind")(patternKind)
    __obj.asInstanceOf[Anon_ColorPatternKind]
  }
}

