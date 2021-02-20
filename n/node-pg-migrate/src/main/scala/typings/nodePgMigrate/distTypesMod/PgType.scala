package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PgType extends StObject
@JSImport("node-pg-migrate/dist/types", "PgType")
@js.native
object PgType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PgType with String] = js.native
  
  @js.native
  sealed trait BIGINT extends PgType
  /* "bigint" */ val BIGINT: typings.nodePgMigrate.distTypesMod.PgType.BIGINT with String = js.native
  
  @js.native
  sealed trait BIGSERIAL extends PgType
  /* "bigserial" */ val BIGSERIAL: typings.nodePgMigrate.distTypesMod.PgType.BIGSERIAL with String = js.native
  
  @js.native
  sealed trait BIT_1 extends PgType
  /* "bit" */ val BIT_1: typings.nodePgMigrate.distTypesMod.PgType.BIT_1 with String = js.native
  
  @js.native
  sealed trait BIT_VARYING extends PgType
  /* "bit varying" */ val BIT_VARYING: typings.nodePgMigrate.distTypesMod.PgType.BIT_VARYING with String = js.native
  
  @js.native
  sealed trait BOOL extends PgType
  /* "bool" */ val BOOL: typings.nodePgMigrate.distTypesMod.PgType.BOOL with String = js.native
  
  @js.native
  sealed trait BOOLEAN extends PgType
  /* "boolean" */ val BOOLEAN: typings.nodePgMigrate.distTypesMod.PgType.BOOLEAN with String = js.native
  
  @js.native
  sealed trait BOX extends PgType
  /* "box" */ val BOX: typings.nodePgMigrate.distTypesMod.PgType.BOX with String = js.native
  
  @js.native
  sealed trait BYTEA extends PgType
  /* "bytea" */ val BYTEA: typings.nodePgMigrate.distTypesMod.PgType.BYTEA with String = js.native
  
  @js.native
  sealed trait CHAR extends PgType
  /* "char" */ val CHAR: typings.nodePgMigrate.distTypesMod.PgType.CHAR with String = js.native
  
  @js.native
  sealed trait CHARACTER extends PgType
  /* "character" */ val CHARACTER: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER with String = js.native
  
  @js.native
  sealed trait CHARACTER_VARYING extends PgType
  /* "character varying" */ val CHARACTER_VARYING: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER_VARYING with String = js.native
  
  @js.native
  sealed trait CIDR extends PgType
  /* "cidr" */ val CIDR: typings.nodePgMigrate.distTypesMod.PgType.CIDR with String = js.native
  
  @js.native
  sealed trait CIRCLE extends PgType
  /* "circle" */ val CIRCLE: typings.nodePgMigrate.distTypesMod.PgType.CIRCLE with String = js.native
  
  @js.native
  sealed trait DATE extends PgType
  /* "date" */ val DATE: typings.nodePgMigrate.distTypesMod.PgType.DATE with String = js.native
  
  @js.native
  sealed trait DOUBLE_PRECISION extends PgType
  /* "double precision" */ val DOUBLE_PRECISION: typings.nodePgMigrate.distTypesMod.PgType.DOUBLE_PRECISION with String = js.native
  
  @js.native
  sealed trait FLOAT4 extends PgType
  /* "float4" */ val FLOAT4: typings.nodePgMigrate.distTypesMod.PgType.FLOAT4 with String = js.native
  
  @js.native
  sealed trait INET extends PgType
  /* "inet" */ val INET: typings.nodePgMigrate.distTypesMod.PgType.INET with String = js.native
  
  @js.native
  sealed trait INT extends PgType
  /* "int" */ val INT: typings.nodePgMigrate.distTypesMod.PgType.INT with String = js.native
  
  @js.native
  sealed trait INT2 extends PgType
  /* "int2" */ val INT2: typings.nodePgMigrate.distTypesMod.PgType.INT2 with String = js.native
  
  @js.native
  sealed trait INT4 extends PgType
  /* "int4" */ val INT4: typings.nodePgMigrate.distTypesMod.PgType.INT4 with String = js.native
  
  @js.native
  sealed trait INT8 extends PgType
  /* "int8" */ val INT8: typings.nodePgMigrate.distTypesMod.PgType.INT8 with String = js.native
  
  @js.native
  sealed trait INTEGER extends PgType
  /* "integer" */ val INTEGER: typings.nodePgMigrate.distTypesMod.PgType.INTEGER with String = js.native
  
  @js.native
  sealed trait INTERVAL extends PgType
  /* "interval" */ val INTERVAL: typings.nodePgMigrate.distTypesMod.PgType.INTERVAL with String = js.native
  
  @js.native
  sealed trait JSON extends PgType
  /* "json" */ val JSON: typings.nodePgMigrate.distTypesMod.PgType.JSON with String = js.native
  
  @js.native
  sealed trait JSONB extends PgType
  /* "jsonb" */ val JSONB: typings.nodePgMigrate.distTypesMod.PgType.JSONB with String = js.native
  
  @js.native
  sealed trait LINE extends PgType
  /* "line" */ val LINE: typings.nodePgMigrate.distTypesMod.PgType.LINE with String = js.native
  
  @js.native
  sealed trait LSEG extends PgType
  /* "lseg" */ val LSEG: typings.nodePgMigrate.distTypesMod.PgType.LSEG with String = js.native
  
  @js.native
  sealed trait MACADDR extends PgType
  /* "macaddr" */ val MACADDR: typings.nodePgMigrate.distTypesMod.PgType.MACADDR with String = js.native
  
  @js.native
  sealed trait MONEY extends PgType
  /* "money" */ val MONEY: typings.nodePgMigrate.distTypesMod.PgType.MONEY with String = js.native
  
  @js.native
  sealed trait NUMERIC extends PgType
  /* "numeric" */ val NUMERIC: typings.nodePgMigrate.distTypesMod.PgType.NUMERIC with String = js.native
  
  @js.native
  sealed trait PATH extends PgType
  /* "path" */ val PATH: typings.nodePgMigrate.distTypesMod.PgType.PATH with String = js.native
  
  @js.native
  sealed trait PG_LSN extends PgType
  /* "pg_lsn" */ val PG_LSN: typings.nodePgMigrate.distTypesMod.PgType.PG_LSN with String = js.native
  
  @js.native
  sealed trait POINT extends PgType
  /* "point" */ val POINT: typings.nodePgMigrate.distTypesMod.PgType.POINT with String = js.native
  
  @js.native
  sealed trait POLYGON extends PgType
  /* "polygon" */ val POLYGON: typings.nodePgMigrate.distTypesMod.PgType.POLYGON with String = js.native
  
  @js.native
  sealed trait REAL extends PgType
  /* "real" */ val REAL: typings.nodePgMigrate.distTypesMod.PgType.REAL with String = js.native
  
  @js.native
  sealed trait SERIAL extends PgType
  /* "serial" */ val SERIAL: typings.nodePgMigrate.distTypesMod.PgType.SERIAL with String = js.native
  
  @js.native
  sealed trait SERIAL2 extends PgType
  /* "serial2" */ val SERIAL2: typings.nodePgMigrate.distTypesMod.PgType.SERIAL2 with String = js.native
  
  @js.native
  sealed trait SERIAL4 extends PgType
  /* "serial4" */ val SERIAL4: typings.nodePgMigrate.distTypesMod.PgType.SERIAL4 with String = js.native
  
  @js.native
  sealed trait SERIAL8 extends PgType
  /* "serial8" */ val SERIAL8: typings.nodePgMigrate.distTypesMod.PgType.SERIAL8 with String = js.native
  
  @js.native
  sealed trait SMALLINT extends PgType
  /* "smallint" */ val SMALLINT: typings.nodePgMigrate.distTypesMod.PgType.SMALLINT with String = js.native
  
  @js.native
  sealed trait SMALLSERIAL extends PgType
  /* "smallserial" */ val SMALLSERIAL: typings.nodePgMigrate.distTypesMod.PgType.SMALLSERIAL with String = js.native
  
  @js.native
  sealed trait TEXT extends PgType
  /* "text" */ val TEXT: typings.nodePgMigrate.distTypesMod.PgType.TEXT with String = js.native
  
  @js.native
  sealed trait TIME extends PgType
  /* "time" */ val TIME: typings.nodePgMigrate.distTypesMod.PgType.TIME with String = js.native
  
  @js.native
  sealed trait TIMESTAMP extends PgType
  /* "timestamp" */ val TIMESTAMP: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP with String = js.native
  
  @js.native
  sealed trait TIMESTAMPTZ extends PgType
  /* "timestamptz" */ val TIMESTAMPTZ: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMPTZ with String = js.native
  
  @js.native
  sealed trait TIMESTAMP_WITHOUT_TIME_ZONE extends PgType
  /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITHOUT_TIME_ZONE with String = js.native
  
  @js.native
  sealed trait TIMESTAMP_WITH_TIME_ZONE extends PgType
  /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITH_TIME_ZONE with String = js.native
  
  @js.native
  sealed trait TIMETZ extends PgType
  /* "timetz" */ val TIMETZ: typings.nodePgMigrate.distTypesMod.PgType.TIMETZ with String = js.native
  
  @js.native
  sealed trait TIME_WITHOUT_TIME_ZONE extends PgType
  /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITHOUT_TIME_ZONE with String = js.native
  
  @js.native
  sealed trait TIME_WITH_TIME_ZONE extends PgType
  /* "time with time zone" */ val TIME_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITH_TIME_ZONE with String = js.native
  
  @js.native
  sealed trait TSQUERY extends PgType
  /* "tsquery" */ val TSQUERY: typings.nodePgMigrate.distTypesMod.PgType.TSQUERY with String = js.native
  
  @js.native
  sealed trait TSVECTOR extends PgType
  /* "tsvector" */ val TSVECTOR: typings.nodePgMigrate.distTypesMod.PgType.TSVECTOR with String = js.native
  
  @js.native
  sealed trait TXID_SNAPSHOT extends PgType
  /* "txid_snapshot" */ val TXID_SNAPSHOT: typings.nodePgMigrate.distTypesMod.PgType.TXID_SNAPSHOT with String = js.native
  
  @js.native
  sealed trait UUID extends PgType
  /* "uuid" */ val UUID: typings.nodePgMigrate.distTypesMod.PgType.UUID with String = js.native
  
  @js.native
  sealed trait VARBIT extends PgType
  /* "varbit" */ val VARBIT: typings.nodePgMigrate.distTypesMod.PgType.VARBIT with String = js.native
  
  @js.native
  sealed trait VARCHAR extends PgType
  /* "varchar" */ val VARCHAR: typings.nodePgMigrate.distTypesMod.PgType.VARCHAR with String = js.native
  
  @js.native
  sealed trait XML extends PgType
  /* "xml" */ val XML: typings.nodePgMigrate.distTypesMod.PgType.XML with String = js.native
}
