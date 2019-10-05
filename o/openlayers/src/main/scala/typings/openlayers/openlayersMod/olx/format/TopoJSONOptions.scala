package typings.openlayers.openlayersMod.olx.format

import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopoJSONOptions extends js.Object {
  var defaultDataProjection: ProjectionLike
}

object TopoJSONOptions {
  @scala.inline
  def apply(defaultDataProjection: ProjectionLike = null): TopoJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultDataProjection != null) __obj.updateDynamic("defaultDataProjection")(defaultDataProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopoJSONOptions]
  }
}

