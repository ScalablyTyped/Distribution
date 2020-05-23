package typings.peculiarAsn1Schema

import typings.peculiarAsn1Schema.typesMod.IEmptyConstructor
import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/parser", JSImport.Namespace)
@js.native
object parserMod extends js.Object {
  @js.native
  class AsnParser () extends js.Object
  
  /* static members */
  @js.native
  object AsnParser extends js.Object {
    /**
      * Deserializes an object from the asn1js object
      * @param asn1Schema asn1js object
      * @param target Target schema for object deserialization
      */
    def fromASN[T](asn1Schema: js.Any, target: IEmptyConstructor[T]): js.Any = js.native
    /**
      * Deserializes an object from the ASN.1 encoded buffer
      * @param data ASN.1 encoded buffer
      * @param target Target schema for object deserialization
      */
    def parse[T](data: BufferSource, target: IEmptyConstructor[T]): T = js.native
  }
  
}

