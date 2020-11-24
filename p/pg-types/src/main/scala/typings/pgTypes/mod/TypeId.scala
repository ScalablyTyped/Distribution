package typings.pgTypes.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeId extends js.Object
@JSImport("pg-types", "TypeId")
@js.native
object TypeId extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeId with Double] = js.native
  
  @js.native
  sealed trait ABSTIME extends TypeId
  /* 702 */ @js.native
  object ABSTIME extends TopLevel[ABSTIME with Double]
  
  @js.native
  sealed trait ACLITEM extends TypeId
  /* 1033 */ @js.native
  object ACLITEM extends TopLevel[ACLITEM with Double]
  
  @js.native
  sealed trait BIT extends TypeId
  /* 1560 */ @js.native
  object BIT extends TopLevel[BIT with Double]
  
  @js.native
  sealed trait BOOL extends TypeId
  /* 16 */ @js.native
  object BOOL extends TopLevel[BOOL with Double]
  
  @js.native
  sealed trait BPCHAR extends TypeId
  /* 1042 */ @js.native
  object BPCHAR extends TopLevel[BPCHAR with Double]
  
  @js.native
  sealed trait BYTEA extends TypeId
  /* 17 */ @js.native
  object BYTEA extends TopLevel[BYTEA with Double]
  
  @js.native
  sealed trait CHAR extends TypeId
  /* 18 */ @js.native
  object CHAR extends TopLevel[CHAR with Double]
  
  @js.native
  sealed trait CID extends TypeId
  /* 29 */ @js.native
  object CID extends TopLevel[CID with Double]
  
  @js.native
  sealed trait CIDR extends TypeId
  /* 650 */ @js.native
  object CIDR extends TopLevel[CIDR with Double]
  
  @js.native
  sealed trait CIRCLE extends TypeId
  /* 718 */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with Double]
  
  @js.native
  sealed trait DATE extends TypeId
  /* 1082 */ @js.native
  object DATE extends TopLevel[DATE with Double]
  
  @js.native
  sealed trait FLOAT4 extends TypeId
  /* 700 */ @js.native
  object FLOAT4 extends TopLevel[FLOAT4 with Double]
  
  @js.native
  sealed trait FLOAT8 extends TypeId
  /* 701 */ @js.native
  object FLOAT8 extends TopLevel[FLOAT8 with Double]
  
  @js.native
  sealed trait GTSVECTOR extends TypeId
  /* 3642 */ @js.native
  object GTSVECTOR extends TopLevel[GTSVECTOR with Double]
  
  @js.native
  sealed trait INET extends TypeId
  /* 869 */ @js.native
  object INET extends TopLevel[INET with Double]
  
  @js.native
  sealed trait INT2 extends TypeId
  /* 21 */ @js.native
  object INT2 extends TopLevel[INT2 with Double]
  
  @js.native
  sealed trait INT4 extends TypeId
  /* 23 */ @js.native
  object INT4 extends TopLevel[INT4 with Double]
  
  @js.native
  sealed trait INT8 extends TypeId
  /* 20 */ @js.native
  object INT8 extends TopLevel[INT8 with Double]
  
  @js.native
  sealed trait INTERVAL extends TypeId
  /* 1186 */ @js.native
  object INTERVAL extends TopLevel[INTERVAL with Double]
  
  @js.native
  sealed trait JSON extends TypeId
  /* 114 */ @js.native
  object JSON extends TopLevel[JSON with Double]
  
  @js.native
  sealed trait JSONB extends TypeId
  /* 3802 */ @js.native
  object JSONB extends TopLevel[JSONB with Double]
  
  @js.native
  sealed trait MACADDR extends TypeId
  /* 829 */ @js.native
  object MACADDR extends TopLevel[MACADDR with Double]
  
  @js.native
  sealed trait MACADDR8 extends TypeId
  /* 774 */ @js.native
  object MACADDR8 extends TopLevel[MACADDR8 with Double]
  
  @js.native
  sealed trait MONEY extends TypeId
  /* 790 */ @js.native
  object MONEY extends TopLevel[MONEY with Double]
  
  @js.native
  sealed trait NUMERIC extends TypeId
  /* 1700 */ @js.native
  object NUMERIC extends TopLevel[NUMERIC with Double]
  
  @js.native
  sealed trait OID extends TypeId
  /* 26 */ @js.native
  object OID extends TopLevel[OID with Double]
  
  @js.native
  sealed trait PATH extends TypeId
  /* 602 */ @js.native
  object PATH extends TopLevel[PATH with Double]
  
  @js.native
  sealed trait PG_DEPENDENCIES extends TypeId
  /* 3402 */ @js.native
  object PG_DEPENDENCIES extends TopLevel[PG_DEPENDENCIES with Double]
  
  @js.native
  sealed trait PG_LSN extends TypeId
  /* 3220 */ @js.native
  object PG_LSN extends TopLevel[PG_LSN with Double]
  
  @js.native
  sealed trait PG_NDISTINCT extends TypeId
  /* 3361 */ @js.native
  object PG_NDISTINCT extends TopLevel[PG_NDISTINCT with Double]
  
  @js.native
  sealed trait PG_NODE_TREE extends TypeId
  /* 194 */ @js.native
  object PG_NODE_TREE extends TopLevel[PG_NODE_TREE with Double]
  
  @js.native
  sealed trait POLYGON extends TypeId
  /* 604 */ @js.native
  object POLYGON extends TopLevel[POLYGON with Double]
  
  @js.native
  sealed trait REFCURSOR extends TypeId
  /* 1790 */ @js.native
  object REFCURSOR extends TopLevel[REFCURSOR with Double]
  
  @js.native
  sealed trait REGCLASS extends TypeId
  /* 2205 */ @js.native
  object REGCLASS extends TopLevel[REGCLASS with Double]
  
  @js.native
  sealed trait REGCONFIG extends TypeId
  /* 3734 */ @js.native
  object REGCONFIG extends TopLevel[REGCONFIG with Double]
  
  @js.native
  sealed trait REGDICTIONARY extends TypeId
  /* 3769 */ @js.native
  object REGDICTIONARY extends TopLevel[REGDICTIONARY with Double]
  
  @js.native
  sealed trait REGNAMESPACE extends TypeId
  /* 4089 */ @js.native
  object REGNAMESPACE extends TopLevel[REGNAMESPACE with Double]
  
  @js.native
  sealed trait REGOPER extends TypeId
  /* 2203 */ @js.native
  object REGOPER extends TopLevel[REGOPER with Double]
  
  @js.native
  sealed trait REGOPERATOR extends TypeId
  /* 2204 */ @js.native
  object REGOPERATOR extends TopLevel[REGOPERATOR with Double]
  
  @js.native
  sealed trait REGPROC extends TypeId
  /* 24 */ @js.native
  object REGPROC extends TopLevel[REGPROC with Double]
  
  @js.native
  sealed trait REGPROCEDURE extends TypeId
  /* 2202 */ @js.native
  object REGPROCEDURE extends TopLevel[REGPROCEDURE with Double]
  
  @js.native
  sealed trait REGROLE extends TypeId
  /* 4096 */ @js.native
  object REGROLE extends TopLevel[REGROLE with Double]
  
  @js.native
  sealed trait REGTYPE extends TypeId
  /* 2206 */ @js.native
  object REGTYPE extends TopLevel[REGTYPE with Double]
  
  @js.native
  sealed trait RELTIME extends TypeId
  /* 703 */ @js.native
  object RELTIME extends TopLevel[RELTIME with Double]
  
  @js.native
  sealed trait SMGR extends TypeId
  /* 210 */ @js.native
  object SMGR extends TopLevel[SMGR with Double]
  
  @js.native
  sealed trait TEXT extends TypeId
  /* 25 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  @js.native
  sealed trait TID extends TypeId
  /* 27 */ @js.native
  object TID extends TopLevel[TID with Double]
  
  @js.native
  sealed trait TIME extends TypeId
  /* 1083 */ @js.native
  object TIME extends TopLevel[TIME with Double]
  
  @js.native
  sealed trait TIMESTAMP extends TypeId
  /* 1114 */ @js.native
  object TIMESTAMP extends TopLevel[TIMESTAMP with Double]
  
  @js.native
  sealed trait TIMESTAMPTZ extends TypeId
  /* 1184 */ @js.native
  object TIMESTAMPTZ extends TopLevel[TIMESTAMPTZ with Double]
  
  @js.native
  sealed trait TIMETZ extends TypeId
  /* 1266 */ @js.native
  object TIMETZ extends TopLevel[TIMETZ with Double]
  
  @js.native
  sealed trait TINTERVAL extends TypeId
  /* 704 */ @js.native
  object TINTERVAL extends TopLevel[TINTERVAL with Double]
  
  @js.native
  sealed trait TSQUERY extends TypeId
  /* 3615 */ @js.native
  object TSQUERY extends TopLevel[TSQUERY with Double]
  
  @js.native
  sealed trait TSVECTOR extends TypeId
  /* 3614 */ @js.native
  object TSVECTOR extends TopLevel[TSVECTOR with Double]
  
  @js.native
  sealed trait TXID_SNAPSHOT extends TypeId
  /* 2970 */ @js.native
  object TXID_SNAPSHOT extends TopLevel[TXID_SNAPSHOT with Double]
  
  @js.native
  sealed trait UUID extends TypeId
  /* 2950 */ @js.native
  object UUID extends TopLevel[UUID with Double]
  
  @js.native
  sealed trait VARBIT extends TypeId
  /* 1562 */ @js.native
  object VARBIT extends TopLevel[VARBIT with Double]
  
  @js.native
  sealed trait VARCHAR extends TypeId
  /* 1043 */ @js.native
  object VARCHAR extends TopLevel[VARCHAR with Double]
  
  @js.native
  sealed trait XID extends TypeId
  /* 28 */ @js.native
  object XID extends TopLevel[XID with Double]
  
  @js.native
  sealed trait XML extends TypeId
  /* 142 */ @js.native
  object XML extends TopLevel[XML with Double]
}
