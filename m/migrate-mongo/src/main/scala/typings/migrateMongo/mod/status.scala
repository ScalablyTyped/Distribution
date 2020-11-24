package typings.migrateMongo.mod

import typings.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("migrate-mongo", "status")
@js.native
object status extends js.Object {
  
  def apply(db: Db): js.Promise[js.Array[MigrationStatus]] = js.native
}
