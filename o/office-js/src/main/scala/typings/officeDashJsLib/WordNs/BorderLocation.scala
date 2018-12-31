package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BorderLocation extends js.Object

/**
  * [Api set: WordApi]
  */
@JSGlobal("Word.BorderLocation")
@js.native
object BorderLocation extends js.Object {
  @js.native
  sealed trait all
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait bottom
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait inside
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait insideHorizontal
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait insideVertical
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait left
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait outside
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait right
    extends officeDashJsLib.WordNs.BorderLocation
  
  @js.native
  sealed trait top
    extends officeDashJsLib.WordNs.BorderLocation
  
  /* "All" */ val all: all with java.lang.String = js.native
  /* "Bottom" */ val bottom: bottom with java.lang.String = js.native
  /* "Inside" */ val inside: inside with java.lang.String = js.native
  /* "InsideHorizontal" */ val insideHorizontal: insideHorizontal with java.lang.String = js.native
  /* "InsideVertical" */ val insideVertical: insideVertical with java.lang.String = js.native
  /* "Left" */ val left: left with java.lang.String = js.native
  /* "Outside" */ val outside: outside with java.lang.String = js.native
  /* "Right" */ val right: right with java.lang.String = js.native
  /* "Top" */ val top: top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.BorderLocation with java.lang.String] = js.native
}

