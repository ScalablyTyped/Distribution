package typings.openui5.sap.ui.layout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SideContentPosition extends StObject
/**
  * The position of the side content - End (default) and Begin.
  */
@JSGlobal("sap.ui.layout.SideContentPosition")
@js.native
object SideContentPosition extends StObject {
  
  @js.native
  sealed trait Begin extends SideContentPosition
  
  @js.native
  sealed trait End extends SideContentPosition
}
