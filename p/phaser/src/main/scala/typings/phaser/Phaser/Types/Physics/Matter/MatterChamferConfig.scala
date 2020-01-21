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
    quality: Int | Double = null,
    qualityMax: Int | Double = null,
    qualityMin: Int | Double = null,
    radius: Double | js.Array[Double] = null
  ): MatterChamferConfig = {
    val __obj = js.Dynamic.literal()
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (qualityMax != null) __obj.updateDynamic("qualityMax")(qualityMax.asInstanceOf[js.Any])
    if (qualityMin != null) __obj.updateDynamic("qualityMin")(qualityMin.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatterChamferConfig]
  }
}

