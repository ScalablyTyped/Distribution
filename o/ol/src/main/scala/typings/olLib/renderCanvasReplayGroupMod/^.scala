package typings
package olLib.renderCanvasReplayGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ReplayGroup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCircleArray(radius: scala.Double): js.Array[js.Array[scala.Boolean]] = js.native
  def replayDeclutter(
    declutterReplays: org.scalablytyped.runtime.StringDictionary[js.Array[_]],
    context: stdLib.CanvasRenderingContext2D,
    rotation: scala.Double,
    snapToPixel: scala.Boolean
  ): scala.Unit = js.native
}

