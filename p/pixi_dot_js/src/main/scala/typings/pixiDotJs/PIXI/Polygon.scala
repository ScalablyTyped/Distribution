package typings.pixiDotJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Polygon")
@js.native
class Polygon protected () extends HitArea {
  // Note - Rest Params cannot be combined with |
  //tslint:disable-next-line:unified-signatures
  def this(points: (Double | Point)*) = this()
  def this(points: js.Array[Double | Point]) = this()
  var closed: Boolean = js.native
  var points: js.Array[Double] = js.native
  var `type`: Double = js.native
  def close(): Unit = js.native
  /* CompleteClass */
  override def contains(x: Double, y: Double): Boolean = js.native
}

