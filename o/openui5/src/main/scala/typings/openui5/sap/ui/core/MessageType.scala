package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MessageType extends js.Object

/**
  * Defines the different message types of a message
  */
@JSGlobal("sap.ui.core.MessageType")
@js.native
object MessageType extends js.Object {
  @js.native
  sealed trait Error extends MessageType
  
  @js.native
  sealed trait Information extends MessageType
  
  @js.native
  sealed trait None extends MessageType
  
  @js.native
  sealed trait Success extends MessageType
  
  @js.native
  sealed trait Warning extends MessageType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
  /* 0 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 1 */ @js.native
  object Information extends TopLevel[Information with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 3 */ @js.native
  object Success extends TopLevel[Success with Double]
  
  /* 4 */ @js.native
  object Warning extends TopLevel[Warning with Double]
  
}

