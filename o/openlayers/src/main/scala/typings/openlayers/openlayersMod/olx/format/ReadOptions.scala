package typings.openlayers.openlayersMod.olx.format

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
  def apply(dataProjection: ProjectionLike = null, featureProjection: ProjectionLike = null): ReadOptions = {
    val __obj = js.Dynamic.literal()
    if (dataProjection != null) __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    if (featureProjection != null) __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

