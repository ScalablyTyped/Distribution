package typings.officeDashJsDashPreview.Word

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
  sealed trait bullet extends ListLevelType
  
  @js.native
  sealed trait number extends ListLevelType
  
  @js.native
  sealed trait picture extends ListLevelType
  
  /* "Bullet" */ val bullet: typings.officeDashJsDashPreview.Word.ListLevelType.bullet with String = js.native
  /* "Number" */ val number: typings.officeDashJsDashPreview.Word.ListLevelType.number with String = js.native
  /* "Picture" */ val picture: typings.officeDashJsDashPreview.Word.ListLevelType.picture with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ListLevelType with String] = js.native
}

