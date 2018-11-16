package typings
package nblasLib.nblasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UPLO extends js.Object

@JSImport("nblas", "UPLO")
@js.native
object UPLO extends js.Object {
  @js.native
  sealed trait Lower
    extends nblasLib.nblasMod.UPLO
  
  @js.native
  sealed trait Upper
    extends nblasLib.nblasMod.UPLO
  
  /* 122 */ val Lower: Lower with scala.Double = js.native
  /* 121 */ val Upper: Upper with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nblasLib.nblasMod.UPLO with scala.Double] = js.native
}

