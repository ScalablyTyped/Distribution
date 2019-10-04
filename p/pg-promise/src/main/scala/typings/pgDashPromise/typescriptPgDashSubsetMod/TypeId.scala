package typings.pgDashPromise.typescriptPgDashSubsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeId extends js.Object

// Type id-s supported by PostgreSQL, copied from:
// http://github.com/brianc/node-pg-types/blob/master/lib/builtins.js
@JSImport("pg-promise/typescript/pg-subset", "TypeId")
@js.native
object TypeId extends js.Object {
  @js.native
  sealed trait ABSTIME extends TypeId
  
  @js.native
  sealed trait ACLITEM extends TypeId
  
  @js.native
  sealed trait BIT extends TypeId
  
  @js.native
  sealed trait BOOL extends TypeId
  
  @js.native
  sealed trait BPCHAR extends TypeId
  
  @js.native
  sealed trait BYTEA extends TypeId
  
  @js.native
  sealed trait CHAR extends TypeId
  
  @js.native
  sealed trait CID extends TypeId
  
  @js.native
  sealed trait CIDR extends TypeId
  
  @js.native
  sealed trait CIRCLE extends TypeId
  
  @js.native
  sealed trait DATE extends TypeId
  
  @js.native
  sealed trait FLOAT4 extends TypeId
  
  @js.native
  sealed trait FLOAT8 extends TypeId
  
  @js.native
  sealed trait GTSVECTOR extends TypeId
  
  @js.native
  sealed trait INET extends TypeId
  
  @js.native
  sealed trait INT2 extends TypeId
  
  @js.native
  sealed trait INT4 extends TypeId
  
  @js.native
  sealed trait INT8 extends TypeId
  
  @js.native
  sealed trait INTERVAL extends TypeId
  
  @js.native
  sealed trait JSON extends TypeId
  
  @js.native
  sealed trait JSONB extends TypeId
  
  @js.native
  sealed trait MACADDR extends TypeId
  
  @js.native
  sealed trait MACADDR8 extends TypeId
  
  @js.native
  sealed trait MONEY extends TypeId
  
  @js.native
  sealed trait NUMERIC extends TypeId
  
  @js.native
  sealed trait OID extends TypeId
  
  @js.native
  sealed trait PATH extends TypeId
  
  @js.native
  sealed trait PG_DEPENDENCIES extends TypeId
  
  @js.native
  sealed trait PG_LSN extends TypeId
  
  @js.native
  sealed trait PG_NDISTINCT extends TypeId
  
  @js.native
  sealed trait PG_NODE_TREE extends TypeId
  
  @js.native
  sealed trait POLYGON extends TypeId
  
  @js.native
  sealed trait REFCURSOR extends TypeId
  
  @js.native
  sealed trait REGCLASS extends TypeId
  
  @js.native
  sealed trait REGCONFIG extends TypeId
  
  @js.native
  sealed trait REGDICTIONARY extends TypeId
  
  @js.native
  sealed trait REGNAMESPACE extends TypeId
  
  @js.native
  sealed trait REGOPER extends TypeId
  
  @js.native
  sealed trait REGOPERATOR extends TypeId
  
  @js.native
  sealed trait REGPROC extends TypeId
  
  @js.native
  sealed trait REGPROCEDURE extends TypeId
  
  @js.native
  sealed trait REGROLE extends TypeId
  
  @js.native
  sealed trait REGTYPE extends TypeId
  
  @js.native
  sealed trait RELTIME extends TypeId
  
  @js.native
  sealed trait SMGR extends TypeId
  
  @js.native
  sealed trait TEXT extends TypeId
  
  @js.native
  sealed trait TID extends TypeId
  
  @js.native
  sealed trait TIME extends TypeId
  
  @js.native
  sealed trait TIMESTAMP extends TypeId
  
  @js.native
  sealed trait TIMESTAMPTZ extends TypeId
  
  @js.native
  sealed trait TIMETZ extends TypeId
  
  @js.native
  sealed trait TINTERVAL extends TypeId
  
  @js.native
  sealed trait TSQUERY extends TypeId
  
  @js.native
  sealed trait TSVECTOR extends TypeId
  
  @js.native
  sealed trait TXID_SNAPSHOT extends TypeId
  
  @js.native
  sealed trait UUID extends TypeId
  
  @js.native
  sealed trait VARBIT extends TypeId
  
  @js.native
  sealed trait VARCHAR extends TypeId
  
  @js.native
  sealed trait XID extends TypeId
  
  @js.native
  sealed trait XML extends TypeId
  
