package typings.pixiDotJs.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Polygon")
@js.native
class Polygon protected ()
  extends typings.pixiDotJs.PIXI.Polygon {
  // Note - Rest Params cannot be combined with |
  //tslint:disable-next-line:unified-signatures
  def this(points: (Double | typings.pixiDotJs.PIXI.Point)*) = this()
  def this(points: js.Array[Double | typings.pixiDotJs.PIXI.Point]) = this()
}

