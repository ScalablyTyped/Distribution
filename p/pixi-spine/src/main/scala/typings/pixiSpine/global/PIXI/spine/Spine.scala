package typings.pixiSpine.global.PIXI.spine

import typings.pixiSpine.PIXI.spine.core.SkeletonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.Spine")
@js.native
class Spine protected ()
  extends typings.pixiSpine.PIXI.spine.Spine {
  def this(spineData: SkeletonData) = this()
}

/* static members */
@JSGlobal("PIXI.spine.Spine")
@js.native
object Spine extends js.Object {
  var clippingPolygon: js.Array[Double] = js.native
  var globalAutoUpdate: Boolean = js.native
  var globalDelayLimit: Double = js.native
}

