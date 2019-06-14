package typings
package openui5Lib.sapNs.uiNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlign extends js.Object

/**
  * Configuration options for horizontal alignments of controls
  */
@JSGlobal("sap.ui.core.HorizontalAlign")
@js.native
object HorizontalAlign extends js.Object {
  @js.native
  sealed trait Begin
    extends openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign
  
  @js.native
  sealed trait Center
    extends openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign
  
  @js.native
  sealed trait End
    extends openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign
  
  @js.native
  sealed trait Left
    extends openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign
  
  @js.native
  sealed trait Right
    extends openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign
  
  /* 0 */ val Begin: Begin with scala.Double = js.native
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 2 */ val End: End with scala.Double = js.native
  /* 3 */ val Left: Left with scala.Double = js.native
  /* 4 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign with scala.Double] = js.native
}

