package typings.orientjs.orientjsMod

import typings.orientjs.orientjsMod.MigrationNs.Migration
import typings.orientjs.orientjsMod.MigrationNs.MigrationManager
import typings.orientjs.orientjsMod.MigrationNs.MigrationManagerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Migration")
@js.native
object MigrationNs extends js.Object {
  @js.native
  class Manager protected () extends MigrationManager {
    def this(config: MigrationManagerConfig) = this()
  }
  
  @js.native
  class Migration () extends js.Object {
    var db: Db = js.native
    var name: String = js.native
    var server: Server = js.native
    def configure(): Unit = js.native
    def configure(config: js.Any): Unit = js.native
    def down(): typings.bluebird.bluebirdMod.^[_] = js.native
    def up(): typings.bluebird.bluebirdMod.^[_] = js.native
  }
  
  @js.native
  /**
    * # Migration Manager
    *
    * @param config The configuration for the migration manager.
    */
  class MigrationManager () extends js.Object {
    def this(config: MigrationManagerConfig) = this()
    var className: String = js.native
    var db: Db = js.native
    var dir: String = js.native
    /**
      * Ensure the migration class exists.
      *
      * @promise {MigrationManager}  The manager instance with intact structure.
      */
    var ensureStructure: typings.bluebird.bluebirdMod.^[MigrationManager] = js.native
    var name: String = js.native
    var server: Server = js.native
    /**
      * Apply the migration with the given name.
      *
      * @param   name The name of the migation.
      * @promise {Mixed} The result of the migration.
      */
    def applyMigration(name: String): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * Create a new migration.
      *
      * @param   config  The name or configuration for the new migration.
      * @promise {string}                The full path to the created migration.
      */
    def create(param: String): typings.bluebird.bluebirdMod.^[String] = js.native
    /**
      * Revert the migration.
      *
      * @param   limit The maximum number of migrations to revert, if any.
      * @promise {Mixed} The result of the migration.
      */
    def down(): typings.bluebird.bluebirdMod.^[_] = js.native
    def down(limit: Double): typings.bluebird.bluebirdMod.^[_] = js.native
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
    def list(): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
    /**
      * Retrieve a list of applied migrations.
      *
      * @promise {Object[]} The applied migrations.
      */
    def listApplied(): typings.bluebird.bluebirdMod.^[js.Array[_]] = js.native
    /**
      * List all the available migrations.
      *
      * @promise {string[]} The names of the available migrations.
      */
    def listAvailable(): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
    /**
      * Load the migration with the given name.
      *
      * @param     name The name of the migation.
      * @return      The loaded migration instance.
      */
    def loadMigration(name: String): Migration = js.native
    /**
      * Revert the migration with the given name.
      *
      * @param   name The name of the migation.
      * @promise {Mixed} The result of the migration.
      */
    def revertMigration(name: String): typings.bluebird.bluebirdMod.^[_] = js.native
    /**
      * Perform the migration.
      *
      * @param   limit The maximum number of migrations to apply, if any.
      * @promise {Mixed} The result of the migration.
      */
    def up(): typings.bluebird.bluebirdMod.^[_] = js.native
    def up(limit: Double): typings.bluebird.bluebirdMod.^[_] = js.native
  }
  
  trait MigrationManagerConfig extends js.Object {
    var className: js.UndefOr[String] = js.undefined
    var db: js.UndefOr[Db] = js.undefined
    var dir: js.UndefOr[String] = js.undefined
    var name: js.UndefOr[String] = js.undefined
  }
  
}

