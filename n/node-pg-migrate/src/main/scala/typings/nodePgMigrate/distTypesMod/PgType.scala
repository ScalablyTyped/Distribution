package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PgType extends js.Object
@JSImport("node-pg-migrate/dist/types", "PgType")
@js.native
object PgType extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PgType with String] = js.native
  
  @js.native
  sealed trait BIGINT extends PgType
  /* "bigint" */ @js.native
  object BIGINT extends TopLevel[BIGINT with String]
  
  @js.native
  sealed trait BIGSERIAL extends PgType
  /* "bigserial" */ @js.native
  object BIGSERIAL extends TopLevel[BIGSERIAL with String]
  
  @js.native
  sealed trait BIT_1 extends PgType
  /* "bit" */ @js.native
  object BIT_1 extends TopLevel[BIT_1 with String]
  
  @js.native
  sealed trait BIT_VARYING extends PgType
  /* "bit varying" */ @js.native
  object BIT_VARYING extends TopLevel[BIT_VARYING with String]
  
  @js.native
  sealed trait BOOL extends PgType
  /* "bool" */ @js.native
  object BOOL extends TopLevel[BOOL with String]
  
  @js.native
  sealed trait BOOLEAN extends PgType
  /* "boolean" */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with String]
  
  @js.native
  sealed trait BOX extends PgType
  /* "box" */ @js.native
  object BOX extends TopLevel[BOX with String]
  
  @js.native
  sealed trait BYTEA extends PgType
  /* "bytea" */ @js.native
  object BYTEA extends TopLevel[BYTEA with String]
  
  @js.native
  sealed trait CHAR extends PgType
  /* "char" */ @js.native
  object CHAR extends TopLevel[CHAR with String]
  
  @js.native
  sealed trait CHARACTER extends PgType
  /* "character" */ @js.native
  object CHARACTER extends TopLevel[CHARACTER with String]
  
  @js.native
  sealed trait CHARACTER_VARYING extends PgType
  /* "character varying" */ @js.native
  object CHARACTER_VARYING extends TopLevel[CHARACTER_VARYING with String]
  
  @js.native
  sealed trait CIDR extends PgType
  /* "cidr" */ @js.native
  object CIDR extends TopLevel[CIDR with String]
  
  @js.native
  sealed trait CIRCLE extends PgType
  /* "circle" */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with String]
  
  @js.native
  sealed trait DATE extends PgType
  /* "date" */ @js.native
  object DATE extends TopLevel[DATE with String]
  
  @js.native
  sealed trait DOUBLE_PRECISION extends PgType
  /* "double precision" */ @js.native
  object DOUBLE_PRECISION extends TopLevel[DOUBLE_PRECISION with String]
  
  @js.native
  sealed trait FLOAT4 extends PgType
  /* "float4" */ @js.native
  object FLOAT4 extends TopLevel[FLOAT4 with String]
  
  @js.native
  sealed trait INET extends PgType
  /* "inet" */ @js.native
  object INET extends TopLevel[INET with String]
  
  @js.native
  sealed trait INT extends PgType
  /* "int" */ @js.native
  object INT extends TopLevel[INT with String]
  
  @js.native
  sealed trait INT2 extends PgType
  /* "int2" */ @js.native
  object INT2 extends TopLevel[INT2 with String]
  
  @js.native
  sealed trait INT4 extends PgType
  /* "int4" */ @js.native
  object INT4 extends TopLevel[INT4 with String]
  
  @js.native
  sealed trait INT8 extends PgType
  /* "int8" */ @js.native
  object INT8 extends TopLevel[INT8 with String]
  
  @js.native
  sealed trait INTEGER extends PgType
  /* "integer" */ @js.native
  object INTEGER extends TopLevel[INTEGER with String]
  
  @js.native
  sealed trait INTERVAL extends PgType
  /* "interval" */ @js.native
  object INTERVAL extends TopLevel[INTERVAL with String]
  
  @js.native
  sealed trait JSON extends PgType
  /* "json" */ @js.native
  object JSON extends TopLevel[JSON with String]
  
  @js.native
  sealed trait JSONB extends PgType
  /* "jsonb" */ @js.native
  object JSONB extends TopLevel[JSONB with String]
  
  @js.native
  sealed trait LINE extends PgType
  /* "line" */ @js.native
  object LINE extends TopLevel[LINE with String]
  
  @js.native
  sealed trait LSEG extends PgType
  /* "lseg" */ @js.native
  object LSEG extends TopLevel[LSEG with String]
  
  @js.native
  sealed trait MACADDR extends PgType
  /* "macaddr" */ @js.native
  object MACADDR extends TopLevel[MACADDR with String]
  
  @js.native
  sealed trait MONEY extends PgType
  /* "money" */ @js.native
  object MONEY extends TopLevel[MONEY with String]
  
  @js.native
  sealed trait NUMERIC extends PgType
  /* "numeric" */ @js.native
  object NUMERIC extends TopLevel[NUMERIC with String]
  
  @js.native
  sealed trait PATH extends PgType
  /* "path" */ @js.native
  object PATH extends TopLevel[PATH with String]
  
  @js.native
  sealed trait PG_LSN extends PgType
  /* "pg_lsn" */ @js.native
  object PG_LSN extends TopLevel[PG_LSN with String]
  
  @js.native
  sealed trait POINT extends PgType
  /* "point" */ @js.native
  object POINT extends TopLevel[POINT with String]
  
  @js.native
  sealed trait POLYGON extends PgType
  /* "polygon" */ @js.native
  object POLYGON extends TopLevel[POLYGON with String]
  
  @js.native
  sealed trait REAL extends PgType
  /* "real" */ @js.native
  object REAL extends TopLevel[REAL with String]
  
  @js.native
  sealed trait SERIAL extends PgType
  /* "serial" */ @js.native
  object SERIAL extends TopLevel[SERIAL with String]
  
  @js.native
  sealed trait SERIAL2 extends PgType
  /* "serial2" */ @js.native
  object SERIAL2 extends TopLevel[SERIAL2 with String]
  
  @js.native
  sealed trait SERIAL4 extends PgType
  /* "serial4" */ @js.native
  object SERIAL4 extends TopLevel[SERIAL4 with String]
  
  @js.native
  sealed trait SERIAL8 extends PgType
  /* "serial8" */ @js.native
  object SERIAL8 extends TopLevel[SERIAL8 with String]
  
  @js.native
  sealed trait SMALLINT extends PgType
  /* "smallint" */ @js.native
  object SMALLINT extends TopLevel[SMALLINT with String]
  
  @js.native
  sealed trait SMALLSERIAL extends PgType
  /* "smallserial" */ @js.native
  object SMALLSERIAL extends TopLevel[SMALLSERIAL with String]
  
  @js.native
  sealed trait TEXT extends PgType
  /* "text" */ @js.native
  object TEXT extends TopLevel[TEXT with String]
  
  @js.native
  sealed trait TIME extends PgType
  /* "time" */ @js.native
  object TIME extends TopLevel[TIME with String]
  
  @js.native
  sealed trait TIMESTAMP extends PgType
  /* "timestamp" */ @js.native
  object TIMESTAMP extends TopLevel[TIMESTAMP with String]
  
  @js.native
  sealed trait TIMESTAMPTZ extends PgType
  /* "timestamptz" */ @js.native
  object TIMESTAMPTZ extends TopLevel[TIMESTAMPTZ with String]
  
  @js.native
  sealed trait TIMESTAMP_WITHOUT_TIME_ZONE extends PgType
  /* "timestamp without time zone" */ @js.native
  object TIMESTAMP_WITHOUT_TIME_ZONE extends TopLevel[TIMESTAMP_WITHOUT_TIME_ZONE with String]
  
  @js.native
  sealed trait TIMESTAMP_WITH_TIME_ZONE extends PgType
  /* "timestamp with time zone" */ @js.native
  object TIMESTAMP_WITH_TIME_ZONE extends TopLevel[TIMESTAMP_WITH_TIME_ZONE with String]
  
  @js.native
  sealed trait TIMETZ extends PgType
  /* "timetz" */ @js.native
  object TIMETZ extends TopLevel[TIMETZ with String]
  
  @js.native
  sealed trait TIME_WITHOUT_TIME_ZONE extends PgType
  /* "without time zone" */ @js.native
  object TIME_WITHOUT_TIME_ZONE extends TopLevel[TIME_WITHOUT_TIME_ZONE with String]
  
  @js.native
  sealed trait TIME_WITH_TIME_ZONE extends PgType
  /* "time with time zone" */ @js.native
  object TIME_WITH_TIME_ZONE extends TopLevel[TIME_WITH_TIME_ZONE with String]
  
  @js.native
  sealed trait TSQUERY extends PgType
  /* "tsquery" */ @js.native
  object TSQUERY extends TopLevel[TSQUERY with String]
  
  @js.native
  sealed trait TSVECTOR extends PgType
  /* "tsvector" */ @js.native
  object TSVECTOR extends TopLevel[TSVECTOR with String]
  
  @js.native
  sealed trait TXID_SNAPSHOT extends PgType
  /* "txid_snapshot" */ @js.native
  object TXID_SNAPSHOT extends TopLevel[TXID_SNAPSHOT with String]
  
  @js.native
  sealed trait UUID extends PgType
  /* "uuid" */ @js.native
  object UUID extends TopLevel[UUID with String]
  
  @js.native
  sealed trait VARBIT extends PgType
  /* "varbit" */ @js.native
  object VARBIT extends TopLevel[VARBIT with String]
  
  @js.native
  sealed trait VARCHAR extends PgType
  /* "varchar" */ @js.native
  object VARCHAR extends TopLevel[VARCHAR with String]
  
  @js.native
  sealed trait XML extends PgType
  /* "xml" */ @js.native
  object XML extends TopLevel[XML with String]
}
