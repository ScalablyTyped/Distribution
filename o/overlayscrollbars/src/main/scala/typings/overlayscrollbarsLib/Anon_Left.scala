package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left
  extends overlayscrollbarsLib.overlayscrollbarsMod._Coordinates {
  var left: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.Position] = js.undefined
  var top: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.Position] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(
    left: overlayscrollbarsLib.overlayscrollbarsMod.Position = null,
    top: overlayscrollbarsLib.overlayscrollbarsMod.Position = null
  ): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Left]
  }
}

