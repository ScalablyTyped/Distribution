package typings.openui5.sap.ui.core

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
  
  /* 0 */ val Error: typings.openui5.sap.ui.core.MessageType.Error with Double = js.native
  /* 1 */ val Information: typings.openui5.sap.ui.core.MessageType.Information with Double = js.native
  /* 2 */ val None: typings.openui5.sap.ui.core.MessageType.None with Double = js.native
  /* 3 */ val Success: typings.openui5.sap.ui.core.MessageType.Success with Double = js.native
  /* 4 */ val Warning: typings.openui5.sap.ui.core.MessageType.Warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MessageType with Double] = js.native
}

