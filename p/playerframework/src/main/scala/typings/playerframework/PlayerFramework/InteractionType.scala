package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.TopLevel
import typings.playerframework.PlayerFramework.InteractionType.all
import typings.playerframework.PlayerFramework.InteractionType.hard
import typings.playerframework.PlayerFramework.InteractionType.none
import typings.playerframework.PlayerFramework.InteractionType.soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InteractionType extends js.Object

@JSGlobal("PlayerFramework.InteractionType")
@js.native
object InteractionType extends js.Object {
  /**
  		* Indicates both "soft" and "hard" interactions.
  		**/
  @js.native
  sealed trait all extends InteractionType
  
  /**
  		* Indicates a "hard" interaction such as a tap, click, or a key is pressed.
  		**/
  @js.native
  sealed trait hard extends InteractionType
  
  /**
  		* Indicates no interaction.
  		**/
  @js.native
  sealed trait none extends InteractionType
  
  /**
  		* Indicates a "soft" interaction such as mouse movement or a timeout occurring.
  		**/
  @js.native
  sealed trait soft extends InteractionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InteractionType with Double] = js.native
  /* 3 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 2 */ @js.native
  object hard extends TopLevel[hard with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object soft extends TopLevel[soft with Double]
  
}

