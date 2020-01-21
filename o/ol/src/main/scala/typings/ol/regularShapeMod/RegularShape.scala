package typings.ol.regularShapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegularShape
  extends typings.ol.styleImageMod.default {
  var radius_ : Double = js.native
  def getAngle(): Double = js.native
  def getFill(): typings.ol.fillMod.default = js.native
  def getPoints(): Double = js.native
  def getRadius(): Double = js.native
  def getRadius2(): Double = js.native
  def getStroke(): typings.ol.strokeMod.default = js.native
  /* protected */ def render(): Unit = js.native
}

