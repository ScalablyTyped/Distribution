package typings.peculiarAsn1Schema

import typings.asn1js.mod.AsnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSerializerMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/serializer", "AsnSerializer")
  @js.native
  open class AsnSerializer () extends StObject
  /* static members */
  object AsnSerializer {
    
    @JSImport("@peculiar/asn1-schema/build/types/serializer", "AsnSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Serializes an object to the ASN.1 encoded buffer
      * @param obj The object to serialize
      */
    inline def serialize(obj: Any): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(obj.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Serialize an object to the asn1js object
      * @param obj The object to serialize
      */
    inline def toASN(obj: Any): AsnType = ^.asInstanceOf[js.Dynamic].applyDynamic("toASN")(obj.asInstanceOf[js.Any]).asInstanceOf[AsnType]
    
    @JSImport("@peculiar/asn1-schema/build/types/serializer", "AsnSerializer.toAsnItem")
    @js.native
    def toAsnItem: Any = js.native
    inline def toAsnItem_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toAsnItem")(x.asInstanceOf[js.Any])
  }
}
