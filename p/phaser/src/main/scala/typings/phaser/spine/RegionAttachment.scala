package typings.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.RegionAttachment")
@js.native
class RegionAttachment protected () extends Attachment {
  def this(name: String) = this()
  var color: Color = js.native
  var height: Double = js.native
  var offset: ArrayLike[Double] = js.native
  var path: String = js.native
  var region: TextureRegion = js.native
  var rendererObject: js.Any = js.native
  var rotation: Double = js.native
  var scaleX: Double = js.native
  var scaleY: Double = js.native
  var tempColor: Color = js.native
  var uvs: ArrayLike[Double] = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def computeWorldVertices(bone: Bone, worldVertices: ArrayLike[Double], offset: Double, stride: Double): Unit = js.native
  def setRegion(region: TextureRegion): Unit = js.native
  def updateOffset(): Unit = js.native
}

/* static members */
@JSGlobal("spine.RegionAttachment")
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

