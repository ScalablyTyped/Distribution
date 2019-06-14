package typings
package openui5Lib.sapNs.mNs

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
  sealed trait HideMode
    extends openui5Lib.sapNs.mNs.SplitAppMode
  
  @js.native
  sealed trait PopoverMode
    extends openui5Lib.sapNs.mNs.SplitAppMode
  
  @js.native
  sealed trait ShowHideMode
    extends openui5Lib.sapNs.mNs.SplitAppMode
  
  @js.native
  sealed trait StretchCompressMode
    extends openui5Lib.sapNs.mNs.SplitAppMode
  
  /* 0 */ val HideMode: HideMode with scala.Double = js.native
  /* 1 */ val PopoverMode: PopoverMode with scala.Double = js.native
  /* 2 */ val ShowHideMode: ShowHideMode with scala.Double = js.native
  /* 3 */ val StretchCompressMode: StretchCompressMode with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.SplitAppMode with scala.Double] = js.native
}

