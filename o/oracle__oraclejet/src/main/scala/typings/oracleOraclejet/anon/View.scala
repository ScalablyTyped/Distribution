package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait View
  extends /* key */ StringDictionary[js.Any] {
  var view: js.Array[Node]
  var viewModel: js.Object
}

object View {
  @scala.inline
  def apply(
    view: js.Array[Node],
    viewModel: js.Object,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): View = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[View]
  }
}

