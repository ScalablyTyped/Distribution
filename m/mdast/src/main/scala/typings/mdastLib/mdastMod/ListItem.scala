package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListItem extends Parent {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("children")
  var children_ListItem: js.Array[BlockContent]
  var spread: js.UndefOr[scala.Boolean] = js.undefined
  @JSName("type")
  var type_ListItem: mdastLib.mdastLibStrings.listItem
}

