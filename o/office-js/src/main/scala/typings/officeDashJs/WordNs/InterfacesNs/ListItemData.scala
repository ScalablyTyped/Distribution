package typings.officeDashJs.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "listItem.toJSON()". */
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
  def apply(level: Int | Double = null, listString: String = null, siblingIndex: Int | Double = null): ListItemData = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (listString != null) __obj.updateDynamic("listString")(listString)
    if (siblingIndex != null) __obj.updateDynamic("siblingIndex")(siblingIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemData]
  }
}

