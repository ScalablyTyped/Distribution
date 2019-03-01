package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Label[K2, D2] extends js.Object {
  var label: js.UndefOr[Anon_ContextRendererAnonInsertElement[K2, D2]] = js.undefined
  var maxWidth: js.UndefOr[java.lang.String] = js.undefined
  var rendered: js.UndefOr[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ] = js.undefined
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Label {
  @scala.inline
  def apply[K2, D2](
    label: Anon_ContextRendererAnonInsertElement[K2, D2] = null,
    maxWidth: java.lang.String = null,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off = null,
    width: java.lang.String = null
  ): Anon_Label[K2, D2] = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth)
    if (rendered != null) __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Label[K2, D2]]
  }
}

