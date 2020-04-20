package typings.playcanvas

import typings.playcanvas.pc.Application
import typings.playcanvas.pc.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  var app: Application
  var entity: Entity
}

object AnonApp {
  @scala.inline
  def apply(app: Application, entity: Entity): AnonApp = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
}

