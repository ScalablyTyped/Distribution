package typings.openseadragon.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonState extends js.Object
@JSImport("openseadragon", "ButtonState")
@js.native
object ButtonState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ButtonState with Double] = js.native
  
  @js.native
  sealed trait DOWN extends ButtonState
  /* 3 */ @js.native
  object DOWN extends TopLevel[DOWN with Double]
  
  @js.native
  sealed trait GROUP extends ButtonState
  /* 1 */ @js.native
  object GROUP extends TopLevel[GROUP with Double]
  
  @js.native
  sealed trait HOVER extends ButtonState
  /* 2 */ @js.native
  object HOVER extends TopLevel[HOVER with Double]
  
  @js.native
  sealed trait REST extends ButtonState
  /* 0 */ @js.native
  object REST extends TopLevel[REST with Double]
}
