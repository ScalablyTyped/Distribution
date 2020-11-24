package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
