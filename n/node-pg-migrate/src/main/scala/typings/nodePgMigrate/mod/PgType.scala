package typings.nodePgMigrate.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PgType with String] = js.native
  /* "bigint" */ @js.native
  object BIGINT extends TopLevel[BIGINT with String]
  
  /* "bigserial" */ @js.native
  object BIGSERIAL extends TopLevel[BIGSERIAL with String]
  
  /* "bit" */ @js.native
  object BIT_1 extends TopLevel[BIT_1 with String]
  
  /* "bit varying" */ @js.native
  object BIT_VARYING extends TopLevel[BIT_VARYING with String]
  
  /* "bool" */ @js.native
  object BOOL extends TopLevel[BOOL with String]
  
  /* "boolean" */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with String]
  
  /* "box" */ @js.native
  object BOX extends TopLevel[BOX with String]
  
  /* "bytea" */ @js.native
  object BYTEA extends TopLevel[BYTEA with String]
  
  /* "char" */ @js.native
  object CHAR extends TopLevel[CHAR with String]
  
  /* "character" */ @js.native
  object CHARACTER extends TopLevel[CHARACTER with String]
  
  /* "character varying" */ @js.native
  object CHARACTER_VARYING extends TopLevel[CHARACTER_VARYING with String]
  
  /* "cidr" */ @js.native
  object CIDR extends TopLevel[CIDR with String]
  
  /* "circle" */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with String]
  
  /* "date" */ @js.native
  object DATE extends TopLevel[DATE with String]
  
  /* "double precision" */ @js.native
  object DOUBLE_PRECISION extends TopLevel[DOUBLE_PRECISION with String]
  
  /* "float4" */ @js.native
  object FLOAT4 extends TopLevel[FLOAT4 with String]
  
  /* "inet" */ @js.native
  object INET extends TopLevel[INET with String]
  
  /* "int" */ @js.native
  object INT extends TopLevel[INT with String]
  
  /* "int2" */ @js.native
  object INT2 extends TopLevel[INT2 with String]
  
  /* "int4" */ @js.native
  object INT4 extends TopLevel[INT4 with String]
  
  /* "int8" */ @js.native
  object INT8 extends TopLevel[INT8 with String]
  
  /* "integer" */ @js.native
  object INTEGER extends TopLevel[INTEGER with String]
  
  /* "interval" */ @js.native
  object INTERVAL extends TopLevel[INTERVAL with String]
  
  /* "json" */ @js.native
  object JSON extends TopLevel[JSON with String]
  
  /* "jsonb" */ @js.native
  object JSONB extends TopLevel[JSONB with String]
  
  /* "line" */ @js.native
  object LINE extends TopLevel[LINE with String]
  
  /* "lseg" */ @js.native
  object LSEG extends TopLevel[LSEG with String]
  
  /* "macaddr" */ @js.native
  object MACADDR extends TopLevel[MACADDR with String]
  
  /* "money" */ @js.native
  object MONEY extends TopLevel[MONEY with String]
  
  /* "numeric" */ @js.native
  object NUMERIC extends TopLevel[NUMERIC with String]
  
  /* "path" */ @js.native
  object PATH extends TopLevel[PATH with String]
  
  /* "pg_lsn" */ @js.native
  object PG_LSN extends TopLevel[PG_LSN with String]
  
  /* "point" */ @js.native
  object POINT extends TopLevel[POINT with String]
  
  /* "polygon" */ @js.native
  object POLYGON extends TopLevel[POLYGON with String]
  
  /* "real" */ @js.native
  object REAL extends TopLevel[REAL with String]
  
  /* "serial" */ @js.native
  object SERIAL extends TopLevel[SERIAL with String]
  
  /* "serial2" */ @js.native
  object SERIAL2 extends TopLevel[SERIAL2 with String]
  
  /* "serial4" */ @js.native
  object SERIAL4 extends TopLevel[SERIAL4 with String]
  
  /* "serial8" */ @js.native
  object SERIAL8 extends TopLevel[SERIAL8 with String]
  
  /* "smallint" */ @js.native
  object SMALLINT extends TopLevel[SMALLINT with String]
  
  /* "smallserial" */ @js.native
  object SMALLSERIAL extends TopLevel[SMALLSERIAL with String]
  
  /* "text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
  /* "time" */ @js.native
  object TIME extends TopLevel[TIME with String]
  
  /* "timestamp" */ @js.native
  object TIMESTAMP extends TopLevel[TIMESTAMP with String]
  
  /* "timestamptz" */ @js.native
  object TIMESTAMPTZ extends TopLevel[TIMESTAMPTZ with String]
  
  /* "timestamp without time zone" */ @js.native
  object TIMESTAMP_WITHOUT_TIME_ZONE extends TopLevel[TIMESTAMP_WITHOUT_TIME_ZONE with String]
  
  /* "timestamp with time zone" */ @js.native
  object TIMESTAMP_WITH_TIME_ZONE extends TopLevel[TIMESTAMP_WITH_TIME_ZONE with String]
  
  /* "timetz" */ @js.native
  object TIMETZ extends TopLevel[TIMETZ with String]
  
  /* "without time zone" */ @js.native
  object TIME_WITHOUT_TIME_ZONE extends TopLevel[TIME_WITHOUT_TIME_ZONE with String]
  
  /* "time with time zone" */ @js.native
  object TIME_WITH_TIME_ZONE extends TopLevel[TIME_WITH_TIME_ZONE with String]
  
  /* "tsquery" */ @js.native
  object TSQUERY extends TopLevel[TSQUERY with String]
  
  /* "tsvector" */ @js.native
  object TSVECTOR extends TopLevel[TSVECTOR with String]
  
  /* "txid_snapshot" */ @js.native
  object TXID_SNAPSHOT extends TopLevel[TXID_SNAPSHOT with String]
  
  /* "uuid" */ @js.native
  object UUID extends TopLevel[UUID with String]
  
  /* "varbit" */ @js.native
  object VARBIT extends TopLevel[VARBIT with String]
  
  /* "varchar" */ @js.native
  object VARCHAR extends TopLevel[VARCHAR with String]
  
  /* "xml" */ @js.native
  object XML extends TopLevel[XML with String]
  
}

