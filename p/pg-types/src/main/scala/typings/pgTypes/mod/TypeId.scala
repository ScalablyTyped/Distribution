package typings.pgTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeId extends StObject
@JSImport("pg-types", "TypeId")
@js.native
object TypeId extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId with Double] = js.native
  
  @js.native
  sealed trait ABSTIME extends TypeId
  /* 702 */ val ABSTIME: typings.pgTypes.mod.TypeId.ABSTIME with Double = js.native
  
  @js.native
  sealed trait ACLITEM extends TypeId
  /* 1033 */ val ACLITEM: typings.pgTypes.mod.TypeId.ACLITEM with Double = js.native
  
  @js.native
  sealed trait BIT extends TypeId
  /* 1560 */ val BIT: typings.pgTypes.mod.TypeId.BIT with Double = js.native
  
  @js.native
  sealed trait BOOL extends TypeId
  /* 16 */ val BOOL: typings.pgTypes.mod.TypeId.BOOL with Double = js.native
  
  @js.native
  sealed trait BPCHAR extends TypeId
  /* 1042 */ val BPCHAR: typings.pgTypes.mod.TypeId.BPCHAR with Double = js.native
  
  @js.native
  sealed trait BYTEA extends TypeId
  /* 17 */ val BYTEA: typings.pgTypes.mod.TypeId.BYTEA with Double = js.native
  
  @js.native
  sealed trait CHAR extends TypeId
  /* 18 */ val CHAR: typings.pgTypes.mod.TypeId.CHAR with Double = js.native
  
  @js.native
  sealed trait CID extends TypeId
  /* 29 */ val CID: typings.pgTypes.mod.TypeId.CID with Double = js.native
  
  @js.native
  sealed trait CIDR extends TypeId
  /* 650 */ val CIDR: typings.pgTypes.mod.TypeId.CIDR with Double = js.native
  
  @js.native
  sealed trait CIRCLE extends TypeId
  /* 718 */ val CIRCLE: typings.pgTypes.mod.TypeId.CIRCLE with Double = js.native
  
  @js.native
  sealed trait DATE extends TypeId
  /* 1082 */ val DATE: typings.pgTypes.mod.TypeId.DATE with Double = js.native
  
  @js.native
  sealed trait FLOAT4 extends TypeId
  /* 700 */ val FLOAT4: typings.pgTypes.mod.TypeId.FLOAT4 with Double = js.native
  
  @js.native
  sealed trait FLOAT8 extends TypeId
  /* 701 */ val FLOAT8: typings.pgTypes.mod.TypeId.FLOAT8 with Double = js.native
  
  @js.native
  sealed trait GTSVECTOR extends TypeId
  /* 3642 */ val GTSVECTOR: typings.pgTypes.mod.TypeId.GTSVECTOR with Double = js.native
  
  @js.native
  sealed trait INET extends TypeId
  /* 869 */ val INET: typings.pgTypes.mod.TypeId.INET with Double = js.native
  
  @js.native
  sealed trait INT2 extends TypeId
  /* 21 */ val INT2: typings.pgTypes.mod.TypeId.INT2 with Double = js.native
  
  @js.native
  sealed trait INT4 extends TypeId
  /* 23 */ val INT4: typings.pgTypes.mod.TypeId.INT4 with Double = js.native
  
  @js.native
  sealed trait INT8 extends TypeId
  /* 20 */ val INT8: typings.pgTypes.mod.TypeId.INT8 with Double = js.native
  
  @js.native
  sealed trait INTERVAL extends TypeId
  /* 1186 */ val INTERVAL: typings.pgTypes.mod.TypeId.INTERVAL with Double = js.native
  
  @js.native
  sealed trait JSON extends TypeId
  /* 114 */ val JSON: typings.pgTypes.mod.TypeId.JSON with Double = js.native
  
  @js.native
  sealed trait JSONB extends TypeId
  /* 3802 */ val JSONB: typings.pgTypes.mod.TypeId.JSONB with Double = js.native
  
  @js.native
  sealed trait MACADDR extends TypeId
  /* 829 */ val MACADDR: typings.pgTypes.mod.TypeId.MACADDR with Double = js.native
  
  @js.native
  sealed trait MACADDR8 extends TypeId
  /* 774 */ val MACADDR8: typings.pgTypes.mod.TypeId.MACADDR8 with Double = js.native
  
  @js.native
  sealed trait MONEY extends TypeId
  /* 790 */ val MONEY: typings.pgTypes.mod.TypeId.MONEY with Double = js.native
  
  @js.native
  sealed trait NUMERIC extends TypeId
  /* 1700 */ val NUMERIC: typings.pgTypes.mod.TypeId.NUMERIC with Double = js.native
  
  @js.native
  sealed trait OID extends TypeId
  /* 26 */ val OID: typings.pgTypes.mod.TypeId.OID with Double = js.native
  
  @js.native
  sealed trait PATH extends TypeId
  /* 602 */ val PATH: typings.pgTypes.mod.TypeId.PATH with Double = js.native
  
  @js.native
  sealed trait PG_DEPENDENCIES extends TypeId
  /* 3402 */ val PG_DEPENDENCIES: typings.pgTypes.mod.TypeId.PG_DEPENDENCIES with Double = js.native
  
  @js.native
  sealed trait PG_LSN extends TypeId
  /* 3220 */ val PG_LSN: typings.pgTypes.mod.TypeId.PG_LSN with Double = js.native
  
  @js.native
  sealed trait PG_NDISTINCT extends TypeId
  /* 3361 */ val PG_NDISTINCT: typings.pgTypes.mod.TypeId.PG_NDISTINCT with Double = js.native
  
  @js.native
  sealed trait PG_NODE_TREE extends TypeId
  /* 194 */ val PG_NODE_TREE: typings.pgTypes.mod.TypeId.PG_NODE_TREE with Double = js.native
  
  @js.native
  sealed trait POLYGON extends TypeId
  /* 604 */ val POLYGON: typings.pgTypes.mod.TypeId.POLYGON with Double = js.native
  
  @js.native
  sealed trait REFCURSOR extends TypeId
  /* 1790 */ val REFCURSOR: typings.pgTypes.mod.TypeId.REFCURSOR with Double = js.native
  
  @js.native
  sealed trait REGCLASS extends TypeId
  /* 2205 */ val REGCLASS: typings.pgTypes.mod.TypeId.REGCLASS with Double = js.native
  
  @js.native
  sealed trait REGCONFIG extends TypeId
  /* 3734 */ val REGCONFIG: typings.pgTypes.mod.TypeId.REGCONFIG with Double = js.native
  
  @js.native
  sealed trait REGDICTIONARY extends TypeId
  /* 3769 */ val REGDICTIONARY: typings.pgTypes.mod.TypeId.REGDICTIONARY with Double = js.native
  
  @js.native
  sealed trait REGNAMESPACE extends TypeId
  /* 4089 */ val REGNAMESPACE: typings.pgTypes.mod.TypeId.REGNAMESPACE with Double = js.native
  
  @js.native
  sealed trait REGOPER extends TypeId
  /* 2203 */ val REGOPER: typings.pgTypes.mod.TypeId.REGOPER with Double = js.native
  
  @js.native
  sealed trait REGOPERATOR extends TypeId
  /* 2204 */ val REGOPERATOR: typings.pgTypes.mod.TypeId.REGOPERATOR with Double = js.native
  
  @js.native
  sealed trait REGPROC extends TypeId
  /* 24 */ val REGPROC: typings.pgTypes.mod.TypeId.REGPROC with Double = js.native
  
  @js.native
  sealed trait REGPROCEDURE extends TypeId
  /* 2202 */ val REGPROCEDURE: typings.pgTypes.mod.TypeId.REGPROCEDURE with Double = js.native
  
  @js.native
  sealed trait REGROLE extends TypeId
  /* 4096 */ val REGROLE: typings.pgTypes.mod.TypeId.REGROLE with Double = js.native
  
  @js.native
  sealed trait REGTYPE extends TypeId
  /* 2206 */ val REGTYPE: typings.pgTypes.mod.TypeId.REGTYPE with Double = js.native
  
  @js.native
  sealed trait RELTIME extends TypeId
  /* 703 */ val RELTIME: typings.pgTypes.mod.TypeId.RELTIME with Double = js.native
  
  @js.native
  sealed trait SMGR extends TypeId
  /* 210 */ val SMGR: typings.pgTypes.mod.TypeId.SMGR with Double = js.native
  
  @js.native
  sealed trait TEXT extends TypeId
  /* 25 */ val TEXT: typings.pgTypes.mod.TypeId.TEXT with Double = js.native
  
  @js.native
  sealed trait TID extends TypeId
  /* 27 */ val TID: typings.pgTypes.mod.TypeId.TID with Double = js.native
  
  @js.native
  sealed trait TIME extends TypeId
  /* 1083 */ val TIME: typings.pgTypes.mod.TypeId.TIME with Double = js.native
  
  @js.native
  sealed trait TIMESTAMP extends TypeId
  /* 1114 */ val TIMESTAMP: typings.pgTypes.mod.TypeId.TIMESTAMP with Double = js.native
  
  @js.native
  sealed trait TIMESTAMPTZ extends TypeId
  /* 1184 */ val TIMESTAMPTZ: typings.pgTypes.mod.TypeId.TIMESTAMPTZ with Double = js.native
  
  @js.native
  sealed trait TIMETZ extends TypeId
  /* 1266 */ val TIMETZ: typings.pgTypes.mod.TypeId.TIMETZ with Double = js.native
  
  @js.native
  sealed trait TINTERVAL extends TypeId
  /* 704 */ val TINTERVAL: typings.pgTypes.mod.TypeId.TINTERVAL with Double = js.native
  
  @js.native
  sealed trait TSQUERY extends TypeId
  /* 3615 */ val TSQUERY: typings.pgTypes.mod.TypeId.TSQUERY with Double = js.native
  
  @js.native
  sealed trait TSVECTOR extends TypeId
  /* 3614 */ val TSVECTOR: typings.pgTypes.mod.TypeId.TSVECTOR with Double = js.native
  
  @js.native
  sealed trait TXID_SNAPSHOT extends TypeId
  /* 2970 */ val TXID_SNAPSHOT: typings.pgTypes.mod.TypeId.TXID_SNAPSHOT with Double = js.native
  
  @js.native
  sealed trait UUID extends TypeId
  /* 2950 */ val UUID: typings.pgTypes.mod.TypeId.UUID with Double = js.native
  
  @js.native
  sealed trait VARBIT extends TypeId
  /* 1562 */ val VARBIT: typings.pgTypes.mod.TypeId.VARBIT with Double = js.native
  
  @js.native
  sealed trait VARCHAR extends TypeId
  /* 1043 */ val VARCHAR: typings.pgTypes.mod.TypeId.VARCHAR with Double = js.native
  
  @js.native
  sealed trait XID extends TypeId
  /* 28 */ val XID: typings.pgTypes.mod.TypeId.XID with Double = js.native
  
  @js.native
  sealed trait XML extends TypeId
  /* 142 */ val XML: typings.pgTypes.mod.TypeId.XML with Double = js.native
}
