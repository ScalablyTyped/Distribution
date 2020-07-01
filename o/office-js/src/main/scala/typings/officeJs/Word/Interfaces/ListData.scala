package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.ListLevelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `list.toJSON()`. */
trait ListData extends js.Object {
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[js.Array[Boolean]] = js.undefined
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[js.Array[ListLevelType]] = js.undefined
  /**
    *
    * Gets paragraphs in the list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.undefined
}

object ListData {
  @scala.inline
  def apply(
    id: js.UndefOr[Double] = js.undefined,
    levelExistences: js.Array[Boolean] = null,
    levelTypes: js.Array[ListLevelType] = null,
    paragraphs: js.Array[ParagraphData] = null
  ): ListData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (levelExistences != null) __obj.updateDynamic("levelExistences")(levelExistences.asInstanceOf[js.Any])
    if (levelTypes != null) __obj.updateDynamic("levelTypes")(levelTypes.asInstanceOf[js.Any])
    if (paragraphs != null) __obj.updateDynamic("paragraphs")(paragraphs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListData]
  }
}