  /* 702 */ val ABSTIME: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.ABSTIME with Double = js.native
  /* 1033 */ val ACLITEM: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.ACLITEM with Double = js.native
  /* 1560 */ val BIT: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.BIT with Double = js.native
  /* 16 */ val BOOL: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.BOOL with Double = js.native
  /* 1042 */ val BPCHAR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.BPCHAR with Double = js.native
  /* 17 */ val BYTEA: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.BYTEA with Double = js.native
  /* 18 */ val CHAR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.CHAR with Double = js.native
  /* 29 */ val CID: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.CID with Double = js.native
  /* 650 */ val CIDR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.CIDR with Double = js.native
  /* 718 */ val CIRCLE: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.CIRCLE with Double = js.native
  /* 1082 */ val DATE: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.DATE with Double = js.native
  /* 700 */ val FLOAT4: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.FLOAT4 with Double = js.native
  /* 701 */ val FLOAT8: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.FLOAT8 with Double = js.native
  /* 3642 */ val GTSVECTOR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.GTSVECTOR with Double = js.native
  /* 869 */ val INET: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.INET with Double = js.native
  /* 21 */ val INT2: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.INT2 with Double = js.native
  /* 23 */ val INT4: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.INT4 with Double = js.native
  /* 20 */ val INT8: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.INT8 with Double = js.native
  /* 1186 */ val INTERVAL: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.INTERVAL with Double = js.native
  /* 114 */ val JSON: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.JSON with Double = js.native
  /* 3802 */ val JSONB: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.JSONB with Double = js.native
  /* 829 */ val MACADDR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.MACADDR with Double = js.native
  /* 774 */ val MACADDR8: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.MACADDR8 with Double = js.native
  /* 790 */ val MONEY: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.MONEY with Double = js.native
  /* 1700 */ val NUMERIC: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.NUMERIC with Double = js.native
  /* 26 */ val OID: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.OID with Double = js.native
  /* 602 */ val PATH: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.PATH with Double = js.native
  /* 3402 */ val PG_DEPENDENCIES: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.PG_DEPENDENCIES with Double = js.native
  /* 3220 */ val PG_LSN: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.PG_LSN with Double = js.native
  /* 3361 */ val PG_NDISTINCT: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.PG_NDISTINCT with Double = js.native
  /* 194 */ val PG_NODE_TREE: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.PG_NODE_TREE with Double = js.native
  /* 604 */ val POLYGON: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.POLYGON with Double = js.native
  /* 1790 */ val REFCURSOR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REFCURSOR with Double = js.native
  /* 2205 */ val REGCLASS: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGCLASS with Double = js.native
  /* 3734 */ val REGCONFIG: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGCONFIG with Double = js.native
  /* 3769 */ val REGDICTIONARY: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGDICTIONARY with Double = js.native
  /* 4089 */ val REGNAMESPACE: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGNAMESPACE with Double = js.native
  /* 2203 */ val REGOPER: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGOPER with Double = js.native
  /* 2204 */ val REGOPERATOR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGOPERATOR with Double = js.native
  /* 24 */ val REGPROC: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGPROC with Double = js.native
  /* 2202 */ val REGPROCEDURE: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGPROCEDURE with Double = js.native
  /* 4096 */ val REGROLE: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGROLE with Double = js.native
  /* 2206 */ val REGTYPE: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.REGTYPE with Double = js.native
  /* 703 */ val RELTIME: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.RELTIME with Double = js.native
  /* 210 */ val SMGR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.SMGR with Double = js.native
  /* 25 */ val TEXT: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TEXT with Double = js.native
  /* 27 */ val TID: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TID with Double = js.native
  /* 1083 */ val TIME: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TIME with Double = js.native
  /* 1114 */ val TIMESTAMP: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TIMESTAMP with Double = js.native
  /* 1184 */ val TIMESTAMPTZ: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TIMESTAMPTZ with Double = js.native
  /* 1266 */ val TIMETZ: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TIMETZ with Double = js.native
  /* 704 */ val TINTERVAL: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TINTERVAL with Double = js.native
  /* 3615 */ val TSQUERY: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TSQUERY with Double = js.native
  /* 3614 */ val TSVECTOR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TSVECTOR with Double = js.native
  /* 2970 */ val TXID_SNAPSHOT: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.TXID_SNAPSHOT with Double = js.native
  /* 2950 */ val UUID: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.UUID with Double = js.native
  /* 1562 */ val VARBIT: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.VARBIT with Double = js.native
  /* 1043 */ val VARCHAR: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.VARCHAR with Double = js.native
  /* 28 */ val XID: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.XID with Double = js.native
  /* 142 */ val XML: typings.pgDashPromise.typescriptPgDashSubsetMod.TypeId.XML with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId with Double] = js.native
}

