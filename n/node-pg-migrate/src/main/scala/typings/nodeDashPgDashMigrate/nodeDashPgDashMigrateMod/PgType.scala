package typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod

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
  sealed trait BIGINT extends PgType
  
   // autoincrementing eight-byte integer
  @js.native
  sealed trait BIGSERIAL extends PgType
  
   // fixed-length bit string
  @js.native
  sealed trait BIT_1 extends PgType
  
   // variable-length bit string
  @js.native
  sealed trait BIT_VARYING extends PgType
  
   // alias for boolean
  @js.native
  sealed trait BOOL extends PgType
  
   // logical Boolean (true/false)
  @js.native
  sealed trait BOOLEAN extends PgType
  
   // rectangular box on a plane
  @js.native
  sealed trait BOX extends PgType
  
   // binary data ("byte array")
  @js.native
  sealed trait BYTEA extends PgType
  
   // alias for character
  @js.native
  sealed trait CHAR extends PgType
  
   // fixed-length character string
  @js.native
  sealed trait CHARACTER extends PgType
  
   // variable-length character string
  @js.native
  sealed trait CHARACTER_VARYING extends PgType
  
   // IPv4 or IPv6 network address
  @js.native
  sealed trait CIDR extends PgType
  
   // circle on a plane
  @js.native
  sealed trait CIRCLE extends PgType
  
   // calendar date (year, month, day)
  @js.native
  sealed trait DATE extends PgType
  
   // float8	double precision floating-point number (8 bytes)
  @js.native
  sealed trait DOUBLE_PRECISION extends PgType
  
   // alias for REAL
  @js.native
  sealed trait FLOAT4 extends PgType
  
   // IPv4 or IPv6 host address
  @js.native
  sealed trait INET extends PgType
  
   // alias for int
  @js.native
  sealed trait INT extends PgType
  
   // alias for smallint
  @js.native
  sealed trait INT2 extends PgType
  
   // alias for int
  @js.native
  sealed trait INT4 extends PgType
  
   // alias for bigint
  @js.native
  sealed trait INT8 extends PgType
  
   // signed four-byte integer
  @js.native
  sealed trait INTEGER extends PgType
  
   // time span
  @js.native
  sealed trait INTERVAL extends PgType
  
   // textual JSON data
  @js.native
  sealed trait JSON extends PgType
  
   // binary JSON data, decomposed
  @js.native
  sealed trait JSONB extends PgType
  
   // infinite line on a plane
  @js.native
  sealed trait LINE extends PgType
  
   // line segment on a plane
  @js.native
  sealed trait LSEG extends PgType
  
   // MAC (Media Access Control) address
  @js.native
  sealed trait MACADDR extends PgType
  
   // currency amount
  @js.native
  sealed trait MONEY extends PgType
  
   // exact numeric of selectable precision
  @js.native
  sealed trait NUMERIC extends PgType
  
   // geometric path on a plane
  @js.native
  sealed trait PATH extends PgType
  
   // PostgreSQL Log Sequence Number
  @js.native
  sealed trait PG_LSN extends PgType
  
   // geometric point on a plane
  @js.native
  sealed trait POINT extends PgType
  
   // closed geometric path on a plane
  @js.native
  sealed trait POLYGON extends PgType
  
   // single precision floating-point number (4 bytes)
  @js.native
  sealed trait REAL extends PgType
  
   // autoincrementing four-byte integer
  @js.native
  sealed trait SERIAL extends PgType
  
   // alias for smallserial
  @js.native
  sealed trait SERIAL2 extends PgType
  
   // alias for serial
  @js.native
  sealed trait SERIAL4 extends PgType
  
   // alias for bigserial
  @js.native
  sealed trait SERIAL8 extends PgType
  
   // signed two-byte integer
  @js.native
  sealed trait SMALLINT extends PgType
  
   // autoincrementing two-byte integer
  @js.native
  sealed trait SMALLSERIAL extends PgType
  
   // variable-length character string
  @js.native
  sealed trait TEXT extends PgType
  
   // time of day (no time zone)
  @js.native
  sealed trait TIME extends PgType
  
   // date and time (no time zone)
  @js.native
  sealed trait TIMESTAMP extends PgType
  
   // alias of timestamp with time zone
  @js.native
  sealed trait TIMESTAMPTZ extends PgType
  
   // alias of timestamp
  @js.native
  sealed trait TIMESTAMP_WITHOUT_TIME_ZONE extends PgType
  
   // date and time, including time zone
  @js.native
  sealed trait TIMESTAMP_WITH_TIME_ZONE extends PgType
  
   // alias of time with time zone
  @js.native
  sealed trait TIMETZ extends PgType
  
   // alias of time
  @js.native
  sealed trait TIME_WITHOUT_TIME_ZONE extends PgType
  
   // time of day, including time zone
  @js.native
  sealed trait TIME_WITH_TIME_ZONE extends PgType
  
   // text search query
  @js.native
  sealed trait TSQUERY extends PgType
  
   // text search document
  @js.native
  sealed trait TSVECTOR extends PgType
  
   // user-level transaction ID snapshot
  @js.native
  sealed trait TXID_SNAPSHOT extends PgType
  
   // universally unique identifier
  @js.native
  sealed trait UUID extends PgType
  
   // alias for bit varying
  @js.native
  sealed trait VARBIT extends PgType
  
   // alias for character varying
  @js.native
  sealed trait VARCHAR extends PgType
  
   // XML data
  @js.native
  sealed trait XML extends PgType
  
  /* "bigint" */ val BIGINT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BIGINT with String = js.native
  /* "bigserial" */ val BIGSERIAL: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BIGSERIAL with String = js.native
  /* "bit" */ val BIT_1: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BIT_1 with String = js.native
  /* "bit varying" */ val BIT_VARYING: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BIT_VARYING with String = js.native
  /* "bool" */ val BOOL: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BOOL with String = js.native
  /* "boolean" */ val BOOLEAN: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BOOLEAN with String = js.native
  /* "box" */ val BOX: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BOX with String = js.native
  /* "bytea" */ val BYTEA: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.BYTEA with String = js.native
  /* "char" */ val CHAR: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.CHAR with String = js.native
  /* "character" */ val CHARACTER: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.CHARACTER with String = js.native
  /* "character varying" */ val CHARACTER_VARYING: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.CHARACTER_VARYING with String = js.native
  /* "cidr" */ val CIDR: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.CIDR with String = js.native
  /* "circle" */ val CIRCLE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.CIRCLE with String = js.native
  /* "date" */ val DATE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.DATE with String = js.native
  /* "double precision" */ val DOUBLE_PRECISION: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.DOUBLE_PRECISION with String = js.native
  /* "float4" */ val FLOAT4: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.FLOAT4 with String = js.native
  /* "inet" */ val INET: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.INET with String = js.native
  /* "int" */ val INT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.INT with String = js.native
  /* "int2" */ val INT2: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.INT2 with String = js.native
  /* "int4" */ val INT4: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.INT4 with String = js.native
  /* "int8" */ val INT8: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.INT8 with String = js.native
  /* "integer" */ val INTEGER: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.INTEGER with String = js.native
  /* "interval" */ val INTERVAL: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.INTERVAL with String = js.native
  /* "json" */ val JSON: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.JSON with String = js.native
  /* "jsonb" */ val JSONB: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.JSONB with String = js.native
  /* "line" */ val LINE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.LINE with String = js.native
  /* "lseg" */ val LSEG: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.LSEG with String = js.native
  /* "macaddr" */ val MACADDR: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.MACADDR with String = js.native
  /* "money" */ val MONEY: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.MONEY with String = js.native
  /* "numeric" */ val NUMERIC: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.NUMERIC with String = js.native
  /* "path" */ val PATH: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.PATH with String = js.native
  /* "pg_lsn" */ val PG_LSN: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.PG_LSN with String = js.native
  /* "point" */ val POINT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.POINT with String = js.native
  /* "polygon" */ val POLYGON: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.POLYGON with String = js.native
  /* "real" */ val REAL: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.REAL with String = js.native
  /* "serial" */ val SERIAL: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.SERIAL with String = js.native
  /* "serial2" */ val SERIAL2: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.SERIAL2 with String = js.native
  /* "serial4" */ val SERIAL4: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.SERIAL4 with String = js.native
  /* "serial8" */ val SERIAL8: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.SERIAL8 with String = js.native
  /* "smallint" */ val SMALLINT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.SMALLINT with String = js.native
  /* "smallserial" */ val SMALLSERIAL: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.SMALLSERIAL with String = js.native
  /* "text" */ val TEXT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TEXT with String = js.native
  /* "time" */ val TIME: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIME with String = js.native
  /* "timestamp" */ val TIMESTAMP: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIMESTAMP with String = js.native
  /* "timestamptz" */ val TIMESTAMPTZ: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIMESTAMPTZ with String = js.native
  /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIMESTAMP_WITHOUT_TIME_ZONE with String = js.native
  /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIMESTAMP_WITH_TIME_ZONE with String = js.native
  /* "timetz" */ val TIMETZ: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIMETZ with String = js.native
  /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIME_WITHOUT_TIME_ZONE with String = js.native
  /* "time with time zone" */ val TIME_WITH_TIME_ZONE: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TIME_WITH_TIME_ZONE with String = js.native
  /* "tsquery" */ val TSQUERY: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TSQUERY with String = js.native
  /* "tsvector" */ val TSVECTOR: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TSVECTOR with String = js.native
  /* "txid_snapshot" */ val TXID_SNAPSHOT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.TXID_SNAPSHOT with String = js.native
  /* "uuid" */ val UUID: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.UUID with String = js.native
  /* "varbit" */ val VARBIT: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.VARBIT with String = js.native
  /* "varchar" */ val VARCHAR: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.VARCHAR with String = js.native
  /* "xml" */ val XML: typings.nodeDashPgDashMigrate.nodeDashPgDashMigrateMod.PgType.XML with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PgType with String] = js.native
}

