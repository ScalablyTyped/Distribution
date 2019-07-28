package typings.playcanvas

import typings.playcanvas.pcNs.Application
import typings.playcanvas.pcNs.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: Application
  var enabled: js.UndefOr[Boolean] = js.undefined
  var entity: Entity
}

object Anon_App {
  @scala.inline
  def apply(app: Application, entity: Entity, enabled: js.UndefOr[Boolean] = js.undefined): Anon_App = {
    val __obj = js.Dynamic.literal(app = app, entity = entity)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_App]
  }
}

