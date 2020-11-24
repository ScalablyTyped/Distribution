package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Scrolling extends js.Object
/**
  * Defines the possible values for horizontal and vertical scrolling behavior.
  */
@JSGlobal("sap.ui.core.Scrolling")
@js.native
object Scrolling extends js.Object {
  
  @js.native
  sealed trait Auto extends Scrolling
  
  @js.native
  sealed trait Hidden extends Scrolling
  
  @js.native
  sealed trait None extends Scrolling
  
  @js.native
  sealed trait Scroll extends Scrolling
}
