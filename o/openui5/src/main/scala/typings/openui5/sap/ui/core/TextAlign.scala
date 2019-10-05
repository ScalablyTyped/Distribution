package typings.openui5.sap.ui.core

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
  sealed trait Begin extends TextAlign
  
  @js.native
  sealed trait Center extends TextAlign
  
  @js.native
  sealed trait End extends TextAlign
  
  @js.native
  sealed trait Initial extends TextAlign
  
  @js.native
  sealed trait Left extends TextAlign
  
  @js.native
  sealed trait Right extends TextAlign
  
  /* 0 */ val Begin: typings.openui5.sap.ui.core.TextAlign.Begin with Double = js.native
  /* 1 */ val Center: typings.openui5.sap.ui.core.TextAlign.Center with Double = js.native
  /* 2 */ val End: typings.openui5.sap.ui.core.TextAlign.End with Double = js.native
  /* 3 */ val Initial: typings.openui5.sap.ui.core.TextAlign.Initial with Double = js.native
  /* 4 */ val Left: typings.openui5.sap.ui.core.TextAlign.Left with Double = js.native
  /* 5 */ val Right: typings.openui5.sap.ui.core.TextAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlign with Double] = js.native
}

