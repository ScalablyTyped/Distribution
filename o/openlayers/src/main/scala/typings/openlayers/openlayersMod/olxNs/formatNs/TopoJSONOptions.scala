package typings.openlayers.openlayersMod.olxNs.formatNs

import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopoJSONOptions extends js.Object {
  var defaultDataProjection: ProjectionLike
}

object TopoJSONOptions {
  @scala.inline
  def apply(defaultDataProjection: ProjectionLike): TopoJSONOptions = {
    val __obj = js.Dynamic.literal(defaultDataProjection = defaultDataProjection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TopoJSONOptions]
  }
}

