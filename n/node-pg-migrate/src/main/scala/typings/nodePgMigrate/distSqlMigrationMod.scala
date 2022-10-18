package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.MigrationBuilderActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSqlMigrationMod {
  
  @JSImport("node-pg-migrate/dist/sqlMigration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sqlPath: String): js.Promise[MigrationBuilderActions] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sqlPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MigrationBuilderActions]]
  
  inline def getActions(content: String): MigrationBuilderActions = ^.asInstanceOf[js.Dynamic].applyDynamic("getActions")(content.asInstanceOf[js.Any]).asInstanceOf[MigrationBuilderActions]
}
