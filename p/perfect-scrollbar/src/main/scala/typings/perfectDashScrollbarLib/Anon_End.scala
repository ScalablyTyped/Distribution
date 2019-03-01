package typings
package perfectDashScrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_End extends js.Object {
  var x: perfectDashScrollbarLib.perfectDashScrollbarLibStrings.start | perfectDashScrollbarLib.perfectDashScrollbarLibStrings.end | scala.Null
  var y: perfectDashScrollbarLib.perfectDashScrollbarLibStrings.start | perfectDashScrollbarLib.perfectDashScrollbarLibStrings.end | scala.Null
}

object Anon_End {
  @scala.inline
  def apply(
    x: perfectDashScrollbarLib.perfectDashScrollbarLibStrings.start | perfectDashScrollbarLib.perfectDashScrollbarLibStrings.end = null,
    y: perfectDashScrollbarLib.perfectDashScrollbarLibStrings.start | perfectDashScrollbarLib.perfectDashScrollbarLibStrings.end = null
  ): Anon_End = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_End]
  }
}

