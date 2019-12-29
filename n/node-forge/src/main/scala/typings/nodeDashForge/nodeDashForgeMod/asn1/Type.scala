package typings.nodeDashForge.nodeDashForgeMod.asn1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSImport("node-forge", "asn1.Type")
@js.native
object Type extends js.Object {
  @js.native
  sealed trait BITSTRING extends Type
  
  @js.native
  sealed trait BMPSTRING extends Type
  
  @js.native
  sealed trait BOOLEAN extends Type
  
  @js.native
  sealed trait EMBEDDED extends Type
  
  @js.native
  sealed trait ENUMERATED extends Type
  
  @js.native
  sealed trait EXTERNAL extends Type
  
  @js.native
  sealed trait GENERALIZEDTIME extends Type
  
  @js.native
  sealed trait IA5STRING extends Type
  
  @js.native
  sealed trait INTEGER extends Type
  
  @js.native
  sealed trait NONE extends Type
  
  @js.native
  sealed trait NULL extends Type
  
  @js.native
  sealed trait OCTETSTRING extends Type
  
  @js.native
  sealed trait ODESC extends Type
  
  @js.native
  sealed trait OID extends Type
  
  @js.native
  sealed trait PRINTABLESTRING extends Type
  
  @js.native
  sealed trait REAL extends Type
  
  @js.native
  sealed trait ROID extends Type
  
  @js.native
  sealed trait SEQUENCE extends Type
  
  @js.native
  sealed trait SET extends Type
  
  @js.native
  sealed trait UTCTIME extends Type
  
  @js.native
  sealed trait UTF8 extends Type
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  /* 3 */ @js.native
  object BITSTRING extends TopLevel[BITSTRING with Double]
  
  /* 30 */ @js.native
  object BMPSTRING extends TopLevel[BMPSTRING with Double]
  
  /* 1 */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with Double]
  
  /* 11 */ @js.native
  object EMBEDDED extends TopLevel[EMBEDDED with Double]
  
  /* 10 */ @js.native
  object ENUMERATED extends TopLevel[ENUMERATED with Double]
  
  /* 8 */ @js.native
  object EXTERNAL extends TopLevel[EXTERNAL with Double]
  
  /* 24 */ @js.native
  object GENERALIZEDTIME extends TopLevel[GENERALIZEDTIME with Double]
  
  /* 22 */ @js.native
  object IA5STRING extends TopLevel[IA5STRING with Double]
  
  /* 2 */ @js.native
  object INTEGER extends TopLevel[INTEGER with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  /* 5 */ @js.native
  object NULL extends TopLevel[NULL with Double]
  
  /* 4 */ @js.native
  object OCTETSTRING extends TopLevel[OCTETSTRING with Double]
  
  /* 7 */ @js.native
  object ODESC extends TopLevel[ODESC with Double]
  
  /* 6 */ @js.native
  object OID extends TopLevel[OID with Double]
  
  /* 19 */ @js.native
  object PRINTABLESTRING extends TopLevel[PRINTABLESTRING with Double]
  
  /* 9 */ @js.native
  object REAL extends TopLevel[REAL with Double]
  
  /* 13 */ @js.native
  object ROID extends TopLevel[ROID with Double]
  
  /* 16 */ @js.native
  object SEQUENCE extends TopLevel[SEQUENCE with Double]
  
  /* 17 */ @js.native
  object SET extends TopLevel[SET with Double]
  
  /* 23 */ @js.native
  object UTCTIME extends TopLevel[UTCTIME with Double]
  
  /* 12 */ @js.native
  object UTF8 extends TopLevel[UTF8 with Double]
  
}

