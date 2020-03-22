package typings.nodePgMigrate.distTypesMod

import typings.pg.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerOptionClient extends js.Object {
  var dbClient: Client
}

object RunnerOptionClient {
  @scala.inline
  def apply(dbClient: Client): RunnerOptionClient = {
    val __obj = js.Dynamic.literal(dbClient = dbClient.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunnerOptionClient]
  }
}

