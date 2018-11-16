package typings
package numericLib.numericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spline extends js.Object {
  var kl: numericLib.Vector = js.native
  var kr: numericLib.Vector = js.native
  var x: numericLib.Vector = js.native
  var yl: numericLib.Vector = js.native
  var yr: numericLib.Vector = js.native
  def at(x0: numericLib.Scalar): numericLib.Vector | numericLib.Scalar = js.native
  def at(x0: numericLib.Vector): numericLib.Vector | numericLib.Scalar = js.native
  def diff(): Spline = js.native
  def roots(): numericLib.Vector = js.native
}

