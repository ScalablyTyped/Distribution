package typings.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the paragraph list item format.
  *
  * [Api set: WordApi 1.3]
  */
trait ListItemLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the list item bullet, number, or picture as a string. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the list item order number in relation to its siblings. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Boolean] = js.undefined
}

object ListItemLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    level: js.UndefOr[Boolean] = js.undefined,
    listString: js.UndefOr[Boolean] = js.undefined,
    siblingIndex: js.UndefOr[Boolean] = js.undefined
  ): ListItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(listString)) __obj.updateDynamic("listString")(listString.asInstanceOf[js.Any])
    if (!js.isUndefined(siblingIndex)) __obj.updateDynamic("siblingIndex")(siblingIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemLoadOptions]
  }
}

