package typings
package ngmapLib.angularNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INgMapOptions extends js.Object {
  var marker: ngmapLib.Anon_AnchorPoint
}

object INgMapOptions {
  @scala.inline
  def apply(marker: ngmapLib.Anon_AnchorPoint): INgMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[INgMapOptions]
  }
}

