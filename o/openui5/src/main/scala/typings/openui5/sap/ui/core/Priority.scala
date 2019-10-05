package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Priority extends js.Object

/**
  * Priorities for general use.
  */
@JSGlobal("sap.ui.core.Priority")
@js.native
object Priority extends js.Object {
  @js.native
  sealed trait High extends Priority
  
  @js.native
  sealed trait Low extends Priority
  
  @js.native
  sealed trait Medium extends Priority
  
  @js.native
  sealed trait None extends Priority
  
  /* 0 */ val High: typings.openui5.sap.ui.core.Priority.High with Double = js.native
  /* 1 */ val Low: typings.openui5.sap.ui.core.Priority.Low with Double = js.native
  /* 2 */ val Medium: typings.openui5.sap.ui.core.Priority.Medium with Double = js.native
  /* 3 */ val None: typings.openui5.sap.ui.core.Priority.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
}

