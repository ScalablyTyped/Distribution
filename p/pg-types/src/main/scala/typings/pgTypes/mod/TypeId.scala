package typings.pgTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeId extends StObject
@JSImport("pg-types", "TypeId")
@js.native
object TypeId extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId & Double] = js.native
  
  @js.native
  sealed trait ABSTIME
    extends StObject
       with TypeId
  /* 702 */ val ABSTIME: typings.pgTypes.mod.TypeId.ABSTIME & Double = js.native
  
  @js.native
  sealed trait ACLITEM
    extends StObject
       with TypeId
  /* 1033 */ val ACLITEM: typings.pgTypes.mod.TypeId.ACLITEM & Double = js.native
  
  @js.native
  sealed trait BIT
    extends StObject
       with TypeId
  /* 1560 */ val BIT: typings.pgTypes.mod.TypeId.BIT & Double = js.native
  
  @js.native
  sealed trait BOOL
    extends StObject
       with TypeId
  /* 16 */ val BOOL: typings.pgTypes.mod.TypeId.BOOL & Double = js.native
  
  @js.native
  sealed trait BPCHAR
    extends StObject
       with TypeId
  /* 1042 */ val BPCHAR: typings.pgTypes.mod.TypeId.BPCHAR & Double = js.native
  
  @js.native
  sealed trait BYTEA
    extends StObject
       with TypeId
  /* 17 */ val BYTEA: typings.pgTypes.mod.TypeId.BYTEA & Double = js.native
  
  @js.native
  sealed trait CHAR
    extends StObject
       with TypeId
  /* 18 */ val CHAR: typings.pgTypes.mod.TypeId.CHAR & Double = js.native
  
  @js.native
  sealed trait CID
    extends StObject
       with TypeId
  /* 29 */ val CID: typings.pgTypes.mod.TypeId.CID & Double = js.native
  
  @js.native
  sealed trait CIDR
    extends StObject
       with TypeId
  /* 650 */ val CIDR: typings.pgTypes.mod.TypeId.CIDR & Double = js.native
  
  @js.native
  sealed trait CIRCLE
    extends StObject
       with TypeId
  /* 718 */ val CIRCLE: typings.pgTypes.mod.TypeId.CIRCLE & Double = js.native
  
  @js.native
  sealed trait DATE
    extends StObject
       with TypeId
  /* 1082 */ val DATE: typings.pgTypes.mod.TypeId.DATE & Double = js.native
  
  @js.native
  sealed trait FLOAT4
    extends StObject
       with TypeId
  /* 700 */ val FLOAT4: typings.pgTypes.mod.TypeId.FLOAT4 & Double = js.native
  
  @js.native
  sealed trait FLOAT8
    extends StObject
       with TypeId
  /* 701 */ val FLOAT8: typings.pgTypes.mod.TypeId.FLOAT8 & Double = js.native
  
  @js.native
  sealed trait GTSVECTOR
    extends StObject
       with TypeId
  /* 3642 */ val GTSVECTOR: typings.pgTypes.mod.TypeId.GTSVECTOR & Double = js.native
  
  @js.native
  sealed trait INET
    extends StObject
       with TypeId
  /* 869 */ val INET: typings.pgTypes.mod.TypeId.INET & Double = js.native
  
  @js.native
  sealed trait INT2
    extends StObject
       with TypeId
  /* 21 */ val INT2: typings.pgTypes.mod.TypeId.INT2 & Double = js.native
  
  @js.native
  sealed trait INT4
    extends StObject
       with TypeId
  /* 23 */ val INT4: typings.pgTypes.mod.TypeId.INT4 & Double = js.native
  
  @js.native
  sealed trait INT8
    extends StObject
       with TypeId
  /* 20 */ val INT8: typings.pgTypes.mod.TypeId.INT8 & Double = js.native
  
  @js.native
  sealed trait INTERVAL
    extends StObject
       with TypeId
  /* 1186 */ val INTERVAL: typings.pgTypes.mod.TypeId.INTERVAL & Double = js.native
  
  @js.native
  sealed trait JSON
    extends StObject
       with TypeId
  /* 114 */ val JSON: typings.pgTypes.mod.TypeId.JSON & Double = js.native
  
  @js.native
  sealed trait JSONB
    extends StObject
       with TypeId
  /* 3802 */ val JSONB: typings.pgTypes.mod.TypeId.JSONB & Double = js.native
  
  @js.native
  sealed trait MACADDR
    extends StObject
       with TypeId
  /* 829 */ val MACADDR: typings.pgTypes.mod.TypeId.MACADDR & Double = js.native
  
  @js.native
  sealed trait MACADDR8
    extends StObject
       with TypeId
  /* 774 */ val MACADDR8: typings.pgTypes.mod.TypeId.MACADDR8 & Double = js.native
  
  @js.native
  sealed trait MONEY
    extends StObject
       with TypeId
  /* 790 */ val MONEY: typings.pgTypes.mod.TypeId.MONEY & Double = js.native
  
  @js.native
  sealed trait NUMERIC
    extends StObject
       with TypeId
  /* 1700 */ val NUMERIC: typings.pgTypes.mod.TypeId.NUMERIC & Double = js.native
  
  @js.native
  sealed trait OID
    extends StObject
       with TypeId
  /* 26 */ val OID: typings.pgTypes.mod.TypeId.OID & Double = js.native
  
  @js.native
  sealed trait PATH
    extends StObject
       with TypeId
  /* 602 */ val PATH: typings.pgTypes.mod.TypeId.PATH & Double = js.native
  
  @js.native
  sealed trait PG_DEPENDENCIES
    extends StObject
       with TypeId
  /* 3402 */ val PG_DEPENDENCIES: typings.pgTypes.mod.TypeId.PG_DEPENDENCIES & Double = js.native
  
  @js.native
  sealed trait PG_LSN
    extends StObject
       with TypeId
  /* 3220 */ val PG_LSN: typings.pgTypes.mod.TypeId.PG_LSN & Double = js.native
  
  @js.native
  sealed trait PG_NDISTINCT
    extends StObject
       with TypeId
  /* 3361 */ val PG_NDISTINCT: typings.pgTypes.mod.TypeId.PG_NDISTINCT & Double = js.native
  
  @js.native
  sealed trait PG_NODE_TREE
    extends StObject
       with TypeId
  /* 194 */ val PG_NODE_TREE: typings.pgTypes.mod.TypeId.PG_NODE_TREE & Double = js.native
  
  @js.native
  sealed trait POLYGON
    extends StObject
       with TypeId
  /* 604 */ val POLYGON: typings.pgTypes.mod.TypeId.POLYGON & Double = js.native
  
  @js.native
  sealed trait REFCURSOR
    extends StObject
       with TypeId
  /* 1790 */ val REFCURSOR: typings.pgTypes.mod.TypeId.REFCURSOR & Double = js.native
  
  @js.native
  sealed trait REGCLASS
    extends StObject
       with TypeId
  /* 2205 */ val REGCLASS: typings.pgTypes.mod.TypeId.REGCLASS & Double = js.native
  
  @js.native
  sealed trait REGCONFIG
    extends StObject
       with TypeId
  /* 3734 */ val REGCONFIG: typings.pgTypes.mod.TypeId.REGCONFIG & Double = js.native
  
  @js.native
  sealed trait REGDICTIONARY
    extends StObject
       with TypeId
  /* 3769 */ val REGDICTIONARY: typings.pgTypes.mod.TypeId.REGDICTIONARY & Double = js.native
  
  @js.native
  sealed trait REGNAMESPACE
    extends StObject
       with TypeId
  /* 4089 */ val REGNAMESPACE: typings.pgTypes.mod.TypeId.REGNAMESPACE & Double = js.native
  
  @js.native
  sealed trait REGOPER
    extends StObject
       with TypeId
  /* 2203 */ val REGOPER: typings.pgTypes.mod.TypeId.REGOPER & Double = js.native
  
  @js.native
  sealed trait REGOPERATOR
    extends StObject
       with TypeId
  /* 2204 */ val REGOPERATOR: typings.pgTypes.mod.TypeId.REGOPERATOR & Double = js.native
  
  @js.native
  sealed trait REGPROC
    extends StObject
       with TypeId
  /* 24 */ val REGPROC: typings.pgTypes.mod.TypeId.REGPROC & Double = js.native
  
  @js.native
  sealed trait REGPROCEDURE
    extends StObject
       with TypeId
  /* 2202 */ val REGPROCEDURE: typings.pgTypes.mod.TypeId.REGPROCEDURE & Double = js.native
  
  @js.native
  sealed trait REGROLE
    extends StObject
       with TypeId
  /* 4096 */ val REGROLE: typings.pgTypes.mod.TypeId.REGROLE & Double = js.native
  
  @js.native
  sealed trait REGTYPE
    extends StObject
       with TypeId
  /* 2206 */ val REGTYPE: typings.pgTypes.mod.TypeId.REGTYPE & Double = js.native
  
  @js.native
  sealed trait RELTIME
    extends StObject
       with TypeId
  /* 703 */ val RELTIME: typings.pgTypes.mod.TypeId.RELTIME & Double = js.native
  
  @js.native
  sealed trait SMGR
    extends StObject
       with TypeId
  /* 210 */ val SMGR: typings.pgTypes.mod.TypeId.SMGR & Double = js.native
  
  @js.native
  sealed trait TEXT
    extends StObject
       with TypeId
  /* 25 */ val TEXT: typings.pgTypes.mod.TypeId.TEXT & Double = js.native
  
  @js.native
  sealed trait TID
    extends StObject
       with TypeId
  /* 27 */ val TID: typings.pgTypes.mod.TypeId.TID & Double = js.native
  
  @js.native
  sealed trait TIME
    extends StObject
       with TypeId
  /* 1083 */ val TIME: typings.pgTypes.mod.TypeId.TIME & Double = js.native
  
  @js.native
  sealed trait TIMESTAMP
    extends StObject
       with TypeId
  /* 1114 */ val TIMESTAMP: typings.pgTypes.mod.TypeId.TIMESTAMP & Double = js.native
  
  @js.native
  sealed trait TIMESTAMPTZ
    extends StObject
       with TypeId
  /* 1184 */ val TIMESTAMPTZ: typings.pgTypes.mod.TypeId.TIMESTAMPTZ & Double = js.native
  
  @js.native
  sealed trait TIMETZ
    extends StObject
       with TypeId
  /* 1266 */ val TIMETZ: typings.pgTypes.mod.TypeId.TIMETZ & Double = js.native
  
  @js.native
  sealed trait TINTERVAL
    extends StObject
       with TypeId
  /* 704 */ val TINTERVAL: typings.pgTypes.mod.TypeId.TINTERVAL & Double = js.native
  
  @js.native
  sealed trait TSQUERY
    extends StObject
       with TypeId
  /* 3615 */ val TSQUERY: typings.pgTypes.mod.TypeId.TSQUERY & Double = js.native
  
  @js.native
  sealed trait TSVECTOR
    extends StObject
       with TypeId
  /* 3614 */ val TSVECTOR: typings.pgTypes.mod.TypeId.TSVECTOR & Double = js.native
  
  @js.native
  sealed trait TXID_SNAPSHOT
    extends StObject
       with TypeId
  /* 2970 */ val TXID_SNAPSHOT: typings.pgTypes.mod.TypeId.TXID_SNAPSHOT & Double = js.native
  
  @js.native
  sealed trait UUID
    extends StObject
       with TypeId
  /* 2950 */ val UUID: typings.pgTypes.mod.TypeId.UUID & Double = js.native
  
  @js.native
  sealed trait VARBIT
    extends StObject
       with TypeId
  /* 1562 */ val VARBIT: typings.pgTypes.mod.TypeId.VARBIT & Double = js.native
  
  @js.native
  sealed trait VARCHAR
    extends StObject
       with TypeId
  /* 1043 */ val VARCHAR: typings.pgTypes.mod.TypeId.VARCHAR & Double = js.native
  
  @js.native
  sealed trait XID
    extends StObject
       with TypeId
  /* 28 */ val XID: typings.pgTypes.mod.TypeId.XID & Double = js.native
  
  @js.native
  sealed trait XML
    extends StObject
       with TypeId
  /* 142 */ val XML: typings.pgTypes.mod.TypeId.XML & Double = js.native
}
