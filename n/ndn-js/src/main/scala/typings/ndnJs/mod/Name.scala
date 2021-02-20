package typings.ndnJs.mod

import typings.ndnJs.nameMod.Name.Component
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ndn-js", "Name")
@js.native
class Name ()
  extends typings.ndnJs.nameMod.Name {
  def this(components: js.Array[Component | Uint8Array]) = this()
  def this(name: String) = this()
  def this(name: typings.ndnJs.nameMod.Name) = this()
}
/* static members */
object Name {
  
  @JSImport("ndn-js", "Name.Component")
  @js.native
  class Component ()
    extends typings.ndnJs.nameMod.Name.Component {
    def this(component: typings.ndnJs.nameMod.Name.Component) = this()
    def this(value: String) = this()
    def this(value: js.Array[Double]) = this()
    def this(value: typings.ndnJs.blobMod.Blob) = this()
    def this(value: ArrayBuffer) = this()
    def this(value: Uint8Array) = this()
    def this(value: js.UndefOr[scala.Nothing], `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: String, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.Array[Double], `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: typings.ndnJs.blobMod.Blob, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: ArrayBuffer, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: Uint8Array, `type`: typings.ndnJs.nameMod.ComponentType) = this()
    def this(value: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(
      value: js.UndefOr[scala.Nothing],
      `type`: typings.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: String, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: String, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: js.Array[Double], `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: typings.ndnJs.blobMod.Blob, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(
      value: typings.ndnJs.blobMod.Blob,
      `type`: typings.ndnJs.nameMod.ComponentType,
      otherTypeCode: Double
    ) = this()
    def this(value: ArrayBuffer, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: ArrayBuffer, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
    def this(value: Uint8Array, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double) = this()
    def this(value: Uint8Array, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double) = this()
  }
  object Component {
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromImplicitSha256Digest")
    @js.native
    def fromImplicitSha256Digest(digest: typings.ndnJs.blobMod.Blob): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double): typings.ndnJs.nameMod.Name.Component = js.native
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double, `type`: js.UndefOr[scala.Nothing], otherTypeCode: Double): typings.ndnJs.nameMod.Name.Component = js.native
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double, `type`: typings.ndnJs.nameMod.ComponentType): typings.ndnJs.nameMod.Name.Component = js.native
    @JSImport("ndn-js", "Name.Component.fromNumber")
    @js.native
    def fromNumber(number: Double, `type`: typings.ndnJs.nameMod.ComponentType, otherTypeCode: Double): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromNumberWithMarker")
    @js.native
    def fromNumberWithMarker(number: Double, marker: Double): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromParametersSha256Digest")
    @js.native
    def fromParametersSha256Digest(digest: typings.ndnJs.blobMod.Blob): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromSegment")
    @js.native
    def fromSegment(segment: Double): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromSegmentOffset")
    @js.native
    def fromSegmentOffset(segmentOffset: Double): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromSequenceNumber")
    @js.native
    def fromSequenceNumber(sequenceNumber: Double): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromTimestamp")
    @js.native
    def fromTimestamp(timestamp: Double): typings.ndnJs.nameMod.Name.Component = js.native
    
    /* static member */
    @JSImport("ndn-js", "Name.Component.fromVersion")
    @js.native
    def fromVersion(version: Double): typings.ndnJs.nameMod.Name.Component = js.native
  }
  
  @JSImport("ndn-js", "Name.fromEscapedString")
  @js.native
  def fromEscapedString(uri: String): typings.ndnJs.nameMod.Name = js.native
}
