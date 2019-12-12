package typings.openpgp.openpgpMod.enums

import org.scalablytyped.runtime.TopLevel
import typings.openpgp.openpgpMod.enums.s2k.gnu
import typings.openpgp.openpgpMod.enums.s2k.iterated
import typings.openpgp.openpgpMod.enums.s2k.salted
import typings.openpgp.openpgpMod.enums.s2k.simple
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[s2k with Double] = js.native
  /* 101 */ @js.native
  object gnu extends TopLevel[gnu with Double]
  
  /* 3 */ @js.native
  object iterated extends TopLevel[iterated with Double]
  
  /* 1 */ @js.native
  object salted extends TopLevel[salted with Double]
  
  /* 0 */ @js.native
  object simple extends TopLevel[simple with Double]
  
}

