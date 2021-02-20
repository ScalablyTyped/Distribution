package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SplitAppMode extends StObject
/**
  * The mode of SplitContainer or SplitApp control to show/hide the master area.
  */
@JSGlobal("sap.m.SplitAppMode")
@js.native
object SplitAppMode extends StObject {
  
  @js.native
  sealed trait HideMode extends SplitAppMode
  
  @js.native
  sealed trait PopoverMode extends SplitAppMode
  
  @js.native
  sealed trait ShowHideMode extends SplitAppMode
  
  @js.native
  sealed trait StretchCompressMode extends SplitAppMode
}
