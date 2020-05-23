package typings.openui5.sap.ui.core.routing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enumaration for different HistoryDirections
  */
@JSGlobal("sap.ui.core.routing.routing")
@js.native
object routing extends js.Object {
  @js.native
  sealed trait HistoryDirection extends js.Object
  
  @js.native
  object HistoryDirection extends js.Object {
    @js.native
    sealed trait Backwards extends HistoryDirection
    
    @js.native
    sealed trait Forwards extends HistoryDirection
    
    @js.native
    sealed trait NewEntry extends HistoryDirection
    
    @js.native
    sealed trait Unknown extends HistoryDirection
    
  }
  
}

