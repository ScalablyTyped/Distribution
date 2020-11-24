package typings.nodePgMigrate.migrationBuilderMod

import typings.nodePgMigrate.distTypesMod.DB
import typings.nodePgMigrate.distTypesMod.Logger
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-pg-migrate/dist/migration-builder", JSImport.Default)
@js.native
class default protected () extends MigrationBuilderImpl {
  def this(db: DB, typeShorthands: js.UndefOr[scala.Nothing], shouldDecamelize: Boolean, logger: Logger) = this()
  def this(db: DB, typeShorthands: ColumnDefinitions, shouldDecamelize: Boolean, logger: Logger) = this()
}
