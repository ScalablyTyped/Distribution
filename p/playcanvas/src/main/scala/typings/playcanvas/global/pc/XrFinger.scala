package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents finger with related joints and index
  * @property index - Index of a finger, numeration is: thumb, index, middle, ring, little
  * @property hand - Hand that finger relates to
  * @property joints - List of joints that relates to this finger, starting from joint closest to wrist all the way to the tip of a finger
  * @property tip - Tip of a finger, or null if not available
  * @param index - Index of a finger
  * @param hand - Hand that finger relates to
  */
@JSGlobal("pc.XrFinger")
@js.native
class XrFinger protected ()
  extends typings.playcanvas.pc.XrFinger {
  def this(index: Double, hand: typings.playcanvas.pc.XrHand) = this()
}
