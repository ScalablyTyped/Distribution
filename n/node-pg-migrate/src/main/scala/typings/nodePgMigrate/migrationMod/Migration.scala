package typings.nodePgMigrate.migrationMod

import typings.nodePgMigrate.dbMod.DBConnection
import typings.nodePgMigrate.distTypesMod.MigrationAction
import typings.nodePgMigrate.distTypesMod.MigrationBuilderActions
import typings.nodePgMigrate.distTypesMod.MigrationDirection
import typings.nodePgMigrate.distTypesMod.RunnerOption
import typings.nodePgMigrate.migrationBuilderMod.default
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import typings.nodePgMigrate.nodePgMigrateStrings.js_
import typings.nodePgMigrate.nodePgMigrateStrings.sql
import typings.nodePgMigrate.nodePgMigrateStrings.ts
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import typings.pg.mod.QueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/migration", "Migration")
@js.native
class Migration protected () extends RunMigration {
  def this(db: DBConnection, migrationPath: String, hasUpDown: MigrationBuilderActions, options: RunnerOption) = this()
  def this(
    db: DBConnection,
    migrationPath: String,
    hasUpDown: MigrationBuilderActions,
    options: RunnerOption,
    typeShorthands: ColumnDefinitions
  ) = this()
  def this(
    db: DBConnection,
    migrationPath: String,
    hasUpDown: MigrationBuilderActions,
    options: RunnerOption,
    typeShorthands: ColumnDefinitions,
    log: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  ) = this()
  val db: DBConnection = js.native
  var down: js.UndefOr[`false` | MigrationAction] = js.native
  /* CompleteClass */
  override val name: String = js.native
  val options: RunnerOption = js.native
  /* CompleteClass */
  override val path: String = js.native
  /* CompleteClass */
  override val timestamp: Double = js.native
  val typeShorthands: js.UndefOr[ColumnDefinitions] = js.native
  var up: js.UndefOr[`false` | MigrationAction] = js.native
  def _apply(action: MigrationAction, pgm: default): js.Promise[_] = js.native
  def _getAction(direction: MigrationDirection): MigrationAction = js.native
  def _getMarkAsRun(action: MigrationAction): String = js.native
  @JSName("apply")
  def apply(direction: MigrationDirection): js.Promise[_] = js.native
  def log(): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def markAsRun(direction: MigrationDirection): js.Promise[QueryResult[_]] = js.native
}

/* static members */
@JSImport("node-pg-migrate/dist/migration", "Migration")
@js.native
object Migration extends js.Object {
  def create(name: String, directory: String): js.Promise[String] = js.native
  @JSName("create")
  def create_js(name: String, directory: String, language: js_): js.Promise[String] = js.native
  @JSName("create")
  def create_js(name: String, directory: String, language: js_, ignorePattern: String): js.Promise[String] = js.native
  @JSName("create")
  def create_sql(name: String, directory: String, language: sql): js.Promise[String] = js.native
  @JSName("create")
  def create_sql(name: String, directory: String, language: sql, ignorePattern: String): js.Promise[String] = js.native
  @JSName("create")
  def create_ts(name: String, directory: String, language: ts): js.Promise[String] = js.native
  @JSName("create")
  def create_ts(name: String, directory: String, language: ts, ignorePattern: String): js.Promise[String] = js.native
}

