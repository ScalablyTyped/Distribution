package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Contains a collection of {@link Word.Paragraph} objects.
  *
  * [Api set: WordApi 1.3]
  */
trait ListLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[Boolean] = js.undefined
}

object ListLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    levelExistences: js.UndefOr[Boolean] = js.undefined,
    levelTypes: js.UndefOr[Boolean] = js.undefined
  ): ListLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(levelExistences)) __obj.updateDynamic("levelExistences")(levelExistences.asInstanceOf[js.Any])
    if (!js.isUndefined(levelTypes)) __obj.updateDynamic("levelTypes")(levelTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLoadOptions]
  }
}

