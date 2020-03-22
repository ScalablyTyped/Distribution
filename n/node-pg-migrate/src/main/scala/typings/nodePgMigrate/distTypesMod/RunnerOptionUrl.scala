package typings.nodePgMigrate.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerOptionUrl extends js.Object {
  var databaseUrl: String | ClientConfig
}

object RunnerOptionUrl {
  @scala.inline
  def apply(databaseUrl: String | ClientConfig): RunnerOptionUrl = {
    val __obj = js.Dynamic.literal(databaseUrl = databaseUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunnerOptionUrl]
  }
}

