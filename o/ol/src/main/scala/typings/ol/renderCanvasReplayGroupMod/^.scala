package typings.ol.renderCanvasReplayGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/canvas/ReplayGroup", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getCircleArray(radius: Double): js.Array[js.Array[Boolean]] = js.native
  def replayDeclutter(
    declutterReplays: StringDictionary[js.Array[_]],
    context: CanvasRenderingContext2D,
    rotation: Double,
    snapToPixel: Boolean
  ): Unit = js.native
}

