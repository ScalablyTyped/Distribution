package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeId extends StObject
// Type id-s supported by PostgreSQL, copied from:
// http://github.com/brianc/node-pg-types/blob/master/lib/builtins.js
@JSImport("pg-promise/typescript/pg-subset", "TypeId")
@js.native
object TypeId extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId with Double] = js.native
  
  @js.native
  sealed trait ABSTIME extends TypeId
  /* 702 */ val ABSTIME: typings.pgPromise.pgSubsetMod.TypeId.ABSTIME with Double = js.native
  
  @js.native
  sealed trait ACLITEM extends TypeId
  /* 1033 */ val ACLITEM: typings.pgPromise.pgSubsetMod.TypeId.ACLITEM with Double = js.native
  
  @js.native
  sealed trait BIT extends TypeId
  /* 1560 */ val BIT: typings.pgPromise.pgSubsetMod.TypeId.BIT with Double = js.native
  
  @js.native
  sealed trait BOOL extends TypeId
  /* 16 */ val BOOL: typings.pgPromise.pgSubsetMod.TypeId.BOOL with Double = js.native
  
  @js.native
  sealed trait BPCHAR extends TypeId
  /* 1042 */ val BPCHAR: typings.pgPromise.pgSubsetMod.TypeId.BPCHAR with Double = js.native
  
  @js.native
  sealed trait BYTEA extends TypeId
  /* 17 */ val BYTEA: typings.pgPromise.pgSubsetMod.TypeId.BYTEA with Double = js.native
  
  @js.native
  sealed trait CHAR extends TypeId
  /* 18 */ val CHAR: typings.pgPromise.pgSubsetMod.TypeId.CHAR with Double = js.native
  
  @js.native
  sealed trait CID extends TypeId
  /* 29 */ val CID: typings.pgPromise.pgSubsetMod.TypeId.CID with Double = js.native
  
  @js.native
  sealed trait CIDR extends TypeId
  /* 650 */ val CIDR: typings.pgPromise.pgSubsetMod.TypeId.CIDR with Double = js.native
  
  @js.native
  sealed trait CIRCLE extends TypeId
  /* 718 */ val CIRCLE: typings.pgPromise.pgSubsetMod.TypeId.CIRCLE with Double = js.native
  
  @js.native
  sealed trait DATE extends TypeId
  /* 1082 */ val DATE: typings.pgPromise.pgSubsetMod.TypeId.DATE with Double = js.native
  
  @js.native
  sealed trait FLOAT4 extends TypeId
  /* 700 */ val FLOAT4: typings.pgPromise.pgSubsetMod.TypeId.FLOAT4 with Double = js.native
  
  @js.native
  sealed trait FLOAT8 extends TypeId
  /* 701 */ val FLOAT8: typings.pgPromise.pgSubsetMod.TypeId.FLOAT8 with Double = js.native
  
  @js.native
  sealed trait GTSVECTOR extends TypeId
  /* 3642 */ val GTSVECTOR: typings.pgPromise.pgSubsetMod.TypeId.GTSVECTOR with Double = js.native
  
  @js.native
  sealed trait INET extends TypeId
  /* 869 */ val INET: typings.pgPromise.pgSubsetMod.TypeId.INET with Double = js.native
  
  @js.native
  sealed trait INT2 extends TypeId
  /* 21 */ val INT2: typings.pgPromise.pgSubsetMod.TypeId.INT2 with Double = js.native
  
  @js.native
  sealed trait INT4 extends TypeId
  /* 23 */ val INT4: typings.pgPromise.pgSubsetMod.TypeId.INT4 with Double = js.native
  
  @js.native
  sealed trait INT8 extends TypeId
  /* 20 */ val INT8: typings.pgPromise.pgSubsetMod.TypeId.INT8 with Double = js.native
  
  @js.native
  sealed trait INTERVAL extends TypeId
  /* 1186 */ val INTERVAL: typings.pgPromise.pgSubsetMod.TypeId.INTERVAL with Double = js.native
  
  @js.native
  sealed trait JSON extends TypeId
  /* 114 */ val JSON: typings.pgPromise.pgSubsetMod.TypeId.JSON with Double = js.native
  
  @js.native
  sealed trait JSONB extends TypeId
  /* 3802 */ val JSONB: typings.pgPromise.pgSubsetMod.TypeId.JSONB with Double = js.native
  
  @js.native
  sealed trait MACADDR extends TypeId
  /* 829 */ val MACADDR: typings.pgPromise.pgSubsetMod.TypeId.MACADDR with Double = js.native
  
  @js.native
  sealed trait MACADDR8 extends TypeId
  /* 774 */ val MACADDR8: typings.pgPromise.pgSubsetMod.TypeId.MACADDR8 with Double = js.native
  
  @js.native
  sealed trait MONEY extends TypeId
  /* 790 */ val MONEY: typings.pgPromise.pgSubsetMod.TypeId.MONEY with Double = js.native
  
  @js.native
  sealed trait NUMERIC extends TypeId
  /* 1700 */ val NUMERIC: typings.pgPromise.pgSubsetMod.TypeId.NUMERIC with Double = js.native
  
  @js.native
  sealed trait OID extends TypeId
  /* 26 */ val OID: typings.pgPromise.pgSubsetMod.TypeId.OID with Double = js.native
  
  @js.native
  sealed trait PATH extends TypeId
  /* 602 */ val PATH: typings.pgPromise.pgSubsetMod.TypeId.PATH with Double = js.native
  
  @js.native
  sealed trait PG_DEPENDENCIES extends TypeId
  /* 3402 */ val PG_DEPENDENCIES: typings.pgPromise.pgSubsetMod.TypeId.PG_DEPENDENCIES with Double = js.native
  
  @js.native
  sealed trait PG_LSN extends TypeId
  /* 3220 */ val PG_LSN: typings.pgPromise.pgSubsetMod.TypeId.PG_LSN with Double = js.native
  
  @js.native
  sealed trait PG_NDISTINCT extends TypeId
  /* 3361 */ val PG_NDISTINCT: typings.pgPromise.pgSubsetMod.TypeId.PG_NDISTINCT with Double = js.native
  
  @js.native
  sealed trait PG_NODE_TREE extends TypeId
  /* 194 */ val PG_NODE_TREE: typings.pgPromise.pgSubsetMod.TypeId.PG_NODE_TREE with Double = js.native
  
  @js.native
  sealed trait POLYGON extends TypeId
  /* 604 */ val POLYGON: typings.pgPromise.pgSubsetMod.TypeId.POLYGON with Double = js.native
  
  @js.native
  sealed trait REFCURSOR extends TypeId
  /* 1790 */ val REFCURSOR: typings.pgPromise.pgSubsetMod.TypeId.REFCURSOR with Double = js.native
  
  @js.native
  sealed trait REGCLASS extends TypeId
  /* 2205 */ val REGCLASS: typings.pgPromise.pgSubsetMod.TypeId.REGCLASS with Double = js.native
  
  @js.native
  sealed trait REGCONFIG extends TypeId
  /* 3734 */ val REGCONFIG: typings.pgPromise.pgSubsetMod.TypeId.REGCONFIG with Double = js.native
  
  @js.native
  sealed trait REGDICTIONARY extends TypeId
  /* 3769 */ val REGDICTIONARY: typings.pgPromise.pgSubsetMod.TypeId.REGDICTIONARY with Double = js.native
  
  @js.native
  sealed trait REGNAMESPACE extends TypeId
  /* 4089 */ val REGNAMESPACE: typings.pgPromise.pgSubsetMod.TypeId.REGNAMESPACE with Double = js.native
  
  @js.native
  sealed trait REGOPER extends TypeId
  /* 2203 */ val REGOPER: typings.pgPromise.pgSubsetMod.TypeId.REGOPER with Double = js.native
  
  @js.native
  sealed trait REGOPERATOR extends TypeId
  /* 2204 */ val REGOPERATOR: typings.pgPromise.pgSubsetMod.TypeId.REGOPERATOR with Double = js.native
  
  @js.native
  sealed trait REGPROC extends TypeId
  /* 24 */ val REGPROC: typings.pgPromise.pgSubsetMod.TypeId.REGPROC with Double = js.native
  
  @js.native
  sealed trait REGPROCEDURE extends TypeId
  /* 2202 */ val REGPROCEDURE: typings.pgPromise.pgSubsetMod.TypeId.REGPROCEDURE with Double = js.native
  
  @js.native
  sealed trait REGROLE extends TypeId
  /* 4096 */ val REGROLE: typings.pgPromise.pgSubsetMod.TypeId.REGROLE with Double = js.native
  
  @js.native
  sealed trait REGTYPE extends TypeId
  /* 2206 */ val REGTYPE: typings.pgPromise.pgSubsetMod.TypeId.REGTYPE with Double = js.native
  
  @js.native
  sealed trait RELTIME extends TypeId
  /* 703 */ val RELTIME: typings.pgPromise.pgSubsetMod.TypeId.RELTIME with Double = js.native
  
  @js.native
  sealed trait SMGR extends TypeId
  /* 210 */ val SMGR: typings.pgPromise.pgSubsetMod.TypeId.SMGR with Double = js.native
  
  @js.native
  sealed trait TEXT extends TypeId
  /* 25 */ val TEXT: typings.pgPromise.pgSubsetMod.TypeId.TEXT with Double = js.native
  
  @js.native
  sealed trait TID extends TypeId
  /* 27 */ val TID: typings.pgPromise.pgSubsetMod.TypeId.TID with Double = js.native
  
  @js.native
  sealed trait TIME extends TypeId
  /* 1083 */ val TIME: typings.pgPromise.pgSubsetMod.TypeId.TIME with Double = js.native
  
  @js.native
  sealed trait TIMESTAMP extends TypeId
  /* 1114 */ val TIMESTAMP: typings.pgPromise.pgSubsetMod.TypeId.TIMESTAMP with Double = js.native
  
  @js.native
  sealed trait TIMESTAMPTZ extends TypeId
  /* 1184 */ val TIMESTAMPTZ: typings.pgPromise.pgSubsetMod.TypeId.TIMESTAMPTZ with Double = js.native
  
  @js.native
  sealed trait TIMETZ extends TypeId
  /* 1266 */ val TIMETZ: typings.pgPromise.pgSubsetMod.TypeId.TIMETZ with Double = js.native
  
  @js.native
  sealed trait TINTERVAL extends TypeId
  /* 704 */ val TINTERVAL: typings.pgPromise.pgSubsetMod.TypeId.TINTERVAL with Double = js.native
  
  @js.native
  sealed trait TSQUERY extends TypeId
  /* 3615 */ val TSQUERY: typings.pgPromise.pgSubsetMod.TypeId.TSQUERY with Double = js.native
  
  @js.native
  sealed trait TSVECTOR extends TypeId
  /* 3614 */ val TSVECTOR: typings.pgPromise.pgSubsetMod.TypeId.TSVECTOR with Double = js.native
  
  @js.native
  sealed trait TXID_SNAPSHOT extends TypeId
  /* 2970 */ val TXID_SNAPSHOT: typings.pgPromise.pgSubsetMod.TypeId.TXID_SNAPSHOT with Double = js.native
  
  @js.native
  sealed trait UUID extends TypeId
  /* 2950 */ val UUID: typings.pgPromise.pgSubsetMod.TypeId.UUID with Double = js.native
  
  @js.native
  sealed trait VARBIT extends TypeId
  /* 1562 */ val VARBIT: typings.pgPromise.pgSubsetMod.TypeId.VARBIT with Double = js.native
  
  @js.native
  sealed trait VARCHAR extends TypeId
  /* 1043 */ val VARCHAR: typings.pgPromise.pgSubsetMod.TypeId.VARCHAR with Double = js.native
  
  @js.native
  sealed trait XID extends TypeId
  /* 28 */ val XID: typings.pgPromise.pgSubsetMod.TypeId.XID with Double = js.native
  
  @js.native
  sealed trait XML extends TypeId
  /* 142 */ val XML: typings.pgPromise.pgSubsetMod.TypeId.XML with Double = js.native
}
