package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.RegionAttachment")
@js.native
class RegionAttachment protected () extends Attachment {
  def this(name: java.lang.String) = this()
  var color: Color = js.native
  var height: scala.Double = js.native
  var offset: ArrayLike[scala.Double] = js.native
  var path: java.lang.String = js.native
  var region: TextureRegion = js.native
  var rendererObject: js.Any = js.native
  var rotation: scala.Double = js.native
  var scaleX: scala.Double = js.native
  var scaleY: scala.Double = js.native
  var tempColor: Color = js.native
  var uvs: ArrayLike[scala.Double] = js.native
  var width: scala.Double = js.native
  var x: scala.Double = js.native
  var y: scala.Double = js.native
  def computeWorldVertices(bone: Bone, worldVertices: ArrayLike[scala.Double], offset: scala.Double, stride: scala.Double): scala.Unit = js.native
  def setRegion(region: TextureRegion): scala.Unit = js.native
  def updateOffset(): scala.Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.RegionAttachment")
@js.native
object RegionAttachment extends js.Object {
  var C1A: scala.Double = js.native
  var C1B: scala.Double = js.native
  var C1G: scala.Double = js.native
  var C1R: scala.Double = js.native
  var C2A: scala.Double = js.native
  var C2B: scala.Double = js.native
  var C2G: scala.Double = js.native
  var C2R: scala.Double = js.native
  var C3A: scala.Double = js.native
  var C3B: scala.Double = js.native
  var C3G: scala.Double = js.native
  var C3R: scala.Double = js.native
  var C4A: scala.Double = js.native
  var C4B: scala.Double = js.native
  var C4G: scala.Double = js.native
  var C4R: scala.Double = js.native
  var OX1: scala.Double = js.native
  var OX2: scala.Double = js.native
  var OX3: scala.Double = js.native
  var OX4: scala.Double = js.native
  var OY1: scala.Double = js.native
  var OY2: scala.Double = js.native
  var OY3: scala.Double = js.native
  var OY4: scala.Double = js.native
  var U1: scala.Double = js.native
  var U2: scala.Double = js.native
  var U3: scala.Double = js.native
  var U4: scala.Double = js.native
  var V1: scala.Double = js.native
  var V2: scala.Double = js.native
  var V3: scala.Double = js.native
  var V4: scala.Double = js.native
  var X1: scala.Double = js.native
  var X2: scala.Double = js.native
  var X3: scala.Double = js.native
  var X4: scala.Double = js.native
  var Y1: scala.Double = js.native
  var Y2: scala.Double = js.native
  var Y3: scala.Double = js.native
  var Y4: scala.Double = js.native
}

