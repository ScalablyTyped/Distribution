package typings
package nblasLib.nblasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SIDE extends js.Object

@JSImport("nblas", "SIDE")
@js.native
object SIDE extends js.Object {
  @js.native
  sealed trait Left
    extends nblasLib.nblasMod.SIDE
  
  @js.native
  sealed trait Right
    extends nblasLib.nblasMod.SIDE
  
  /* 141 */ val Left: Left with scala.Double = js.native
  /* 142 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nblasLib.nblasMod.SIDE with scala.Double] = js.native
}

