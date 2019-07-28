package typings.nodeDashForge.nodeDashForgeMod

import typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Asn1
import typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Class
import typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteBuffer
import typings.nodeDashForge.nodeDashForgeMod.utilNs.ByteStringBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "asn1")
@js.native
object asn1Ns extends js.Object {
  trait Asn1 extends js.Object {
    var composed: Boolean
    var constructed: Boolean
    var tagClass: Class
    var `type`: Type
    var value: Bytes | js.Array[Asn1]
  }
  
  @js.native
  sealed trait Class extends js.Object
  
  @js.native
  sealed trait Type extends js.Object
  
  def create(tagClass: Class, `type`: Type, constructed: Boolean, value: js.Array[Asn1]): Asn1 = js.native
  def create(tagClass: Class, `type`: Type, constructed: Boolean, value: Bytes): Asn1 = js.native
  def derToOid(der: ByteStringBuffer): OID = js.native
  def fromDer(bytes: Bytes): Asn1 = js.native
  def fromDer(bytes: Bytes, strict: Boolean): Asn1 = js.native
  def fromDer(bytes: ByteBuffer): Asn1 = js.native
  def fromDer(bytes: ByteBuffer, strict: Boolean): Asn1 = js.native
  def oidToDer(oid: OID): ByteStringBuffer = js.native
  def toDer(obj: Asn1): ByteBuffer = js.native
  @js.native
  object Class extends js.Object {
    @js.native
    sealed trait APPLICATION extends Class
    
    @js.native
    sealed trait CONTEXT_SPECIFIC extends Class
    
    @js.native
    sealed trait PRIVATE extends Class
    
    @js.native
    sealed trait UNIVERSAL extends Class
    
    /* 0x40 */ val APPLICATION: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Class.APPLICATION with Double = js.native
    /* 0x80 */ val CONTEXT_SPECIFIC: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Class.CONTEXT_SPECIFIC with Double = js.native
    /* 0xC0 */ val PRIVATE: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Class.PRIVATE with Double = js.native
    /* 0x00 */ val UNIVERSAL: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Class.UNIVERSAL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Class with Double] = js.native
  }
  
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
    
    /* 3 */ val BITSTRING: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.BITSTRING with Double = js.native
    /* 30 */ val BMPSTRING: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.BMPSTRING with Double = js.native
    /* 1 */ val BOOLEAN: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.BOOLEAN with Double = js.native
    /* 11 */ val EMBEDDED: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.EMBEDDED with Double = js.native
    /* 10 */ val ENUMERATED: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.ENUMERATED with Double = js.native
    /* 8 */ val EXTERNAL: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.EXTERNAL with Double = js.native
    /* 24 */ val GENERALIZEDTIME: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.GENERALIZEDTIME with Double = js.native
    /* 22 */ val IA5STRING: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.IA5STRING with Double = js.native
    /* 2 */ val INTEGER: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.INTEGER with Double = js.native
    /* 0 */ val NONE: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.NONE with Double = js.native
    /* 5 */ val NULL: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.NULL with Double = js.native
    /* 4 */ val OCTETSTRING: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.OCTETSTRING with Double = js.native
    /* 7 */ val ODESC: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.ODESC with Double = js.native
    /* 6 */ val OID: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.OID with Double = js.native
    /* 19 */ val PRINTABLESTRING: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.PRINTABLESTRING with Double = js.native
    /* 9 */ val REAL: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.REAL with Double = js.native
    /* 13 */ val ROID: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.ROID with Double = js.native
    /* 16 */ val SEQUENCE: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.SEQUENCE with Double = js.native
    /* 17 */ val SET: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.SET with Double = js.native
    /* 23 */ val UTCTIME: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.UTCTIME with Double = js.native
    /* 12 */ val UTF8: typings.nodeDashForge.nodeDashForgeMod.asn1Ns.Type.UTF8 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type with Double] = js.native
  }
  
}

