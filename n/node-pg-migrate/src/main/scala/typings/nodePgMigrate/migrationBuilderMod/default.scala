package typings.nodePgMigrate.migrationBuilderMod

import typings.nodePgMigrate.distTypesMod.DB
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/migration-builder", JSImport.Default)
@js.native
class default protected () extends MigrationBuilderImpl {
  def this(db: DB, typeShorthands: js.UndefOr[scala.Nothing], shouldDecamelize: Boolean) = this()
  def this(db: DB, typeShorthands: ColumnDefinitions, shouldDecamelize: Boolean) = this()
}

