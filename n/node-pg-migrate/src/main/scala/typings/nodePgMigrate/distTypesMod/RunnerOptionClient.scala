package typings.nodePgMigrate.distTypesMod

import typings.pg.mod.ClientBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerOptionClient extends js.Object {
  var dbClient: ClientBase
}

object RunnerOptionClient {
  @scala.inline
  def apply(dbClient: ClientBase): RunnerOptionClient = {
    val __obj = js.Dynamic.literal(dbClient = dbClient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunnerOptionClient]
  }
}

