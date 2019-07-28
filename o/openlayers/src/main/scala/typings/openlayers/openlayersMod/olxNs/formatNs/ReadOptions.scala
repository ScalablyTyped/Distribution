package typings.openlayers.openlayersMod.olxNs.formatNs

import typings.openlayers.openlayersMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var dataProjection: ProjectionLike
  var featureProjection: ProjectionLike
}

object ReadOptions {
  @scala.inline
  def apply(dataProjection: ProjectionLike, featureProjection: ProjectionLike): ReadOptions = {
    val __obj = js.Dynamic.literal(dataProjection = dataProjection.asInstanceOf[js.Any], featureProjection = featureProjection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadOptions]
  }
}

