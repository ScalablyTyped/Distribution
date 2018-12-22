package typings
package officeDashJsDashPreviewLib.WordNs

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
    extends officeDashJsDashPreviewLib.WordNs.BodyType
  
  @js.native
  sealed trait header
    extends officeDashJsDashPreviewLib.WordNs.BodyType
  
  @js.native
  sealed trait mainDoc
    extends officeDashJsDashPreviewLib.WordNs.BodyType
  
  @js.native
  sealed trait section
    extends officeDashJsDashPreviewLib.WordNs.BodyType
  
  @js.native
  sealed trait tableCell
    extends officeDashJsDashPreviewLib.WordNs.BodyType
  
  @js.native
  sealed trait unknown
    extends officeDashJsDashPreviewLib.WordNs.BodyType
  
  /* "Footer" */ val footer: footer with java.lang.String = js.native
  /* "Header" */ val header: header with java.lang.String = js.native
  /* "MainDoc" */ val mainDoc: mainDoc with java.lang.String = js.native
  /* "Section" */ val section: section with java.lang.String = js.native
  /* "TableCell" */ val tableCell: tableCell with java.lang.String = js.native
  /* "Unknown" */ val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsDashPreviewLib.WordNs.BodyType with java.lang.String] = js.native
}

