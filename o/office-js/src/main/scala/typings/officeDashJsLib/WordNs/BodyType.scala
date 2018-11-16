package typings
package officeDashJsLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BodyType extends js.Object

/**
     * [Api set: WordApi]
     */
@JSGlobal("Word.BodyType")
@js.native
object BodyType extends js.Object {
  @js.native
  sealed trait footer
    extends officeDashJsLib.WordNs.BodyType
  
  @js.native
  sealed trait header
    extends officeDashJsLib.WordNs.BodyType
  
  @js.native
  sealed trait mainDoc
    extends officeDashJsLib.WordNs.BodyType
  
  @js.native
  sealed trait section
    extends officeDashJsLib.WordNs.BodyType
  
  @js.native
  sealed trait tableCell
    extends officeDashJsLib.WordNs.BodyType
  
  @js.native
  sealed trait unknown
    extends officeDashJsLib.WordNs.BodyType
  
  /* "Footer" */ val footer: footer with java.lang.String = js.native
  /* "Header" */ val header: header with java.lang.String = js.native
  /* "MainDoc" */ val mainDoc: mainDoc with java.lang.String = js.native
  /* "Section" */ val section: section with java.lang.String = js.native
  /* "TableCell" */ val tableCell: tableCell with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.WordNs.BodyType with java.lang.String] = js.native
}

