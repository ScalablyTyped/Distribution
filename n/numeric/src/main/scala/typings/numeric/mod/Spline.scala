package typings.numeric.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spline extends js.Object {
  
  def at(x0: Scalar): Vector | Scalar = js.native
  def at(x0: Vector): Vector | Scalar = js.native
  
  def diff(): Spline = js.native
  
  var kl: Vector = js.native
  
  var kr: Vector = js.native
  
  def roots(): Vector = js.native
  
  var x: Vector = js.native
  
  var yl: Vector = js.native
  
  var yr: Vector = js.native
}
