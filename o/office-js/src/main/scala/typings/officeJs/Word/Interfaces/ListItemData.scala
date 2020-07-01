package typings.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `listItem.toJSON()`. */
trait ListItemData extends js.Object {
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.undefined
  /**
    *
    * Gets the list item bullet, number, or picture as a string. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the list item order number in relation to its siblings. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Double] = js.undefined
}

object ListItemData {
  @scala.inline
  def apply(
    level: js.UndefOr[Double] = js.undefined,
    listString: String = null,
    siblingIndex: js.UndefOr[Double] = js.undefined
  ): ListItemData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (listString != null) __obj.updateDynamic("listString")(listString.asInstanceOf[js.Any])
    if (!js.isUndefined(siblingIndex)) __obj.updateDynamic("siblingIndex")(siblingIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemData]
  }
}

