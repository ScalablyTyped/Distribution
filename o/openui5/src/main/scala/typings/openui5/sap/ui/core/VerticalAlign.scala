package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 0 */ val Bottom: typings.openui5.sap.ui.core.VerticalAlign.Bottom with Double = js.native
  /* 1 */ val Inherit: typings.openui5.sap.ui.core.VerticalAlign.Inherit with Double = js.native
  /* 2 */ val Middle: typings.openui5.sap.ui.core.VerticalAlign.Middle with Double = js.native
  /* 3 */ val Top: typings.openui5.sap.ui.core.VerticalAlign.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VerticalAlign with Double] = js.native
}

