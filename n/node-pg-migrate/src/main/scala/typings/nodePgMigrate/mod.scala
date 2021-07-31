package typings.nodePgMigrate

import typings.nodePgMigrate.dbMod.DBConnection
import typings.nodePgMigrate.distTypesMod.Logger
import typings.nodePgMigrate.distTypesMod.MigrationBuilderActions
import typings.nodePgMigrate.distTypesMod.RunnerOption
import typings.nodePgMigrate.migrationMod.CreateOptions
import typings.nodePgMigrate.migrationMod.FilenameFormat
import typings.nodePgMigrate.migrationMod.RunMigration
import typings.nodePgMigrate.nodePgMigrateStrings.js_
import typings.nodePgMigrate.nodePgMigrateStrings.sql
import typings.nodePgMigrate.nodePgMigrateStrings.ts
import typings.nodePgMigrate.pgLiteralMod.default
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-pg-migrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(options: RunnerOption): js.Promise[js.Array[RunMigration]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[RunMigration]]]
  
  @JSImport("node-pg-migrate", "Migration")
  @js.native
  class Migration protected ()
    extends typings.nodePgMigrate.migrationMod.Migration {
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
      typeShorthands: Unit,
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
  }
  /* static members */
  object Migration {
    
    @JSImport("node-pg-migrate", "Migration")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(name: String, directory: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create(name: String, directory: String, _language: Unit, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create(
      name: String,
      directory: String,
      _language: Unit,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create(
      name: String,
      directory: String,
      _language: Unit,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create(name: String, directory: String, _language: CreateOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create(name: String, directory: String, _language: CreateOptions, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def create_js(name: String, directory: String, _language: js_): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_js(name: String, directory: String, _language: js_, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def create_sql(name: String, directory: String, _language: sql): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_sql(name: String, directory: String, _language: sql, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    @scala.inline
    def create_ts(name: String, directory: String, _language: ts): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_ts(name: String, directory: String, _language: ts, _ignorePattern: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    @scala.inline
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: Unit,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(name.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], _language.asInstanceOf[js.Any], _ignorePattern.asInstanceOf[js.Any], _filenameFormat.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  }
  
  @JSImport("node-pg-migrate", "PgLiteral")
  @js.native
  class PgLiteral protected () extends default {
    def this(value: String) = this()
  }
  /* static members */
  object PgLiteral {
    
    @JSImport("node-pg-migrate", "PgLiteral")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def create(str: String): typings.nodePgMigrate.pgLiteralMod.PgLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(str.asInstanceOf[js.Any]).asInstanceOf[typings.nodePgMigrate.pgLiteralMod.PgLiteral]
  }
  
  @JSImport("node-pg-migrate", "PgType")
  @js.native
  object PgType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nodePgMigrate.distTypesMod.PgType & String] = js.native
    
    /* "bigint" */ val BIGINT: typings.nodePgMigrate.distTypesMod.PgType.BIGINT & String = js.native
    
    /* "bigserial" */ val BIGSERIAL: typings.nodePgMigrate.distTypesMod.PgType.BIGSERIAL & String = js.native
    
    /* "bit" */ val BIT_1: typings.nodePgMigrate.distTypesMod.PgType.BIT_1 & String = js.native
    
    /* "bit varying" */ val BIT_VARYING: typings.nodePgMigrate.distTypesMod.PgType.BIT_VARYING & String = js.native
    
    /* "bool" */ val BOOL: typings.nodePgMigrate.distTypesMod.PgType.BOOL & String = js.native
    
    /* "boolean" */ val BOOLEAN: typings.nodePgMigrate.distTypesMod.PgType.BOOLEAN & String = js.native
    
    /* "box" */ val BOX: typings.nodePgMigrate.distTypesMod.PgType.BOX & String = js.native
    
    /* "bytea" */ val BYTEA: typings.nodePgMigrate.distTypesMod.PgType.BYTEA & String = js.native
    
    /* "char" */ val CHAR: typings.nodePgMigrate.distTypesMod.PgType.CHAR & String = js.native
    
    /* "character" */ val CHARACTER: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER & String = js.native
    
    /* "character varying" */ val CHARACTER_VARYING: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER_VARYING & String = js.native
    
    /* "cidr" */ val CIDR: typings.nodePgMigrate.distTypesMod.PgType.CIDR & String = js.native
    
    /* "circle" */ val CIRCLE: typings.nodePgMigrate.distTypesMod.PgType.CIRCLE & String = js.native
    
    /* "date" */ val DATE: typings.nodePgMigrate.distTypesMod.PgType.DATE & String = js.native
    
    /* "double precision" */ val DOUBLE_PRECISION: typings.nodePgMigrate.distTypesMod.PgType.DOUBLE_PRECISION & String = js.native
    
    /* "float4" */ val FLOAT4: typings.nodePgMigrate.distTypesMod.PgType.FLOAT4 & String = js.native
    
    /* "inet" */ val INET: typings.nodePgMigrate.distTypesMod.PgType.INET & String = js.native
    
    /* "int" */ val INT: typings.nodePgMigrate.distTypesMod.PgType.INT & String = js.native
    
    /* "int2" */ val INT2: typings.nodePgMigrate.distTypesMod.PgType.INT2 & String = js.native
    
    /* "int4" */ val INT4: typings.nodePgMigrate.distTypesMod.PgType.INT4 & String = js.native
    
    /* "int8" */ val INT8: typings.nodePgMigrate.distTypesMod.PgType.INT8 & String = js.native
    
    /* "integer" */ val INTEGER: typings.nodePgMigrate.distTypesMod.PgType.INTEGER & String = js.native
    
    /* "interval" */ val INTERVAL: typings.nodePgMigrate.distTypesMod.PgType.INTERVAL & String = js.native
    
    /* "json" */ val JSON: typings.nodePgMigrate.distTypesMod.PgType.JSON & String = js.native
    
    /* "jsonb" */ val JSONB: typings.nodePgMigrate.distTypesMod.PgType.JSONB & String = js.native
    
    /* "line" */ val LINE: typings.nodePgMigrate.distTypesMod.PgType.LINE & String = js.native
    
    /* "lseg" */ val LSEG: typings.nodePgMigrate.distTypesMod.PgType.LSEG & String = js.native
    
    /* "macaddr" */ val MACADDR: typings.nodePgMigrate.distTypesMod.PgType.MACADDR & String = js.native
    
    /* "money" */ val MONEY: typings.nodePgMigrate.distTypesMod.PgType.MONEY & String = js.native
    
    /* "numeric" */ val NUMERIC: typings.nodePgMigrate.distTypesMod.PgType.NUMERIC & String = js.native
    
    /* "path" */ val PATH: typings.nodePgMigrate.distTypesMod.PgType.PATH & String = js.native
    
    /* "pg_lsn" */ val PG_LSN: typings.nodePgMigrate.distTypesMod.PgType.PG_LSN & String = js.native
    
    /* "point" */ val POINT: typings.nodePgMigrate.distTypesMod.PgType.POINT & String = js.native
    
    /* "polygon" */ val POLYGON: typings.nodePgMigrate.distTypesMod.PgType.POLYGON & String = js.native
    
    /* "real" */ val REAL: typings.nodePgMigrate.distTypesMod.PgType.REAL & String = js.native
    
    /* "serial" */ val SERIAL: typings.nodePgMigrate.distTypesMod.PgType.SERIAL & String = js.native
    
    /* "serial2" */ val SERIAL2: typings.nodePgMigrate.distTypesMod.PgType.SERIAL2 & String = js.native
    
    /* "serial4" */ val SERIAL4: typings.nodePgMigrate.distTypesMod.PgType.SERIAL4 & String = js.native
    
    /* "serial8" */ val SERIAL8: typings.nodePgMigrate.distTypesMod.PgType.SERIAL8 & String = js.native
    
    /* "smallint" */ val SMALLINT: typings.nodePgMigrate.distTypesMod.PgType.SMALLINT & String = js.native
    
    /* "smallserial" */ val SMALLSERIAL: typings.nodePgMigrate.distTypesMod.PgType.SMALLSERIAL & String = js.native
    
    /* "text" */ val TEXT: typings.nodePgMigrate.distTypesMod.PgType.TEXT & String = js.native
    
    /* "time" */ val TIME: typings.nodePgMigrate.distTypesMod.PgType.TIME & String = js.native
    
    /* "timestamp" */ val TIMESTAMP: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP & String = js.native
    
    /* "timestamptz" */ val TIMESTAMPTZ: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMPTZ & String = js.native
    
    /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITHOUT_TIME_ZONE & String = js.native
    
    /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITH_TIME_ZONE & String = js.native
    
    /* "timetz" */ val TIMETZ: typings.nodePgMigrate.distTypesMod.PgType.TIMETZ & String = js.native
    
    /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITHOUT_TIME_ZONE & String = js.native
    
    /* "time with time zone" */ val TIME_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITH_TIME_ZONE & String = js.native
    
    /* "tsquery" */ val TSQUERY: typings.nodePgMigrate.distTypesMod.PgType.TSQUERY & String = js.native
    
    /* "tsvector" */ val TSVECTOR: typings.nodePgMigrate.distTypesMod.PgType.TSVECTOR & String = js.native
    
    /* "txid_snapshot" */ val TXID_SNAPSHOT: typings.nodePgMigrate.distTypesMod.PgType.TXID_SNAPSHOT & String = js.native
    
    /* "uuid" */ val UUID: typings.nodePgMigrate.distTypesMod.PgType.UUID & String = js.native
    
    /* "varbit" */ val VARBIT: typings.nodePgMigrate.distTypesMod.PgType.VARBIT & String = js.native
    
    /* "varchar" */ val VARCHAR: typings.nodePgMigrate.distTypesMod.PgType.VARCHAR & String = js.native
    
    /* "xml" */ val XML: typings.nodePgMigrate.distTypesMod.PgType.XML & String = js.native
  }
}
