package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait OpenState extends StObject
/**
  * Defines the different possible states of an element that can be open or closed and does not
  * onlytoggle between these states, but also spends some time in between (e.g. because of an
  * animation).
  */
@JSGlobal("sap.ui.core.OpenState")
@js.native
object OpenState extends StObject {
  
  @js.native
  sealed trait CLOSED extends OpenState
  
  @js.native
  sealed trait CLOSING extends OpenState
  
  @js.native
  sealed trait OPEN extends OpenState
  
  @js.native
  sealed trait OPENING extends OpenState
}
