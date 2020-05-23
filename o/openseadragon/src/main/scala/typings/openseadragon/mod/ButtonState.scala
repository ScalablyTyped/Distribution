package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonState extends js.Object

@JSImport("openseadragon", "ButtonState")
@js.native
object ButtonState extends js.Object {
  @js.native
  sealed trait DOWN extends ButtonState
  
  @js.native
  sealed trait GROUP extends ButtonState
  
  @js.native
  sealed trait HOVER extends ButtonState
  
  @js.native
  sealed trait REST extends ButtonState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonState with Double] = js.native
  /* 3 */ @js.native
  object DOWN extends TopLevel[DOWN with Double]
  
  /* 1 */ @js.native
  object GROUP extends TopLevel[GROUP with Double]
  
  /* 2 */ @js.native
  object HOVER extends TopLevel[HOVER with Double]
  
  /* 0 */ @js.native
  object REST extends TopLevel[REST with Double]
  
}

