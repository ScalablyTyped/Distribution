package typings.playcanvas.anon

import typings.playcanvas.pc.Application
import typings.playcanvas.pc.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App extends js.Object {
  var app: Application
  var entity: Entity
}

object App {
  @scala.inline
  def apply(app: Application, entity: Entity): App = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[App]
  }
}

