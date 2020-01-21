package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId with Double] = js.native
  /* 702 */ @js.native
  object ABSTIME extends TopLevel[ABSTIME with Double]
  
  /* 1033 */ @js.native
  object ACLITEM extends TopLevel[ACLITEM with Double]
  
  /* 1560 */ @js.native
  object BIT extends TopLevel[BIT with Double]
  
  /* 16 */ @js.native
  object BOOL extends TopLevel[BOOL with Double]
  
  /* 1042 */ @js.native
  object BPCHAR extends TopLevel[BPCHAR with Double]
  
  /* 17 */ @js.native
  object BYTEA extends TopLevel[BYTEA with Double]
  
  /* 18 */ @js.native
  object CHAR extends TopLevel[CHAR with Double]
  
  /* 29 */ @js.native
  object CID extends TopLevel[CID with Double]
  
  /* 650 */ @js.native
  object CIDR extends TopLevel[CIDR with Double]
  
  /* 718 */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with Double]
  
  /* 1082 */ @js.native
  object DATE extends TopLevel[DATE with Double]
  
  /* 700 */ @js.native
  object FLOAT4 extends TopLevel[FLOAT4 with Double]
  
  /* 701 */ @js.native
  object FLOAT8 extends TopLevel[FLOAT8 with Double]
  
  /* 3642 */ @js.native
  object GTSVECTOR extends TopLevel[GTSVECTOR with Double]
  
  /* 869 */ @js.native
  object INET extends TopLevel[INET with Double]
  
  /* 21 */ @js.native
  object INT2 extends TopLevel[INT2 with Double]
  
  /* 23 */ @js.native
  object INT4 extends TopLevel[INT4 with Double]
  
  /* 20 */ @js.native
  object INT8 extends TopLevel[INT8 with Double]
  
  /* 1186 */ @js.native
  object INTERVAL extends TopLevel[INTERVAL with Double]
  
  /* 114 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  /* 3802 */ @js.native
  object JSONB extends TopLevel[JSONB with Double]
  
  /* 829 */ @js.native
  object MACADDR extends TopLevel[MACADDR with Double]
  
  /* 774 */ @js.native
  object MACADDR8 extends TopLevel[MACADDR8 with Double]
  
  /* 790 */ @js.native
  object MONEY extends TopLevel[MONEY with Double]
  
  /* 1700 */ @js.native
  object NUMERIC extends TopLevel[NUMERIC with Double]
  
  /* 26 */ @js.native
  object OID extends TopLevel[OID with Double]
  
  /* 602 */ @js.native
  object PATH extends TopLevel[PATH with Double]
  
  /* 3402 */ @js.native
  object PG_DEPENDENCIES extends TopLevel[PG_DEPENDENCIES with Double]
  
  /* 3220 */ @js.native
  object PG_LSN extends TopLevel[PG_LSN with Double]
  
  /* 3361 */ @js.native
  object PG_NDISTINCT extends TopLevel[PG_NDISTINCT with Double]
  
  /* 194 */ @js.native
  object PG_NODE_TREE extends TopLevel[PG_NODE_TREE with Double]
  
  /* 604 */ @js.native
  object POLYGON extends TopLevel[POLYGON with Double]
  
  /* 1790 */ @js.native
  object REFCURSOR extends TopLevel[REFCURSOR with Double]
  
  /* 2205 */ @js.native
  object REGCLASS extends TopLevel[REGCLASS with Double]
  
  /* 3734 */ @js.native
  object REGCONFIG extends TopLevel[REGCONFIG with Double]
  
  /* 3769 */ @js.native
  object REGDICTIONARY extends TopLevel[REGDICTIONARY with Double]
  
  /* 4089 */ @js.native
  object REGNAMESPACE extends TopLevel[REGNAMESPACE with Double]
  
  /* 2203 */ @js.native
  object REGOPER extends TopLevel[REGOPER with Double]
  
  /* 2204 */ @js.native
  object REGOPERATOR extends TopLevel[REGOPERATOR with Double]
  
  /* 24 */ @js.native
  object REGPROC extends TopLevel[REGPROC with Double]
  
  /* 2202 */ @js.native
  object REGPROCEDURE extends TopLevel[REGPROCEDURE with Double]
  
  /* 4096 */ @js.native
  object REGROLE extends TopLevel[REGROLE with Double]
  
  /* 2206 */ @js.native
  object REGTYPE extends TopLevel[REGTYPE with Double]
  
  /* 703 */ @js.native
  object RELTIME extends TopLevel[RELTIME with Double]
  
  /* 210 */ @js.native
  object SMGR extends TopLevel[SMGR with Double]
  
  /* 25 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 27 */ @js.native
  object TID extends TopLevel[TID with Double]
  
  /* 1083 */ @js.native
  object TIME extends TopLevel[TIME with Double]
  
  /* 1114 */ @js.native
  object TIMESTAMP extends TopLevel[TIMESTAMP with Double]
  
  /* 1184 */ @js.native
  object TIMESTAMPTZ extends TopLevel[TIMESTAMPTZ with Double]
  
  /* 1266 */ @js.native
  object TIMETZ extends TopLevel[TIMETZ with Double]
  
  /* 704 */ @js.native
  object TINTERVAL extends TopLevel[TINTERVAL with Double]
  
  /* 3615 */ @js.native
  object TSQUERY extends TopLevel[TSQUERY with Double]
  
  /* 3614 */ @js.native
  object TSVECTOR extends TopLevel[TSVECTOR with Double]
  
  /* 2970 */ @js.native
  object TXID_SNAPSHOT extends TopLevel[TXID_SNAPSHOT with Double]
  
  /* 2950 */ @js.native
  object UUID extends TopLevel[UUID with Double]
  
  /* 1562 */ @js.native
  object VARBIT extends TopLevel[VARBIT with Double]
  
  /* 1043 */ @js.native
  object VARCHAR extends TopLevel[VARCHAR with Double]
  
  /* 28 */ @js.native
  object XID extends TopLevel[XID with Double]
  
  /* 142 */ @js.native
  object XML extends TopLevel[XML with Double]
  
}

