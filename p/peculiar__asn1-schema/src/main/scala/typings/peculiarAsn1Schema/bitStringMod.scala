package typings.peculiarAsn1Schema

import typings.asn1js.mod.BaseBlock
import typings.asn1js.mod.LocalValueBlock
import typings.peculiarAsn1Schema.typesMod.IAsnConvertible
import typings.std.ArrayBuffer
import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/types/bit_string", JSImport.Namespace)
@js.native
object bitStringMod extends js.Object {
  @js.native
  class BitString[T /* <: Double */] ()
    extends IAsnConvertible[js.Any] {
    def this(value: T) = this()
    def this(value: BufferSource) = this()
    def this(value: BufferSource, unusedBits: Double) = this()
    var unusedBits: Double = js.native
    var value: ArrayBuffer = js.native
    /* CompleteClass */
    override def fromASN(asn: js.Any): this.type = js.native
    def fromNumber(value: T): Unit = js.native
    /* CompleteClass */
    override def toASN(): js.Any = js.native
    def toNumber(): T = js.native
    /* CompleteClass */
    override def toSchema(name: String): BaseBlock[LocalValueBlock] = js.native
  }
  
}

