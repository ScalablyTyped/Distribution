package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

/**
  * Configuration options for text alignments.
  */
@JSGlobal("sap.ui.core.TextAlign")
@js.native
object TextAlign extends js.Object {
  @js.native
  sealed trait Begin
    extends openui5Lib.sapNs.uiNs.coreNs.TextAlign
  
  @js.native
  sealed trait Center
    extends openui5Lib.sapNs.uiNs.coreNs.TextAlign
  
  @js.native
  sealed trait End
    extends openui5Lib.sapNs.uiNs.coreNs.TextAlign
  
  @js.native
  sealed trait Initial
    extends openui5Lib.sapNs.uiNs.coreNs.TextAlign
  
  @js.native
  sealed trait Left
    extends openui5Lib.sapNs.uiNs.coreNs.TextAlign
  
  @js.native
  sealed trait Right
    extends openui5Lib.sapNs.uiNs.coreNs.TextAlign
  
  /* 0 */ val Begin: Begin with scala.Double = js.native
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 2 */ val End: End with scala.Double = js.native
  /* 3 */ val Initial: Initial with scala.Double = js.native
  /* 4 */ val Left: Left with scala.Double = js.native
  /* 5 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.TextAlign with scala.Double] = js.native
}

