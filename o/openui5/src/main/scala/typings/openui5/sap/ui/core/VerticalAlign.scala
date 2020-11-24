package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalAlign extends js.Object
/**
  * Configuration options for vertical alignments, for example of a layout cell content within the
  * borders.
  */
@JSGlobal("sap.ui.core.VerticalAlign")
@js.native
object VerticalAlign extends js.Object {
  
  @js.native
  sealed trait Bottom extends VerticalAlign
  
  @js.native
  sealed trait Inherit extends VerticalAlign
  
  @js.native
  sealed trait Middle extends VerticalAlign
  
  @js.native
  sealed trait Top extends VerticalAlign
}
