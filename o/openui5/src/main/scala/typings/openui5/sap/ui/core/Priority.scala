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
  
}

