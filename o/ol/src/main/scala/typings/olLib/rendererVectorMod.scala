package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/vector", JSImport.Namespace)
@js.native
object rendererVectorMod extends js.Object {
  def defaultOrder(feature1: olLib.featureMod.FeatureLike, feature2: olLib.featureMod.FeatureLike): scala.Double = js.native
  def getSquaredTolerance(resolution: scala.Double, pixelRatio: scala.Double): scala.Double = js.native
  def getTolerance(resolution: scala.Double, pixelRatio: scala.Double): scala.Double = js.native
  def renderFeature[T](
    replayGroup: olLib.renderReplayGroupMod.default,
    feature: olLib.featureMod.FeatureLike,
    style: olLib.styleStyleMod.default,
    squaredTolerance: scala.Double,
    listener: js.ThisFunction1[/* this */ T, /* param1 */ olLib.eventsEventMod.default, scala.Unit],
    thisArg: T
  ): scala.Boolean = js.native
}

