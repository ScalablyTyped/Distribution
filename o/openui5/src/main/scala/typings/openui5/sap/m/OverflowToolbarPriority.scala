package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.OverflowToolbarPriority.AlwaysOverflow
import typings.openui5.sap.m.OverflowToolbarPriority.Disappear
import typings.openui5.sap.m.OverflowToolbarPriority.High
import typings.openui5.sap.m.OverflowToolbarPriority.Low
import typings.openui5.sap.m.OverflowToolbarPriority.NeverOverflow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OverflowToolbarPriority extends js.Object

/**
  * Defines the priorities of the controls within sap.m.OverflowToolbar
  */
@JSGlobal("sap.m.OverflowToolbarPriority")
@js.native
object OverflowToolbarPriority extends js.Object {
  @js.native
  sealed trait AlwaysOverflow extends OverflowToolbarPriority
  
  @js.native
  sealed trait Disappear extends OverflowToolbarPriority
  
  @js.native
  sealed trait High extends OverflowToolbarPriority
  
  @js.native
  sealed trait Low extends OverflowToolbarPriority
  
  @js.native
  sealed trait NeverOverflow extends OverflowToolbarPriority
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OverflowToolbarPriority with Double] = js.native
  /* 0 */ @js.native
  object AlwaysOverflow extends TopLevel[AlwaysOverflow with Double]
  
  /* 1 */ @js.native
  object Disappear extends TopLevel[Disappear with Double]
  
  /* 2 */ @js.native
  object High extends TopLevel[High with Double]
  
  /* 3 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  /* 4 */ @js.native
  object NeverOverflow extends TopLevel[NeverOverflow with Double]
  
}

