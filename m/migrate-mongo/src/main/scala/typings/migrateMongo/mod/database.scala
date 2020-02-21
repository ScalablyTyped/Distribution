package typings.migrateMongo.mod

import typings.migrateMongo.AnonClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("migrate-mongo", "database")
@js.native
object database extends js.Object {
  def connect(): js.Promise[AnonClient] = js.native
}

