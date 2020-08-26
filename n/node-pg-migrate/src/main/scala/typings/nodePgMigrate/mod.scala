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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  }
  
  @js.native
  class PgLiteral protected () extends default {
    def this(str: String) = this()
  }
  
  def default(options: RunnerOption): js.Promise[js.Array[RunMigration]] = js.native
  /* static members */
  @js.native
  object Migration extends js.Object {
    def create(name: String, directory: String): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: js.UndefOr[scala.Nothing],
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    def create(name: String, directory: String, _language: js.UndefOr[scala.Nothing], _ignorePattern: String): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: js.UndefOr[scala.Nothing],
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    def create(name: String, directory: String, _language: CreateOptions): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    def create(name: String, directory: String, _language: CreateOptions, _ignorePattern: String): js.Promise[String] = js.native
    def create(
      name: String,
      directory: String,
      _language: CreateOptions,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_js(name: String, directory: String, _language: js_): js.Promise[String] = js.native
    @JSName("create")
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_js(name: String, directory: String, _language: js_, _ignorePattern: String): js.Promise[String] = js.native
    @JSName("create")
    def create_js(
      name: String,
      directory: String,
      _language: js_,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(name: String, directory: String, _language: sql): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(name: String, directory: String, _language: sql, _ignorePattern: String): js.Promise[String] = js.native
    @JSName("create")
    def create_sql(
      name: String,
      directory: String,
      _language: sql,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(name: String, directory: String, _language: ts): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: js.UndefOr[scala.Nothing],
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(name: String, directory: String, _language: ts, _ignorePattern: String): js.Promise[String] = js.native
    @JSName("create")
    def create_ts(
      name: String,
      directory: String,
      _language: ts,
      _ignorePattern: String,
      _filenameFormat: FilenameFormat
    ): js.Promise[String] = js.native
  }
  
  /* static members */
  @js.native
  object PgLiteral extends js.Object {
    def create(str: String): typings.nodePgMigrate.pgLiteralMod.PgLiteral = js.native
  }
  
  @js.native
  object PgType extends js.Object {
    /* "bigint" */ val BIGINT: typings.nodePgMigrate.distTypesMod.PgType.BIGINT with String = js.native
    /* "bigserial" */ val BIGSERIAL: typings.nodePgMigrate.distTypesMod.PgType.BIGSERIAL with String = js.native
    /* "bit" */ val BIT_1: typings.nodePgMigrate.distTypesMod.PgType.BIT_1 with String = js.native
    /* "bit varying" */ val BIT_VARYING: typings.nodePgMigrate.distTypesMod.PgType.BIT_VARYING with String = js.native
    /* "bool" */ val BOOL: typings.nodePgMigrate.distTypesMod.PgType.BOOL with String = js.native
    /* "boolean" */ val BOOLEAN: typings.nodePgMigrate.distTypesMod.PgType.BOOLEAN with String = js.native
    /* "box" */ val BOX: typings.nodePgMigrate.distTypesMod.PgType.BOX with String = js.native
    /* "bytea" */ val BYTEA: typings.nodePgMigrate.distTypesMod.PgType.BYTEA with String = js.native
    /* "char" */ val CHAR: typings.nodePgMigrate.distTypesMod.PgType.CHAR with String = js.native
    /* "character" */ val CHARACTER: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER with String = js.native
    /* "character varying" */ val CHARACTER_VARYING: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER_VARYING with String = js.native
    /* "cidr" */ val CIDR: typings.nodePgMigrate.distTypesMod.PgType.CIDR with String = js.native
    /* "circle" */ val CIRCLE: typings.nodePgMigrate.distTypesMod.PgType.CIRCLE with String = js.native
    /* "date" */ val DATE: typings.nodePgMigrate.distTypesMod.PgType.DATE with String = js.native
    /* "double precision" */ val DOUBLE_PRECISION: typings.nodePgMigrate.distTypesMod.PgType.DOUBLE_PRECISION with String = js.native
    /* "float4" */ val FLOAT4: typings.nodePgMigrate.distTypesMod.PgType.FLOAT4 with String = js.native
    /* "inet" */ val INET: typings.nodePgMigrate.distTypesMod.PgType.INET with String = js.native
    /* "int" */ val INT: typings.nodePgMigrate.distTypesMod.PgType.INT with String = js.native
    /* "int2" */ val INT2: typings.nodePgMigrate.distTypesMod.PgType.INT2 with String = js.native
    /* "int4" */ val INT4: typings.nodePgMigrate.distTypesMod.PgType.INT4 with String = js.native
    /* "int8" */ val INT8: typings.nodePgMigrate.distTypesMod.PgType.INT8 with String = js.native
    /* "integer" */ val INTEGER: typings.nodePgMigrate.distTypesMod.PgType.INTEGER with String = js.native
    /* "interval" */ val INTERVAL: typings.nodePgMigrate.distTypesMod.PgType.INTERVAL with String = js.native
    /* "json" */ val JSON: typings.nodePgMigrate.distTypesMod.PgType.JSON with String = js.native
    /* "jsonb" */ val JSONB: typings.nodePgMigrate.distTypesMod.PgType.JSONB with String = js.native
    /* "line" */ val LINE: typings.nodePgMigrate.distTypesMod.PgType.LINE with String = js.native
    /* "lseg" */ val LSEG: typings.nodePgMigrate.distTypesMod.PgType.LSEG with String = js.native
    /* "macaddr" */ val MACADDR: typings.nodePgMigrate.distTypesMod.PgType.MACADDR with String = js.native
    /* "money" */ val MONEY: typings.nodePgMigrate.distTypesMod.PgType.MONEY with String = js.native
    /* "numeric" */ val NUMERIC: typings.nodePgMigrate.distTypesMod.PgType.NUMERIC with String = js.native
    /* "path" */ val PATH: typings.nodePgMigrate.distTypesMod.PgType.PATH with String = js.native
    /* "pg_lsn" */ val PG_LSN: typings.nodePgMigrate.distTypesMod.PgType.PG_LSN with String = js.native
    /* "point" */ val POINT: typings.nodePgMigrate.distTypesMod.PgType.POINT with String = js.native
    /* "polygon" */ val POLYGON: typings.nodePgMigrate.distTypesMod.PgType.POLYGON with String = js.native
    /* "real" */ val REAL: typings.nodePgMigrate.distTypesMod.PgType.REAL with String = js.native
    /* "serial" */ val SERIAL: typings.nodePgMigrate.distTypesMod.PgType.SERIAL with String = js.native
    /* "serial2" */ val SERIAL2: typings.nodePgMigrate.distTypesMod.PgType.SERIAL2 with String = js.native
    /* "serial4" */ val SERIAL4: typings.nodePgMigrate.distTypesMod.PgType.SERIAL4 with String = js.native
    /* "serial8" */ val SERIAL8: typings.nodePgMigrate.distTypesMod.PgType.SERIAL8 with String = js.native
    /* "smallint" */ val SMALLINT: typings.nodePgMigrate.distTypesMod.PgType.SMALLINT with String = js.native
    /* "smallserial" */ val SMALLSERIAL: typings.nodePgMigrate.distTypesMod.PgType.SMALLSERIAL with String = js.native
    /* "text" */ val TEXT: typings.nodePgMigrate.distTypesMod.PgType.TEXT with String = js.native
    /* "time" */ val TIME: typings.nodePgMigrate.distTypesMod.PgType.TIME with String = js.native
    /* "timestamp" */ val TIMESTAMP: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP with String = js.native
    /* "timestamptz" */ val TIMESTAMPTZ: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMPTZ with String = js.native
    /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITHOUT_TIME_ZONE with String = js.native
    /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITH_TIME_ZONE with String = js.native
    /* "timetz" */ val TIMETZ: typings.nodePgMigrate.distTypesMod.PgType.TIMETZ with String = js.native
    /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITHOUT_TIME_ZONE with String = js.native
    /* "time with time zone" */ val TIME_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITH_TIME_ZONE with String = js.native
    /* "tsquery" */ val TSQUERY: typings.nodePgMigrate.distTypesMod.PgType.TSQUERY with String = js.native
    /* "tsvector" */ val TSVECTOR: typings.nodePgMigrate.distTypesMod.PgType.TSVECTOR with String = js.native
    /* "txid_snapshot" */ val TXID_SNAPSHOT: typings.nodePgMigrate.distTypesMod.PgType.TXID_SNAPSHOT with String = js.native
    /* "uuid" */ val UUID: typings.nodePgMigrate.distTypesMod.PgType.UUID with String = js.native
    /* "varbit" */ val VARBIT: typings.nodePgMigrate.distTypesMod.PgType.VARBIT with String = js.native
    /* "varchar" */ val VARCHAR: typings.nodePgMigrate.distTypesMod.PgType.VARCHAR with String = js.native
    /* "xml" */ val XML: typings.nodePgMigrate.distTypesMod.PgType.XML with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.nodePgMigrate.distTypesMod.PgType with String] = js.native
  }
  
}

