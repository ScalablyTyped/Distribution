package typings
package nblasLib.nblasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DIAG extends js.Object

@JSImport("nblas", "DIAG")
@js.native
object DIAG extends js.Object {
  @js.native
  sealed trait NonUnit
    extends nblasLib.nblasMod.DIAG
  
  @js.native
  sealed trait Unit
    extends nblasLib.nblasMod.DIAG
  
  /* 131 */ val NonUnit: NonUnit with scala.Double = js.native
  /* 132 */ val Unit: Unit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nblasLib.nblasMod.DIAG with scala.Double] = js.native
}

