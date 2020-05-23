package typings.peculiarAsn1Schema

import typings.asn1js.mod.BaseBlock
import typings.asn1js.mod.LocalValueBlock
import typings.peculiarAsn1Schema.typesMod.IAsnConvertible
import typings.std.ArrayBuffer
import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/asn1-schema/build/types/types/octet_string", JSImport.Namespace)
@js.native
object octetStringMod extends js.Object {
  @js.native
  class OctetString ()
    extends ArrayBuffer
       with IAsnConvertible[js.Any] {
    def this(byteLength: Double) = this()
    def this(bytes: js.Array[Double]) = this()
    def this(bytes: BufferSource) = this()
    /* CompleteClass */
    override def fromASN(asn: js.Any): this.type = js.native
    /* CompleteClass */
    override def toASN(): js.Any = js.native
    /* CompleteClass */
    override def toSchema(name: String): BaseBlock[LocalValueBlock] = js.native
  }
  
}

