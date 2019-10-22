package typings.playcanvas

import typings.playcanvas.pc.Application
import typings.playcanvas.pc.Entity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: Application
  var entity: Entity
}

object Anon_App {
  @scala.inline
  def apply(app: Application, entity: Entity): Anon_App = {
    val __obj = js.Dynamic.literal(app = app, entity = entity)
  
    __obj.asInstanceOf[Anon_App]
  }
}

