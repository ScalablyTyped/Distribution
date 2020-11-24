package typings.nodeForge.mod.asn1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Type extends js.Object
@JSImport("node-forge", "asn1.Type")
@js.native
object Type extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Type with Double] = js.native
  
  @js.native
  sealed trait BITSTRING extends Type
  /* 3 */ @js.native
  object BITSTRING extends TopLevel[BITSTRING with Double]
  
  @js.native
  sealed trait BMPSTRING extends Type
  /* 30 */ @js.native
  object BMPSTRING extends TopLevel[BMPSTRING with Double]
  
  @js.native
  sealed trait BOOLEAN extends Type
  /* 1 */ @js.native
  object BOOLEAN extends TopLevel[BOOLEAN with Double]
  
  @js.native
  sealed trait EMBEDDED extends Type
  /* 11 */ @js.native
  object EMBEDDED extends TopLevel[EMBEDDED with Double]
  
  @js.native
  sealed trait ENUMERATED extends Type
  /* 10 */ @js.native
  object ENUMERATED extends TopLevel[ENUMERATED with Double]
  
  @js.native
  sealed trait EXTERNAL extends Type
  /* 8 */ @js.native
  object EXTERNAL extends TopLevel[EXTERNAL with Double]
  
  @js.native
  sealed trait GENERALIZEDTIME extends Type
  /* 24 */ @js.native
  object GENERALIZEDTIME extends TopLevel[GENERALIZEDTIME with Double]
  
  @js.native
  sealed trait IA5STRING extends Type
  /* 22 */ @js.native
  object IA5STRING extends TopLevel[IA5STRING with Double]
  
  @js.native
  sealed trait INTEGER extends Type
  /* 2 */ @js.native
  object INTEGER extends TopLevel[INTEGER with Double]
  
  @js.native
  sealed trait NONE extends Type
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
  @js.native
  sealed trait NULL extends Type
  /* 5 */ @js.native
  object NULL extends TopLevel[NULL with Double]
  
  @js.native
  sealed trait OCTETSTRING extends Type
  /* 4 */ @js.native
  object OCTETSTRING extends TopLevel[OCTETSTRING with Double]
  
  @js.native
  sealed trait ODESC extends Type
  /* 7 */ @js.native
  object ODESC extends TopLevel[ODESC with Double]
  
  @js.native
  sealed trait OID extends Type
  /* 6 */ @js.native
  object OID extends TopLevel[OID with Double]
  
  @js.native
  sealed trait PRINTABLESTRING extends Type
  /* 19 */ @js.native
  object PRINTABLESTRING extends TopLevel[PRINTABLESTRING with Double]
  
  @js.native
  sealed trait REAL extends Type
  /* 9 */ @js.native
  object REAL extends TopLevel[REAL with Double]
  
  @js.native
  sealed trait ROID extends Type
  /* 13 */ @js.native
  object ROID extends TopLevel[ROID with Double]
  
  @js.native
  sealed trait SEQUENCE extends Type
  /* 16 */ @js.native
  object SEQUENCE extends TopLevel[SEQUENCE with Double]
  
  @js.native
  sealed trait SET extends Type
  /* 17 */ @js.native
  object SET extends TopLevel[SET with Double]
  
  @js.native
  sealed trait UTCTIME extends Type
  /* 23 */ @js.native
  object UTCTIME extends TopLevel[UTCTIME with Double]
  
  @js.native
  sealed trait UTF8 extends Type
  /* 12 */ @js.native
  object UTF8 extends TopLevel[UTF8 with Double]
}
