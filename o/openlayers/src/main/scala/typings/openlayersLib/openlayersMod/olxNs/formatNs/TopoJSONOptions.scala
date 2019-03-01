package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopoJSONOptions extends js.Object {
  var defaultDataProjection: openlayersLib.openlayersMod.ProjectionLike
}

object TopoJSONOptions {
  @scala.inline
  def apply(defaultDataProjection: openlayersLib.openlayersMod.ProjectionLike): TopoJSONOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultDataProjection")(defaultDataProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopoJSONOptions]
  }
}

