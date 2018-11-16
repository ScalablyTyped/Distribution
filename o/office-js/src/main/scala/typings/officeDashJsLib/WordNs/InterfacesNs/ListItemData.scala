package typings
package officeDashJsLib.WordNs.InterfacesNs

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
  var level: js.UndefOr[scala.Double] = js.undefined
  /**
               *
               * Gets the list item bullet, number, or picture as a string. Read-only.
               *
               * [Api set: WordApi 1.3]
               */
  var listString: js.UndefOr[java.lang.String] = js.undefined
  /**
               *
               * Gets the list item order number in relation to its siblings. Read-only.
               *
               * [Api set: WordApi 1.3]
               */
  var siblingIndex: js.UndefOr[scala.Double] = js.undefined
}

