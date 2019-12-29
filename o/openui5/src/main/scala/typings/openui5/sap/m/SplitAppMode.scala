package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplitAppMode extends js.Object

/**
  * The mode of SplitContainer or SplitApp control to show/hide the master area.
  */
@JSGlobal("sap.m.SplitAppMode")
@js.native
object SplitAppMode extends js.Object {
  @js.native
  sealed trait HideMode extends SplitAppMode
  
  @js.native
  sealed trait PopoverMode extends SplitAppMode
  
  @js.native
  sealed trait ShowHideMode extends SplitAppMode
  
  @js.native
  sealed trait StretchCompressMode extends SplitAppMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SplitAppMode with Double] = js.native
  /* 0 */ @js.native
  object HideMode extends TopLevel[HideMode with Double]
  
  /* 1 */ @js.native
  object PopoverMode extends TopLevel[PopoverMode with Double]
  
  /* 2 */ @js.native
  object ShowHideMode extends TopLevel[ShowHideMode with Double]
  
  /* 3 */ @js.native
  object StretchCompressMode extends TopLevel[StretchCompressMode with Double]
  
}

