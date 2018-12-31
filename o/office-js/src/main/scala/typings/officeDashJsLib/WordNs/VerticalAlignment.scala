package typings
package officeDashJsLib.WordNs

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
    extends officeDashJsLib.WordNs.VerticalAlignment
  
  @js.native
  sealed trait center
    extends officeDashJsLib.WordNs.VerticalAlignment
  
  @js.native
  sealed trait mixed
    extends officeDashJsLib.WordNs.VerticalAlignment
  
  @js.native
  sealed trait top
    extends officeDashJsLib.WordNs.VerticalAlignment
  
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Center" */ val center: center with java.lang.String = js.native
  /* "Mixed" */ val mixed: mixed with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.VerticalAlignment with java.lang.String] = js.native
}

