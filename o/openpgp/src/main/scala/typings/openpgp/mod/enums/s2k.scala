package typings.openpgp.mod.enums

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait s2k extends js.Object
/**
  * A string to key specifier type
  */
@JSImport("openpgp", "enums.s2k")
@js.native
object s2k extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[s2k with Double] = js.native
  
  @js.native
  sealed trait gnu extends s2k
  /* 101 */ @js.native
  object gnu extends TopLevel[gnu with Double]
  
  @js.native
  sealed trait iterated extends s2k
  /* 3 */ @js.native
  object iterated extends TopLevel[iterated with Double]
  
  @js.native
  sealed trait salted extends s2k
  /* 1 */ @js.native
  object salted extends TopLevel[salted with Double]
  
  @js.native
  sealed trait simple extends s2k
  /* 0 */ @js.native
  object simple extends TopLevel[simple with Double]
}
