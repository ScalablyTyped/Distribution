package typings.pixiDotJs.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Circle object can be used to specify a hit area for displayObjects
  */
@JSGlobal("PIXI.Circle")
@js.native
class Circle () extends HitArea {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, radius: Double) = this()
  var radius: Double = js.native
  var `type`: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
  def getBounds(): Rectangle = js.native
}

