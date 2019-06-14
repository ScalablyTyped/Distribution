package typings
package openui5Lib.sapNs.uiNs.coreNs

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
  sealed trait Bottom
    extends openui5Lib.sapNs.uiNs.coreNs.VerticalAlign
  
  @js.native
  sealed trait Inherit
    extends openui5Lib.sapNs.uiNs.coreNs.VerticalAlign
  
  @js.native
  sealed trait Middle
    extends openui5Lib.sapNs.uiNs.coreNs.VerticalAlign
  
  @js.native
  sealed trait Top
    extends openui5Lib.sapNs.uiNs.coreNs.VerticalAlign
  
  /* 0 */ val Bottom: Bottom with scala.Double = js.native
  /* 1 */ val Inherit: Inherit with scala.Double = js.native
  /* 2 */ val Middle: Middle with scala.Double = js.native
  /* 3 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.VerticalAlign with scala.Double] = js.native
}

