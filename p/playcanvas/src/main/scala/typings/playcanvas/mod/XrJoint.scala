package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents joint of a finger
  * @property index - Index of a joint within a finger, starting from 0 (root of a finger) all the way to tip of the finger
  * @property hand - Hand that joint relates to
  * @property finger - Finger that joint relates to
  * @property wrist - True if joint is a wrist
  * @property tip - True if joint is a tip of a finger
  * @property radius - The radius of a joint, which is a distance from joint to the edge of a skin
  * @param index - Index of a joint within a finger
  * @param id - Id of a joint based on XRHand specs
  * @param hand - Hand that joint relates to
  * @param [finger] - Finger that joint is related to, can be null in case of wrist joint
  */
@JSImport("playcanvas", "XrJoint")
@js.native
class XrJoint protected ()
  extends typings.playcanvas.pc.XrJoint {
  def this(index: Double, id: Double, hand: typings.playcanvas.pc.XrHand) = this()
  def this(
    index: Double,
    id: Double,
    hand: typings.playcanvas.pc.XrHand,
    finger: typings.playcanvas.pc.XrFinger
  ) = this()
}
