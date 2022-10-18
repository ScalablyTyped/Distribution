package typings.peculiarAsn1Schema

import typings.asn1js.mod.AsnType
import typings.asn1js.mod.BaseBlock
import typings.asn1js.mod.ValueBlock
import typings.asn1js.mod.ValueBlockJson
import typings.peculiarAsn1Schema.buildTypesTypesMod.IAsnConvertible
import typings.pvtsutils.mod.BufferSource
import typings.std.ArrayBufferLike
import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesTypesOctetStringMod {
  
  @JSImport("@peculiar/asn1-schema/build/types/types/octet_string", "OctetString")
  @js.native
  open class OctetString ()
    extends StObject
       with IAsnConvertible[AsnType]
       with ArrayBufferView {
    def this(byteLength: Double) = this()
    def this(bytes: js.Array[Double]) = this()
    def this(bytes: BufferSource) = this()
    
    /**
      * The ArrayBuffer instance referenced by the array.
      */
    /* standard es5 */
    /* CompleteClass */
    var buffer: ArrayBufferLike = js.native
    @JSName("buffer")
    var buffer_OctetString: js.typedarray.ArrayBuffer = js.native
    
    /**
      * The length in bytes of the array.
      */
    /* standard es5 */
    /* CompleteClass */
    var byteLength: Double = js.native
    @JSName("byteLength")
    def byteLength_MOctetString: Double = js.native
    
    /**
      * The offset in bytes of the array.
      */
    /* standard es5 */
    /* CompleteClass */
    var byteOffset: Double = js.native
    @JSName("byteOffset")
    def byteOffset_MOctetString: Double = js.native
    
    /* CompleteClass */
    override def fromASN(asn: AsnType): this.type = js.native
    def fromASN(asn: typings.asn1js.mod.OctetString): this.type = js.native
    
    /* CompleteClass */
    override def toASN(): AsnType = js.native
    
    /* CompleteClass */
    override def toSchema(name: String): BaseBlock[ValueBlock, ValueBlockJson] = js.native
  }
}
