package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListLevelType extends js.Object

/**
     * [Api set: WordApi]
     */
@JSGlobal("Word.ListLevelType")
@js.native
object ListLevelType extends js.Object {
  @js.native
  sealed trait bullet
    extends officeDashJsLib.WordNs.ListLevelType
  
  @js.native
  sealed trait number
    extends officeDashJsLib.WordNs.ListLevelType
  
  @js.native
  sealed trait picture
    extends officeDashJsLib.WordNs.ListLevelType
  
  /* "Bullet" */ val bullet: bullet with java.lang.String = js.native
  /* "Number" */ val number: number with java.lang.String = js.native
  /* "Picture" */ val picture: picture with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.ListLevelType with java.lang.String] = js.native
}

