package typings.peculiarAsn1Schema

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/types/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  @js.native
  class BitString[T /* <: Double */] ()
    extends typings.peculiarAsn1Schema.bitStringMod.BitString[T] {
    def this(value: T) = this()
    def this(value: BufferSource) = this()
    def this(value: BufferSource, unusedBits: Double) = this()
  }
  
  @js.native
  class OctetString ()
    extends typings.peculiarAsn1Schema.octetStringMod.OctetString {
    def this(byteLength: Double) = this()
    def this(bytes: js.Array[Double]) = this()
    def this(bytes: BufferSource) = this()
  }
  
}

