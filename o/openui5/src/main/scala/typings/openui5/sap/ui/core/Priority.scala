package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.Priority.High
import typings.openui5.sap.ui.core.Priority.Low
import typings.openui5.sap.ui.core.Priority.Medium
import typings.openui5.sap.ui.core.Priority.None
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Priority with Double] = js.native
  /* 0 */ @js.native
  object High extends TopLevel[High with Double]
  
  /* 1 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  /* 2 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 3 */ @js.native
  object None extends TopLevel[None with Double]
  
}

