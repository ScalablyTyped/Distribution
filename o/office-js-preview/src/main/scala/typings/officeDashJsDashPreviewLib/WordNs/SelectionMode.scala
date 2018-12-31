package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  @js.native
  sealed trait end
    extends officeDashJsDashPreviewLib.WordNs.SelectionMode
  
  @js.native
  sealed trait select
    extends officeDashJsDashPreviewLib.WordNs.SelectionMode
  
  @js.native
  sealed trait start
    extends officeDashJsDashPreviewLib.WordNs.SelectionMode
  
  /* "End" */ val end: end with java.lang.String = js.native
  /* "Select" */ val select: select with java.lang.String = js.native
  /* "Start" */ val start: start with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.SelectionMode with java.lang.String] = js.native
}

