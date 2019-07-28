package typings.ol.styleRegularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegularShape
  extends typings.ol.styleImageMod.default {
  var atlasManager_ : typings.ol.styleAtlasManagerMod.default = js.native
  var radius_ : Double = js.native
  @JSName("clone")
  def clone_RegularShape(): RegularShape = js.native
  def getAngle(): Double = js.native
  def getChecksum(): String = js.native
  def getFill(): typings.ol.styleFillMod.default = js.native
  def getPoints(): Double = js.native
  def getRadius(): Double = js.native
  def getRadius2(): Double = js.native
  def getStroke(): typings.ol.styleStrokeMod.default = js.native
  /* protected */ def render_(atlasManager: typings.ol.styleAtlasManagerMod.default): Unit = js.native
}

