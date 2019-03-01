package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: playcanvasLib.pcNs.Application
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var entity: playcanvasLib.pcNs.Entity
}

object Anon_App {
  @scala.inline
  def apply(
    app: playcanvasLib.pcNs.Application,
    entity: playcanvasLib.pcNs.Entity,
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_App = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app")(app)
    __obj.updateDynamic("entity")(entity)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_App]
  }
}

