package typings.nodePgMigrate

import typings.nodePgMigrate.dbMod.DBConnection
import typings.nodePgMigrate.distTypesMod.Logger
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object migrationMod {
  
  @js.native
  sealed trait FilenameFormat extends StObject
  @JSImport("node-pg-migrate/dist/migration", "FilenameFormat")
  @js.native
  object FilenameFormat extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FilenameFormat with String] = js.native
    
    @js.native
    sealed trait timestamp extends FilenameFormat
    /* "timestamp" */ val timestamp: typings.nodePgMigrate.migrationMod.FilenameFormat.timestamp with String = js.native
    
    @js.native
    sealed trait utc extends FilenameFormat
    /* "utc" */ val utc: typings.nodePgMigrate.migrationMod.FilenameFormat.utc with String = js.native
  }
  
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
      typeShorthands: js.UndefOr[scala.Nothing],
      logger: Logger
    ) = this()
    def this(
      db: DBConnection,
      migrationPath: String,
      hasUpDown: MigrationBuilderActions,
      options: RunnerOption,
      typeShorthands: ColumnDefinitions,
      logger: Logger
    ) = this()
    
    def _apply(action: MigrationAction, pgm: default): js.Promise[_] = js.native
    
    def _getAction(direction: MigrationDirection): MigrationAction = js.native
    
    def _getMarkAsRun(action: MigrationAction): String = js.native
    
    @JSName("apply")
    def apply(direction: MigrationDirection): js.Promise[_] = js.native
    
    val db: DBConnection = js.native
    
    var down: js.UndefOr[`false` | MigrationAction] = js.native
    
    val logger: Logger = js.native
    
    def markAsRun(direction: MigrationDirection): js.Promise[QueryResult[_]] = js.native
    
    val options: RunnerOption = js.native
    
    val typeShorthands: js.UndefOr[ColumnDefinitions] = js.native
    
    var up: js.UndefOr[`false` | MigrationAction] = js.native
  }
  /* static members */
  object Migration {
    
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(name: String, directory: String): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(
      name: String,
      directory: String,
      _language: js.UndefOr[scala.Nothing],
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(name: String, directory: String, _language: js.UndefOr[scala.Nothing], _ignorePattern: String): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(
      name: String,
      directory: String,
      _language: js.UndefOr[scala.Nothing],
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(name: String, directory: String, _language: CreateOptions): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(name: String, directory: String, _language: CreateOptions, _ignorePattern: String): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_js(name: String, directory: String, _language: js_): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_js(name: String, directory: String, _language: js_, _ignorePattern: String): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_sql(name: String, directory: String, _language: sql): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_sql(name: String, directory: String, _language: sql, _ignorePattern: String): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_ts(name: String, directory: String, _language: ts): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_ts(name: String, directory: String, _language: ts, _ignorePattern: String): js.Promise[String] = js.native
    @JSImport("node-pg-migrate/dist/migration", "Migration.create")
    @js.native
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
  }
  
  @JSImport("node-pg-migrate/dist/migration", "getTimestamp")
  @js.native
  def getTimestamp(logger: Logger, filename: String): Double = js.native
  
  @JSImport("node-pg-migrate/dist/migration", "loadMigrationFiles")
  @js.native
  def loadMigrationFiles(dir: String): js.Promise[js.Array[String]] = js.native
  @JSImport("node-pg-migrate/dist/migration", "loadMigrationFiles")
  @js.native
  def loadMigrationFiles(dir: String, ignorePattern: String): js.Promise[js.Array[String]] = js.native
  
  type CreateOptions = typings.nodePgMigrate.anon.FilenameFormat with (CreateOptionsTemplate | CreateOptionsDefault)
  
  @js.native
  trait CreateOptionsDefault extends StObject {
    
    var ignorePattern: js.UndefOr[String] = js.native
    
    var language: js.UndefOr[js_ | ts | sql] = js.native
  }
  object CreateOptionsDefault {
    
    @scala.inline
    def apply(): CreateOptionsDefault = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptionsDefault]
    }
    
    @scala.inline
    implicit class CreateOptionsDefaultMutableBuilder[Self <: CreateOptionsDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnorePattern(value: String): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
      
      @scala.inline
      def setLanguage(value: js_ | ts | sql): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    }
  }
  
  @js.native
  trait CreateOptionsTemplate extends StObject {
    
    var templateFileName: String = js.native
  }
  object CreateOptionsTemplate {
    
    @scala.inline
    def apply(templateFileName: String): CreateOptionsTemplate = {
      val __obj = js.Dynamic.literal(templateFileName = templateFileName.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateOptionsTemplate]
    }
    
    @scala.inline
    implicit class CreateOptionsTemplateMutableBuilder[Self <: CreateOptionsTemplate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTemplateFileName(value: String): Self = StObject.set(x, "templateFileName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RunMigration extends StObject {
    
    val name: String = js.native
    
    val path: String = js.native
    
    val timestamp: Double = js.native
  }
  object RunMigration {
    
    @scala.inline
    def apply(name: String, path: String, timestamp: Double): RunMigration = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunMigration]
    }
    
    @scala.inline
    implicit class RunMigrationMutableBuilder[Self <: RunMigration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
