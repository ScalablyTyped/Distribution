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
  
  val HideMode: HideMode with java.lang.String = js.native
  val PopoverMode: PopoverMode with java.lang.String = js.native
  val ShowHideMode: ShowHideMode with java.lang.String = js.native
  val StretchCompressMode: StretchCompressMode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.SplitAppMode with java.lang.String] = js.native
}

