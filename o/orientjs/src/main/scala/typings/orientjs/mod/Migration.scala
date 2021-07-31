package typings.orientjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Migration {
  
  @JSImport("orientjs", "Migration.Manager")
  @js.native
  class Manager protected () extends MigrationManager {
    def this(config: MigrationManagerConfig) = this()
  }
  
  @JSImport("orientjs", "Migration.Migration")
  @js.native
  class Migration () extends StObject {
    
    var db: ODB = js.native
    
    def down(): js.Promise[js.Any] = js.native
    
    var name: String = js.native
    
    var server: OServer = js.native
    
    def up(): js.Promise[js.Any] = js.native
  }
  
  @JSImport("orientjs", "Migration.MigrationManager")
  @js.native
  /**
    * # Migration Manager
    *
    * @param config The configuration for the migration manager.
    */
  class MigrationManager () extends StObject {
    def this(config: MigrationManagerConfig) = this()
    
    /**
      * Apply the migration with the given name.
      *
      * @param   name The name of the migation.
      * @promise {Mixed} The result of the migration.
      */
    def applyMigration(name: String): js.Promise[js.Any] = js.native
    
    var className: String = js.native
    
    /**
      * Create a new migration.
      *
      * @param   config  The name or configuration for the new migration.
      * @promise {string}                The full path to the created migration.
      */
    def create(param: String): js.Promise[String] = js.native
    
    var db: ODB = js.native
    
    var dir: String = js.native
    
    /**
      * Revert the migration.
      *
      * @param   limit The maximum number of migrations to revert, if any.
      * @promise {Mixed} The result of the migration.
      */
    def down(): js.Promise[js.Any] = js.native
    def down(limit: Double): js.Promise[js.Any] = js.native
    
    /**
      * Ensure the migration class exists.
      *
      * @promise {MigrationManager}  The manager instance with intact structure.
      */
    var ensureStructure: js.Promise[MigrationManager] = js.native
    
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
    def listApplied(): js.Promise[js.Array[js.Any]] = js.native
    
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
    
    var name: String = js.native
    
    /**
      * Revert the migration with the given name.
      *
      * @param   name The name of the migation.
      * @promise {Mixed} The result of the migration.
      */
    def revertMigration(name: String): js.Promise[js.Any] = js.native
    
    var server: OServer = js.native
    
    /**
      * Perform the migration.
      *
      * @param   limit The maximum number of migrations to apply, if any.
      * @promise {Mixed} The result of the migration.
      */
    def up(): js.Promise[js.Any] = js.native
    def up(limit: Double): js.Promise[js.Any] = js.native
  }
  
  trait MigrationManagerConfig extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var db: js.UndefOr[ODB] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object MigrationManagerConfig {
    
    @scala.inline
    def apply(): MigrationManagerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MigrationManagerConfig]
    }
    
    @scala.inline
    implicit class MigrationManagerConfigMutableBuilder[Self <: MigrationManagerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDb(value: ODB): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
