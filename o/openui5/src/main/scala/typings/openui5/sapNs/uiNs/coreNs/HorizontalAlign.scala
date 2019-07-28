package typings.openui5.sapNs.uiNs.coreNs

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
  sealed trait Begin extends HorizontalAlign
  
  @js.native
  sealed trait Center extends HorizontalAlign
  
  @js.native
  sealed trait End extends HorizontalAlign
  
  @js.native
  sealed trait Left extends HorizontalAlign
  
  @js.native
  sealed trait Right extends HorizontalAlign
  
  /* 0 */ val Begin: typings.openui5.sapNs.uiNs.coreNs.HorizontalAlign.Begin with Double = js.native
  /* 1 */ val Center: typings.openui5.sapNs.uiNs.coreNs.HorizontalAlign.Center with Double = js.native
  /* 2 */ val End: typings.openui5.sapNs.uiNs.coreNs.HorizontalAlign.End with Double = js.native
  /* 3 */ val Left: typings.openui5.sapNs.uiNs.coreNs.HorizontalAlign.Left with Double = js.native
  /* 4 */ val Right: typings.openui5.sapNs.uiNs.coreNs.HorizontalAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlign with Double] = js.native
}

