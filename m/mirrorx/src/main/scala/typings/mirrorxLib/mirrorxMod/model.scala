package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait model extends js.Object {
  var effects: js.UndefOr[js.Any] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
  var name: java.lang.String
  var reducers: js.UndefOr[js.Any] = js.undefined
}

object model {
  @scala.inline
  def apply(
    name: java.lang.String,
    effects: js.Any = null,
    initialState: js.Any = null,
    reducers: js.Any = null
  ): model = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (effects != null) __obj.updateDynamic("effects")(effects)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (reducers != null) __obj.updateDynamic("reducers")(reducers)
    __obj.asInstanceOf[model]
  }
}

