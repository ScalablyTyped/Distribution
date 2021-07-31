package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the different possible states of an element that can be open or closed and does not
  * onlytoggle between these states, but also spends some time in between (e.g. because of an
  * animation).
  */
@JSGlobal("sap.ui.core.OpenState")
@js.native
object OpenState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.openui5.sap.ui.core.OpenState & Double] = js.native
  
  /* 0 */ val CLOSED: typings.openui5.sap.ui.core.OpenState.CLOSED & Double = js.native
  
  /* 1 */ val CLOSING: typings.openui5.sap.ui.core.OpenState.CLOSING & Double = js.native
  
  /* 2 */ val OPEN: typings.openui5.sap.ui.core.OpenState.OPEN & Double = js.native
  
  /* 3 */ val OPENING: typings.openui5.sap.ui.core.OpenState.OPENING & Double = js.native
}
