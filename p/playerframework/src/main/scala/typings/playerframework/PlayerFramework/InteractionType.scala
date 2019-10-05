package typings.playerframework.PlayerFramework

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
  
  /* 3 */ val all: typings.playerframework.PlayerFramework.InteractionType.all with Double = js.native
  /* 2 */ val hard: typings.playerframework.PlayerFramework.InteractionType.hard with Double = js.native
  /* 0 */ val none: typings.playerframework.PlayerFramework.InteractionType.none with Double = js.native
  /* 1 */ val soft: typings.playerframework.PlayerFramework.InteractionType.soft with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[InteractionType with Double] = js.native
}

