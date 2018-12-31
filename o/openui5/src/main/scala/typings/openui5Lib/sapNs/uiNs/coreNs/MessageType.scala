package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Error
    extends openui5Lib.sapNs.uiNs.coreNs.MessageType
  
  @js.native
  sealed trait Information
    extends openui5Lib.sapNs.uiNs.coreNs.MessageType
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.uiNs.coreNs.MessageType
  
  @js.native
  sealed trait Success
    extends openui5Lib.sapNs.uiNs.coreNs.MessageType
  
  @js.native
  sealed trait Warning
    extends openui5Lib.sapNs.uiNs.coreNs.MessageType
  
  val Error: Error with java.lang.String = js.native
  val Information: Information with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Success: Success with java.lang.String = js.native
  val Warning: Warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.MessageType with java.lang.String] = js.native
}

