package typings.officeDashJsDashPreview.Word

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
  sealed trait footer extends BodyType
  
  @js.native
  sealed trait header extends BodyType
  
  @js.native
  sealed trait mainDoc extends BodyType
  
  @js.native
  sealed trait section extends BodyType
  
  @js.native
  sealed trait tableCell extends BodyType
  
  @js.native
  sealed trait unknown extends BodyType
  
  /* "Footer" */ val footer: typings.officeDashJsDashPreview.Word.BodyType.footer with String = js.native
  /* "Header" */ val header: typings.officeDashJsDashPreview.Word.BodyType.header with String = js.native
  /* "MainDoc" */ val mainDoc: typings.officeDashJsDashPreview.Word.BodyType.mainDoc with String = js.native
  /* "Section" */ val section: typings.officeDashJsDashPreview.Word.BodyType.section with String = js.native
  /* "TableCell" */ val tableCell: typings.officeDashJsDashPreview.Word.BodyType.tableCell with String = js.native
  /* "Unknown" */ val unknown: typings.officeDashJsDashPreview.Word.BodyType.unknown with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BodyType with String] = js.native
}

