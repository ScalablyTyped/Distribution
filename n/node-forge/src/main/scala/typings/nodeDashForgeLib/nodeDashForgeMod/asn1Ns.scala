package typings
package nodeDashForgeLib.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "asn1")
@js.native
object asn1Ns extends js.Object {
  trait Asn1 extends js.Object {
    var composed: scala.Boolean
    var constructed: scala.Boolean
    var tagClass: Class
    var `type`: Type
    var value: nodeDashForgeLib.nodeDashForgeMod.Bytes | js.Array[Asn1]
  }
  
  @js.native
  sealed trait Class extends js.Object
  
  @js.native
  sealed trait Type extends js.Object
  
  def create(tagClass: Class, `type`: Type, constructed: scala.Boolean, value: js.Array[Asn1]): Asn1 = js.native
  def create(
    tagClass: Class,
    `type`: Type,
    constructed: scala.Boolean,
    value: nodeDashForgeLib.nodeDashForgeMod.Bytes
  ): Asn1 = js.native
  def derToOid(der: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer): nodeDashForgeLib.nodeDashForgeMod.OID = js.native
  def fromDer(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes): Asn1 = js.native
  def fromDer(bytes: nodeDashForgeLib.nodeDashForgeMod.Bytes, strict: scala.Boolean): Asn1 = js.native
  def fromDer(bytes: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer): Asn1 = js.native
  def fromDer(bytes: nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer, strict: scala.Boolean): Asn1 = js.native
  def oidToDer(oid: nodeDashForgeLib.nodeDashForgeMod.OID): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteStringBuffer = js.native
  def toDer(obj: Asn1): nodeDashForgeLib.nodeDashForgeMod.utilNs.ByteBuffer = js.native
  @js.native
  object Class extends js.Object {
    @js.native
    sealed trait APPLICATION
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Class
    
    @js.native
    sealed trait CONTEXT_SPECIFIC
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Class
    
    @js.native
    sealed trait PRIVATE
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Class
    
    @js.native
    sealed trait UNIVERSAL
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Class
    
    /* 0x40 */ val APPLICATION: APPLICATION with scala.Double = js.native
    /* 0x80 */ val CONTEXT_SPECIFIC: CONTEXT_SPECIFIC with scala.Double = js.native
    /* 0xC0 */ val PRIVATE: PRIVATE with scala.Double = js.native
    /* 0x00 */ val UNIVERSAL: UNIVERSAL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Class with scala.Double] = js.native
  }
  
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait BITSTRING
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait BMPSTRING
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait BOOLEAN
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait EMBEDDED
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait ENUMERATED
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait EXTERNAL
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait GENERALIZEDTIME
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait IA5STRING
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait INTEGER
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait NONE
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait NULL
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait OCTETSTRING
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait ODESC
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait OID
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait PRINTABLESTRING
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait REAL
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait ROID
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait SEQUENCE
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait SET
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait UTCTIME
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    @js.native
    sealed trait UTF8
      extends nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type
    
    /* 3 */ val BITSTRING: BITSTRING with scala.Double = js.native
    /* 30 */ val BMPSTRING: BMPSTRING with scala.Double = js.native
    /* 1 */ val BOOLEAN: BOOLEAN with scala.Double = js.native
    /* 11 */ val EMBEDDED: EMBEDDED with scala.Double = js.native
    /* 10 */ val ENUMERATED: ENUMERATED with scala.Double = js.native
    /* 8 */ val EXTERNAL: EXTERNAL with scala.Double = js.native
    /* 24 */ val GENERALIZEDTIME: GENERALIZEDTIME with scala.Double = js.native
    /* 22 */ val IA5STRING: IA5STRING with scala.Double = js.native
    /* 2 */ val INTEGER: INTEGER with scala.Double = js.native
    /* 0 */ val NONE: NONE with scala.Double = js.native
    /* 5 */ val NULL: NULL with scala.Double = js.native
    /* 4 */ val OCTETSTRING: OCTETSTRING with scala.Double = js.native
    /* 7 */ val ODESC: ODESC with scala.Double = js.native
    /* 6 */ val OID: OID with scala.Double = js.native
    /* 19 */ val PRINTABLESTRING: PRINTABLESTRING with scala.Double = js.native
    /* 9 */ val REAL: REAL with scala.Double = js.native
    /* 13 */ val ROID: ROID with scala.Double = js.native
    /* 16 */ val SEQUENCE: SEQUENCE with scala.Double = js.native
    /* 17 */ val SET: SET with scala.Double = js.native
    /* 23 */ val UTCTIME: UTCTIME with scala.Double = js.native
    /* 12 */ val UTF8: UTF8 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[nodeDashForgeLib.nodeDashForgeMod.asn1Ns.Type with scala.Double] = js.native
  }
  
}

