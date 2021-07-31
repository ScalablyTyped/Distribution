package typings.playerframework.PlayerFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InteractionType extends StObject
@JSGlobal("PlayerFramework.InteractionType")
@js.native
object InteractionType extends StObject {
  
  /**
    * Indicates both "soft" and "hard" interactions.
    **/
  @js.native
  sealed trait all
    extends StObject
       with InteractionType
  
  /**
    * Indicates a "hard" interaction such as a tap, click, or a key is pressed.
    **/
  @js.native
  sealed trait hard
    extends StObject
       with InteractionType
  
  /**
    * Indicates no interaction.
    **/
  @js.native
  sealed trait none
    extends StObject
       with InteractionType
  
  /**
    * Indicates a "soft" interaction such as mouse movement or a timeout occurring.
    **/
  @js.native
  sealed trait soft
    extends StObject
       with InteractionType
}
