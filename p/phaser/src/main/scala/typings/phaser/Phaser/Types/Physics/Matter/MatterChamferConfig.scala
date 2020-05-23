package typings.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatterChamferConfig extends js.Object {
  /**
    * The quality of the chamfering. -1 means 'auto'.
    */
  var quality: js.UndefOr[Double] = js.undefined
  /**
    * The maximum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMax: js.UndefOr[Double] = js.undefined
  /**
    * The minimum quality of the chamfering. The higher this value, the more vertices are created.
    */
  var qualityMin: js.UndefOr[Double] = js.undefined
  /**
    * A single number, or an array, to specify the radius for each vertex.
    */
  var radius: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object MatterChamferConfig {
  @scala.inline
  def apply(
    quality: js.UndefOr[Double] = js.undefined,
    qualityMax: js.UndefOr[Double] = js.undefined,
    qualityMin: js.UndefOr[Double] = js.undefined,
    radius: Double | js.Array[Double] = null
  ): MatterChamferConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qualityMax)) __obj.updateDynamic("qualityMax")(qualityMax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(qualityMin)) __obj.updateDynamic("qualityMin")(qualityMin.get.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterChamferConfig]
  }
}

