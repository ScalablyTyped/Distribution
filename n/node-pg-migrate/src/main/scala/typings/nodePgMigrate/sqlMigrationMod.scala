package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationBuilderActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/sqlMigration", JSImport.Namespace)
@js.native
object sqlMigrationMod extends js.Object {
  
  def default(sqlPath: String): js.Promise[MigrationBuilderActions] = js.native
  
  def getActions(content: String): MigrationBuilderActions = js.native
}
