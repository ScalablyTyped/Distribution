package typings.mirrorx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait model extends js.Object {
  var effects: js.UndefOr[js.Any] = js.undefined
  var initialState: js.UndefOr[js.Any] = js.undefined
  var name: String
  var reducers: js.UndefOr[js.Any] = js.undefined
}

@JSImport("mirrorx", "model")
@js.native
object model extends js.Object {
  def apply(options: model): _model = js.native
}

