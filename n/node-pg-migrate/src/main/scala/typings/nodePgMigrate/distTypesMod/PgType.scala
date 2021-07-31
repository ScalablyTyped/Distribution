package typings.nodePgMigrate.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PgType extends StObject
@JSImport("node-pg-migrate/dist/types", "PgType")
@js.native
object PgType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PgType & String] = js.native
  
  @js.native
  sealed trait BIGINT
    extends StObject
       with PgType
  /* "bigint" */ val BIGINT: typings.nodePgMigrate.distTypesMod.PgType.BIGINT & String = js.native
  
  @js.native
  sealed trait BIGSERIAL
    extends StObject
       with PgType
  /* "bigserial" */ val BIGSERIAL: typings.nodePgMigrate.distTypesMod.PgType.BIGSERIAL & String = js.native
  
  @js.native
  sealed trait BIT_1
    extends StObject
       with PgType
  /* "bit" */ val BIT_1: typings.nodePgMigrate.distTypesMod.PgType.BIT_1 & String = js.native
  
  @js.native
  sealed trait BIT_VARYING
    extends StObject
       with PgType
  /* "bit varying" */ val BIT_VARYING: typings.nodePgMigrate.distTypesMod.PgType.BIT_VARYING & String = js.native
  
  @js.native
  sealed trait BOOL
    extends StObject
       with PgType
  /* "bool" */ val BOOL: typings.nodePgMigrate.distTypesMod.PgType.BOOL & String = js.native
  
  @js.native
  sealed trait BOOLEAN
    extends StObject
       with PgType
  /* "boolean" */ val BOOLEAN: typings.nodePgMigrate.distTypesMod.PgType.BOOLEAN & String = js.native
  
  @js.native
  sealed trait BOX
    extends StObject
       with PgType
  /* "box" */ val BOX: typings.nodePgMigrate.distTypesMod.PgType.BOX & String = js.native
  
  @js.native
  sealed trait BYTEA
    extends StObject
       with PgType
  /* "bytea" */ val BYTEA: typings.nodePgMigrate.distTypesMod.PgType.BYTEA & String = js.native
  
  @js.native
  sealed trait CHAR
    extends StObject
       with PgType
  /* "char" */ val CHAR: typings.nodePgMigrate.distTypesMod.PgType.CHAR & String = js.native
  
  @js.native
  sealed trait CHARACTER
    extends StObject
       with PgType
  /* "character" */ val CHARACTER: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER & String = js.native
  
  @js.native
  sealed trait CHARACTER_VARYING
    extends StObject
       with PgType
  /* "character varying" */ val CHARACTER_VARYING: typings.nodePgMigrate.distTypesMod.PgType.CHARACTER_VARYING & String = js.native
  
  @js.native
  sealed trait CIDR
    extends StObject
       with PgType
  /* "cidr" */ val CIDR: typings.nodePgMigrate.distTypesMod.PgType.CIDR & String = js.native
  
  @js.native
  sealed trait CIRCLE
    extends StObject
       with PgType
  /* "circle" */ val CIRCLE: typings.nodePgMigrate.distTypesMod.PgType.CIRCLE & String = js.native
  
  @js.native
  sealed trait DATE
    extends StObject
       with PgType
  /* "date" */ val DATE: typings.nodePgMigrate.distTypesMod.PgType.DATE & String = js.native
  
  @js.native
  sealed trait DOUBLE_PRECISION
    extends StObject
       with PgType
  /* "double precision" */ val DOUBLE_PRECISION: typings.nodePgMigrate.distTypesMod.PgType.DOUBLE_PRECISION & String = js.native
  
  @js.native
  sealed trait FLOAT4
    extends StObject
       with PgType
  /* "float4" */ val FLOAT4: typings.nodePgMigrate.distTypesMod.PgType.FLOAT4 & String = js.native
  
  @js.native
  sealed trait INET
    extends StObject
       with PgType
  /* "inet" */ val INET: typings.nodePgMigrate.distTypesMod.PgType.INET & String = js.native
  
  @js.native
  sealed trait INT
    extends StObject
       with PgType
  /* "int" */ val INT: typings.nodePgMigrate.distTypesMod.PgType.INT & String = js.native
  
  @js.native
  sealed trait INT2
    extends StObject
       with PgType
  /* "int2" */ val INT2: typings.nodePgMigrate.distTypesMod.PgType.INT2 & String = js.native
  
  @js.native
  sealed trait INT4
    extends StObject
       with PgType
  /* "int4" */ val INT4: typings.nodePgMigrate.distTypesMod.PgType.INT4 & String = js.native
  
  @js.native
  sealed trait INT8
    extends StObject
       with PgType
  /* "int8" */ val INT8: typings.nodePgMigrate.distTypesMod.PgType.INT8 & String = js.native
  
  @js.native
  sealed trait INTEGER
    extends StObject
       with PgType
  /* "integer" */ val INTEGER: typings.nodePgMigrate.distTypesMod.PgType.INTEGER & String = js.native
  
  @js.native
  sealed trait INTERVAL
    extends StObject
       with PgType
  /* "interval" */ val INTERVAL: typings.nodePgMigrate.distTypesMod.PgType.INTERVAL & String = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with PgType
  /* "json" */ val JSON: typings.nodePgMigrate.distTypesMod.PgType.JSON & String = js.native
  
  @js.native
  sealed trait JSONB
    extends StObject
       with PgType
  /* "jsonb" */ val JSONB: typings.nodePgMigrate.distTypesMod.PgType.JSONB & String = js.native
  
  @js.native
  sealed trait LINE
    extends StObject
       with PgType
  /* "line" */ val LINE: typings.nodePgMigrate.distTypesMod.PgType.LINE & String = js.native
  
  @js.native
  sealed trait LSEG
    extends StObject
       with PgType
  /* "lseg" */ val LSEG: typings.nodePgMigrate.distTypesMod.PgType.LSEG & String = js.native
  
  @js.native
  sealed trait MACADDR
    extends StObject
       with PgType
  /* "macaddr" */ val MACADDR: typings.nodePgMigrate.distTypesMod.PgType.MACADDR & String = js.native
  
  @js.native
  sealed trait MONEY
    extends StObject
       with PgType
  /* "money" */ val MONEY: typings.nodePgMigrate.distTypesMod.PgType.MONEY & String = js.native
  
  @js.native
  sealed trait NUMERIC
    extends StObject
       with PgType
  /* "numeric" */ val NUMERIC: typings.nodePgMigrate.distTypesMod.PgType.NUMERIC & String = js.native
  
  @js.native
  sealed trait PATH
    extends StObject
       with PgType
  /* "path" */ val PATH: typings.nodePgMigrate.distTypesMod.PgType.PATH & String = js.native
  
  @js.native
  sealed trait PG_LSN
    extends StObject
       with PgType
  /* "pg_lsn" */ val PG_LSN: typings.nodePgMigrate.distTypesMod.PgType.PG_LSN & String = js.native
  
  @js.native
  sealed trait POINT
    extends StObject
       with PgType
  /* "point" */ val POINT: typings.nodePgMigrate.distTypesMod.PgType.POINT & String = js.native
  
  @js.native
  sealed trait POLYGON
    extends StObject
       with PgType
  /* "polygon" */ val POLYGON: typings.nodePgMigrate.distTypesMod.PgType.POLYGON & String = js.native
  
  @js.native
  sealed trait REAL
    extends StObject
       with PgType
  /* "real" */ val REAL: typings.nodePgMigrate.distTypesMod.PgType.REAL & String = js.native
  
  @js.native
  sealed trait SERIAL
    extends StObject
       with PgType
  /* "serial" */ val SERIAL: typings.nodePgMigrate.distTypesMod.PgType.SERIAL & String = js.native
  
  @js.native
  sealed trait SERIAL2
    extends StObject
       with PgType
  /* "serial2" */ val SERIAL2: typings.nodePgMigrate.distTypesMod.PgType.SERIAL2 & String = js.native
  
  @js.native
  sealed trait SERIAL4
    extends StObject
       with PgType
  /* "serial4" */ val SERIAL4: typings.nodePgMigrate.distTypesMod.PgType.SERIAL4 & String = js.native
  
  @js.native
  sealed trait SERIAL8
    extends StObject
       with PgType
  /* "serial8" */ val SERIAL8: typings.nodePgMigrate.distTypesMod.PgType.SERIAL8 & String = js.native
  
  @js.native
  sealed trait SMALLINT
    extends StObject
       with PgType
  /* "smallint" */ val SMALLINT: typings.nodePgMigrate.distTypesMod.PgType.SMALLINT & String = js.native
  
  @js.native
  sealed trait SMALLSERIAL
    extends StObject
       with PgType
  /* "smallserial" */ val SMALLSERIAL: typings.nodePgMigrate.distTypesMod.PgType.SMALLSERIAL & String = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with PgType
  /* "text" */ val TEXT: typings.nodePgMigrate.distTypesMod.PgType.TEXT & String = js.native
  
  @js.native
  sealed trait TIME
    extends StObject
       with PgType
  /* "time" */ val TIME: typings.nodePgMigrate.distTypesMod.PgType.TIME & String = js.native
  
  @js.native
  sealed trait TIMESTAMP
    extends StObject
       with PgType
  /* "timestamp" */ val TIMESTAMP: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP & String = js.native
  
  @js.native
  sealed trait TIMESTAMPTZ
    extends StObject
       with PgType
  /* "timestamptz" */ val TIMESTAMPTZ: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMPTZ & String = js.native
  
  @js.native
  sealed trait TIMESTAMP_WITHOUT_TIME_ZONE
    extends StObject
       with PgType
  /* "timestamp without time zone" */ val TIMESTAMP_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITHOUT_TIME_ZONE & String = js.native
  
  @js.native
  sealed trait TIMESTAMP_WITH_TIME_ZONE
    extends StObject
       with PgType
  /* "timestamp with time zone" */ val TIMESTAMP_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIMESTAMP_WITH_TIME_ZONE & String = js.native
  
  @js.native
  sealed trait TIMETZ
    extends StObject
       with PgType
  /* "timetz" */ val TIMETZ: typings.nodePgMigrate.distTypesMod.PgType.TIMETZ & String = js.native
  
  @js.native
  sealed trait TIME_WITHOUT_TIME_ZONE
    extends StObject
       with PgType
  /* "without time zone" */ val TIME_WITHOUT_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITHOUT_TIME_ZONE & String = js.native
  
  @js.native
  sealed trait TIME_WITH_TIME_ZONE
    extends StObject
       with PgType
  /* "time with time zone" */ val TIME_WITH_TIME_ZONE: typings.nodePgMigrate.distTypesMod.PgType.TIME_WITH_TIME_ZONE & String = js.native
  
  @js.native
  sealed trait TSQUERY
    extends StObject
       with PgType
  /* "tsquery" */ val TSQUERY: typings.nodePgMigrate.distTypesMod.PgType.TSQUERY & String = js.native
  
  @js.native
  sealed trait TSVECTOR
    extends StObject
       with PgType
  /* "tsvector" */ val TSVECTOR: typings.nodePgMigrate.distTypesMod.PgType.TSVECTOR & String = js.native
  
  @js.native
  sealed trait TXID_SNAPSHOT
    extends StObject
       with PgType
  /* "txid_snapshot" */ val TXID_SNAPSHOT: typings.nodePgMigrate.distTypesMod.PgType.TXID_SNAPSHOT & String = js.native
  
  @js.native
  sealed trait UUID
    extends StObject
       with PgType
  /* "uuid" */ val UUID: typings.nodePgMigrate.distTypesMod.PgType.UUID & String = js.native
  
  @js.native
  sealed trait VARBIT
    extends StObject
       with PgType
  /* "varbit" */ val VARBIT: typings.nodePgMigrate.distTypesMod.PgType.VARBIT & String = js.native
  
  @js.native
  sealed trait VARCHAR
    extends StObject
       with PgType
  /* "varchar" */ val VARCHAR: typings.nodePgMigrate.distTypesMod.PgType.VARCHAR & String = js.native
  
  @js.native
  sealed trait XML
    extends StObject
       with PgType
  /* "xml" */ val XML: typings.nodePgMigrate.distTypesMod.PgType.XML & String = js.native
}
