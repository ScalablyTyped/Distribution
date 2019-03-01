package typings
package openlayersLib.openlayersMod.olxNs.formatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadOptions extends js.Object {
  var dataProjection: openlayersLib.openlayersMod.ProjectionLike
  var featureProjection: openlayersLib.openlayersMod.ProjectionLike
}

object ReadOptions {
  @scala.inline
  def apply(
    dataProjection: openlayersLib.openlayersMod.ProjectionLike,
    featureProjection: openlayersLib.openlayersMod.ProjectionLike
  ): ReadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataProjection")(dataProjection.asInstanceOf[js.Any])
    __obj.updateDynamic("featureProjection")(featureProjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOptions]
  }
}

