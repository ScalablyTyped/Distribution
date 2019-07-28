package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val HideMode: typings.openui5.sapNs.mNs.SplitAppMode.HideMode with Double = js.native
  /* 1 */ val PopoverMode: typings.openui5.sapNs.mNs.SplitAppMode.PopoverMode with Double = js.native
  /* 2 */ val ShowHideMode: typings.openui5.sapNs.mNs.SplitAppMode.ShowHideMode with Double = js.native
  /* 3 */ val StretchCompressMode: typings.openui5.sapNs.mNs.SplitAppMode.StretchCompressMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SplitAppMode with Double] = js.native
}

