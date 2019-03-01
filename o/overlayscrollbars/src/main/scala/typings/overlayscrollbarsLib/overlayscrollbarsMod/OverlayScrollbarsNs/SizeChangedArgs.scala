package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeChangedArgs extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object SizeChangedArgs {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): SizeChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SizeChangedArgs]
  }
}

