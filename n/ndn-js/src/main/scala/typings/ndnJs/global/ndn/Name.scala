package typings.ndnJs.global.ndn

import typings.ndnJs.nameMod.Name.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ndn.Name")
@js.native
open class Name ()
  extends typings.ndnJs.mod.Name {
  def this(components: js.Array[Component | js.typedarray.Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typings.ndnJs.nameMod.Name) = this()
}
/* static members */
object Name {
  
  @JSGlobal("ndn.Name")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("ndn.Name.Component")
  @js.native
  open class Component ()
    extends typings.ndnJs.mod.Name.Component {
    def this(component: typings.ndnJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: js.typedarray.ArrayBuffer) = this()
    def this(value: js.typedarray.Uint8Array) = this()
    def this(value: typings.ndnJs.blobMod.Blob) = this()
    def this(value: String, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.typedarray.ArrayBuffer, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.typedarray.Uint8Array, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: Unit, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: typings.ndnJs.blobMod.Blob, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: Unit, otherTypeCode: Double) = this()
    def this(value: String, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: Unit, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.typedarray.ArrayBuffer, `type`: Unit, otherTypeCode: Double) = this()
    def this(
      value: js.typedarray.ArrayBuffer,
      `type`: typings.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: js.typedarray.Uint8Array, `type`: Unit, otherTypeCode: Double) = this()
    def this(
      value: js.typedarray.Uint8Array,
      `type`: typings.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: Unit, `type`: Unit, otherTypeCode: Double) = this()
    def this(value: Unit, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: typings.ndnJs.blobMod.Blob, `type`: Unit, otherTypeCode: Double) = this()
    def this(
      value: typings.ndnJs.blobMod.Blob,
      `type`: typings.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
  }
  object Component {
    
    @JSGlobal("ndn.Name.Component")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def fromImplicitSha256Digest(digest: typings.ndnJs.blobMod.Blob): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImplicitSha256Digest")(digest.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromNumber(number: Double): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    inline def fromNumber(number: Double, `type`: Unit, otherTypeCode: Double): typings.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], otherTypeCode.asInstanceOf[js.Any])).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    inline def fromNumber(number: Double, `type`: typings.ndnJs.nameMod.ComponentType): typings.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    inline def fromNumber(number: Double, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double): typings.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(number.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], otherTypeCode.asInstanceOf[js.Any])).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromNumberWithMarker(number: Double, marker: Double): typings.ndnJs.nameMod.Name.Component = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNumberWithMarker")(number.asInstanceOf[js.Any], marker.asInstanceOf[js.Any])).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromParametersSha256Digest(digest: typings.ndnJs.blobMod.Blob): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParametersSha256Digest")(digest.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromSegment(segment: Double): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegment")(segment.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromSegmentOffset(segmentOffset: Double): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSegmentOffset")(segmentOffset.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromSequenceNumber(sequenceNumber: Double): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSequenceNumber")(sequenceNumber.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromTimestamp(timestamp: Double): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTimestamp")(timestamp.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
    
    /* static member */
    inline def fromVersion(version: Double): typings.ndnJs.nameMod.Name.Component = ^.asInstanceOf[js.Dynamic].applyDynamic("fromVersion")(version.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name.Component]
  }
  
  inline def fromEscapedString(uri: String): typings.ndnJs.nameMod.Name = ^.asInstanceOf[js.Dynamic].applyDynamic("fromEscapedString")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.ndnJs.nameMod.Name]
}
