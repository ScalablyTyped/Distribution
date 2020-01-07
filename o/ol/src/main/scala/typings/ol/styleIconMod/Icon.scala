package typings.ol.styleIconMod

import typings.ol.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon
  extends typings.ol.styleImageMod.default {
  def getColor(): Color = js.native
  def getSrc(): String = js.native
  def setAnchor(anchor: js.Array[Double]): Unit = js.native
}

