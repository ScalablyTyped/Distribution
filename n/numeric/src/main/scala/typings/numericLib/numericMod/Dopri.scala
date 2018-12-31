package typings
package numericLib.numericMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dopri extends js.Object {
  var events: js.UndefOr[scala.Boolean | numericLib.VectorBoolean] = js.undefined
  var f: numericLib.Vector
  var iterations: scala.Double
  var msg: java.lang.String
  var x: numericLib.Vector
  var y: numericLib.Vector
  var ymid: numericLib.Vector
  def at(x: numericLib.Vector): numericLib.Vector | numericLib.Matrix
}

