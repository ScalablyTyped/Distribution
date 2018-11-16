package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PgType extends js.Object

@JSImport("node-pg-migrate", "PgType")
@js.native
object PgType extends js.Object {
   // signed eight-byte integer
  @js.native
  sealed trait BIGINT
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // autoincrementing eight-byte integer
  @js.native
  sealed trait BIGSERIAL
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // fixed-length bit string
  @js.native
  sealed trait BIT_1
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // variable-length bit string
  @js.native
  sealed trait BIT_VARYING
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for boolean
  @js.native
  sealed trait BOOL
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // logical Boolean (true/false)
  @js.native
  sealed trait BOOLEAN
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // rectangular box on a plane
  @js.native
  sealed trait BOX
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // binary data ("byte array")
  @js.native
  sealed trait BYTEA
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for character
  @js.native
  sealed trait CHAR
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // fixed-length character string
  @js.native
  sealed trait CHARACTER
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // variable-length character string
  @js.native
  sealed trait CHARACTER_VARYING
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // IPv4 or IPv6 network address
  @js.native
  sealed trait CIDR
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // circle on a plane
  @js.native
  sealed trait CIRCLE
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // calendar date (year, month, day)
  @js.native
  sealed trait DATE
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // float8	double precision floating-point number (8 bytes)
  @js.native
  sealed trait DOUBLE_PRECISION
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for REAL
  @js.native
  sealed trait FLOAT4
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // IPv4 or IPv6 host address
  @js.native
  sealed trait INET
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for int
  @js.native
  sealed trait INT
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for smallint
  @js.native
  sealed trait INT2
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for int
  @js.native
  sealed trait INT4
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for bigint
  @js.native
  sealed trait INT8
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // signed four-byte integer
  @js.native
  sealed trait INTEGER
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // time span
  @js.native
  sealed trait INTERVAL
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // textual JSON data
  @js.native
  sealed trait JSON
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // binary JSON data, decomposed
  @js.native
  sealed trait JSONB
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // infinite line on a plane
  @js.native
  sealed trait LINE
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // line segment on a plane
  @js.native
  sealed trait LSEG
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // MAC (Media Access Control) address
  @js.native
  sealed trait MACADDR
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // currency amount
  @js.native
  sealed trait MONEY
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // exact numeric of selectable precision
  @js.native
  sealed trait NUMERIC
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // geometric path on a plane
  @js.native
  sealed trait PATH
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // PostgreSQL Log Sequence Number
  @js.native
  sealed trait PG_LSN
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // geometric point on a plane
  @js.native
  sealed trait POINT
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // closed geometric path on a plane
  @js.native
  sealed trait POLYGON
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // single precision floating-point number (4 bytes)
  @js.native
  sealed trait REAL
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // autoincrementing four-byte integer
  @js.native
  sealed trait SERIAL
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for smallserial
  @js.native
  sealed trait SERIAL2
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for serial
  @js.native
  sealed trait SERIAL4
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for bigserial
  @js.native
  sealed trait SERIAL8
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // signed two-byte integer
  @js.native
  sealed trait SMALLINT
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // autoincrementing two-byte integer
  @js.native
  sealed trait SMALLSERIAL
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // variable-length character string
  @js.native
  sealed trait TEXT
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // time of day (no time zone)
  @js.native
  sealed trait TIME
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // date and time (no time zone)
  @js.native
  sealed trait TIMESTAMP
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias of timestamp with time zone
  @js.native
  sealed trait TIMESTAMPTZ
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias of timestamp
  @js.native
  sealed trait TIMESTAMP_WITHOUT_TIME_ZONE
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // date and time, including time zone
  @js.native
  sealed trait TIMESTAMP_WITH_TIME_ZONE
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias of time with time zone
  @js.native
  sealed trait TIMETZ
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias of time
  @js.native
  sealed trait TIME_WITHOUT_TIME_ZONE
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // time of day, including time zone
  @js.native
  sealed trait TIME_WITH_TIME_ZONE
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // text search query
  @js.native
  sealed trait TSQUERY
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // text search document
  @js.native
  sealed trait TSVECTOR
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // user-level transaction ID snapshot
  @js.native
  sealed trait TXID_SNAPSHOT
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // universally unique identifier
  @js.native
  sealed trait UUID
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for bit varying
  @js.native
  sealed trait VARBIT
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // alias for character varying
  @js.native
  sealed trait VARCHAR
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
   // XML data
  @js.native
  sealed trait XML
    extends nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType
  
