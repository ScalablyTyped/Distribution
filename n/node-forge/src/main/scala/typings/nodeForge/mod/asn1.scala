package typings.nodeForge.mod

import typings.nodeForge.mod.util.ByteBuffer
import typings.nodeForge.mod.util.ByteStringBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asn1 {
  
  @js.native
  sealed trait Class extends StObject
  @JSImport("node-forge", "asn1.Class")
  @js.native
  object Class extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Class with Double] = js.native
    
    @js.native
    sealed trait APPLICATION extends Class
    /* 0x40 */ val APPLICATION: typings.nodeForge.mod.asn1.Class.APPLICATION with Double = js.native
    
    @js.native
    sealed trait CONTEXT_SPECIFIC extends Class
    /* 0x80 */ val CONTEXT_SPECIFIC: typings.nodeForge.mod.asn1.Class.CONTEXT_SPECIFIC with Double = js.native
    
    @js.native
    sealed trait PRIVATE extends Class
    /* 0xC0 */ val PRIVATE: typings.nodeForge.mod.asn1.Class.PRIVATE with Double = js.native
    
    @js.native
    sealed trait UNIVERSAL extends Class
    /* 0x00 */ val UNIVERSAL: typings.nodeForge.mod.asn1.Class.UNIVERSAL with Double = js.native
  }
  
  @js.native
  sealed trait Type extends StObject
  @JSImport("node-forge", "asn1.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Type with Double] = js.native
    
    @js.native
    sealed trait BITSTRING extends Type
    /* 3 */ val BITSTRING: typings.nodeForge.mod.asn1.Type.BITSTRING with Double = js.native
    
    @js.native
    sealed trait BMPSTRING extends Type
    /* 30 */ val BMPSTRING: typings.nodeForge.mod.asn1.Type.BMPSTRING with Double = js.native
    
    @js.native
    sealed trait BOOLEAN extends Type
    /* 1 */ val BOOLEAN: typings.nodeForge.mod.asn1.Type.BOOLEAN with Double = js.native
    
    @js.native
    sealed trait EMBEDDED extends Type
    /* 11 */ val EMBEDDED: typings.nodeForge.mod.asn1.Type.EMBEDDED with Double = js.native
    
    @js.native
    sealed trait ENUMERATED extends Type
    /* 10 */ val ENUMERATED: typings.nodeForge.mod.asn1.Type.ENUMERATED with Double = js.native
    
    @js.native
    sealed trait EXTERNAL extends Type
    /* 8 */ val EXTERNAL: typings.nodeForge.mod.asn1.Type.EXTERNAL with Double = js.native
    
    @js.native
    sealed trait GENERALIZEDTIME extends Type
    /* 24 */ val GENERALIZEDTIME: typings.nodeForge.mod.asn1.Type.GENERALIZEDTIME with Double = js.native
    
    @js.native
    sealed trait IA5STRING extends Type
    /* 22 */ val IA5STRING: typings.nodeForge.mod.asn1.Type.IA5STRING with Double = js.native
    
    @js.native
    sealed trait INTEGER extends Type
    /* 2 */ val INTEGER: typings.nodeForge.mod.asn1.Type.INTEGER with Double = js.native
    
    @js.native
    sealed trait NONE extends Type
    /* 0 */ val NONE: typings.nodeForge.mod.asn1.Type.NONE with Double = js.native
    
    @js.native
    sealed trait NULL extends Type
    /* 5 */ val NULL: typings.nodeForge.mod.asn1.Type.NULL with Double = js.native
    
    @js.native
    sealed trait OCTETSTRING extends Type
    /* 4 */ val OCTETSTRING: typings.nodeForge.mod.asn1.Type.OCTETSTRING with Double = js.native
    
    @js.native
    sealed trait ODESC extends Type
    /* 7 */ val ODESC: typings.nodeForge.mod.asn1.Type.ODESC with Double = js.native
    
    @js.native
    sealed trait OID extends Type
    /* 6 */ val OID: typings.nodeForge.mod.asn1.Type.OID with Double = js.native
    
    @js.native
    sealed trait PRINTABLESTRING extends Type
    /* 19 */ val PRINTABLESTRING: typings.nodeForge.mod.asn1.Type.PRINTABLESTRING with Double = js.native
    
    @js.native
    sealed trait REAL extends Type
    /* 9 */ val REAL: typings.nodeForge.mod.asn1.Type.REAL with Double = js.native
    
    @js.native
    sealed trait ROID extends Type
    /* 13 */ val ROID: typings.nodeForge.mod.asn1.Type.ROID with Double = js.native
    
    @js.native
    sealed trait SEQUENCE extends Type
    /* 16 */ val SEQUENCE: typings.nodeForge.mod.asn1.Type.SEQUENCE with Double = js.native
    
    @js.native
    sealed trait SET extends Type
    /* 17 */ val SET: typings.nodeForge.mod.asn1.Type.SET with Double = js.native
    
    @js.native
    sealed trait UTCTIME extends Type
    /* 23 */ val UTCTIME: typings.nodeForge.mod.asn1.Type.UTCTIME with Double = js.native
    
    @js.native
    sealed trait UTF8 extends Type
    /* 12 */ val UTF8: typings.nodeForge.mod.asn1.Type.UTF8 with Double = js.native
  }
  
  @JSImport("node-forge", "asn1.create")
  @js.native
  def create(tagClass: Class, `type`: Type, constructed: Boolean, value: js.Array[Asn1]): Asn1 = js.native
  @JSImport("node-forge", "asn1.create")
  @js.native
  def create(tagClass: Class, `type`: Type, constructed: Boolean, value: Bytes): Asn1 = js.native
  
  @JSImport("node-forge", "asn1.derToOid")
  @js.native
  def derToOid(der: ByteStringBuffer): OID = js.native
  
  @JSImport("node-forge", "asn1.fromDer")
  @js.native
  def fromDer(bytes: Bytes): Asn1 = js.native
  @JSImport("node-forge", "asn1.fromDer")
  @js.native
  def fromDer(bytes: Bytes, strict: Boolean): Asn1 = js.native
  @JSImport("node-forge", "asn1.fromDer")
  @js.native
  def fromDer(bytes: ByteBuffer): Asn1 = js.native
  @JSImport("node-forge", "asn1.fromDer")
  @js.native
  def fromDer(bytes: ByteBuffer, strict: Boolean): Asn1 = js.native
  
  @JSImport("node-forge", "asn1.oidToDer")
  @js.native
  def oidToDer(oid: OID): ByteStringBuffer = js.native
  
  @JSImport("node-forge", "asn1.toDer")
  @js.native
  def toDer(obj: Asn1): ByteBuffer = js.native
  
  @js.native
  trait Asn1 extends StObject {
    
    var composed: Boolean = js.native
    
    var constructed: Boolean = js.native
    
    var tagClass: Class = js.native
    
    var `type`: Type = js.native
    
    var value: Bytes | js.Array[Asn1] = js.native
  }
  object Asn1 {
    
    @scala.inline
    def apply(
      composed: Boolean,
      constructed: Boolean,
      tagClass: Class,
      `type`: Type,
      value: Bytes | js.Array[Asn1]
    ): Asn1 = {
      val __obj = js.Dynamic.literal(composed = composed.asInstanceOf[js.Any], constructed = constructed.asInstanceOf[js.Any], tagClass = tagClass.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Asn1]
    }
    
    @scala.inline
    implicit class Asn1MutableBuilder[Self <: Asn1] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructed(value: Boolean): Self = StObject.set(x, "constructed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagClass(value: Class): Self = StObject.set(x, "tagClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Bytes | js.Array[Asn1]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueVarargs(value: Asn1*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
