package typings
package olLib.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegularShape
  extends olLib.styleImageMod.default {
  var atlasManager_ : olLib.styleAtlasManagerMod.default = js.native
  var radius_ : scala.Double = js.native
  @JSName("clone")
  def clone_default(): olLib.styleImageMod.default = js.native
  def getAngle(): scala.Double = js.native
  def getChecksum(): java.lang.String = js.native
  def getFill(): olLib.styleFillMod.default = js.native
  def getPoints(): scala.Double = js.native
  def getRadius(): scala.Double = js.native
  def getRadius2(): scala.Double = js.native
  def getStroke(): olLib.styleStrokeMod.default = js.native
  /* protected */ def render_(atlasManager: olLib.styleAtlasManagerMod.default): scala.Unit = js.native
}

