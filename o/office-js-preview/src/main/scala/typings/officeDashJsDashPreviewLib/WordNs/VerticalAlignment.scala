package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VerticalAlignment extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.VerticalAlignment")
@js.native
object VerticalAlignment extends js.Object {
  @js.native
  sealed trait bottom
    extends officeDashJsDashPreviewLib.WordNs.VerticalAlignment
  
  @js.native
  sealed trait center
    extends officeDashJsDashPreviewLib.WordNs.VerticalAlignment
  
  @js.native
  sealed trait mixed
    extends officeDashJsDashPreviewLib.WordNs.VerticalAlignment
  
  @js.native
  sealed trait top
    extends officeDashJsDashPreviewLib.WordNs.VerticalAlignment
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Mixed" */ val mixed: mixed with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.VerticalAlignment with java.lang.String] = js.native
}