  /* "bigint" */ val BIGINT: BIGINT with java.lang.String = js.native
  /* "bigserial" */ val BIGSERIAL: BIGSERIAL with java.lang.String = js.native
  /* "bit" */ val BIT_1: BIT_1 with java.lang.String = js.native
  /* "bit varying" */ val BIT_VARYING: BIT_VARYING with java.lang.String = js.native
  /* "bool" */ val BOOL: BOOL with java.lang.String = js.native
  /* "boolean" */ val BOOLEAN: BOOLEAN with java.lang.String = js.native
  /* "box" */ val BOX: BOX with java.lang.String = js.native
  /* "bytea" */ val BYTEA: BYTEA with java.lang.String = js.native
  /* "char" */ val CHAR: CHAR with java.lang.String = js.native
  /* "character" */ val CHARACTER: CHARACTER with java.lang.String = js.native
  /* "character varying" */ val CHARACTER_VARYING: CHARACTER_VARYING with java.lang.String = js.native
  /* "cidr" */ val CIDR: CIDR with java.lang.String = js.native
  /* "circle" */ val CIRCLE: CIRCLE with java.lang.String = js.native
  /* "date" */ val DATE: DATE with java.lang.String = js.native
  /* "double precision" */ val DOUBLE_PRECISION: DOUBLE_PRECISION with java.lang.String = js.native
  /* "float4" */ val FLOAT4: FLOAT4 with java.lang.String = js.native
  /* "inet" */ val INET: INET with java.lang.String = js.native
  /* "int" */ val INT: INT with java.lang.String = js.native
  /* "int2" */ val INT2: INT2 with java.lang.String = js.native
  /* "int4" */ val INT4: INT4 with java.lang.String = js.native
  /* "int8" */ val INT8: INT8 with java.lang.String = js.native
  /* "integer" */ val INTEGER: INTEGER with java.lang.String = js.native
  /* "interval" */ val INTERVAL: INTERVAL with java.lang.String = js.native
  /* "json" */ val JSON: JSON with java.lang.String = js.native
  /* "jsonb" */ val JSONB: JSONB with java.lang.String = js.native
  /* "line" */ val LINE: LINE with java.lang.String = js.native
  /* "lseg" */ val LSEG: LSEG with java.lang.String = js.native
  /* "macaddr" */ val MACADDR: MACADDR with java.lang.String = js.native
  /* "money" */ val MONEY: MONEY with java.lang.String = js.native
  /* "numeric" */ val NUMERIC: NUMERIC with java.lang.String = js.native
  /* "path" */ val PATH: PATH with java.lang.String = js.native
  /* "pg_lsn" */ val PG_LSN: PG_LSN with java.lang.String = js.native
  /* "point" */ val POINT: POINT with java.lang.String = js.native
  /* "polygon" */ val POLYGON: POLYGON with java.lang.String = js.native
  /* "real" */ val REAL: REAL with java.lang.String = js.native
  /* "serial" */ val SERIAL: SERIAL with java.lang.String = js.native
  /* "serial2" */ val SERIAL2: SERIAL2 with java.lang.String = js.native
  /* "serial4" */ val SERIAL4: SERIAL4 with java.lang.String = js.native
  /* "serial8" */ val SERIAL8: SERIAL8 with java.lang.String = js.native
  /* "smallint" */ val SMALLINT: SMALLINT with java.lang.String = js.native
  /* "smallserial" */ val SMALLSERIAL: SMALLSERIAL with java.lang.String = js.native
  /* "text" */ val TEXT: TEXT with java.lang.String = js.native
  /* "time" */ val TIME: TIME with java.lang.String = js.native
  /* "timestamp" */ val TIMESTAMP: TIMESTAMP with java.lang.String = js.native
  /* "timestamptz" */ val TIMESTAMPTZ: TIMESTAMPTZ with java.lang.String = js.native
  /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: TIMESTAMP_WITHOUT_TIME_ZONE with java.lang.String = js.native
  /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: TIMESTAMP_WITH_TIME_ZONE with java.lang.String = js.native
  /* "timetz" */ val TIMETZ: TIMETZ with java.lang.String = js.native
  /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: TIME_WITHOUT_TIME_ZONE with java.lang.String = js.native
  /* "time with time zone" */ val TIME_WITH_TIME_ZONE: TIME_WITH_TIME_ZONE with java.lang.String = js.native
  /* "tsquery" */ val TSQUERY: TSQUERY with java.lang.String = js.native
  /* "tsvector" */ val TSVECTOR: TSVECTOR with java.lang.String = js.native
  /* "txid_snapshot" */ val TXID_SNAPSHOT: TXID_SNAPSHOT with java.lang.String = js.native
  /* "uuid" */ val UUID: UUID with java.lang.String = js.native
  /* "varbit" */ val VARBIT: VARBIT with java.lang.String = js.native
  /* "varchar" */ val VARCHAR: VARCHAR with java.lang.String = js.native
  /* "xml" */ val XML: XML with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod.PgType with java.lang.String] = js.native
}

