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
  
  val Begin: Begin with java.lang.String = js.native
  val Center: Center with java.lang.String = js.native
  val End: End with java.lang.String = js.native
  val Initial: Initial with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.TextAlign with java.lang.String] = js.native
}

