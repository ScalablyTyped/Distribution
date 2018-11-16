package typings
package nblasLib.nblasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TRANS extends js.Object

@JSImport("nblas", "TRANS")
@js.native
object TRANS extends js.Object {
  @js.native
  sealed trait ConjTrans
    extends nblasLib.nblasMod.TRANS
  
  @js.native
  sealed trait NoTrans
    extends nblasLib.nblasMod.TRANS
  
  @js.native
  sealed trait Trans
    extends nblasLib.nblasMod.TRANS
  
  /* 113 */ val ConjTrans: ConjTrans with scala.Double = js.native
  /* 111 */ val NoTrans: NoTrans with scala.Double = js.native
  /* 112 */ val Trans: Trans with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[nblasLib.nblasMod.TRANS with scala.Double] = js.native
}

