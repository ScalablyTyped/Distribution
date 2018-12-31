package typings
package orientjsLib.orientjsMod.orientjsNs.MigrationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationManager extends js.Object {
  var className: java.lang.String = js.native
  var db: orientjsLib.orientjsMod.orientjsNs.Db = js.native
  var dir: java.lang.String = js.native
  /**
    * Ensure the migration class exists.
    *
    * @promise {MigrationManager}  The manager instance with intact structure.
    */
  var ensureStructure: bluebirdLib.bluebirdMod.namespaced[MigrationManager] = js.native
  var name: java.lang.String = js.native
  var server: orientjsLib.orientjsMod.orientjsNs.Server = js.native
  /**
    * Apply the migration with the given name.
    *
    * @param   name The name of the migation.
    * @promise {Mixed} The result of the migration.
    */
  def applyMigration(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Create a new migration.
    *
    * @param   config  The name or configuration for the new migration.
    * @promise {string}                The full path to the created migration.
    */
  def create(param: java.lang.String): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Revert the migration.
    *
    * @param   limit The maximum number of migrations to revert, if any.
    * @promise {Mixed} The result of the migration.
    */
  def down(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def down(limit: scala.Double): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Generate the content for a migration.
    * @param  config The configuration object.
    * @return        The generated JavaScript source code.
    */
  def generateMigration(config: js.Any): java.lang.String = js.native
  /**
    * List the migrations that have not yet been applied.
    *
    * @promise {string[]} An array of migration names
    */
  def list(): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
    * Retrieve a list of applied migrations.
    *
    * @promise {Object[]} The applied migrations.
    */
  def listApplied(): bluebirdLib.bluebirdMod.namespaced[js.Array[_]] = js.native
  /**
    * List all the available migrations.
    *
    * @promise {string[]} The names of the available migrations.
    */
  def listAvailable(): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  /**
    * Load the migration with the given name.
    *
    * @param     name The name of the migation.
    * @return      The loaded migration instance.
    */
  def loadMigration(name: java.lang.String): Migration = js.native
  /**
    * Revert the migration with the given name.
    *
    * @param   name The name of the migation.
    * @promise {Mixed} The result of the migration.
    */
  def revertMigration(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Perform the migration.
    *
    * @param   limit The maximum number of migrations to apply, if any.
    * @promise {Mixed} The result of the migration.
    */
  def up(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def up(limit: scala.Double): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

