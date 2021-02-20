package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationBuilderActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlMigrationMod {
  
  @JSImport("node-pg-migrate/dist/sqlMigration", JSImport.Default)
  @js.native
  def default(sqlPath: String): js.Promise[MigrationBuilderActions] = js.native
  
  @JSImport("node-pg-migrate/dist/sqlMigration", "getActions")
  @js.native
  def getActions(content: String): MigrationBuilderActions = js.native
}
