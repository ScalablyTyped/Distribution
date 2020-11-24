package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
