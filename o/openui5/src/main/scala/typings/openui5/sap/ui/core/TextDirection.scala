package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextDirection extends js.Object
/**
  * Configuration options for the direction of texts.
  */
@JSGlobal("sap.ui.core.TextDirection")
@js.native
object TextDirection extends js.Object {
  
  @js.native
  sealed trait Inherit extends TextDirection
  
  @js.native
  sealed trait LTR extends TextDirection
  
  @js.native
  sealed trait RTL extends TextDirection
}
