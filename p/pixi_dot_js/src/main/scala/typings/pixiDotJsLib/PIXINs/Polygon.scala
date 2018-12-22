package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Polygon")
@js.native
class Polygon protected () extends HitArea {
  // Note - Rest Params cannot be combined with |
  //tslint:disable-next-line:unified-signatures
  def this(points: (scala.Double | Point)*) = this()
  def this(points: js.Array[scala.Double | Point]) = this()
  var closed: scala.Boolean = js.native
  var points: js.Array[scala.Double] = js.native
  var `type`: scala.Double = js.native
  def close(): scala.Unit = js.native
  /* CompleteClass */
  override def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
}

