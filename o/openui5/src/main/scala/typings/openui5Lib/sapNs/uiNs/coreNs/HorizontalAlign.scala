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
  
  val Begin: Begin with java.lang.String = js.native
  val Center: Center with java.lang.String = js.native
  val End: End with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign with java.lang.String] = js.native
}

