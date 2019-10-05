package typings.openpgp.openpgpMod.enums

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait s2k extends js.Object

/**
  * A string to key specifier type
  */
@JSImport("openpgp", "enums.s2k")
@js.native
object s2k extends js.Object {
  @js.native
  sealed trait gnu extends s2k
  
  @js.native
  sealed trait iterated extends s2k
  
  @js.native
  sealed trait salted extends s2k
  
  @js.native
  sealed trait simple extends s2k
  
  /* 101 */ val gnu: typings.openpgp.openpgpMod.enums.s2k.gnu with Double = js.native
  /* 3 */ val iterated: typings.openpgp.openpgpMod.enums.s2k.iterated with Double = js.native
  /* 1 */ val salted: typings.openpgp.openpgpMod.enums.s2k.salted with Double = js.native
  /* 0 */ val simple: typings.openpgp.openpgpMod.enums.s2k.simple with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[s2k with Double] = js.native
}

