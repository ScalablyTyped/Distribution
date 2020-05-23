package typings.pixiSpine.global.PIXI.spine.core

import typings.pixiSpine.PIXI.spine.core.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.RegionAttachment")
@js.native
class RegionAttachment protected ()
  extends typings.pixiSpine.PIXI.spine.core.RegionAttachment {
  def this(name: String) = this()
  /* CompleteClass */
  override var color: typings.pixiSpine.PIXI.spine.core.Color = js.native
  /* CompleteClass */
  override var height: Double = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var offset: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var path: String = js.native
  /* CompleteClass */
  override var region: typings.pixiSpine.PIXI.spine.core.TextureRegion = js.native
  /* CompleteClass */
  override var rendererObject: js.Any = js.native
  /* CompleteClass */
  override var rotation: Double = js.native
  /* CompleteClass */
  override var scaleX: Double = js.native
  /* CompleteClass */
  override var scaleY: Double = js.native
  /* CompleteClass */
  override var tempColor: typings.pixiSpine.PIXI.spine.core.Color = js.native
  /* CompleteClass */
  override var uvs: ArrayLike[Double] = js.native
  /* CompleteClass */
  override var width: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def computeWorldVertices(
    bone: typings.pixiSpine.PIXI.spine.core.Bone,
    worldVertices: ArrayLike[Double],
    offset: Double,
    stride: Double
  ): Unit = js.native
  /* CompleteClass */
  override def copy(): typings.pixiSpine.PIXI.spine.core.Attachment = js.native
  /* CompleteClass */
  override def setRegion(region: typings.pixiSpine.PIXI.spine.core.TextureRegion): Unit = js.native
  /* CompleteClass */
  override def updateOffset(): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.RegionAttachment")
@js.native
object RegionAttachment extends js.Object {
  var C1A: Double = js.native
  var C1B: Double = js.native
  var C1G: Double = js.native
  var C1R: Double = js.native
  var C2A: Double = js.native
  var C2B: Double = js.native
  var C2G: Double = js.native
  var C2R: Double = js.native
  var C3A: Double = js.native
  var C3B: Double = js.native
  var C3G: Double = js.native
  var C3R: Double = js.native
  var C4A: Double = js.native
  var C4B: Double = js.native
  var C4G: Double = js.native
  var C4R: Double = js.native
  var OX1: Double = js.native
  var OX2: Double = js.native
  var OX3: Double = js.native
  var OX4: Double = js.native
  var OY1: Double = js.native
  var OY2: Double = js.native
  var OY3: Double = js.native
  var OY4: Double = js.native
  var U1: Double = js.native
  var U2: Double = js.native
  var U3: Double = js.native
  var U4: Double = js.native
  var V1: Double = js.native
  var V2: Double = js.native
  var V3: Double = js.native
  var V4: Double = js.native
  var X1: Double = js.native
  var X2: Double = js.native
  var X3: Double = js.native
  var X4: Double = js.native
  var Y1: Double = js.native
  var Y2: Double = js.native
  var Y3: Double = js.native
  var Y4: Double = js.native
}

