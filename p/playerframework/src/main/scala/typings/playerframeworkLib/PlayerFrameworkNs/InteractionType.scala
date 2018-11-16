package typings
package playerframeworkLib.PlayerFrameworkNs

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
  sealed trait all
    extends playerframeworkLib.PlayerFrameworkNs.InteractionType
  
  /**
  		* Indicates a "hard" interaction such as a tap, click, or a key is pressed.
  		**/
  @js.native
  sealed trait hard
    extends playerframeworkLib.PlayerFrameworkNs.InteractionType
  
  /**
  		* Indicates no interaction.
  		**/
  @js.native
  sealed trait none
    extends playerframeworkLib.PlayerFrameworkNs.InteractionType
  
  /**
  		* Indicates a "soft" interaction such as mouse movement or a timeout occurring.
  		**/
  @js.native
  sealed trait soft
    extends playerframeworkLib.PlayerFrameworkNs.InteractionType
  
  /* 3 */ val all: all with scala.Double = js.native
  /* 2 */ val hard: hard with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val soft: soft with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[playerframeworkLib.PlayerFrameworkNs.InteractionType with scala.Double] = js.native
}

