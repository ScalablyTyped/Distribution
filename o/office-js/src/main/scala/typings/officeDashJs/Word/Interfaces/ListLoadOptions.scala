package typings.officeDashJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait ListLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[Boolean] = js.native
}

