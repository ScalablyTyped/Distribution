package typings.orientjs.mod.Migration

import typings.orientjs.mod.ODB
import typings.orientjs.mod.OServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Migration.MigrationManager")
@js.native
/**
  * # Migration Manager
  *
  * @param config The configuration for the migration manager.
  */
class MigrationManager () extends js.Object {
  def this(config: MigrationManagerConfig) = this()
  var className: String = js.native
  var db: ODB = js.native
  var dir: String = js.native
  /**
    * Ensure the migration class exists.
    *
    * @promise {MigrationManager}  The manager instance with intact structure.
    */
  var ensureStructure: js.Promise[MigrationManager] = js.native
  var name: String = js.native
  var server: OServer = js.native
  /**
    * Apply the migration with the given name.
    *
    * @param   name The name of the migation.
    * @promise {Mixed} The result of the migration.
    */
  def applyMigration(name: String): js.Promise[_] = js.native
  /**
    * Create a new migration.
    *
    * @param   config  The name or configuration for the new migration.
    * @promise {string}                The full path to the created migration.
    */
  def create(param: String): js.Promise[String] = js.native
  /**
    * Revert the migration.
    *
    * @param   limit The maximum number of migrations to revert, if any.
    * @promise {Mixed} The result of the migration.
    */
  def down(): js.Promise[_] = js.native
  def down(limit: Double): js.Promise[_] = js.native
  /**
    * Generate the content for a migration.
    * @param  config The configuration object.
    * @return        The generated JavaScript source code.
    */
  def generateMigration(config: js.Any): String = js.native
  /**
    * List the migrations that have not yet been applied.
    *
    * @promise {string[]} An array of migration names
    */
  def list(): js.Promise[js.Array[String]] = js.native
  /**
    * Retrieve a list of applied migrations.
    *
    * @promise {Object[]} The applied migrations.
    */
  def listApplied(): js.Promise[js.Array[_]] = js.native
  /**
    * List all the available migrations.
    *
    * @promise {string[]} The names of the available migrations.
    */
  def listAvailable(): js.Promise[js.Array[String]] = js.native
  /**
    * Load the migration with the given name.
    *
    * @param     name The name of the migation.
    * @return      The loaded migration instance.
    */
  def loadMigration(name: String): typings.orientjs.mod.Migration.Migration = js.native
  /**
    * Revert the migration with the given name.
    *
    * @param   name The name of the migation.
    * @promise {Mixed} The result of the migration.
    */
  def revertMigration(name: String): js.Promise[_] = js.native
  /**
    * Perform the migration.
    *
    * @param   limit The maximum number of migrations to apply, if any.
    * @promise {Mixed} The result of the migration.
    */
  def up(): js.Promise[_] = js.native
  def up(limit: Double): js.Promise[_] = js.native
}

