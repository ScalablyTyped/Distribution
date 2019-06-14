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
  
  /* 0 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Information: Information with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  /* 3 */ val Success: Success with scala.Double = js.native
  /* 4 */ val Warning: Warning with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.MessageType with scala.Double] = js.native
}

