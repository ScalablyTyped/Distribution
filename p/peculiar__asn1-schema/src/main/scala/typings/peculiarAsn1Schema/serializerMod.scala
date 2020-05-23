package typings.peculiarAsn1Schema

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/serializer", JSImport.Namespace)
@js.native
object serializerMod extends js.Object {
  @js.native
  class AsnSerializer () extends js.Object
  
  /* static members */
  @js.native
  object AsnSerializer extends js.Object {
    var toAsnItem: js.Any = js.native
    /**
      * Serializes an object to the ASN.1 encoded buffer
      * @param obj The object to serialize
      */
    def serialize(obj: js.Any): ArrayBuffer = js.native
    /**
      * Serialize an object to the asn1js object
      * @param obj The object to serialize
      */
    def toASN(obj: js.Any): js.Any = js.native
  }
  
}

