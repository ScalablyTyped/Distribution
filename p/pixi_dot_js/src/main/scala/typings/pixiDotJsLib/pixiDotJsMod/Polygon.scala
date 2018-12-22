package typings
package pixiDotJsLib.pixiDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Polygon")
@js.native
class Polygon protected ()
  extends pixiDotJsLib.PIXINs.Polygon {
  // Note - Rest Params cannot be combined with |
  //tslint:disable-next-line:unified-signatures
  def this(points: (scala.Double | pixiDotJsLib.PIXINs.Point)*) = this()
  def this(points: js.Array[scala.Double | pixiDotJsLib.PIXINs.Point]) = this()
}

