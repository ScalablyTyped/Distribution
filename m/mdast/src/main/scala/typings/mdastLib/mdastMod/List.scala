package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait List extends Parent {
  @JSName("children")
  var children_List: js.Array[ListContent]
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  var spread: js.UndefOr[scala.Boolean] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  @JSName("type")
  var type_List: mdastLib.mdastLibStrings.list
}

