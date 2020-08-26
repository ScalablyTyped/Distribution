package typings.mirrorx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait model extends js.Object {
  var effects: js.UndefOr[js.Any] = js.native
  var initialState: js.UndefOr[js.Any] = js.native
  var name: String = js.native
  var reducers: js.UndefOr[js.Any] = js.native
}

@JSImport("mirrorx", "model")
@js.native
object model extends js.Object {
  def apply(options: model): _model = js.native
}

